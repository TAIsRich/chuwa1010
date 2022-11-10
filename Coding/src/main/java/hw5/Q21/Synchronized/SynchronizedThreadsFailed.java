package hw5.Q21.Synchronized;

public class SynchronizedThreadsFailed {
    public static void main(String[] args) throws InterruptedException {
        Thread[] ts = new Thread[]{
                new AddStudentThread(),
                new DesStudentThread(),
                new AddTeacherThread(),
                new DecTeacherThread()
        };
        for (Thread t : ts) {
            t.start();
        }
        for (Thread t : ts) {
            t.join();
        }
        System.out.println(Counter.studentCount);
        System.out.println(Counter.teacherCount);
    }
}

class Counter1 {
    public static final Object LOCK_STUDENT = new Object();
    public static final Object LOCK_TEACHER = new Object();
    public static final Object LOCK_COMMON = new Object();
    public static int studentCount = 0;
    public static int teacherCount = 0;
}

class AddThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Counter1.LOCK_STUDENT){
                Counter1.studentCount += 1;
            }
        }
    }
}

class DesThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Counter1.LOCK_TEACHER) {
                Counter1.studentCount -= 1;
            }
        }
    }
}

class AddThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Counter1.LOCK_COMMON) {
                Counter1.teacherCount += 1;
            }
        }
    }
}

class DecThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Counter1.LOCK_COMMON) {
                Counter.teacherCount -= 1;
            }
        }
    }
}