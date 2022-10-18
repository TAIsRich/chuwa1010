package Singleton.Lazy;

/**
 * @Version v1.0
 * @Description TODO
 * @Author Wenbo Geng
 * @Date 10/18/22 12:06 AM
 * @ClassName Singleton
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }

    // 对外提供公共访问方式
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
