package Singleton.Lazy2;

/**
 * @Version v1.0
 * @Description TODO
 * @Author Wenbo Geng
 * @Date 10/18/22 12:13 AM
 * @ClassName Singleton
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
