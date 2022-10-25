### What is generic in Java?
(https://www.geeksforgeeks.org/generics-in-java/)
Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. 
Using Generics, it is possible to create classes that work with different data types. 
An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

### Write the Singleton design pattern include eager load and lazy load
- eager load

   ```java
   public class Singleton {
       private static Singleton instance = new Singleton();
       
       private Singleton(){}
       
       public static Singleton getInstance() {
           return instance;
       }
   }
   ```

- lazy load

  ```java
  public class Singleton{
      private static volatile Singleton instance;
      
      private Singleton(){}
      
      public static Singleton getInstance() {
          if (instance == null) {
              synchronized (Singleton.class) {
                  if (instance == null){
                      instance = new Singleton();
                  }
              }
          }
          return instance;
      }
  }
  ```
  
### What is Runtime Exception? could you give me some examples?

RuntimeException is the superclass of all classes that exceptions are thrown during the normal operation of the JVM. The RuntimeException and its subclasses are unchecked exceptions. Some exceptions are ArithmeticException, IndexOutOfBoundsException, NullPointerException.

- ArithmeticException Example

  ```java
  public class Main {
      public static void main(String[] args) {
          int x = 100;
          int y = 0;
          //devide by zero
          System.out.println( x / y );
      }
  }
  ```

- IndexOutOfBoundsException Example

  ```java
  public class Main {
      public static void main(String[] args) {
          String[] str = new String[5];
          //index 5 is out of bound
          str[5] = "Hello";
      }
  }
  ```
  
### Could you give me one example of NullPointerException?

  ```java
   public class Main {
       public static void main(String[] args) {
           String[] str = new String[10];
           //str[9] = null, NullPointerException
           int len = str[9].length();
           
           System.out.print(len);
       }
   }
   ```

### What is the Optional class?
The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values. The class was introduced in the java. util package to remove the need for multiple null checks to protect against the dreaded NullPointerExceptions during run-time.

### What is the @FunctionalInterface?
A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. A functional interface can have any number of default methods.

#### What is lambda?
Lambda works with functional interface and provides implementation of functional interface. Lambda is able to replace anonymous inner class, which means that we don't need to overwrite the method again for providing the implementation. 

### What is Method Reference?
Method reference is a new feature of Java 8, a short and easily readable writing syntax for a lambda expression. To refer to a functional interface method, use a method reference. You can replace a method reference for your lambda expression whenever you are just referring to a method with a lambda expression.

#### What is Java 8 new features?
- default and static method in Interface
- Functional Interface
- Lambda & Method Reference
- Optional Class
- Stream API

### Lambda can use unchanged variable outside of lambda? what is the details
A lambda expression can capture variables like local and anonymous classes. In other words, they have the same access to local variables of the enclosing scope
