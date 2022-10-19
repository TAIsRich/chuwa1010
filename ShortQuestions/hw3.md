### What is the checked exception and unchecked exception in Java, could you give one example?

In Java, exceptions under Error and RuntimeException classes are unchecked exceptions, 
everything else under throwable is checked.
These are the exceptions that are checked at compile time. If some code within a method throws a checked exception, 
then the method must either handle the exception or it must specify the exception using the throws keyword. 
In checked exception, there are two types: fully checked and partially checked exceptions.
A fully checked exception is a checked exception where all its child classes are also checked, like IOException, InterruptedException
A partially checked exception is a checked exception where some of its child classes are unchecked, like Exception.
![image](https://media.geeksforgeeks.org/wp-content/uploads/Exception-in-java1.png)

### Can there be multiple finally blocks?
You can only have one finally clause per try/catch/finally statement, but you can have multiple such statements, either in the same method or in multiple methods.

Basically, a try/catch/finally statement is:

try
catch (0 or more)
finally (0 or 1)

### When both catch and finally return values, what will be the final result?
In a try-catch-finally block that has return statements, only the value from the finally block will be returned

### What is Runtime/unchecked exception? what is Compile/Checked Exception?
lets see if i can answer this after reviewing.

### What is the difference between throw and throws?
Both throw and throws are concepts of exception handling in Java. 
The throws keyword is used to declare which exceptions can be thrown from a method, 
while the throw keyword is used to explicitly throw an exception within a method or block of code.
(https://rollbar.com/blog/how-to-use-the-throws-keyword-in-java-and-when-to-use-throw/)

### code problem
Because Runtime exception is subclass of Exception, which means the Runtime Exception is included by Exception. 
If we put the Exception before runtime Exception, even though JVM find a runtime exception,
it will be thrown as exception instead. Because both exception and runtime exception can find it, and the exception is before it, the exception would be thrown everytime and the runtime exception would never be thrown.

###  What is optional? why do you use it? write an optional example.
An Optional object can have one of the following possible states:

Present: The Optional object does not represent absence. A value is in the Optional object and it can be accessed by invoking get().
Absent: The Optional object does represent absence of a value; you cannot access its content with get().

Optional is generally used as a return type for methods that might not always have a result to return. For example, a method that looks up a user by ID might not find a match, in which case it would return an empty Optional.

Optional can help to reduce the number of null pointer exceptions in your code. It is not intended as a replacement for existing reference types, such as String or List, but, rather, as an addition to the Java type system.

### Why finally always be executed ?
We need a block to protect our program even though an exception thrown.
For example, close file or buffer in finally to make sure that although has exception, 
the file can be closed successfully before program end.

### What is Java 8 new features ?
- Reference
- Default method and static method in interface
- Lambda & Functional Interface
- Lambda 
1.to replace anonymous inner class
2.Lambda can use unchanged variable outside of lambada
- Optinal
- Method Reference
- Stream API

### What are the types of design patterns in Java ?

`Creational Design Pattern:`
```
Factory Pattern
Abstract Factory Pattern
Singleton Pattern
Prototype Pattern
Builder Pattern
```
`Structural Design Pattern:`
```
Adapter Pattern
Bridge Pattern
Composite Pattern
Decorator Pattern
Facade Pattern
Flyweight Pattern
Proxy Pattern
```
`Behavioral Design Pattern:`
```
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
```

### What are the SOLID Principles ?
`single-responsibility` each class should only support one responsibility

`open-close` add new feature but do not change the existing code

`liskov substitution` parent object can call subclass function and the function should get a correct result and have no exception or error

`interface segregation` to make the interfaces hava each single and less functional blueprint to avoid the implement class have to override useless logic

`dependency inversion` class should depend on abstract class or interface rather than concrete class



### How can you achieve thread-safe singleton patterns in Java ?
看课件 熟记singleton pattern
There are three ways through which we can achieve thread safety.

Create the instance variable at the time of class loading. Pros:
Thread safety without synchronization
Easy to implement
Cons:

Early creation of resource that might not be used in the application.
The client application can’t pass any argument, so we can’t reuse it. For example, having a generic singleton class for database connection where client application supplies database server properties.
Synchronize the getInstance() method. Pros:
Thread safety is guaranteed.
Client application can pass parameters
Lazy initialization achieved
Cons:

Slow performance because of locking overhead.
Unnecessary synchronization that is not required once the instance variable is initialized.
Use synchronized block inside the if loop and volatile variable Pros:
Thread safety is guaranteed
Client application can pass arguments
Lazy initialization achieved
Synchronization overhead is minimal and applicable only for first few threads when the variable is null.
Cons:

Extra if condition



### What do you understand by the Open-Closed Principle (OCP) ?
It tells you to write your code so that you will be able to add new functionality without changing the existing code. 
That prevents situations in which a change to one of your classes also requires you to adapt all depending classes.

### 15 A
Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be
substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
1. It mean that if the object of type A can do something, the object of type B could also be able tp
   perform the same thing
2. It means that all the objects of type A could execute all the methods present in its subtype B
3. It means if a method is present in class A, it should also be present in class B so that the object of
   type B could substitute object of type A.
4. It means that for the class B to inherit class A, objects of type B and objects of type A must be same