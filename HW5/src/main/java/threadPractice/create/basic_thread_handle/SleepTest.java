package threadPractice.create.basic_thread_handle;

public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()-> {System.out.println("t thread starts....");
        try{
            System.out.println("t thread starts to sleep 5 second");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("t thread done");
        });
        System.out.println("Main thread start");
        t.start();
        Thread.sleep(3000);
        System.out.println("Main Thread start to sleep 3 s");;
        System.out.println("Main thread done");
    }
}
