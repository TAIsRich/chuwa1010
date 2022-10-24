# hw3

*2. What is the checked exception and unchecked exception in Java, could you give one example?*

 In general, checked exceptions represent errors outside the control of the program. For example, the constructor of *[FileInputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/FileInputStream.html#%3Cinit%3E(java.io.File))* throws *FileNotFoundException* if the input file does not exist.

If a program throws an unchecked exception, it reflects some error inside the program logic.For example, if we divide a number by 0, Java will throw *ArithmeticException*:

*3. Can there be multiple finally blocks?*

No

*4. When both catch and finally return values, what will be the final result?*

If both catch and finally return, the receiving method will get the returned value from the finally block.

*5. What is Runtime/unchecked exception? what is Compile/Checked Exception?*

Checked exceptions represent errors outside the control of the program. For example, the constructor of FileInputStream throws *FileNotFoundException* if the input file does not exist.

A checked exception is caught at compile time whereas a runtime or unchecked exception is at runtime.

If a program throws an unchecked exception, it reflects some error inside the program logic.

For example, if we divide a number by 0, Java will throw ArithmeticException.

A checked exception must be handled either by re-throwing or with a try catch block, whereas an unchecked isn't required to be handled.

*6. What is the difference between throw and throws?*

Both throw and throws are concepts of exception handling in Java. The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.

*7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime* *exception before Exception ?*

Because the best practise of error handling is that we handle small errors first, and divided by zero is a small bug could be caught by easy check.  It's an unchecked exception is at runtime. So we put the Runtime exception before Exception.

*8. What is optional? why do you use it?*

Optional is a new type introduced in Java 8. It is used to represent a value that may or may not be present. In other words, an Optional object can either contain a non-null value (in which case it is considered *present*) or it can contain no value at all (in which case it is considered *empty*).

Optional optional = Optional.of("value");

Optional can help to prevent **NullPointerException** errors by making it explicit when a variable may or may not contain a value. This can lead to cleaner and more readable code. Additionally, Optional provides several methods that can be used to safely work with data that may or may not be present. Another benefit of using Optional is that it can be used as an ordinary class, which means that there is no need for special syntax for invoking methods or accessing fields.

1. *Why finally always be executed ?*

Some resource cleanup, such as closing a file, needs to be done even if an exception is thrown. To do this, we can use

a finally block.

*10. What is Java 8 new features ?*

### **Functional Interfaces And Lambda Expressions**

In Java 8, a new notion called functional interfaces was introduced. A Functional Interface is an interface that has exactly one abstract method. To designate an interface as a Functional Interface, we don’t need to use the @FunctionalInterface annotation. One of the most appealing features of the functional interface is creating objects using lambda expressions. We can create an interface using an anonymous class, but the code is cumbersome.

Lambda Expressions, on the other hand, express instances of Functional Interfaces from a different viewpoint. Lambda Expressions implement functional interfaces by implementing the single abstract function provided in the functional interface.

### **forEach() Method In Iterable Interface**

In Java 8, the Java.lang interface now supports a “forEach” function. Iterable that can iterate over the collection’s items. The Iterable interface has a default method called “forEach.” Collection classes use it to iterate items, which extends the Iterable interface.You may send Lambda Expression as an argument to the “forEach” method, which accepts the Functional Interface as a single parameter.

### **Optional Class**

In Java 8, the “java.util” package included an optional class. The public final class “Optional” is used to handle NullPointerException in a Java program. You may give other code or values to execute using Optional. Thus, optional reduces the number of null checks required to avoid a nullPointerException.

### **Java Stream API For Bulk Data Operations On Collections**

Another significant feature in Java 8 is the Stream API. The Stream API is used to handle a collection of items and allows many iterations. A Stream is a collection of items (elements) that enables you to combine multiple techniques to achieve your goals.

*11. What are the types of design patterns in Java ?*

Java Design Patterns are divided into three categories - **creational**, **structural**, and **behavioral** design patterns.

Creational design pattern includes: 1. Singleton Pattern 2. Factory Pattern 3. Abstract Factory Pattern 4. Builder Pattern 5. Prototype Pattern

Structural design pattern includes : 1.  Adapter Pattern  2. Composite Pattern 3. Proxy Pattern. 4. Flyweight Pattern 5. Facade Pattern 6. Bridge Pattern 7. Decorator Pattern

Behavioral Design Patterns includes 1. Template Method Pattern 2. Mediator Pattern 3. Chain of Responsibility Pattern 4. Observer Pattern5. Strategy Pattern  6. Command Pattern 7. State Pattern 8. Visitor Pattern 9. Interpreter Pattern 10. Iterator Pattern 11. Memento Pattern

1. What are the SOLID Principles ?
    
    SOLID is an acronym for the first five object-oriented design (OOD) principles by Robert C. Martin. These principles establish practices that lend to developing software with considerations for maintaining and extending as the project grows. Adopting these practices can also contribute to avoiding code smells, refactoring code, and Agile or Adaptive software development.
    
    SOLID stands for:
    
    S - Single-Responsibility Principle
    
    O - Open-Closed Principle
    
    L -Liskov Substitution Principle
    
    I -Interface Segregation Principle
    
    D- Dependency Inversion Principle
    

13. *How can you achieve thread-safe singleton patterns in Java ?**

There are three ways through which we can achieve thread safety.

1. Create the instance variable at the time of class loading.
2. Synchronize the getInstance() method**.**
3. Use synchronized block inside the if loop and volatile variable*

```java
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {

    }
    public static Singleton getInstance() {
        if (instance == null) {
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

*14. What do you understand by the Open-Closed Principle (OCP) ?*

The Open-Closed Principle (OCP) states that software entities (classes, modules, methods, etc.) should be open for extension, but closed for modification. In practice, this means creating software entities whose behavior can be changed without the need to edit and recompile the code itself; So if you want to add additional functionality, or change the functionality of a class, create a subclass instead of changing the original. This way, anyone using the parent class does not have to worry about it changing later on. Basically, it's all about backwards compatibility.

*15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.*
*1. It mean that if the object of type A can do something, the object of type B could also be able tp*
*perform the same thing*
*2. It means that all the objects of type A could execute all the methods present in its subtype B*
*3. It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.*
*4. It means that for the class B to inherit class A, objects of type B and objects of type A must be same.*

A: choose 3

*16. Watch the design pattern video, and type the code, submit it to MavenProject folder*