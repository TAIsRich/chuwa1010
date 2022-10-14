### 1. Write up Example code to demonstrate the three fundamental concepts of OOP. (Reference Code Demo repo as example)
    1) Encapsulation; 2) Polymorphism; 3) Inheritance;


### 2. What is wrapper class in Java and Why we need wrapper class?
1) Wrapper class wraps the eight primitive data types, so that we can use these primitive data types as objects.
The primitive data types and their wrapper classes are below.
Data type: byte, boolean, short, char, int, long, float, double
Wrapper class: Byte, Boolean, Short, Character, Integer, Long, Float, Double

2) First, data structures in the Collection framework, such as ArrayList, can only store the objects (reference types) and cannot use the primitive types in it.
Second, the objects would be easier when we modify the arguments passed into the method. And the primitive type can only be passed by value.


### 3. What is the difference between HashMap and HashTable?
1) HashMap is non-synchronized and is not thread-safe.
HashTable is synchronized and thread-safe.
2) HashMap can have one null key and its values can be null.
HashTable cannot have the null key or value.
3) When we do not need the multithreading and synchronization, the HashMap is faster than HashTable.


### 4. What is String pool in Java and why we need String pool?
String in java is immutable. String Pool, also name String Constant Pool, is a kind of storage method. When a string is created, the JVM first checks the String Constant Pool before creating a new String object corresponding to it. For example, if we have `String s1 = “Cat”` and `String s2 = “Cat”`, then `s1 == s2` is true since them have the same address.
We can declare a string using the syntax: `String s1 = “StringPool”`. And when we use the `new` syntax, `String s2 = new String(“NotStringPool”)` , it is not in String pool.


### 5. What is Java garbage collection?
Garbage collection in java is the process of looking at heap memory, identifying which objects are in use and which are not and deleting the unused objects. An unused object or unreferenced object, is no longer referenced by any part of your program.

Garbage collector is a daemon thread that keeps running in the background, freeing up heap memory by destroying the unreachable objects. These are, Young Generation, Old Generation, and Permanent Generation .

The Young Generation is where all new objects are allocated and aged. The young generation is further divided into 3 parts: Eden Space, Survivor space S0 and Survivor space S1. When the young generation fills up, this causes a minor garbage collection . Some surviving objects are aged and eventually move to the old generation. All minor garbage collections are "Stop the World" events. This means that all application threads are stopped until the operation completes. Minor garbage collections are always Stop the World events.

The Old Generation is used to store long surviving objects.

The Permanent generation contains metadata required by the JVM to describe the classes and methods used in the application.

Classes may get collected (unloaded) if the JVM finds they are no longer needed and space may be needed for other classes.


### 6. What are access modifiers and their scopes in Java?
Access modifiers are the keywords that can be used to control the visibility of fields, methods, and constructors in a class.  
`default`: The declarations can be access only within the same packages. (If we do not use any access modifiers, it is default access modifier.)  
`private`: The declarations can be access only within the same packages.  
`protected`: The declarations can be access within the same packages. And also, for the outside of the package, we should have the inheritance for the package, so we can access the child classes/subclasses.  
`public`: The declarations can be access everywhere.


### 7. What is final keyword? (Filed, Method, Class)
final variable: When we declare a final variable, it would be constant and can not be changed.
final method: For the final method, we can not override it.
final class: For the final class, we can not extend a final class, which prevent inheritance. And The final class is immutable.


### 8. What is static keyword? (Filed, Method, Class). When do we usually use it?  
- static variable:  
1) If a variable is declared as static, it is static variable.  
2) When we have the common property of all objects, we can declare the common property as static variable, then we can use it for all objects.  
- static method:  
1) If a method is declared as static, it is static method.  
2) We can directly call static method using class name. The static method can be directly accessed using class name without the need of creating an object.  
- static class:  
1) If a class is declared as static, it is static class.  
2) When the class is a nested class, we can declare the class as static. And then we can call the nested static class through its name.


### 9. What is the differences between overriding and overloading?
overriding: Overriding occurs when the method signature is the same in the superclass and the child class.
1) overloading occurs during compile time.
2) It has better performance because the binding is being done at compile time.
3) Private and final methods can be overloaded.
4) Return type of method does not matter in case of method overloading.
5) Arguments must be different in the case of overloading.
6) It is being done in the same class.
7) Mostly used to increase the readability of the code.

overloading: Overloading occurs when two or more methods in the same class have the same name but different parameters.
1) overloading occurs at run time
2) It has less performance because the binding is being done at run time.
3) Private and final methods can NOT be overridden.
4) Return type of method must be the same in the case of overriding.
5) Arguments must be the same in the case of overriding.
6) Base and derived(child) classes are required here.
7) Mostly used to provide the implementation of the method that is already provided by its base class.


### 10. What is the differences between super and this?
**super**: The super keyword points to a reference of the parent class.  
**this**: The this keyword points to a reference of the current class.

### 11. What is the Java load sequence? 
For JVM load, the static variable/block load firstly.


### 12. What is Polymorphism? And how Java implements it?
Polymorphism is the process in which an object or function takes different forms. There are static polymorphism and dynamic polymorphism.  
Static polymorphism: Compile Time Polymorphism (Method Overloading)  
Dynamic polymorphism: Run Time Polymorphism (Method Overriding)


### 13. What is Encapsulation? How Java implements it? And why we need encapsulation?
1) Encapsulation means that we put data and code together in one class. After encapsulation, other classes cannot access these data and code.
2) Since we encapsulate the class, we cannot access the class/unit derectly. We can use getter/setter methods of the class to access.
3) Encapsulation can help us to put the related data and methods together, which would be efficient to management the process. And we can read and write the code easily and clearly.


### 14. What is Interface and what is abstract class? What are the differences between them?
- Interface: Interface is a collection of methods and does not implement them (without braces, and followed by a semicolon).
- Abstract class: Abstract class is declared `abstract`, which is a kind of class that can not create objects (without braces, and followed by a semicolon).
- Differences: 
    - Interface: Interface’s fields are public, static and final. Its methods declared are public. A class extends only one abstract class.
    - Abstract class: Abstract class’s fields can be non-static and non-final. Its methods defined can be public, protected, and private. A class can implement many interfaces.

### 15. design a parking lot (put the code to codingQuestions/coding1 folder)


### 16. What are Queue interface implementations and what are the differences and when to use what?
- Queue interface implementations: Queue interface extends the Collection interface. It follows the FIFO (First-In-First-Out) principle. There are PriorityQueue, LinkedList and PriorityBlockingQueue about its implementations.
- Differences: 
    - The PriorityQueue class provides the functionality of the heap data structure. It implements the Queue interface. 
    - LinkedLists are linear data structures that hold data in individual objects called nodes. These nodes hold both the data and a reference to the next node in the list. It has efficient insertion and deletion.
    - The PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules as the class PriorityQueue and supplies blocking retrieval operations. Since it is unbounded, adding elements may sometimes fail due to resource exhaustion resulting in OutOfMemoryError. This class does not permit null elements.
- When to use what: PriorityQueue and LinkedList are not thread-safe. PriorityBlockingQueue is thread-safe.