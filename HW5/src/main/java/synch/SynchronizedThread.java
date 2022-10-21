package synch;

public class SynchronizedThread {
    public static void main(String[] args) throws InterruptedException {
        Thread[] ts = new Thread[]{
                new AddStudentThread(),new DecStudent(),new AddTeacher(), new DecTeacher()
        };
        for (Thread t:ts){
            t.start();
        }
        for (Thread t :ts){
            t.join();
        }
        System.out.println(Counter.studentCount);
        System.out.println(Counter.teacherCount);

    }
}
class Counter{
    public static  final Object LOCK_STUDENT = new Object();
    public static  final Object LOCK_TEACHER = new Object();
    public static  int studentCount = 0;
    public static int teacherCount =0;
}
class AddStudentThread extends  Thread{
    @Override
    public void run() {
        for(int i = 0; i<10000; i++){
            synchronized (Counter.LOCK_STUDENT){
                Counter.studentCount+=1;
            }
        }
    }
}
class DecStudent extends Thread{
    @Override
    public void run() {
        for(int i =0; i<10000; i++){
            synchronized (Counter.LOCK_STUDENT){
                Counter.studentCount-=1;
            }
        }
    }
}
class AddTeacher extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<10000; i++){
            synchronized (Counter.LOCK_TEACHER){
                Counter.teacherCount+=1;
            }
        }
    }
}
class DecTeacher extends  Thread {
    @Override
    public void run(){
        for(int i= 0; i<10000; i++){
            synchronized (Counter.LOCK_TEACHER){
                Counter.teacherCount-=1;
            }
        }
    }
}