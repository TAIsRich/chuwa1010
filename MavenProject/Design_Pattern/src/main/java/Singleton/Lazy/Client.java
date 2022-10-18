package Singleton.Lazy;

import Singleton.Eager.Singleton;

/**
 * @Version v1.0
 * @Description TODO
 * @Author Wenbo Geng
 * @Date 10/18/22 12:06 AM
 * @ClassName Client
 */
public class Client {
    public static void main(String[] args) {
        Singleton.Eager.Singleton instance1 = Singleton.Eager.Singleton.getInstance();
        Singleton.Eager.Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance1);
    }
}
