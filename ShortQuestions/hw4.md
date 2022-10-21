# HW4 ShortAnswers
1. What is generic in Java? and type the generic code by yourself.

     a. https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core /src/main/java/com/chuwa/tutorial/t01_basic/generic

     * Java generics allows programmers to detect illegal types at compile time. The essence of generics is that they are parameterized types, that is, the data type being manipulated is specified as a parameter.

     * See it in the Coding Folder

2. Read those codes and type it one by one by yourself. the push the code to your branch.

     https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/mai n/java/com/chuwa/tutorial/t06_java8

     * See it in the Coding

3. practice stream API at least **3** times

     a. https://blog.devgenius.io/15-practical-exercises-help-you-master-java- stream-api-3f9c86b1cf82

     * See in the Coding

4. Write the Singleton design pattern include eager load and lazy load.

     * Lazy Load

       ```
       public class Singleton {  
           private static Singleton instance;  
           private Singleton (){}  
         
           public static Singleton getInstance() {  
               if (instance == null) {  
                   instance = new Singleton();  
               }  
               return instance;  
           }  
       }
       ```

     * Eager Load

       ```
       public class Singleton {  
           private static Singleton instance = new Singleton();  
           private Singleton (){}  
           public static Singleton getInstance() {  
           return instance;  
           }  
       }
       ```

5. What is Runtime Exception? could you give me some examples?

     * **RuntimeException** is the superclass of exceptions that may be thrown during normal operation of the Java Virtual Machine. Any subclasses of RuntimeException that may be thrown but not caught during method execution need not be declared in the throws clause. It is a subclass of Exception.
     * Include:
       - ArithmeticException
       - NullPointerException
       - ArrayIndexOutOfBoundsException
       - NumberFormatException
       - InputMismatchException
       - IllegalArgumentException
       - IllegalStateException
       - ClassCastException
       - Missing Resource Exception
       - No Such Element Exception
       - Undeclared Throwable Exception
       - Empty Stack Exception

6. Could you give me one example of NullPointerException?

     * ```
       public class NullPointerExceptionExample {
           private static void Length(String str) {
               System.out.println(str.length());
           }
       
           public static void main(String args[]) {
               String str = null;
               Length(str);
           }
       }
       ```

7. What is the Optional class?

     * The **Optional class** is a nullable container object. The isPresent() method will return true if the value exists, and calling the get() method will return the object.

8. What is the @FunctionalInterface?

     * A **functional interface** is an interface that has one and only one abstract method, but can have multiple non-abstract methods. Functional interfaces can be implicitly converted to lambda expressions.

9. what is lamda?

     * **Lambdas** allow functions to be passed as parameters to a method (functions are passed into methods as parameters).
       Using lambda expressions can make the code more concise and compact.

10. What is Method Reference?

     * A **method reference** refers to a method by its name. Method references can make language constructs more compact and concise, reducing redundant code. Method references use a pair of colons :: .

11. What is Java 8 new features?

      * **Java 8 New Features**: 

        - Reference
           Default method and static method in interface Lambda & Functional Interface

        - Functional Interface Lambda

        - To Replace anonymous inner class

        - Lambda can use unchanged variable outside of lambda Optional

        - Method Reference Stream API

12. Lambda can use unchanged variable outside of lambda? what is the details?

      * Yes, Lambdas have been made for functional style of programming and this means: No side effects. 
