package threadPractice.create.basic_thread_handle;

import threadPractice.create.ThreadTest;

public class Daemon {
    public static void main(String[] args) {
        Thread p1 = new Thread(new People());
        Thread g2 = new Thread(new God());
        Thread g = new Thread(new God());
        g2.setDaemon(true);
        g2.start();
        p1.start();
        g.setDaemon(true);
        g.start();
        System.out.println("Main end");

    }

}
class  People implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<5;i++){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("People alive");
        }
        System.out.println("People thread end");
    }
}
class God implements Runnable{

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("God bless you");
        }
    }
}
