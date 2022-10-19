package SingletonPattern;

public class SingletonLazyLoad {
    private static volatile SingletonLazyLoad instance;

    private SingletonLazyLoad(){

    }

    public static SingletonLazyLoad getInstance(){
        if (instance == null){
            synchronized (SingletonLazyLoad.class){
                if (instance == null){
                    instance = new SingletonLazyLoad();
                }
            }
        }
        return instance;
    }
}
