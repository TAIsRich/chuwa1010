package Singleton.Eager;

/**
 * @Version v1.0
 * @Description TODO
 * @Author Wenbo Geng
 * @Date 10/17/22 11:53 PM
 * @ClassName Singleton
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    public static Singleton getInstance() {
        return instance;
    }
}
