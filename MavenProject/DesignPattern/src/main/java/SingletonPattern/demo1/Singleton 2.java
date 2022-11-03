package SingletonPattern.demo1;

public class Singleton {
    private Singleton() {}
    //在本类中创造本类对象
    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
