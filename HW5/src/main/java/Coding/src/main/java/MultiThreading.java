public class MultiThreading {
    //question 21

    private static int n = 1;

    public static void main(String[] args) {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = new Thread();
        Thread thread4 = new Thread();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

    public static synchronized void printNumber() throws InterruptedException {
        int count = 10;
        while (count-- > 0) {
            System.out.println(Thread.currentThread().getName() + ": " + n++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();;
            }
        }

        MultiThreading.class.notifyAll();
    }
}
