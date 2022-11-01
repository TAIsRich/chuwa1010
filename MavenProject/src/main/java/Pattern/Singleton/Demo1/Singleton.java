package Pattern.Singleton.Demo1;

public class Singleton {
//    Eager Mode
    private Singleton() {};

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
