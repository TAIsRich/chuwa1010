package MultiThreading;

public class PrintNumber1 {
    private static int n=1;

    public static void main(String[] args) {
        Thread t1= new Thread(()->print());
        Thread t2= new Thread(()->print());
        Thread t3= new Thread(()->print());
        t1.start();
        t2.start();
        t3.start();
    }
    public static synchronized void print(){
        int count = 10;
        while (count-- > 0) {
            System.out.println(Thread.currentThread().getName()+"->"+n);
            n++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            PrintNumber1.class.notifyAll();
        }
    }
}
