/**
 * @Version v1.0
 * @Description TODO
 * @Author Wenbo Geng
 * @Date 10/21/22 4:40 AM
 * @ClassName ThreeThreads
 */
public class ThreeThreads {
    private static int k = 1;

    private static synchronized void printNumber() {
        int count = 10;
        while (count-- > 0) {
            System.out.println(Thread.currentThread().getName() + ": " + k++);

            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        ThreeThreads.class.notifyAll();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> printNumber());
        Thread t2 = new Thread(() -> printNumber());
        Thread t3 = new Thread(() -> printNumber());
        t1.start();
        t2.start();
        t3.start();
    }
}