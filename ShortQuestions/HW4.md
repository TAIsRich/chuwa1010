HW4 solution:

4. Eager 

   ```java
   public class EagerInitializedSingleton {
       
       private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
       
       private EagerInitializedSingleton(){}
   
       public static EagerInitializedSingleton getInstance(){
           return instance;
       }
   }
   ```

   Lazy

   ```java
   public class LazyInitializedSingleton {
   
       private static LazyInitializedSingleton instance;
       
       private LazyInitializedSingleton(){}
       
       public static LazyInitializedSingleton getInstance(){
           if(instance == null){
               instance = new LazyInitializedSingleton();
           }
           return instance;
       }
   }
   ```

   

5. Runtime errors occur when something goes wrong in the normal execution of a program. For example: NullPointerException.

6. ```java
   public class NullPointerExceptionExample {
       private static void printLength(String str) {
           System.out.println(str.length());
       }
   
       public static void main(String args[]) {
           String myString = null;
           printLength(myString);
       }
   }
   ```

7. The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values.

8. A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit.

9. A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

10. Method references are a special type of lambda expressions.

    They're often used to create simple lambda expressions by referencing existing methods. There are four kinds of method references: Static methods. Instance methods of particular objects. 

11. Jave 8 new features: defalut method and static method in interface, lambda&Functional Interface

12. Yes, lambda can use unchanged variable outside of lambda. 

    