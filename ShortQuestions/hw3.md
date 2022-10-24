## HW 3 - Design Pattern, Exception, Collection

1. **Practice Collection (in Coding folder)**

2. **What is the checked exception and unchecked exception in Java, could you give one example?**

   - ***checked exception*** - represents errors outside the control of the program, we should use `throws` or `try-catch` block to declare and handle a checked exception, java verifies at compile time

     Some common checked exceptions: IOException, SQLException, ParseException

   - ***unchecked exception*** - represents errors inside the program logic, java doesn't verify at compile time

     Some common unchecked exceptions: NullPointerException, IndexOutOfBoundsException, IllegalArgumentException (All belong to RuntimeException)

3. **Can there be multiple finally blocks?**

   No. Multiple finally blocks cannot be declared within a single try or try-catch block. There can be only one finally clause with a single try block.

4. **When both catch and finally return values, what will be the final result?**

   The final result will come from the `finally` block.

5. **What is Runtime/Unchecked Exception? what is Compile/Checked Exception?**

   Same as Question 2. Unchecked exception is not checked during compile time. Java verifies checked exceptions at compile time.

6. **What is the difference between throw and throws?**

   - `throw` is used inside the function to throw an exception explicitly, throw only one exception at a time, unchecked exceptions only
   - `throws` is used in the function signature, used when the function has some statements that can lead to exceptions, can declare multiple exceptions, checked exceptions only

7. **Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?**

   Because the `catch` scope should be from small to large. 

   From small to large scope: Null/Runtime Exception -> Exception

8. **What is optional? why do you use it? write an optional example.**

   Optional is a public final class and used to deal with NullPointerException in Java. It provides methods which are used to check the presence of value for particular variable.

   Example:

   ```java
   import java.util.Optional;
    
   public class Main {
       public static void main(String[] args)
       {
           String[] words = new String[5];
           Optional<String> checkNull = Optional.ofNullable(words[1]);
           if (checkNull.isPresent()) {
               String word = words[1].toLowerCase();
               System.out.print(word);
           }
           else
               System.out.println("word is null");
       }
   }
   ```

9. **Why finally always be executed?**

   It allows the programmer to put a cleanup code. This ensures that the finally block is executed and cleanup occurs even if an unexpected exception occurs. 

10. **What are Java 8 new features?**

    default and static methods in Interface, Optional class, Method references, Lambda expressions, The stream API, The date-time API

11. **What are the types of design patterns in Java?**

    - Creational Design Pattern
    - Structural Design Pattern
    - Behavioral Design Pattern

12. **What are the SOLID Principles?**

    - **S**ingle Responsibility - a class should have only one job
    - **O**pen/Closed - a class should be open for extension but closed for modification
    - **L**iskov Substitution - a subclass should be substitutable for its parent class without disrupting the behavior of program
    - **I**nterface Segregation - larger interfaces should be split into smaller ones
    - **D**ependency Inversion - both high-level module and low-level module should depend on abstractions

13. **How can you achieve thread-safe singleton patterns in Java?**

    static synchronized getInstance() method

14. **What do you understand by the Open-Closed Principle (OCP)?**

    This principle states that objects or entities should be open for extension but closed for modification. Means that in our program, a class should be extended without modifying the class itself.

15. **Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean?**

     It mean that if the object of type A can do something, the object of type B could also be able to perform the same thing.

16. **Watch the design pattern video, and type the code (in MavenProject folder)**

