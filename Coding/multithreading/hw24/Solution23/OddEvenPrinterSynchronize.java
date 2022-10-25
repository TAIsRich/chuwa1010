package multithreading.hw24.Solution23;
/**
 * 23. write a code to create 2 threads, one thread print 1,3,5,7,9, another thread print
 * 2,4,6,8,10.  a. One solution use synchronized and wait notify
 * b. One solution use ReentrantLock and await, signal
 * author : Megan Wang
 */

public class OddEvenPrinterSynchronize {
    private static final  Object monitor = new Object();
    private static int value = 1;

    static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            synchronized (monitor) {
                while (value <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    monitor.notify();
                    try {
                        monitor.wait();
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}