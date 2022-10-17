1. Write up Example code to demonstrate the three fundamental concepts of OOP.(referenceCodeDemo repo as example)
    1). Encapsulation: hide the details of some data. It could be implemented by two ways:
   set the data variable to be private, provide get and set method.
   2). Polymorphism: the same method name with different parameters or different method contents.
   3). Inheritance: extend from parent class.
   code examples are in OOP.java under Coding folder.
2. What is wrapper class in Java and Why we need wrapper class?
   The wrapper classes in java are used to convert primitive types(int, char, etc.)
   into corresponding objects.
   byte	- Byte
   short - Short	
   int - Integer	
   long	- Long
   float - Float
   double -	Double
   char	- Character
   boolean -	Boolean
    The wrapper class is needed if we need to modify the arguments passed into the method because 
   primitive types are passed by value.
   The classes in java.util package handle only objects and hence wrapper classes help.
   Wrapper class could be null; primitive types could not be null.

3. What is the difference between HashMap and HashTable?
   HashMap: unordered and unsorted map; it allows one null key and multiple null values.It is not synchronized.
   HashTable:maintain insertion order, slower than HashMap. It is synchronized.
   Duplicate keys are not allowed in both HashMap and HashTable.
4. What is String pool in Java and why we need String pool?
   String pool is a storage area in Java heap to store the String literals. It could decrease the temporary
   String object with the help of sharing. An immutable class is needed to facilitate sharing. Immutable Java
   String helps in executing the concept of String Pool.
5. What is Java **garbage collection**?
   Java garbage collection is the process that Java programs perform automatic memory management.
   The garbage collection process identify the objects which are no longer needed by a program so that their resources can be 
   reclaimed and reused. The identified objects will be discarded.
   Java garbage collection is an automatic process. The programmer does not need to explicitly mark
   objects to be deleted. The garbage collection implementation lives in the JVM. Each JVM implement garbage
   collection when it meets the JVM specification.

6. What are **access modifiers** and their scopes in Java?
   Java provides a number of access modifiers to set access levels for classes, variables, methods, 
   and constructors. The four access levels are:
    default - Visible to the package. No modifiers are needed.
    private - Visible to the class only.
    public - Visible to the world.
    protected - Visible to the package and all sub-classes.
   
7. What is final keyword?(Field,Method,Class)
   final keyword is a non-acess specifier that is used to restrict  a class, variable, and method. 
   variable with final keyword: cannot modify its value; to create constants.
   method with final keyword: cannot be overridden by any subclasses.
   class with final keyword: restrict the other classes to inherit or extend it.
    
8. What is static keyword?(Field,Method,Class).When do we usually use it?
   The static keyword means that particular member belongs to a type itself, rather than to an instance of that type.
   Static filed: when we declare a field static, exactly a single copy of that field is created and shared among
   all instances of that class.
   Static fields are used when the value of variable is independent of objects, and when the value is supposed to
   be shared across all objects.
   Static methods: belong to a class instead of an object. We can call them without creating the object of the
   class in which they reside.
   Static methods are widely used in utility and helper classes.
   Static class: provides a way of grouping elements that we'll only use in one place. This helps to keep our code
   more organized and readable. 
    
10. What is the differences between overriding and overloading?
    Overloading:static polymorphism,implemented in compile time in the same class with different parameters.
    Overriding: dynamic polymorphism,implemented in run time in child class with different method contents.
11. What is the differences between super and this?
    Super refers to parent class, this refers to current class.
12. What is the Java load sequence?
    JVM loads the parent class, if exists, then the child class when initializing a class and static
    fields/blocks first, and then non-static fields/block. 
    
13. What is Polymorphism? And how Java implements it?
    It refers the same method could have different implementations. It implemented by:
    Overloading:static polymorphism,implemented in compile time in the same class with different parameters.
    Overriding: dynamic polymorphism,implemented in run time in child class with different method contents.
14. What is Encapsulation? How Java implements it? And why we need encapsulation?
    Encapsulation is hiding the details of some data. It could be implemented by two ways:
    set the data variable to be private, provide get and set method.
15. What is Interface and what is abstract class? What are the differences between them?
    An abstract class can have abstract and non-abstract methods(method with the body); 
    it doesn't support multiple inheritance;
    It can have final, non-final, static and non-static variables;
    It van provide the implementation of interface;

    Interface: it is abstract class, but only includes abstract methods. The methods are not implemented in the interface.
    It supports multiple inheritance;
    It has only static and final variables;
    Members of a Java interface are public by default.
    
16. design a parking lot (put the code to codingQuestions/coding1 folder)
    Please see project under *ParkingLot* folder.
17. What are Queue interface implementations and what are the differences and when to use what?
    Queue interface is present in java.util package and extends the Collection interface is used to 
    hold the elements about to be processed in FIFO(First In First Out) order.
    This interface is implemented by the following classes:
    LinkedBlockingQueue — an optionally bounded FIFO blocking queue backed by linked nodes
    ArrayBlockingQueue — a bounded FIFO blocking queue backed by an array
    PriorityBlockingQueue — an unbounded blocking priority queue backed by a heap
    DelayQueue — a time-based scheduling queue backed by a heap
    SynchronousQueue — a simple rendezvous mechanism that uses the BlockingQueue interface