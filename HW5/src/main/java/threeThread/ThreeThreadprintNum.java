package threeThread;

public class ThreeThreadprintNum {

    private static int n = 1;
    public static void main(String[] args) {
        Thread t1 = new Thread(()->printNum());
        Thread t2 = new Thread(()->printNum());
        Thread t3 = new Thread(()->printNum());
        t1.start();
        t2.start();
        t3.start();

    }
    private static synchronized  void printNum(){
        int cout = 10;
        while (cout-->0){
            System.out.println(Thread.currentThread().getName()+ " : "+n++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ThreeThreadprintNum.class.notifyAll();
    }
}
