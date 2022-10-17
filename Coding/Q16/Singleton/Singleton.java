package Pattern.Singleton.Demo5;

public class Singleton {
    private Singleton() {};

    private static class SingletonHoldr {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHoldr.INSTANCE;
    }
}
