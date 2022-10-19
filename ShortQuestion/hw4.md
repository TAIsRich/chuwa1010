1. What is generic in Java?  and type the generic code by yourself.
   Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
   a. https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core /src/main/java/com/chuwa/tutorial/t01_basic/generic
2. Read those codes and type it one by one by yourself. the push the code to your branch. https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/mai n/java/com/chuwa/tutorial/t06_java8
3. practice stream API at least 3 times a. https://blog.devgenius.io/15-practical-exercises-help-you-master-javastream-api-3f9c86b1cf82
4. Write the Singleton design pattern include eager load and lazy load.
5. What is Runtime Exception? could you give me some examples?
   RuntimeExceptions are those exceptions which are checked at runtime. NullPointerException,ArithmeticException, ArrayStoreException, CannotRedoException, , ClassCastException.
6. Could you give me one example of NullPointerException? NullPointerException is a runtime exception and it is thrown when the application try to use an object reference which has a null value.
   public class NullPointerExceptionExample {

   private static void printLength(String str) {
   System.out.println(str.length());
   }

   public static void main(String args[]) {
   String myString = null;
   printLength(myString);	}}

7. What is the Optional class?
   Optional is a container object which may or may not contain a non-null value. It can help in writing a neat code without using too many null checks.
8. What is the @FunctionalInterface?
   The @FunctionalInterface annotation indicates that an interface is a functional interface and contains exactly one abstract method.
   A functional interface can have any number of default, static methods but can contain only one abstract method. It can also declare methods of the object class.
   Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces. It is a new feature in Java 8, which helps to achieve a functional programming approach.
   A functional interface can extend another interface only when it does not have any abstract method.
9. what is lamda?
   A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
10. What is Method Reference?
    Method reference is used to refer method of functional interface. It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.
11. What is Java 8 new features?
    Can add default and static method in interface,
    Stream API,
    Lambda and functional interface,
    Method reference,
    Optional class

12. Lambda can use unchanged variable outside of lambda? what is the details?
    The variable needs to be final or effectively final, so, the Lambda can use it .

