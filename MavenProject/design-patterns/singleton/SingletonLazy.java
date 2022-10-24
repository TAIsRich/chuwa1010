public class SingletonLazy {
    private static SingletonLazy singleton;

    //basic thread-safe method (type2)
    //better use the double-lock method in slide
    private SingletonLazy(){}

    public synchronized SingletonLazy getInstance(){
        if(singleton == null){
           singleton = new SingletonLazy();
        }
        return singleton;
    }
}
