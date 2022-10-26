package Singleton.lazy;

public class Singleton_1 {
    private Singleton_1(){};

    private static volatile Singleton_1 instance;

    //use synchronized for thread safe
    public static Singleton_1 getInstance() {
        if (instance == null) {
            synchronized (Singleton_1.class){
                if (instance == null){
                    instance = new Singleton_1();
                }
            }
        }
        return instance;
    }
}
