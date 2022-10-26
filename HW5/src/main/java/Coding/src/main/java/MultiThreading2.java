public class MultiThreading2 {
    //question 23
    private static final Object lock = new Object();
    private static int count = 1;


    public static void main(String[] args) {

        //done by myself
//        Thread thread1 = new Thread();
//        Thread thread2 = new Thread();
//
//        thread1.start();
//        thread2.start();


        printNumber runnable = new printNumber();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }

    static class printNumber implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                while (count <= 10) {
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                    lock.notify();
                    try {
                        if (count < 11) {
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }




    /**

    //done by myself
    private int n = 10;
    private int count = 1;

    public MultiThreading2() {
    }

    public synchronized void oddNumber() throws InterruptedException {
        while (count <= n) {
            if (count % 2 == 0) {
                this.wait();
            }
            System.out.println(count);
            count++;
            this.notify();
        }

    }

    public synchronized void evenNumber() throws InterruptedException {
        while (count <= n) {
            if (count % 2 != 0) {
                this.wait();
            }
            System.out.println(count);
            count++;
            this.notify();
        }

    }

     **/
}
