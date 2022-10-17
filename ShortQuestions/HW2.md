## Homework 2

1. ###### Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)   

   1. Encapsulation;
   2. Polymorphism;
   3. Inheritance;

2. ###### What is wrapper class in Java and Why we need wrapper class?

   A Wrapper class is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. In other words, we can wrap a primitive value into a wrapper class object.

3. ###### What is the difference between HashMap and HashTable?

   `HashMap` and `Hashtable` store key and value pairs in a hash table. When using a `Hashtable` or `HashMap`, we specify an object that is used as a key and the value that you want to be linked to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table. 

   Difference between HashMap and HashTable:

   1. `HashMap` is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
   2. `HashMap` allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
   3. `HashMap` is generally preferred over HashTable if thread synchronization is not needed.

4. ###### What is String pool in Java and why we need String pool?

   A string constant pool is a separate place in the heap memory where the values of all the strings which are defined in the program are stored. When we declare a string, an object of type String is created in the stack, while an instance with the value of the string is created in the heap. On standard assignment of a value to a string variable, the variable is allocated stack, while the value is stored in the heap in the string constant pool. 

5. ###### What is Java garbage collection?

   Garbage collection in Java is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.

6. ###### What are access modifiers and their scopes in Java?

   For a field, class, or method, there are four types of access modifiers:

   - `public` allows access from anywhere.
   - `private` only allows access from inside of a class.
   - `defualt` only allows access from the same package.
   - `prortected` allows acess from the same package or a different package via a child class.

7. ###### What is final key word? (Filed, Method, Class)

   `final variable` define constants

   `final method` prevent override

   `final class` prevent inheritance and make class immutable

8. ###### What is static keyword? (Filed, Method, Class). When do we usually use it?

   `static` variable can be used to refer to common property of all objects

   `static` method can directly call static method using Class name

9. ###### What is the differences between overriding and overloading?

   Method overriding is the process of redefining a parent class’s method in a subclass.

   Method overloading is using different num of arguments, different type aruments, same method name

10. ###### What is the differences between super and this?

    `this` keyword is a reserved keyword in java i.e, we can’t use it as an identifier. It is used to refer current class’s instance as well as static members. 

    `super` keyword eliminates the confusion between the superclasses and subclasses that have methods with same name.

11. ###### What is the Java load sequence?

    The JVM loads the parent class, if exist, then the child class when initializing a class and static fields/blocks first and then non-static fields/blocks.

12. ###### What is Polymorphism ? And how Java implements it ?

    Polymorphism allows us to perform a single action in different ways. It means that you can define one interface and have multiple implementations.

13. ###### What is Encapsulation ? How Java implements it? And why we need encapsulation?

    Encapsulation refers to the bunding of data, along with the methods that operate on that data, into a single unit.

    For example, encapsulation in coding where data and methods are bundled together into a single package.

14. ###### What is Interface and what is abstract class? What are the differences between them?

     A interface provides features that can enhance a class with a specific implementation, while abstract class is a abstraction of common behaviors of a group of subclasses, including fields and methods. While they both have abstract methods that must be implemented in the class where they are implemented or extended, abstract classes can have regular method and field to allow code reusage, which interface cannot. One class can only be a subclass of one abstract class, while it can implement multiple interfaces, which directs the usage of abstract class to a IS relationship in a design sense and the usage of interfaces to future enhancement. 

15. ###### design a parking lot (put the code to codingQuestions/coding1 folder, )

16. ###### If you have no ability to design it, please find the solution in internet, then understand it, and re-type    it.(Do NOT just copy and paste)

17. ###### What are Queue interface implementations and what are the differences and when to use what?

    Queues typically order elements in a FIFO manner. `Queue` inteface implementations include `PriorityQueue` and `LinkedList`, which order elements according to their values.

    1. `PriorityQueue` class which is implemented in the collection framework provides us a way to process the objects based on the priority. It is known that a queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play.
    2. `LinkedList` is a class which is implemented in the collection framework which inherently implements the linked list data structure. It is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays or queues.