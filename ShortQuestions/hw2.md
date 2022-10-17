#Homework 2

##1.	Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)
Please see project under *oop* folder.

##2.	What is wrapper class in Java and Why we need wrapper class?
A wrapper class is a object version of a primitive data type. For example, `Integer` for `int`, and `Character` for `char`. We need wrapper classes to provide functionalities in addition to the stored data itself. For example, we need `Integer.parseInt(String s)` to cast `string` to `int`. We also need wrapper classes to store primitive data types into data structures such as `ArrayList<E>`, which only takes objects as its component.

##3.	What is the difference between HashMap and HashTable?
`HashMap` can store `null`, while `HashTable` can’t. However, `HashTable` is thread-safe, allowing only one thread to be able to operate stored objects at one time, while `HashMap` is not thread-safe and allows multi-thread operations.

##4.	What is String pool in Java and why we need String pool?
A String pool is a storage structure in Java heap that stores unique string values. When a string is initialized, the value is stored in string pool, whose address in heap will be pointed to whenever a new string with same value is initialized, unless a new string is explicitly created through `new String(“”)`. We need String pool to optimize memory space on JVM.

##5.	What is Java garbage collection? 
Java garbage collection is a memory-optimizing property on JVM which removes the value from the memory if the reference in code is removed.

##6.	What are access modifiers and their scopes in Java? 
For a field, class, or method, there are four types of access modifiers:
- `public` allows access from anywhere.
- `private` only allows access from inside of a class.
- `defualt` only allows access from the same package.
- `prortected` allows acess from the same package or a different package via a child class.
  
##7.	What is final key word? (Filed, Method, Class) 
- `final` key word for field means the value is immutable once initialized. 
- `final` key word for class means the classes cannot be extended as a subclass.
- `final` key word for method means the method cannot be overridden in a subclass.

##8.	What is static keyword? (Filed, Method, Class). When do we usually use it?
- `static` keyword for field means the field is declared associated with the class instead any instance of the class.
- `static`keyword for method means the method is operated under the class instead of changing properties of any single instance.
- `static`keyword for class means the class (usually inner) is only associated with a class it is in instead of any single instance.
  
##9.	What is the differences between overriding and overloading?
- Overriding indicates dynamic polymorphisms, which can be seen when a subclass provides a specific version in the run-time of the method belonging to the parent class.
- On the other hand, overloading indicates static polymorphisms, which can be seen from different constructors written in compile-time to initiate a new object belonging to the same class.

##10.	What is the differences between super and this? 
`Super` means to access fields in parent class, while `this` access field in this class that the code is written.

##11.	What is the Java load sequence? 
The JVM loads the parent class, if exist, then the child class when initializing a class and static fields/blocks first and then non-static fields/blocks.

##12.	What is Polymorphism ? And how Java implements it ?
Polymorphism refers to the status when the same class or method is operated with different properties.
Java implements into through static polymorphism, which is overriding in run-time to operate a method differently from its parent class, and dynamic polymorphism, which is overloading in compile-time to provide different constructors to a class when initiating a new instance.

##13.	What is Encapsulation ? How Java implements it? And why we need encapsulation?
Encapsulation is to a data-access protection mechanism in Java, which is implemented by declaring fields in a class to be private and provides getter and setter methods to allow better designed access. We need encapsulation to protect data being read or changed from undesired parties without verification or authentication. 

##14.	What is Interface and what is abstract class? What are the differences between them?
A interface provides features that can enhance a class with a specific implementation, while abstract class is a abstraction of common behaviors of a group of subclasses, including fields and methods. While they both have abstract methods that must be implemented in the class where they are implemented or extended, abstract classes can have regular method and field to allow code reusage, which interface cannot. One class can only be a subclass of one abstract class, while it can implement multiple interfaces, which directs the usage of abstract class to a IS relationship in a design sense and the usage of interfaces to future enhancement.

##15.	design a parking lot (put the code to codingQuestions/coding1 folder) 
Please see project under *parkingLot* folder.

##16.	What are Queue interface implementations and what are the differences and when to use what?
`Queue` interface implementations include `PriorityQueue`, `PriorityBlockingQueue`, and `LinkedList`, which store objects based on insertion order. However, `PriorityQueue` and `PriorityBlockingQueue`’s head is the object with the smallest value. `PiroirtyBlockingQueue` is a version of `PriotiyQueue` with thread-safe access. `LinkedList` follows `Queue`’s FIFO principle that maintains the head in insertion order. It is also different from `PriorityQueue` in a sense that its objects a stored in nonlinear order through pointers, while `PrioirtyQueue` stores it in a linear manner.
