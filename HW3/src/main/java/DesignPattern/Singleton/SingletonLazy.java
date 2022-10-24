package DesignPattern.Singleton;

public class SingletonLazy {
    private static SingletonLazy obj;

    private SingletonLazy() {}

    // Only one thread can execute this at a time
    public static synchronized SingletonLazy getInstance()
    {
        if (obj==null)
            obj = new SingletonLazy();
        return obj;
    }

}
