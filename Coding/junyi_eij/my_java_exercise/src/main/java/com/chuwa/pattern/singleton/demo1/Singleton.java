package com.chuwa.pattern.singleton.demo1;


// Eager Load --- Method 1: static variable method (Need to remember )
// What is Eager Load? The Singleton will be created immediately when class loading
// This means that when JVM is doing class loading, the object will be in the memory space
// and if we are not going to use this object right now, or even for a long time
// it will cause the waste of memory
public class Singleton {
    // 1. private constructor
    private Singleton(){}

    //2. create the object itself inside this class
    // note that we have to make it static because getInstance() need a static object as return
    private static Singleton instance = new Singleton();

    //3. provide a public method to make people outside access this object
    // a. why static? because the outside cannot create Singleton object
    //      Not be able to create an object means not be able to use public method of this object
    //      But static method is available
    //      Also, static variable will only be loaded once, it obeys Singleton Concept
    // b. this function should just return the Singleton Object
    //
    public static Singleton getInstance(){
        return instance;
    }

}
