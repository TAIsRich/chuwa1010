public class MultiThreading4 {
    private static int count = 1;
    private final static Object lock = new Object();

    public static void main(String[] args) {
        printNumber printNumber = new printNumber();
        Thread thread1 = new Thread(printNumber);
        Thread thread2 = new Thread(printNumber);
        Thread thread3 = new Thread(printNumber);
        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class printNumber implements Runnable {

        @Override
        public void run() {
            while (count <= 22) {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                    lock.notifyAll();
                } try {
                    if (count < 23) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
