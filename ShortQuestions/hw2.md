## HW2 - Java Basic, OOP

1. **Write up Example code to demonstrate the three fundamental concepts of OOP. (in Coding folder)**

2. **What is wrapper class in Java and Why we need wrapper class?**

   Wrapper class provides a way to use primitive data types as objects. The wrapper class can be used when objects are needed, for example, the classes in java.util package handle only objects. And data structures in the Collection framework, such as ArrayList, store only objects.

3. **What is the difference between HashMap and HashTable?**

   - HashTable is synchronized, while HashMap is not
   - Only one thread is allowed to operate in HashTable, while multiple threads are allowed to operate concurrently in HashMap
   - Null is not allowed in HashTable, while null is allowed in HashMap

4. **What is String pool in Java and why we need String pool?**

   String pool is a storage area in Java heap. When we create a string literal, the JVM will check in the String pool. If found the same string literal, it just returns the reference. If not found, the literal will be added to the pool and its reference will be returned. String pool helps in saving and optimizing the amount of memory allocated for string by storing only one copy of each string literal in the pool.

5. **What is Java garbage collection?**

   Garbage collection in Java is the process of determining which object is no longer being used and recycling the memory for other uses.  When Java programs run on the JVM, objects are created and stored at the heap memory. The garbage collector will find the unused objects and delete them to free up memory.

6. **What are access modifiers and their scopes in Java?**

   Access modifiers help to restrict the scope of a class, constructor, variable, method, or data member. There are four types of access modifiers:

   - `default` - accessible only within the same package
   - `private` - accessible only within the class
   - `protected` - accessible within the same package or subclasses in different packages
   - `public` - accessible everywhere

7. **What is final key word? (Filed, Method, Class)**

   `final` is a non-access modifier which applicable only to a variable, a method, or a class.

   - `final variable` - cannot change value, defines constant
   - `final method` - cannot override
   - `final class` - cannot extend, prevents inheritance

8. **What is static keyword? (Filed, Method, Class). When do we usually use it?**

   `static` is a non-access modifier which mainly used for memory management. Java supports static variable, static block, static method and static class.

   - `static variable` - a single copy of the variable will be created and shared among all objects at the class level. It makes program memory efficient.
   - `static block` - is used to initialize the static variables. It is executed before the main method.
   - `static method` - can only directly access static data or call static methods. It can be used when we're writing utility methods or classes which are not supposed to be changed.
   - `static class` - a static class must be a inner/nested class, and it can access only the static members of the outer class.

9. **What is the differences between overriding and overloading?**

   - `Overloading` - in the same class, same method name, different arguments, return type doesn't matter
   - `Overriding` - parent and child classes, same method name, same arguments, same return type

10. **What is the differences between super and this?**

    `super` is used to access methods in the parent class, while `this` is used to access methods in the current class

11. **What is the Java load sequence?**

    static fields are initialized before non-static fields in Java: 

    static variable/block -> constructor

12. **What is Polymorphism ? And how Java implements it ?**

    Polymorphism in java means that we have many classes that are related to each other by inheritance. It allows you to define one interface and have multiple implementations. There're two types: compile-time and runtime polymorphism. Compile-time polymorphism can be achieved by overloading. Runtime polymorphism can be achieved by overriding.

13. **What is Encapsulation ? How Java implements it? And why we need encapsulation?**

    Encapsulation in Java is a process of wrapping code and data together into a single unit. The data in a class is hidden from any other class and can be accessed only through the member function of its own class in which it is declared. We need encapsulation to get better control over the data members and methods inside the class as well as improve the security and flexibility of the code and data.

14. **What is Interface and what is abstract class? What are the differences between them?**

    - `abstract class` - can have abstract and non-abstract methods, can have everything as same as normal java class (i.e. constructor, static, final), instantiation is not possible, child classes must implement all the abstract methods declared in the parent abstract class

    - `interface` - is a kind of code contract, which must be implemented by a concrete class

    - Key differences between abstract and interface includes:

      a. an interface cannot have state, while the abstract class can have state with instance variables

      b. a class can implement multiple interface, but a class can extend only one abstract class

      c. interface can be implemented by class or extended by interface, abstract class can only be extended

15. **Design a parking lot (in Coding folder)**

16. **What are Queue interface implementations and what are the differences and when to use what?**

    The Queue interface supports all methods (insertion, deletion, etc.) of Collection interface and follows FIFO concept. Some common queue interface implementations include `PriorityQueue`, `LinkedList`, and `PriorityBlockingQueue`. `PriorityQueue` provides a way to process the objects based on the priority. `LinkedList` implements a a linear data structure where the elements are linked using pointers and addresses. `PriorityBlockingQueue` is an unbounded blocking queue which uses the same ordering rules as PriorityQueue. PriorityQueue and LinkedList are not thread-safe, so if the thread-safe implementation is needed, we should use the PriorityBlockingQueue.
