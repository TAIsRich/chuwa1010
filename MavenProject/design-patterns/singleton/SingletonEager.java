public class SingletonEager {
    private static SingletonEager singleton = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return singleton;
    }
}
