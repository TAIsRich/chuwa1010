package org.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);

        Runnable task1 = new MyThreadRunnable();
        es.submit(task1);

        Callable<String> task2 = new MyThreadCallable();
        es.submit(task2);

        Thread task3 = new MyThreadExtends();
        es.submit(task3);

    }
}