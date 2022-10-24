package Singleton.FalseLazy;

/**
 * @Version v1.0
 * @Description TODO
 * @Author Wenbo Geng
 * @Date 10/18/22 12:02 AM
 * @ClassName Singleton
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        instance = new Singleton();
        return instance;
    }
}
