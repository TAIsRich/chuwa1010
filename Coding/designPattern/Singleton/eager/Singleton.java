package org.example;

public class Singleton {
    //1.static variable
    private static Singleton instance= new Singleton();
    //2. make private constructor be private to make sure cannot make new
    private Singleton(){

    }
    //3. public static getInstance method, static保证在没有instance的情况下，可以调该方法。
    public static Singleton getInstance(){
        return instance;
    }
}
