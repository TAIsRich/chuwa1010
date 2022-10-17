package org.example.singleton;

public class Singletonc {
    // Lazy Instantiation
    // creation of instance when required.
    private Singletonc(){}

    private static Singletonc instance;

    // same object
    public static synchronized Singletonc getInstance(){
        if(instance == null){
            instance = new Singletonc();
        }
        return instance;
    }
}
