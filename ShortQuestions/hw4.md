### 1. What is generic in Java? and type the generic code by yourself.
a. https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t01_basic/generic

### 2. Read those codes and type it one by one by yourself. the push the code to your branch.
https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8

### 3. practice stream API at least 3 times
a. https://blog.devgenius.io/15-practical-exercises-help-you-master-javastream-api-3f9c86b1cf82

### 4. Write the Singleton design pattern include eager load and lazy load.
Eager load
```java
public class Singleton{
  private static Singleton instance = new Singleton();
  private Singleton(){}
  
  public static Singleton getInstance(){
    return instance;
  }
}
```
```java
public class Singleton{
  private static volatile Singleton instance;
  private Singleton(){}
  public static Singleton getInstance(){
    if(instance == null){
      synchronized(Singleton.class){
        if(instance == null){
          instance = new Singleton();
        }
      }
    }
    return instance;
  }
}
```



### 5. What is Runtime Exception? could you give me some examples?

Null pointer exception, and integer division arithmatic exception.

### 6. Could you give me one example of NullPointerException?

One example is calling a method in for an object but the object has not been initialized yet or the object is null.

### 7. What is the Optional class?

Optional class is a class that wraps an object and provides methods for doing null checking on the wrapped object.

### 8. What is the @FunctionalInterface?

Functional interface is an anotation that is used in a functional interface to limits the interface to have only one abstract methods. But tha interface can have many default methods.

### 9. what is lamda?

Lambda function is a block of code that takes an arguments and returns a result. They performs just like a method but they do not need a method name.

### 10. What is Method Reference?

Method reference is used to refer method of functional interface. It is compact and easy form of lambda expression.

### 11. What is Java 8 new features?

Reference; Default method and static method in interface; Lambda&Functional Interface; Optional; Method Reference; Stream API

### 12. Lambda can use unchanged variable outside of lambda? what is the details?
As long as the variable contain remains unchanged or it's a final variable.
