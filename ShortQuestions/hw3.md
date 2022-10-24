2. checked exception is checked during compiling while unchecked is not.
checked exception:  IOException, SQLException
unchecked exception(runtime exception): NullPointerException, IndexOutOfBoundsException
Error is also uncheck during compiling. e.g. StackOverFlowError, OutOfMemoryError
3. No. There have to be only one.
4. final result will be finally return value.
5. Runtime exception will be throwed out during runtime, not during compiling.
Checked exception will be throwed out during compiling, need to handle it before compiling. like try catch
or throws in the method
6.throw is used inside the function body to manually throw out an exception.
throws is used in the method title to overlook such exception during compiling.
7. it means to first catch the RuntimeException before catching Exception. RuntimeException extends Exception.
If we swap the places, the jvm will first catch Exception. If Exception is caught , the following catch
will not be executed. ArithmeticException and NullPointerException extend RuntimeException.
8. finally is optional. It will always be executed despite whether above catch syntax execute or not.
    try { int num = 4 / 0}
    catch (ArithmeticException e) {
        e.printStackTrace();
    } finally {
        System.out.print("Well done!");
    }
9. in some case it's required to do some clean work.
If an exception occurs like closing a file or DB connection, then the finally block is used to clean up the code.
10. java8 :
1. introduce default and static into interface
2. lambda & functional interface, optional, method preference
3. stream API
11. creational structural behavioral
12. single responsibility principle, open-closed principle,
Liskov substitution principle, interface segregation principle, and dependency inversion principle.
13.
eager load:
class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){};
    public static Singleton getInstance() {
        return instance;
    }
}

lazy load:
class Singleton {
    private static volatile Singleton instance;
    private Singleton(){};
    public static Singleton getInstance(){
        if(instance == null) {
            synchronized(Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

14. software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification
15. choose 1
16