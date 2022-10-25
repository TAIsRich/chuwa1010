package multithreading.hw24;

public class Solution24 {
    /**
     * create 3 threads, one thread ouput 1-10, one thread output 11-20, one thread
     * output 21-22. threads run sequence is random. (solution is in
     * com.chuwa.exercise.t08_multithreading.PrintNumber1
     */

    private static int n = 1;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> printNumber());
        Thread t2 = new Thread(() -> printNumber());
        Thread t3 = new Thread(() -> printNumber());

        t1.start();
        t2.start();
        t3.start();
    }

    private static synchronized void printNumber() {
        int count = 10;
        while (count-- > 0) {
            System.out.println(Thread.currentThread().getName() + ": " + n++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Solution24.class.notifyAll();
    }
}
