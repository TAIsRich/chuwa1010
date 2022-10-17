### 1. [Practice collection](https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection)

### 2. What is the checked exception and unchecked exception in Java, could you give one example?
- **checked exception**: 
    - A checked exception is a type of exception that must be either caught or declared in the method in which it is thrown. 
    - Example  
        - IOException
        - SQLException
        - FileNotfoundException
        - ClassNotFoundException

- **unchecked exception**: 
    - An unchecked exception is one that occurs at the time of execution. These are also called Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an API.
    - Example
        - NullPointerException
        - ArrayIndexOutOfBoundsException
        - NumberFormatException
        - InputMismatchException


### 3. Can there be multiple finally blocks?
No.  
`finally` can **only be used once** with a try or try-catch block.  
`finally` is optional in the try-catch block.  
`finally` will be executed whether or not the exception is handled.  
`finally` will still be executed if there is a return statement in the catch clause.


### 4. When both catch and finally return values, what will be the final result?
If both `catch` and `finally` return, the receiving method will get the returned value from the `finally` block.


### 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
- **Runtime/unchecked exception**: 
    - RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine. RuntimeException and its subclasses are unchecked exceptions.  
- **Compile/Checked Exception**: 
    - The exception is checked by the compiler during the compilation process to confirm whether the exception is handled by the programmer or not.


### 6. What is the difference between throw and throws?
Both throw and throws are concepts of exception handling in Java. 

`throws` is used to declare which exceptions can be thrown from a method. The throws keyword can be used to declare multiple exceptions, separated by a comma. Whichever exception occurs, if matched with the declared ones, is thrown automatically then.  
`throw` is used to explicitly throw an exception within a method or block of code. The throw keyword is used to throw an exception explicitly. It can throw only one exception at a time. 


### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception?
After running the three pieces codes, wen can get:
1) java.lang.ArithmeticException: / by zero
2) java.lang.NullPointerException
3) java.lang.RuntimeException  

Runtime exceptions represent problems that are a direct result of a programming problem. It may be useful to catch them and continue program execution.


### 7. What is optional? why do you use it? write an optional example.
- 1) What is optional:
Optional is a container object which may or may not contain a non-null value. 
- 2) Why do we use it:
Optional is generally used as a return type for methods that might not always have a result to return.
- 3) How to use optional:
        ```
        Optional optional = Optional.of("value");
        Optional optional = Optional.empty();
        Optional optional = Optional.ofNullable(null);
        Optional optionalString = Optional.of("value");
        optionalString.ifPresent(s -> System.out.println(s));
        ```
- 4)  optional example:
        ```
        import java.util.Optional;
        public class OptionalDemo {  
            public static void main(String[] args) {
                Optional obj1 = Optional.of("This is a sample text"); 
                Optional obj2 = Optional.empty();
                if (obj1.isPresent()) {          
                    System.out.println("isPresent method called on obj1 returned true");
                }       
            obj1.ifPresent(s -> System.out.println("ifPresent method called on obj1"));
            obj2.ifPresent(s -> System.out.println("ifPresent method called on obj2 "));
        }
        }
        ```


### 8. Why finally always be executed?
A finally block always executes, regardless of whether an exception is thrown. Since the finally block in java is used to put important codes such as clean up code e.g. closing the file or closing the connection.


### 9. Practice collection problems here: https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection


### 10. What is Java 8 new features?
- **Lambda expression**: A function that can be shared or referred to as an object.
- **Functional Interfaces**: Single abstract method interface.
- **Method References**: Uses function as a parameter to invoke a method.
- **Default method**: It provides an implementation of methods within interfaces enabling 'Interface evolution' facilities.
- **Stream API**: Abstract layer that provides pipeline processing of the data.
- **Date Time API**: New improved joda-time inspired APIs to overcome the drawbacks in previous versions
- **Optional**: Wrapper class to check the null values and helps in further processing based on the value.
- **Nashorn, JavaScript Engine**: An improvised version of JavaScript Engine that enables JavaScript executions in Java, to replace Rhino.


### 11. What are the types of design patterns in Java?
- **Creational Patterns**: These patterns provide freedom of choice between creating objects by hiding the logic. The objects constructed are decoupled from the implemented system. 
Examples : Factory design pattern, Builder design, Prototype design, Singleton design, Abstract Factory design.
- **Structural Patterns**: These patterns help in defining how the structures of classes and objects should be like for defining the composition between classes, interfaces, and objects. 
Examples:Adaptor design, Facade design, Decorator design, proxy design, etc.
- **Behavioral Patterns**: These patterns help to define how the objects should communicate and interact with one another. 
Examples: Command pattern, Iterator pattern, Observer pattern, Strategy pattern, etc.


### 12. What are the SOLID Principles?
**SOLID principles** were the Object-Oriented principles. The acronym for SOLID goes as follows:

- **S - Single Responsibility Principle (SRP)**: The single responsibility principle ensures that every class or module should be accountable and responsible for only one functionality. There should be one and only one reason for changing any class.
- **O - Open Closed Principle (OCP)**: Every class is open for extension but closed for modification. Here, we are allowed to extend the entities behaviour by not modifying anything in the existing source code.
- **L - Liskov Substitution Principle(LSP)**: LSP principle states that the objects can be replaced by the subtype instances without affecting the correctness of the program.
- **I - Interface Segregation Principle (ISP)**: The ISP principle states that we can use as many interfaces specific to the client’s requirements instead of creating only one general interface. Clients should not be forced to implement the functionalities that they do not require.
- **D - Dependency Inversion Principle**: Here, the high-level modules should not be dependent on the lower level modules or concrete implementations. Instead, they should be dependent on the abstractions.


### 13. How can you achieve thread-safe singleton patterns in Java?
The thread-safe singleton class can help in object initialization in the presence of multiple threads.
1) Use `static` and `volatile` field initialization
2) Use synchronized keyword
3) Double-check locking

```
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


### 14. What do you understand by the Open-Closed Principle (OCP)?
In object-oriented programming(OOP), the open-closed principle(OCP) means that software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.  

The entity can allow its behavior to be extended without modifying its source code.  A class can be extended via Inheritance, Interfaces, Composition whenever required instead of modifying the code of the class. 


### 15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
1. It mean that if the object of type A can do something, the object of type B could also be able tp perform the same thing
2. It means that all the objects of type A could execute all the methods present in its subtype B  
3. **It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.**
4. It means that for the class B to inherit class A, objects of type B and objects of type A must be same.


### 16. Watch the design pattern video, and type the code, submit it to MavenProject folder
singleton: https://www.bilibili.com/video/BV1Np4y1z7BU?p=22  
Factory: https://www.bilibili.com/video/BV1Np4y1z7BU?p=35&vd_source=310561eab1216a27f7accf859bf7f6d9  
Builder: https://www.bilibili.com/video/BV1Np4y1z7BU?p=50&vd_source=310561eab1216a27f7accf859bf7f6d9 
Publisher_Subscriber: https://www.bilibili.com/video/BV1Np4y1z7BU?p=114&vd_source=310561eab1216a27f7accf859bf7f6d9