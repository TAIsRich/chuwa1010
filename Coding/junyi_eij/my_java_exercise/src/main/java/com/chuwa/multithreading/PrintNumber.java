package com.chuwa.multithreading;

public class PrintNumber {
    private static int value = 1;

    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();

    }

    static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            int count = 10;
            synchronized (PrintNumber.class) {
                while (count-- > 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                PrintNumber.class.notifyAll();
            }
        }
    }
}
