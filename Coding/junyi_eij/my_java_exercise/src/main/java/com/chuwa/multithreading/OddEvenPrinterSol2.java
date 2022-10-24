package com.chuwa.multithreading;

import java.util.concurrent.locks.*;

public class OddEvenPrinterSol2 {
    private static final Lock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();
    private static int value = 1;

    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();

    }

    static class PrintRunnable implements Runnable {

        @Override
        public void run() {
            lock.lock();
            try {
                while (value <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": "+ value++);
                    condition.signal();
                }
                 try {
                     if (value < 11) {
                         condition.await();
                     }
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
            } finally {
                lock.unlock();
            }
        }
    }
}
