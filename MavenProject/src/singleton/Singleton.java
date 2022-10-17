public class Singleton{
    // private constructor
    private Singleton(){}

    // create a class object within the class block
    private static Singleton instance = new Singleton();

    // provide a static method, to externally to get the object
    public static Singleton getInstance(){
        return instance;
    }
}