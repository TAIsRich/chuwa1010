package org.example;

public class Singleton{
    //1.static volatile variable
    private static volatile Singleton instance;

    //2. make private constructor be private to make sure cannot make new
    private Singleton(){
    }
    //3. public static synchronized getInstance method, static保证在没有instance的情况下，可以调该方法。
    public static Singleton getInstance(){
        //4. make sure thread safe, improve performance
        if(instance == null){
            synchronized(Singleton.class) {
                if(instance== null){
                    instance= new Singleton();
                }
            }
        }
        return instance;
    }
}