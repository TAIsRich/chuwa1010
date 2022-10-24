package com.chuwa.multithreading;

public class OddEvenPrinterSol1 {
    private static final Object monitor = new Object();

    private static int value = 1;

    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();

    }
    static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            synchronized (monitor) {
                System.out.println(Thread.currentThread().getName() + ": " + value++);
                monitor.notify();
                try {
                    if (value < 11) {
                        monitor.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

