package hw5.Q21.ExecutorFramework;

import java.util.concurrent.Executor;

public class ThreadExecutorExample {
    public static void main(String[] args) {
        DumbExecutor myExecutor = new DumbExecutor();
        MyTask myTask = new MyTask();
        myExecutor.execute(myTask);
    }

    static class DumbExecutor implements Executor {
        @Override
        public void execute(Runnable runnable) {
            Thread newThread = new Thread(runnable);
            newThread.start();
        }
    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Mytask is running now ...");
        }
    }
}
