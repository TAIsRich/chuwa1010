package org.example;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TwoThreadB {
    private static int value = 1;


    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    static class PrintRunnable implements Runnable{
        private static final Lock lock = new ReentrantLock();
        private final Condition con = lock.newCondition();
        @Override
        public void run() {
            lock.lock();

            try{
                while (value <= 10){
                    System.out.println(Thread.currentThread().getName()+ ": "+ value++);
                    con.signal();
                    try{
                        con.await();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }

}
