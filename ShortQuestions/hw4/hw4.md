1. What is generic in Java? and type the generic code by yourself.
- Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. 
- Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
- Please check folder src/main/java/com/chuwa/generic

3. practice stream API at least 3 times
- Done

4. Write the Singleton design pattern include eager load and lazy load.
- Please check folder src/main/java/com/chuwa/pattern/singleton

5. What is Runtime Exception? could you give me some examples?
- RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine. RuntimeException is unchecked exceptions.
```
example:
//ArithmeticException
System.out.println(100/0);

//NullPointerException
String data;
System.out.println(data.length());

//ArrayIndexOutOfBoundsException
String[] data = new String[5];
data[6] = "Extra";
```
6. Could you give me one example of NullPointerException?
```
//NullPointerException
String data;
System.out.println(data.length());
```
7. What is the Optional class?
- The Optional class in Java is a container that can hold, at max, one value and gracefully deals with null values.
- It could remove the need for multiple null checks to protect against the dreaded NullPointerExceptions during run-time.
- 
8. What is the @FunctionalInterface?
- A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit.
- 
9. what is lambda?
- A lambda expression is a short block of code which takes in parameters and returns a value. It is a function declared without a name.

10. What is Method Reference?
- Method reference is a new feature of Java 8, a short and easily readable writing syntax for a lambda expression.
- Method reference is used to refer method of functional interface.

11. What is Java 8 new features?
- forEach() method in Iterable interface
- default and static methods in Interfaces
- Functional Interfaces and Lambda Expressions
- Java Stream API for Bulk Data Operations on Collections
- Java Time API
- Collection API improvements
- Concurrency API improvements
- Java IO improvements

12. Lambda can use unchanged variable outside of lambda? what is the details?

- Yes, but variables used in lambdas have to be final or effectively final (not defined as final but we never change it)
