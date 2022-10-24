1. ##### What is generic in Java?  and type the generic code by yourself.

   a. https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t01_basic/generic

   Java Generic methods and generic classes enable programmers to specify, with a single method declaration, a set of related methods, or with a single class declaration, a set of related types, respectively.

2. #####  Read those codes and type it one by one by yourself. the push the code to your branch.

   https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8

3. ##### practice stream API at least 3 times

   ###### a. https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82

4. ##### Write the Singleton design pattern include eager load and lazy load. 

   /MavenProject/src/main/java/Singleton/

5. ##### What is Runtime Exception? could you give me some examples?

   Runtime exceptions are caught at runtime. These are also called as unchecked exceptions.

   Eg: Arithmetic Exception; ArrayIndexOutOfBounds Exception

6. ##### Could you give me one example of NullPointerException?

   The NullPointerException typically occurs when you declare a variable but did not create an object and assign it to the variable before trying t ouse the contents of the variable. So you have a reference to something that does not actually exist. Eg:

   ```java
   import java.util.UUID;
   import java.io.*;
    
   class Singleton
   {
       private static Singleton single = null;
       private String ID = null;
    
       private Singleton()
       {
           ID = UUID.randomUUID().toString();
       }
    
       public static Singleton getInstance()
       {
           if (single == null)
               single = new Singleton();
           return single;
       }
    
       public String getID()
       {
           return this.ID;
       }
   }
   
   public class TestSingleton
   {
       public static void main(String[] args)
       {
           Singleton s = Singleton.getInstance();
           System.out.println(s.getID());
       }
   }
   ```

   

7. ##### What is the Optional class?

   The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values.

8. ##### What is the @FunctionalInterface?

   A functional interface is an interface that contains only one abstract method. They can have one functionlity to exhibit. Lambda expressions can be used to represent the instance of a functional interface.

9. ##### What is lamda?

   Lambda expressions express instances of functional interfaces. It only implements the only abstract function and therefore implement functional interfaces. 

10. ##### What is Method Reference?

    Java provides a new feature called method reference in Java 8.Method reference is used to refer method of functional interface.

11. ##### What is Java 8 new features?

    Java 8 new features: Reference, Default method and static method in interface, Lambda & Functional Interface, Optional, Method Reference and Stream API.

12. ##### Lambda can use unchanged variable outside of lambda? what is the details?

    Final variable; Non-final variable however never changed; Object variable