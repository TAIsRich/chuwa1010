package org.example;

public class ThreeThreads {
    private static int value = 1;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> printNumber());
        Thread t2 = new Thread(() -> printNumber());
        Thread t3 = new Thread(() -> printNumber());

        t1.start();
        t2.start();
        t3.start();
    }

    private static synchronized void printNumber(){
        int count = 10;
        //each thread print 10 numbers
        while(count-- > 0){
            System.out.println(Thread.currentThread().getName() + ": " + value++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

            ThreeThreads.class.notifyAll();
        }
    }
}
