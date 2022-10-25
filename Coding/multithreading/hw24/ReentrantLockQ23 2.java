package multithreading.hw24;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockQ23 {
    static class PrintRunnable implements Runnable {
        private final Lock lock = new ReentrantLock();
        private final Condition condition = lock.newCondition();

        private int value = 1;
        @Override
        public void run() {

            lock.lock();
            try {
                while (value <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": " + value++);
                    condition.signal();
                    try {
                        condition.await(); // 解锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }
}