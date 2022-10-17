package org.example.singleton;

public class Singletond {
    //lazy thread-safe
    private Singletond(){}

    private static volatile Singletond instance;

    // same object
    public static  Singletond getInstance(){
        if(instance == null){
            synchronized (Singletond.class){
                if (instance == null) {
                    instance = new Singletond();
                }
            }
        }
        return instance;
    }
}
