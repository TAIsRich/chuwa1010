# HW2 ShortAnswers
1. Write up Example code to demonstrate the three fundamental concepts of OOP. (reference Code Demo repo as example)  
     1. Encapsulation; 2. Polymorphism; 3. Inheritance; 
* See in the Coding folder
2. What is wrapper class in Java and Why we need wrapper class?
* Java language is an object-oriented language, but the basic data types in it are not object-oriented, which brings a lot of inconvenience in actual use. In order to solve this deficiency, a corresponding class is designed for each basic data type to represent the class, so the classes corresponding to the eight basic data types are collectively called Wrapper Class
* We need wrapper class is exactly what object-oriented programming cannot provide for basic data types.
3. What is the difference between HashMap and HashTable?
* HashMap allows null as an entry key or value, while HashTable does not.
* The method of HashTable is Synchronize, but HashMap is not. When multiple threads access HashTable, you do not need to synchronize its methods yourself, but HashMap must provide external synchronization for it.
4. What is String-pool in Java and why we need String-pool?
* String Pool holds the desired string literals literal strings 
* Because string objects are immutable, avoiding current thread safety issues, they can be shared.
5. What is Java garbage collection?
* Garbage Collection is a mechanism provided by the Java Virtual Machine (JVM) garbage collector for reclaiming the memory space occupied by objects without any object reference from time to time in idle time.
6. What are access modifiers and their scopes in Java?
* Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are **public, protected, default, and private**.
7. What is final key word? (Filed,Method,Class)
* When a **variable** is modified with final,  if it is a variable of basic data type, cannot change its value once it is initialized; if it is a variable of reference type, it cannot be allowed to point to another object after it is initialized.
* When a **Method** is modified with final,  it locks the method to prevent any inherited classes from changing its meaning
* When a **class** is modified with final, it indicates that the class cannot be inherited. In other words, if a class you will never let him be inherited, you can use final to modify it. Member variables in final classes can be made final as needed, but it should be noted that all member methods in final classes are implicitly designated as final methods.
8. What is static key word? (Filed,Method,Class). When do we usually use it?
* There is no concept of global variables in Java language. Member variables and member methods modified by static are independent of any objects of the class. That is, it does not depend on a class-specific instance and is shared by all instances of the class.
9. What is the differences between overriding and overloading?
* **Overriding** occurs when the method signature is the same in the parent class and the child class. 
* **Overloading** occurs when two or more methods in the same class have the same name but different parameters.
10. What is the differences between super and this?
* **This** points to a reference of the current class,
* **super** points to a reference of the parent class.
11. What is the Java load sequence?
* static variable/block -> constructor 
12. What is Polymorphism ? And how Java implements it ?
* **polymorphism**refers to the same object exhibiting different **forms and behaviors**. 
    * Inheritance
    - Overriding 
    - The parent class reference points to the child class object: Parent p = new Child ();
13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
* It refers to a method of wrapping and hiding the implementation details of an abstract functional interface.
    * Modify the visibility of the attribute to restrict access to the attribute (generally limited to private
    * Provide external public method access for each value attribute, that is, create a pair of assignment methods for accessing private attributes 
* Because we can modify our own implementation code without modifying the program fragments that call our code and proper encapsulation can make the code easier to understand and maintain, and it also enhances the security of the code
14. What is Interface and what is abstract class? What are the differences between them? 
* **Interfaces** are a kind of code contract, which must be implemented by a concrete class. 
* **Abstract** classes are similar to normal classes, with the difference that they can include abstract methods, which are methods without a body. Abstract classes cannot be instantiated
15. design a parking lot (put the code to codingQuestions/coding1 folder, ) If you have no ability to design it, please find the solution in internet, then understand it, and re-type it.(Do NOT just copy and paste)
* See in the Coding folder
16. What are Queue interface implementations and what are the differences and when to use what?
* There are three ways to implement Queue in Java: blocking queue, non-blocking queue, and Deque.
* Blocking queue is a first-in, first-out collection that can be blocked. For example, a thread will be blocked when it acquires an element from an empty queue, or when the queue is full.
* Non-blocking queue is implemented using CAS (compare and set) mechanism, similar to volatile, with good concurrency performance
* Deque is an element that can operate on both the head and the tail, commonly known as a two-way (double-ended) queue.
