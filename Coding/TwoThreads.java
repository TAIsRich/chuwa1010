/**
* @Version v1.0
* @Description TODO
* @Author Wenbo Geng
* @Date 10/21/22 4:38 AM
* @ClassName TwoThreads
*/
public class TwoThreads {
    private static int k = 1;
    private static final Object monitor = new Object();

    public static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            synchronized (monitor) {
                while (k <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": " + k++);
                    monitor.notify();

                    try {
                        if (k <= 10) {
                            monitor.wait();
                        }
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new PrintRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
