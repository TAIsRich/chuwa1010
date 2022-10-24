## Chuwa Training - Hw3 XinyuZhang

#### 1. Collection Practice

#### 2. What is the checked exception and unchecked exception in Java, could you give one example?
```
Checked Exception: Java checked exceptions at compile time, we must have catch or throws in java code. 
    Eg.IOException, SQLException
Unchecked Exception: Java does not verify unchecked exceptions at compile time
    Eg. NullPonyerException, IndexOutOfBoundsException
```

#### 3. Can there be multiple finally blocks?
```
No, there can only be one finally block, but you can have multiple `try catch` block
```

#### 4. When both catch and finally return values,what will be the final result?
```
when catch and finally block both return value, method will get return from finally block.
```

#### 5. What is Runtime / unchecked exception? what is Compile / Checked Exception?
```
Checked Exception: Java checked exceptions at compile time, we must have catch or throws in java code. 
Unchecked Exception: Java does not verify unchecked exceptions at compile time
```

#### 6. What is the difference between throw and throws?
| throw                                     | throws                                     |
|:------------------------------------------|:-------------------------------------------|
| used inside a function                    | used in the function signature             |
| it can throw onlt one exception at a time | can be used to declare multiple exceptions |
|cannot propagate checked exceptions. It is only used to propagate the unchecked Exceptions that are not checked using the throws keyword|s used to propagate the checked Exceptions only|

#### 7. ????

#### 8. What is optional? why do you use it? write an optional example.
```
Optional is a container object which may or maynot contains a non-null value.
Optional can help to reduce the number of NullPointerException in our java code
```
Example:
```java
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] words = new String[10];
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if (chechNull.isPresent()) {
            String word = word[5].toLowerCase();
            System.out.println(word);
        } esle {
            System.out.println("word is null");
        }
    }
}

```

#### 9. Why finally always be executed?
```
the finally block always excutes when the try block exits. This ensures the finally block is excuted even if an unexpected exception occurs
```

#### 10. What is Java 8 new features ?
```
1. forEach() Method in Iterable interface
2. default and static methods in interface
3. functionl interfaces and Lambda expressions
4. Java Stream API for bulk data operations on Collections
5. Java Time API
6. Collection API improvements
7. Concurrency API improvements
8. Java IO improvements
```

#### 11. What are the types of design patterns in Java ?
```
1. Creational Design Pattern
2. Structural Design Pattern
3. Behavioral Design Pattern
```

#### 12. What are the SOLID Principles ?
```
S : Single-responsibility Principle
O : Open-closed Principle
L : Liskov Substitution Principle
I : Interface Segregation Principle
D : Dependency Inversion Principle
```

#### 13. How can you achieve thread-safe singleton patterns in Java?
Eager Load:
```java
public class Singleton{
    private static Singleton instance = new Singleton();
    
    private Singleton(){
    }
    
    public Sigletone getInstance(){
        return instance;
    }


    public static void main(String[] args) {
        Singleton.getInstace();
    }
}

```

Lazy Load:
```java
public class Singleton{
    private static volatile Singleton instance;
    
    private singleton(){
    }
    
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```
#### 14. What do you understand by the Open-Closed Principle (OCP)?
```
The Open-Closed Principle (OCP) states that software entities (classes, modules, methods, etc.) should be open for extension, but closed for modification.

In practice, this means creating software entities whose behavior can be changed without the need to edit and recompile the code itself.
```
#### 15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
```
It mean that if the object of type A can do something, the object of type B could also be able to perform the same thing
```
#### 16. Watch the design pattern video, and type the code, submit it to MavenProject folder