package com.chuwa.learn;

//public class Singleton {
//    /* Eager 1
//    private static Singleton instance = new Singleton();
//    private Singleton(){}
//    public static Singleton getInstance(){
//        return instance;
//    }*/
//
//
//    /* Eager 2
//    private static Singleton instance;
//    private Singleton(){}
//    static {
//        instance = new Singleton();
//    }
//    public static Singleton getInstance() {
//        return instance;
//    }*/
//
//    }

// Eager 3
//public enum Singleton {
//    INSTANCE;
//}


public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    //Lazy 1
//    public static Singleton getInstance(){
//        if(instance==null)
//            instance= new Singleton();
//        return instance;
//    }

    //Lazy 2
//    public static synchronized Singleton getInstance(){
//        if(instance==null)
//            instance= new Singleton();
//        return instance;
//    }

    //Lazy 3
//    public static Singleton getInstance(){
//        if(instance==null) {
//            synchronized(Singleton.class){
//                if(instance==null)
//                    instance= new Singleton();
//            }
//        }
//        return instance;
//    }

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}