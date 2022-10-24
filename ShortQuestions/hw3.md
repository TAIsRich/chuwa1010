1. Practice collection 

   * See in the Coding Folder

2. What is the checked exception and unchecked exception in Java, could you give one example?

   * **Checked Exception** must be explicitly caught or passed, as described in basic try-catch-finally. Checked Exceptions inherit the java.lang.Exception class.
   * **Unchecked Exception** do not have to be caught or thrown. Unchecked Exception inherits from java.lang.RuntimeException class.

3. Can there be multiple finally blocks?

   * No, finally can **only be used once** with a try or try-catch block.

4. When both catch and finally return values, what will be the final result?

   * finally will **still be executed** if there is a return statement in the catch clause.

5. What is **Runtime/unchecked exception**? what is Compile/Checked Exception?

   * **Unchecked Exception**  are the exceptions that do not need to be caught, including Error and its subclasses, RuntimeException and its subclasses
   * **Checked Exception** is the exceptions that must be caught, including Exception and its subclasses, but excluding RuntimeException and its subclasses

6. What is the difference between **throw** and **throws**?

   * The **throw** statement is used in the body of the method to indicate that an exception is thrown, which is handled by the statement in the body of the method.
   * The **throws** statement is used after the method declaration, indicating that the exception is thrown again, which is handled by the caller of the method.

7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime

   exception before Exception ?

   * Because multiple catch statements can be used, and each catch catches the corresponding Exception and its subclasses. After the JVM catches an exception, it matches the catch statement from top to bottom. After matching a certain catch, it executes the catch code block, and then does not continue to match, Null/Runtime Exception -> Exception.

1. What is **optional **? why do you use it? write an optional example.

   * The Optional class is a nullable container object. The isPresent() method will return true if the value exists, and calling the get() method will return the object.

   * The introduction of the Optional class is a good solution to null pointer exceptions.

   * Optional is a container: it can hold a value of type T, or just null. Optional provides many useful methods so that we don't have to do explicit null detection.

     ```java
     public class Main {
         public static void main(String[] args) {
             Main m = new Main();
             Integer val1 = null;
             Integer val2 = new Integer(10);
             Optional<Integer> a = Optional.ofNullable(val1);
             Optional<Integer> b = Optional.of(val2);
     
             System.out.println(m.sum(a, b));
         }
     }
     // reference: https://www.runoob.com/java/java8-optional-class.html

2. Why finally always be executed?

   * Imagine you opened a file, get an exception, then throwed or returned, but never closed. that's the reason why finally always be executed.

3. Practice collection problems here:https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/ src/main/java/com/chuwa/exercise/collection

   * See in the Coding folder

4. What is Java 8 new features ?

   * Method Reference − Method reference provides a very useful syntax to directly refer to a method or constructor of an existing Java class or object (instance). Used in conjunction with lambdas, method references can make language constructs more compact and concise, reducing redundant code.
   * Lambda expressions − Lambdas allow functions to be passed as parameters to a method (functions are passed as parameters to methods).
   * Optional class − The Optional class has become part of the Java 8 class library to resolve null pointer exceptions.

5. What are the types of design patterns in Java ?

   * Java Design Patterns are divided into three categories - *creational, structural, and behavioral design patterns*.

6. What are the SOLID Principles ? 

   * SOLID is an acronym for five other class-design principles: Single Responsibility Principle, Open-Closed Principle, Liskov Substitution Principle, Interface Segregation Principle, and Dependency Inversion Principle.

7. How can you achieve thread-safe singleton patterns in Java ?

   * **Create the private constructor to avoid any new object creation with new operator**. Declare a private static instance of the same class. Provide a public static method that will return the singleton class instance variable.

14. What do you understand by the Open-Closed Principle (OCP) ?
    * As the name suggests, this principle states that **software entities should be open for extension, but closed for modification**. As a result, when the business requirements change then the entity can be extended, but not modified

15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
    * **Ans 1** It mean that if the object of typeA can do something, the object of typeB could also be able tp perform the same thing

16. Watch the design pattern video, and type the code, submit it to **MavenProject** folder
    * See in the MavenProject folder

