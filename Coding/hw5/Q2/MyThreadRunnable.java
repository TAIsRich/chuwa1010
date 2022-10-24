package org.example;

public class MyThreadRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("New Thread using Runnable");
    }
}
