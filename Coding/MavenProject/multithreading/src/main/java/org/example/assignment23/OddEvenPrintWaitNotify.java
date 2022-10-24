package org.example.assignment23;

public class OddEvenPrintWaitNotify {
    private static final Object monitor = new Object();
    private static int value = 1;

    public static void main(String[] args) {
        Runnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    static class PrintRunnable implements Runnable{

        @Override
        public void run() {
            synchronized (monitor){
                while(value <= 10){
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    monitor.notify();
                    try{
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
