package SingletonPattern;

public class SingletonEagerLoad {
    private static SingletonEagerLoad instance = new SingletonEagerLoad();
    private SingletonEagerLoad(){

    }
    public static SingletonEagerLoad getInstance(){
        return instance;
    }
}
