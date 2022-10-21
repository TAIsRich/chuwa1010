4.
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
    public static Single getInstance(){
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

5.runtime exception is unchecked exception which will not be checked during compiling.
e.g. NullPointerException IndexOutOfBoundsException ArithmeticException

6.
int[] arr = {1, 2, 3, 4, 5};
return arr[5];

7.Optional class is aimed to solve the multiple null check,
which reduce the lines of code and gracefully deals with null values.
To avoid Null checks and run time NullPointerExceptions

8.
@FunctionalInterface is aimed to check whether the interface follows the format correctly,
 which is that the interface has only one abstract method and can have multiple default methods.
 do the sanity check

 9.to replace anonymous inner class;
 work with functional interface

 10.functional interface in java8 and lambda is the prerequisites of method reference.
 method reference is compact, easy to read comparing to lambda expressions. method reference is
 the shorthand syntax for a lambda expression that contains only one method call
 1.Static Method Reference.
 2.Instance Method Reference of a particular object.
 3.Instance Method Reference of an arbitrary object of a particular type.
 4.Constructor Reference.

11.
interface can have default and static methods
optional class
functional interface & lambda
method reference
steam api

12.
final variable
non-final variable however never changed since created
object variable can set its own variables, but can not be assigned to new memory

