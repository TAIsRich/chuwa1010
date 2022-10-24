#### 4. Write the Singleton design pattern include eager load and lazy load.
Eager Load:
```java
public class Singleton{
    private static Singleton instance = new Singleton();
    
    private Singleton(){};
    
    public static Singleton getInstance(){
        return instance;
    }
}
```

Lazy Load:

```java
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {};
    
    public static Singleton getInstance() {
        if (instance == null){
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```
#### 5. What is Runtime Exception? could you give me some examples?
```
Runtime Exception: Java does not verify unchecked exceptions at compile time

Eg. NullPointerException, ArrayIndexOfBoundException

```
#### 6. Could you give me one example of NullPointerException?

```java
import java.util.ArrayList;

public class Exception {
    List<Integer> list = null;
    int a = list.size(); // Null Pointer Exception
}



```
#### 7. What is the Optional class?
```
the Optional class is a container that can hold, at max, one value and gracefullt deals with null values
To avoid Null checks and run time NullPointerException
```
#### 8. What is the @FunctionalInterface?
```
The @FunctionalInterface annotation is an informative annotation that indicates whether or not an interface type declaration is meant to be a functional interface
Functional Interface has one single Abstract method, can have many default method
```
#### 9. what is lambda?
```
To replace anonymous inner class
work with functional interface
```
#### 10. What is Method Reference?
```
Method references are a special type of lambda expressions
Method reference is used to refer method of function interface
```
#### 11. What is Java 8 new features?
```
1. Default Method and static method in interface
2. Lambda & Functional Interface
3. Optional
4. Method Reference
5. Stream API
```
