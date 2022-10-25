package Singleton.lazy;

public class Singleton {
    private Singleton(){};

    private static Singleton instance;

    //use synchronized for thread safe
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
