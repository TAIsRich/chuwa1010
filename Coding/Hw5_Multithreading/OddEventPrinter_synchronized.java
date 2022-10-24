package com.chuwa.tutorial.t08_multithreading.c05_waitNotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Amy Liu
 * @date 10/23/22 12:41 AM
 */
public class OddEventPrinter_synchronized{
    private static final Object monitor= new Object();
    private static int value=1;

    public static void main(String[] args){
        //PrintRunnable runnable= new PrintRunnable();
        PrintRunnable2 runnable= new PrintRunnable2();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    //implement with synchronized, notify(), wait()
    static class PrintRunnable implements Runnable{
        @Override
        public void run(){
            synchronized (monitor){
                while(value <=10){
                    System.out.println(Thread.currentThread().getName()+ ": "+value++);
                    monitor.notify();
                    try{
                        if(value <11){
                            monitor.wait();
                        }
                    }catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    //implement with ReentrantLock, condition.signal(), await()
    static class PrintRunnable2 implements Runnable{
       private final Lock lock= new ReentrantLock();
       private final Condition condition= lock.newCondition();
        @Override
        public void run(){
            lock.lock();
            try{
                while(value <=10){
                    System.out.println(Thread.currentThread().getName()+ ": "+value++);
                    condition.signal();
                    try{
                        condition.await();
                    }catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }finally {
                lock.lock();
            }

        }
    }

}
