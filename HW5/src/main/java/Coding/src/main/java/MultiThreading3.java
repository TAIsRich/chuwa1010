import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThreading3 {
    private static final Lock lock = new ReentrantLock();
    private static int count = 1;
    private static Condition condition;

    public static void main(String[] args) {
        MultiThreading3 multiThreading3 = new MultiThreading3();
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        thread1.start();
        thread2.start();


    }

    public static void printOddNumber() throws InterruptedException {
        lock.lock();
        if (count % 2 == 0) {
            condition.await();
        }
        try{
            System.out.println(Thread.currentThread().getName() + ": " + count++);
        } finally {
            condition.signal();
            lock.unlock();
        }
    }

    public static void printEvenNumber() throws InterruptedException {
        lock.lock();
        if (count % 2 != 0) {
            condition.await();
        }

        try{
            System.out.println(Thread.currentThread().getName() + ": " + count++);
        } finally {
            condition.signal();
            lock.unlock();
        }
    }
}
