public class SingletonLazy {
    // 1. static volatile variable
    private static volatile SingletonLazy instance;

    //2. make constructor to be private
    private SingletonLazy() {}

    //3. static synchronized getInstance method
    public static SingletonLazy getInstance() {
        //4. make sure thread safe, improve performance
        if (instance == null) {
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
