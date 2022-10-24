package org.example.singleton;

public class Singletonb {

    private  Singletonb(){}


    private static Singletonb instance;

    //assign value
    static {
        instance = new Singletonb();
    }

    public static Singletonb getInstance(){
        return instance;
    }
}
