package org.example;

import java.util.concurrent.Callable;

public class MyThreadCallable implements Callable<String> {
    @Override
    public String call() throws Exception{
        Thread.sleep(500);
        return "new thread using Callable";
    }
}


