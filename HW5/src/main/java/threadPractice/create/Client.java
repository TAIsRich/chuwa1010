package threadPractice.create;

import java.util.concurrent.Callable;

public class Client {
    public static void main(String[] args) {

        //Extends Thread Example
        ThreadTest t = new ThreadTest();
        t.start();

        //Runnable Example
        RunnableExmp r = new RunnableExmp();
        Thread t1= new Thread(r);
        t1.start();


        //Callable
        System.out.println("+++++++++++++++++++++++++++++++++");
        Callable<String> callable = new CallableExamp();

    }
}
