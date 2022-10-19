# Homework 3

### 1. Practice collection
Please see see *Coding/hw3/collection* folder.
### 2. What is the checked exception and unchecked exception in Java, could you give one example?
Checked exceptions are whose that are checked by a `try{}catch(){}` statement to attempt to catch exceptions in compile time. For example, we can try catching an `IOexception` by printing out that the file does not exist. Unchecked exceptions are not caught, which will throw exceptions at run time and interrupt the process. Although we can try avoiding such exceptions, but exceptions such as `NullPointerException` and `ArrayIndexOutOfBoundsException` are usually unchecked in compile time.
### 3. Can there be multiple finally blocks?
No. Only one finally block is allowed to always execute certain codes.
### 4. When both catch and finally return values, what will be the final result?
If they both return values, then the code from `finally` block is preserved.
### 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
Checked exceptions are whose that are checked by a `try{}catch(){}` statement to attempt to catch exceptions in compile time. Unchecked exceptions are not caught, which will throw exceptions at run time and interrupt the process. 
### 6. What is the difference between throw and throws?
Throw is an operator that explicitly throws an exception, while throws is a method signature that propagates the checked exceptions that might be thrown from the method.
### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
Because all other exceptions belong to the Exception class. If we don’t write this way, all exceptions will be caught by Exception e and print out a message without checking the inherited subclasses.
### 8. What is optional? why do you use it? write an optional example.
Optional API in Java 8 is a class to allow null value to be handled without invoking NullPointerException. Example:
```
String str; //init a null object
String ret = Optional.of(str).orElse(“”); //provide default empty string if null
```
### 9. Why finally always be executed ?
It’s always executed to ensure certain actions are always done even in case of an exception that interrupts the process.
### 10. What is Java 8 new features ?
-	Stream: processes data structure in a vectorized manner like Python 
-	Optional: provides null value handling to avoid `NullPointerException` 
-	Lambda: provides functional programming support by allowing a way to provide overriding method body in a more elegant way
-	Default and static method for non-abstract method to allow extensibility in interfaces

### 11. What are the types of design patterns in Java ?
Singleton, Factory, Builder, and Publisher_Subscriber
### 12. What are the SOLID Principles ?
1.	Single Responsibility
A class should only have one responsibility to allow easy testing and loose coupling.
2.	Open/Closed
A class should open for extension but closed for modification, unless there is bug in existing code.
3.	Liskov Substitution
A subclass should do that same thing as the parent class if substituted instead of disrupting the consistency in behavior.
4.	Interface Segregation
Interfaces should be designed in a decoupled way so that when we implement one interface we only need to write minimum overriding methods.
5.	Dependency Inversion
Software modules should be designed in decouple way so that we avoid a dependency hierarchy through abstractions.

### 13. How can you achieve thread-safe singleton patterns in Java ?
1.	Eager Load
    1. Provide a `private static` field storing the new and only instance
    2. Provide a `private` constructor so that the class will not be used to create new instances
    3. Provide a `public static getInstance()` method to get the only instance of the class
2.	Lazy Load
    1. Provide a ‘private volatile’ field without creating a new stance but allowing instant update in the field
    2. Provide a `private` constructor so that the class will not be used to create new instances
    3. Check if the instance is present. If yes, return the instance. If no, allowing only one thread to continue
    4. Check if the instance is present. If yes, return the instance. If no, creating a new instance and store it to the volatile field so that threads admitted after this thread will know that when checking if the instance is present.

### 14. What do you understand by the Open-Closed Principle (OCP) ?
A class should open for extension but closed for modification, unless there is bug in existing code. If we want to enhance the class, we may want to extend it add enhanced features in the subclass.
### 15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
1. It means that if the object of type A can do something, the object of type B could also be able tp perform the same thing
### 16.  Watch the design pattern video, and type the code, submit it to MavenProject folder
Please see see *MavenProject/design-pattern* folder.