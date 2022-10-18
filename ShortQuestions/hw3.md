### 1. Practice collection
### 2. What is the checked exception and unchecked exception in Java, could you give one example?
>**Checked exception**: represent errors outside the control of the program. For example, the constructor of FileInputStream throws *FileNotFoundException* if the input file does not exist. Java verifies checked exceptions at compile-time.

> Some common checked exceptions in Java are IOException, SQLException and ParseException.

>**Unchecked exception**: runtime exception, represent errors inside the program logic. For example, if we divide a number by 0, Java will throw ArithmeticException. Java does not verify unchecked exceptions at compile-time. Furthermore, we don't have to declare unchecked exceptions in a method with the throws keyword. And although the above code does not have any errors during compile-time, it will throw ArithmeticException at runtime.

>Some common unchecked exceptions in Java are NullPointerException, ArrayIndexOutOfBoundsException and IllegalArgumentException.

>The RuntimeException class is the superclass of all unchecked exceptions, so we can create a custom unchecked exception by extending RuntimeException:

### 3. Can there be multiple finally blocks?
No, but we can have multiple try/catch/finally statements, either in the same method or in multiple methods.

### 4. When both catch and finally return values, what will be the final result?
The value in finally will be the final result because the finally block will be executed no matter what.

### 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
Look at Quenstion2

### 6. What is the difference between throw and throws?
- The **throw** statement is used in the body of the method to indicate that an exception is thrown, which is handled by the statement in the body of the method.
- The **throws** statement is used after the method declaration, indicating that the exception is thrown again, which is handled by the caller of the method.
```java
public void callUber(int day) throws ApiException { //It might "throws". Not Must.
        if(day % 2 == 0){ //99%
            System.out.println("Successfully get Uber order");
        }else{ //1% .. 0.01%
            throw new ApiException(ResultCode.FAILED); //1-999
        }
    }
```

### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
The catch statements should go from more specific to general

### 7. What is optional? why do you use it? write an optional example.
Optional is a container object used to contain not-null objects. Optional object is used to represent null with absent value. This class has various utility methods to facilitate code to handle values as 'available' or 'not available' instead of checking null values.
```java
String str = null;
Optional<String> optStr = Optional.of(str);
if(optStr.isPresent()){
    System.out.println(optStr.get());
}
```

### 8. Why finally always be executed ?
To ensures the finally block is executed even if an unexpected exception occurs.


### 9. Practice collection problems here: https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection
Okay

### 10. What is Java 8 new features ?
[Java 8 New Features](https://www.cnblogs.com/wmyskxz/p/13527583.html)
- Default method and static method in interface Lambda & Functional Interface(重点，easy)
- Functional Interface Lambda
- To Replace anonymous inner class
- Lambda can use unchanged variable outside of lambda Optional(重点，easy)
- Method Reference Stream API (重点，hard)

### 11. What are the types of design patterns in Java ?
>**Creational** Design Pattern: Singleton Pattern, Prototype Pattern
>**Structural** Design Pattern: Bridge Pattern, Proxy Pattern
>**Behavioral** Design Pattern: Iterator Pattern, State Pattern

### 12. What are the SOLID Principles ?
- S - Single-responsiblity Principle
- O - Open-closed Principle
- L - Liskov Substitution Principle
- I - Interface Segregation Principle
- D - Dependency Inversion Principle

### 13. How can you achieve thread-safe singleton patterns in Java ?
```java
public class Singleton {

    // 1, static volatile variable
    private static volatile Singleton instance;

    // 2, make constructor be private
    private Singleton() {
    }

    // 3. static synchronized getInstance method
    public static Singleton getInstance() {

        // 4, make sure thread safe, improve performance
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

### 14. What do you understand by the Open-Closed Principle (OCP) ?
>Software entities (classes, modules, methods, etc.) should be open for extension, but closed for modification.

### 15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
1. **It mean that if the object of type A can do something, the object of type B could also be able tp perform the same thing**
2. It means that all the objects of type A could execute all the methods present in its subtype B
3. It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.
4. It means that for the class B to inherit class A, objects of type B and objects of type A must be same.

### 16. Watch the design pattern video, and type the code, submit it to MavenProject folder
 **singleton**: https://www.bilibili.com/video/BV1Np4y1z7BU?p=22
 **Factory**: https://www.bilibili.com/video/BV1Np4y1z7BU?p=35&vd_source=310561eab1216a27f7accf859bf7f6d9
 **Builder**: https://www.bilibili.com/video/BV1Np4y1z7BU?p=50&vd_source=310561eab1216a27f7accf859bf7f6d9
 **Publisher_Subscriber**: https://www.bilibili.com/video/BV1Np4y1z7BU?p=114&vd_source=310561eab1216a27f7accf859bf7f6d9
