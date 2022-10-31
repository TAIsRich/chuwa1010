package MultiThreading.c05_waitNotify;

public class OddEvenPrinter {
    static int n = 1;
    static Object obj = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> print());
        Thread t2 = new Thread(() -> print());
        t1.start();
        t2.start();
    }

    public static void print() {
        synchronized (obj) {
            while (n < 11) {
                obj.notify();

                System.out.println(Thread.currentThread().getName() + "__" + n++);
                try {
                    if (n < 11)
                        obj.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}