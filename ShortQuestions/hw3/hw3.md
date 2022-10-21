1. Practice Colletion
  - Please see in folder hw3/MavenProject/mvn_proj/src/main/java/com/chuwa/collection
2. What is the checked exception and unchecked exception in Java, could you give one example?
-  A checked exception in Java represents a predictable, erroneous situation that can occur even if a software library is used as intended. 
    -  Checked exceptions are checked at compile-time. It means if a method is throwing a checked exception then it should handle the exception using try-catch block or it should declare the exception using throws keyword.
    -  For example, if a developer tries to access a file, the Java IO library forces them to deal with the checked FileNotFoundException
- Unchecked exceptions result from faulty logic that can occur anywhere in a software program.
    - For example, if a developer invokes a method on a null object, an unchecked NullPointerException occurs
3. Can there be multiple finally blocks?
- No, we can only have one finally block for a try/catch/finally statement,

4. When both catch and finally return values, what will be the final result?
- The returned value from finally block.
5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
- Same as question 2.
6. What is the difference between ```throw``` and ```throws```?
- ```throw``` keyword is used inside a function. It is used when it is required to throw an Exception logically.
- ```throws``` keyword is used in the function signature. It is used when the function has some statements that can lead to exceptions.
7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception?
- Because all other exceptions belong to the Exception class. Catch scope should be from small to large. 
- If we don’t write this way, all exceptions will be caught by Exception e and print out a message without checking the inherited subclasses.
8. What is optional? why do you use it? write an optional example.
- Optional is a new type introduced in Java 8. It is used to represent a value that may or may not be present. It allows null value to be handled without invoking NullPointerException. Example:
```
import java.util.Optional;  
public class OptionalExample {  
    public static void main(String[] args) {  
        String[] str = new String[10];  
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        if(checkNull.isPresent()){  // check for value is present or not  
            String lowercaseString = str[5].toLowerCase();  
            System.out.print(lowercaseString);  
        }else  
            System.out.println("string value is not present");  
    }  
}  
```

9. Why finally always be executed ?
- A finally block is always get executed when the try block exits, whether the exception has occurred or not.
10. What is Java 8 new features ?
- forEach() method in Iterable interface
- default and static methods in Interfaces
- Functional Interfaces and Lambda Expressions
- Java Stream API for Bulk Data Operations on Collections
- Java Time API
- Collection API improvements
- Concurrency API improvements
- Java IO improvements
11. What are the types of design patterns in Java ?
-  Creational Design Pattern
-  Structural Design Pattern
-  Structural Design Pattern
12. What are the SOLID Principles ?
- SOLID principles are object-oriented design concepts relevant to software development. SOLID is an acronym for five other class-design principles: 
    - Single Responsibility: A class should only have one responsibility to allow easy testing and loose coupling.
    - Open/Closed: A class should open for extension but closed for modification, unless there is bug in existing code.
    - Liskov Substitution: A subclass should do that same thing as the parent class if substituted instead of disrupting the consistency in behavior.
    - Interface Segregation: Interfaces should be designed in a decoupled way so that when we implement one interface we only need to write minimum overriding methods.
    - Dependency Inversion: Software modules should be designed in decouple way so that we avoid a dependency hierarchy through abstractions.
13. How can you achieve thread-safe singleton patterns in Java ?
-   Eager Load
    - Provide a private static field storing the new and only instance
    - Provide a private constructor so that the class will not be used to create new instances
    - Provide a public static getInstance() method to get the only instance of the class
- Lazy Load
    - Provide a ‘private volatile’ field without creating a new stance but allowing instant update in the field
    - Provide a private constructor so that the class will not be used to create new instances
    - Check if the instance is present. If yes, return the instance. If no, allowing only one thread to continue
    - Check if the instance is present. If yes, return the instance. If no, creating a new instance and store it to the volatile field so that threads admitted after this thread will know that when checking if the instance is present.
14. What do you understand by the Open-Closed Principle (OCP) ?
- A class should open for extension but closed for modification, unless there is bug in existing code.
15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be
substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
- It mean that if the object of type A can do something, the object of type B could also be able to perform the same thing.
16. Watch the design pattern video, and type the code, submit it to MavenProject folder.
- Please check folder hw3/MavenProject/mvn_proj/src/main/java/com/chuwa/pattern
