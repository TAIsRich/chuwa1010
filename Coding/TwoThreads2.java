import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Version v1.0
 * @Description TODO
 * @Author Wenbo Geng
 * @Date 10/21/22 4:38 AM
 * @ClassName TwoThreads2
 */
public class TwoThreads2 {
    private static int k = 1;

    public static class PrintRunnable implements Runnable {
        private final Lock lock = new ReentrantLock();
        private final Condition condition = lock.newCondition();

        @Override
        public void run() {
            lock.lock();

            try {
                while (k <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": " + k++);
                    condition.signal();

                    try {
                        if (k <= 10) {
                            condition.await();
                        }
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
