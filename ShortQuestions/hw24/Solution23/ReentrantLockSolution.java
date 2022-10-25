package multithreading.hw24.Solution23;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockSolution {
     static class PrintRunnable implements Runnable {
        private int value = 1;
        private final Lock lock = new ReentrantLock();
        private final Condition condition = lock.newCondition();

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

    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}