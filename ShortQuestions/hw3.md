## HW3
### What is the checked exception and unchecked exception in Java, could you give one example?
Exception is an unwanted or unexpected event, which occurs during the execution of a program.
Checked Exception:
- something has gone wrong in your code and is recoverable
- are checked and handled during the **compile-time**
- handle either by re-throwing or a try-catch block 
- directly inherit Throwable class except RuntimeException and Error, and extend Exception class

include:
- SQLException
- IOException
- ClassNotFoundException
- InvocationTargetException
- FileNotfound Exception

Unchecked Exception:
- something has gone wrong with the program logic and is unrecoverable
- are checked during the **runtime** and occurs during the execution of a program
- the cause of unchecked exceptions is mostly due to **programming errors** like **attempting to access an element with an invalid index, and calling the method with illegal arguments,** etc.
- unlike the checked exceptions, **the compiler generally ignores the unchecked exceptions during compilation**, and the compiler does not check whether the user program contains the code to handle them or not
- directly inherit RuntimeException, and extend Exception class

include:
- ArithmeticException
- NullPointerException
- ArrayIndexOutOfBoundsException
- NumberFormatException
- InputMismatchException
- IllegalArgumentException
- IllegalStateException
- ClassCastException
- Missing Resource Exception
- No Such Element Exception
- Undeclared Throwable Exception
- Empty Stack Exception

note:
keyword "throw":
- produce a exception
- can be used in checked/unchecked exception

try-catch block:
- handle an exception: produce, print or solve
- can be used in checked/unchecked exception
### Can there be multiple finally blocks?
- finally can only be used once with a try or try-catch block. 
- It is optional in the try-catch block.
- It will be executed whether or not the exception is handled.
- It will still be executed if there is a return statement in the catch clause.
- there is only one finally clause following a try-catch statement, but you can have a nested combination formed by many try-catch-finally blocks, ie. the try blocks are as many as the finally blocks as below:
```
```
try {
    try {

    } 
    catch() { // could be more than one

    } 
    finally {

    }
}
catch() { // could be more than one
}
finally {

}

### When both catch and finally return values, what will be the final result?
finally return value will be the final result.
### Why does finally always be executed ?
The finally block is always get executed unless there is an abnormal program termination either resulting from a JVM crash or from a call to System.exit().
Assume some certain statements in a program need to be executed, whether the exception has occurred or not and whether the exception has been catched or not, which explains why Java provides the keyword finally.
### What is optional? Why do you use it? Write an optional example.
Optional is a container object used to contain not-null objects.
It is used to avoid Null Checks and run time NullPointerExceptions.
Example:
public class OptionalDemo{
    public static void main{String[] args){
        String[] words= new String[10];
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if(checkNull.isPresent()){
            String word= words[5].toLowerCase();
            System.out.println(word);
        }else {
            System.out.println("word is null");
        }
    }
}

### Practice collection problems
See the code in "collection" folder under "Coding".
### What are Java 8 new features?
- Default method and static method in interface
- Lamdba & functional Interface
- Optional
- Method reference
- Stream API

### What are the types of design patterns in Java?
1.Creational Design Pattern
Creational design patterns are concerned with the way of creating objects. These design patterns are used when a decision must be made at the time of instantiation of a class (i.e. creating an object of a class).
    Factory Pattern
    Abstract Factory Pattern
    Singleton Pattern
    Prototype Pattern
    Builder Pattern.
2. Structural Design Pattern
Structural design patterns are concerned with how classes and objects can be composed, to form larger structures.
The structural design patterns simplifies the structure by identifying the relationships.
These patterns focus on, how the classes inherit from each other and how they are composed from other classes.
   Adapter Pattern
   Bridge Pattern
   Composite Pattern
   Decorator Pattern
   Facade Pattern
   Flyweight Pattern
   Proxy Pattern
3. Behavioral Design Pattern
   Behavioral design patterns are concerned with the interaction and responsibility of objects. In these design patterns, the interaction between the objects should be in such a way that they can easily talk to each other and still should be loosely coupled. That means the implementation and the client should be loosely coupled in order to avoid hard coding and dependencies.
   Chain Of Responsibility Pattern
   Command Pattern
   Interpreter Pattern
   Iterator Pattern
   Mediator Pattern
   Memento Pattern
   Observer Pattern
   State Pattern
   Strategy Pattern
   Template Pattern
   Visitor Pattern

### What are the SOLID Principles?
S - Single Responsibility Principle:
- A class should only have one reason to change, which means each class should be responsible for a single part or functionality of the system.
- As many as you can to break the classes into smaller classes to add new features.

O - Open-closed Principle:
- The software entities (classes, modules, and functions, etc.) should be open for extension, but closed for modification, which means a class should be extendable without modifying the class itself.

L - Liskov's Substitution Principle:
- The principle was introduced by Barbara Liskov in 1987. According to this principle, each derived class or subclass must be substitutable for its base or parent class.
- This principle ensures that any subclass which has a parent class should be usable in place of its parent without any unexpected behavior.

I - Interface Segregation Principle:
- A client should never be forced to implement an interface that it does not use, or clients should not be forced to depend on the methods they do not use.

D - Dependency Inversion Principle:
- Entities must depend on abstractions (interfaces or abstract classes) but not concrete implementations (classes).
- High-level modules must not depend on the low-level modules, but they should depend on abstractions.
- Abstractions should not depend on details, and instead, details should depend on abstractions

### How can you achieve the thread-safe singleton pattern in Java?
**Eager load**
public class Singleton{
    //1.static variable
    private static Singleton instance = new Singleton();

    //2. make private constructor be private to make sure cannot make new
    private Singleton(){
    }
    //3. public static getInstance method, static保证在没有instance的情况下，可以调该方法。
    public static Singleton getInstance(){
        return instance;
    }
}

**Lazy load**
public class Singleton{
    //1.static volatile variable
    private static volatile Singleton instance;

    //2. make private constructor be private to make sure cannot make new
    private Singleton(){
    }
    //3. public static synchronized getInstance method, static保证在没有instance的情况下，可以调该方法。
    public static Singleton getInstance(){
        //4. make sure thread safe, improve performance
        if(instance == null){
            synchronized(Singleton.class) {
                if(instance== null){
                    instance= new Singleton();
                }
            }
        }
        return instance;
    }
}

### What do you understand by the Open-Closed Principle (OCP)?
- An inheritance, interface, or abstract class can achieve a different form without changing anything inside the origin class.
- It should not crash or break out of the current code due to some specific tiny changes, which means the code should use inheritance, interface or abstract as many and flexible as it can reach out.
- In inheritance, we should use a class without any possible modifications. We define a set of methods in an interface or abstract class, and the interface or abstract class defines a contract that itself is closed for any modification.

### Liskov's Substitution Principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (OA problem)
answer: 1
1. It means that if the object of type A can do something, the object of type B could also be able to perform the same thing.
2. It means that all the objects of type A could execute all the methods present in its subtype B.
3. It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A. (not must be present explicitly, can inherit implicitly)
4. It means that for the class B to inherit class A, objects of type B and objects of type A must be same.

### Watch the design pattern video, type the code, and submit it to the MavenProject folder.
        singleton: https://www.bilibili.com/video/BV1Np4y1z7BU?p=22
        Factory: https://www.bilibili.com/video/BV1Np4y1z7BU?p=35&vd_source=310561eab1216a27f7accf859bf7f6d9
        Builder: https://www.bilibili.com/video/BV1Np4y1z7BU?p=50&vd_source=310561eab1216a27f7accf859bf7f6d9
        Publisher_Subscriber: https://www.bilibili.com/video/BV1Np4y1z7BU?p=114&vd_source=310561eab1216a27f7accf859bf7f6d9
Code is in the "designPattern" folder under "Coding".