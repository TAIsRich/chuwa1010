package Singleton.Eager.Eager2;

public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();

        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance1);
    }
}
