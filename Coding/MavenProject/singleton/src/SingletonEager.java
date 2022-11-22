//Design Pattern - Eager load of Singleton

public class SingletonEager {

    //1. static volatile variable
    private static volatile SingletonEager instance = new SingletonEager();

    //2. make constructor private
    //JVM would automatically make a public constructor if we do not make it
    private SingletonEager() {}

    //3.static getInstance method
    //static 可以保证在没有instance的情况下仍可调用该方法
    public static SingletonEager getInstance() {
        return instance;
    }
}
