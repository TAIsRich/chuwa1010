package com.chuwa.pattern.singleton.demo2;

// Eager Load --- Method 2: static block method
public class Singleton {
    //1. private constructor
    private Singleton(){}

    //2. static variable
    // note that we do not use "new" keyword to create this instance,
    // so right now instance == null
    private static Singleton instance;

    //3. give value to instance in static block
    static{
        instance = new Singleton();
    }

    //4. public access
    public static Singleton getInstance(){
        return instance;
    }
}
