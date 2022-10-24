package Singleton.FalseLazy;

/**
 * @Version v1.0
 * @Description TODO
 * @Author Wenbo Geng
 * @Date 10/18/22 12:02 AM
 * @ClassName Client
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
    }
}
