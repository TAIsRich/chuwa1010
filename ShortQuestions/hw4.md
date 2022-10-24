### 1. What is generic in Java? and type the generic code by yourself.  
   https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t01_basic/generic
   - **Generic in Java**:  
       - Generic in Java allows type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces.  
       - We can create classes, that work with different data types using generic.  
       - The class, interface, or method, that operates on a parameterized type, is a generic entity.


### 2. Read those codes and type it one by one by yourself. then push the code to your branch.
   https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8


### 3. practice stream API at least 3 times.  
   https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82


### 4. Write the Singleton design pattern include eager load and lazy load.
The singleton pattern is a design pattern that restricts the instantiation of a class to one object.

**Eager Load:**
a. static variable
b. make constructor be private
c. static synchronized getInstance method
```
public class Singleton {
    private static Singleton instance = new Singleton();
    
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        return instance;
    }
}

Singleton.getInstance();
```

**Lazy Load:**
a. static volatile variable
b. make constructor be private
c. static synchronized getInstance method
d. double check and synchronized: make sure thread safe, and improve performance
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

Singleton.getInstance();
Signleton.getInstance();
```


### 5. What is Runtime Exception? could you give me some examples?
- **Runtime Exception**: RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine.  
- **Example**: NullPointerException, ClassCastException, SecurityException

### 6. Could you give me one example of NullPointerException?
Example of NullPointerException: 
```aidl
public class NullPointerExceptionExample {

    public static void main(String args[]) {
        String str = null;
        System.out.println(str.length());
    }
}
```
```aidl
Exception in thread "main" java.lang.NullPointerException
	at NullPointerExceptionExample.main(NullPointerExceptionExample.java:4)
```
Example of NullPointerException (use catch):
```aidl
public class NullPointerExceptionExample {

    public static void main(String args[]) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught the NullPointerException");
        }
    }
}
```
```aidl
Caught the NullPointerException
```


### 7. What is the Optional class?
The Optional class can avoid **Null checks** and **run time NullPointerExceptions**.

The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values.  
The class was introduced in the java.util package to remove the need for multiple null checks  
to protect against the dreaded NullPointerExceptions during run-time.


### 8. What is the @FunctionalInterface?
1) Functional Interface has **only one** single Abstract method.
2) @FunctionalInterface is for sanity check.  
   At the same interface class, when we have two abstract methods,  
   if it has @FunctionalInterface, it will throw errors;  
   if no @FunctionalInterface, it will not do sanity check, and we also can not use lambda.
3) Functional Interface can have a lot of default methods.
4) Lambda is the implementation of the abstract method.


### 9. what is lambda?
- **To Replace anonymous inner class**  
- **Work with functional interface**

Lambda expression is a Java programming language feature introduced in Java 8 
that provides functional programming constructs to the Java programming language, 
which simplifies the Java code in certain cases such as with Java anonymous inner classes.  
Lambda expressions blends functional programming features with object oriented programming features of Java resulting 
in simplified and more powerful concurrency features.  
Lambda expressions are functions with no name and identifiers.it is itself an anonymous method.  
It promotes functional interface and only implement abstract functions.
Lambda expressions are blocks of Java code that can be defined and passed as data 
which can be executed at a later time.

- **Syntax**: `parameter -> expression body`
    - *8Argument-list**: It can be both empty and non-empty.
    - The **arrow-token** is used to connect the arguments-list and expression body.
    - **Body**: It contains lambda expression statements and expressions
- For example:`(a,b) -> System.out.print(a+b);`

### 10. What is Method Reference?
In Java 8, a new feature was introduced known as Method Reference.  
This is used to refer to the method of functional interface.  
It can be used to replace Lambda Expression while referring to a method.

Example:  
Lambda Expression: `num -> System.out.println(num)`  
corresponding Method Reference: `System.out::println`

`::` is an operator that distinguishes class name from the method name.


### 11. What is Java 8 new features?
- **Lambda expression**: A function that can be shared or referred to as an object.
- **Functional Interfaces**: Single abstract method interface.
- **Method References**: Uses function as a parameter to invoke a method.
- **Default method**: It provides an implementation of methods within interfaces enabling 'Interface evolution' facilities.
- **Stream API**: Abstract layer that provides pipeline processing of the data.
- **Date Time API**: New improved joda-time inspired APIs to overcome the drawbacks in previous versions
- **Optional**: Wrapper class to check the null values and helps in further processing based on the value.
- **Nashorn, JavaScript Engine**: An improvised version of JavaScript Engine that enables JavaScript executions in Java, to replace Rhino.


### 12. Lambda can use unchanged variable outside of lambda? what is the details?
Yes.  

For the variable outside of lambda:
- final variable
- Non-final variable however never changed
- Object variable (if we use new to reassign a new memory, then this variable is changed, can not be used in lambda)



