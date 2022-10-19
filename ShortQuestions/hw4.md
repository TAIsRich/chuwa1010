1. What is generic in Java? and type the generic code by yourself.

   a. https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core /src/main/java/com/chuwa/tutorial/t01_basic/generic

2. Read those codes and type it one by one by yourself. the push the code to your branch.

   https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/mai n/java/com/chuwa/tutorial/t06_java8

3. practice stream API at least **3** times

   a. https://blog.devgenius.io/15-practical-exercises-help-you-master-java- stream-api-3f9c86b1cf82

4. Write the Singleton design pattern include eager load and lazy load.

   Eager

   ```Java
   public class Singleton{
     private static Singleton instance = new Singleton();
     private Singleton(){
       
     }
     
     public static Singleton getInstance(){
       return instance;
     }
   }
   ```

   Lazy

   ```Java
   public class Singleton{
     private static volatile Singleton instance;
     private Singleton(){
       
     }
     public static Singleton getInstance(){
       if(instance != null){
         synchronized(Singleton.class){
           if(instance != null){
             instance = new Singleton();
           }
         }
       }
       return instance;
     }
   }
   ```

   

5. What is Runtime Exception? could you give me some examples?

   **RuntimeException** is the superclass of all classes that exceptions are thrown during the normal operation of the Java VM (Virtual Machine). The RuntimeException and its subclasses are [unchecked exceptions](https://www.google.com/url?client=internal-element-cse&cx=009682134359037907028:tj6eafkv_be&q=https://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/&sa=U&ved=2ahUKEwiRiMjznP_sAhV4_3MBHbDuCtYQFjAAegQIABAC&usg=AOvVaw3B1vvu7Ab_7OyiJDZG8g2j). The most common exceptions are [NullPointerException](https://www.google.com/url?client=internal-element-cse&cx=009682134359037907028:tj6eafkv_be&q=https://www.geeksforgeeks.org/null-pointer-exception-in-java/&sa=U&ved=2ahUKEwj5zenEnf_sAhXA_XMBHQHzAuUQFjAAegQIBRAC&usg=AOvVaw1efWYJGuOZJPqaZe7uGNfK), [ArrayIndexOutOfBoundsException](https://www.google.com/url?client=internal-element-cse&cx=009682134359037907028:tj6eafkv_be&q=https://www.geeksforgeeks.org/understanding-array-indexoutofbounds-exception-in-java/&sa=U&ved=2ahUKEwj4tePNnf_sAhXymeYKHdAnBRkQFjAAegQIAxAC&usg=AOvVaw2RigQ00_BuOT6APVLX8YqE), **ClassCastException**, InvalidArgumentException etc.

   - The **NullPointerException** is the exception thrown by the [JVM](https://www.geeksforgeeks.org/jvm-works-jvm-architecture/) when the program tries to call a method on the null object or perform other operations on a null object. A user should not attempt to handle this kind of exception because it will only patch the problem and not completely fix it.
   - The **ArrayIndexOutOfBoundsException** is the exception that is automatically thrown by the **JRE**(Java Runtime Environment) when a program incorrectly tries to access a certain location in a set that is non-existent. This often happens when the array index requested is negative, or more than or equal to the array’s size. The arrays of Java use the zero-based indexing; thus, the first element of that array has a zero index, the last element comes with an index of size 1, and the nth element comes with an index n-1.
   - The **InvalidArgumentException** is an exception raised when an invalid parameter is passed to a certain method on the server’s referenced connection.

   [More Information from geeks](https://www.geeksforgeeks.org/java-program-to-handle-runtime-exceptions/)

6. Could you give me one example of NullPointerException?

   ```java
   public static void main(String args[]) {
           String myString = null;
           printLength(myString);
       }
   ```

   

7. What is the Optional class?

   The **`Optional`** class in Java is a container that can hold, at max, one value and gracefully deals with `null` values. The class was introduced in the `java.util` package to remove the need for multiple null checks to protect against the dreaded [`NullPointerExceptions`](https://www.educative.io/edpresso/how-to-resolve-the-javalangnullpointerexception) during run-time.

   or

   Optional is a container object used to contain not-null objects. Optional object is used to represent null with absent value. This class has various utility methods to facilitate code to handle values as ‘available’ or ‘not available’ instead of checking null values. 

   

8. What is the @FunctionalInterface?

   A functional interface in Java is an interface that contains only a single abstract (unimplemented) method. A functional interface can contain default and static methods which do have an implementation, in addition to the single unimplemented method.

9. what is lamda?

   Lambda Expressions were added in Java 8. A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

10. What is Method Reference?

    Method reference(String::compareToIgnoreCase) is used to refer method of functional interface. It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.

11. What is Java 8 new features?

    [Java 8 new features](https://www.cnblogs.com/wmyskxz/p/13527583.html)

    Default method and static method in interface 

    Lambda & Functional Interface

    ​	Functional Interface 

    ​	Lambda

    ​		To Replace anonymous inner class

    ​		Lambda can use unchanged variable outside of lambda 

    Optional

    Method Reference Stream API

12. Lambda can use unchanged variable outside of lambda? what is the details?

    **Lambda can use unchanged variable outside of lambda**

    只要一开始存变量的内存里的内容不变，则该变量可被lambda用。 

    1. Final variable

    2. Non-final variable however never changed

    3. Object variable (if we use new to reassign a new memory, then this variable is changed, can not be used in lambda)(set method won't influence lambda)