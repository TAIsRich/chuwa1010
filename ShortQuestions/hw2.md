## HW2
1. **Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demorepo as example)**  

2. **What is wrapper class in Java and Why we need wrapper class?**
   - *What?*
   - A Wrapper class is a class which contains the primitive data types (int, char, short, byte, etc).
   - *Why?*
   - 1.Wrapper Class will convert primitive data types into objects. The objects are necessary if we wish to modify the arguments passed into the method (because primitive types are passed by value).
   - 2.Data structures in the Collection framework such as ArrayList and Queue store only the objects (reference types) and not the primitive types.

3. **What is the difference between HashMap and HashTable?**  
    - 1.HashMap is non-syncronized and is not thread safe while HashTable is thread safe and is synchronized.
    - 2.HashMap allows one null key and values can be null whereas HashTable doesn't allow null key or value.
    - 3.HashMap is faster than HashTable.
    - 4.HashMap iterator is fail-safe where HashTable iterator is not fail-safe.
    - 5.HashMap extends AbstractMap class where HashTable extends Dictionary class.

4. **What is String pool in Java and why we need String pool?**  
   What?
    String Pool in Java is a special storage space in Java Heap memory where string literals are stored. It is also known by the names - String Constant Pool or String Intern Pool.
   Why?
    It is created to decrease the number of string objects created in the memory. Whenever a string literal is created, the JVM first checks the String Constant Pool before creating a new String object corresponding to it.

5. **What is Java garbage collection?**  
    Java Garbage Collection process is to identify the objects which are no longer needed by a program so that their resources can be reclaimed and reused. These identified objects will be discarded.  
    The main goal of using garbage collection is to free the heap memory by eliminating unnecessary objects.

6. **What are access modifiers and their scopes in Java?**  
    In java, access modifiers are used to set the accessibility (visibility) of classes, interfaces, variables, methods, constructors, data members, and the setter methods.  
    - Public: a class or interface may be accessed from outside the package. Constructors, inner classes, methods and field variables may be accessed wherever their class is accessed.  
    - Protected: are visible in the same package but no other package except if a class extends then it is visible even if it is outside the package.   
    - Private: accessed only within the class in which they are declared.  
    - No modifier (default modifier): are visible to the other classes which are inside the package and invisible to the classes which are outside the package.

7. **What is final key word? (Filed, Method, Class)**  
    1. final variable: If you make any variable as final, you cannot change the value of final variable(It will be constant).
    2. final method: If you make any method as final, you cannot override it.
    3. final class: If you make any class as final, you cannot extend it.

8. **What is static keyword? (Filed, Method, Class). When do we usually use it?**  
   The keyword static means that the particular member belongs to the class itself, rather than to an instance of that class.
   It is used to share the same variable or method of a given class. Basically, static is used for a constant variable or a method that is same for every instance of a class.
   We can apply the keyword to variables, methods, blocks and nested classes.
   - Static Block: 
   If you need to do the computation in order to initialize your static variables, you can declare a static block that gets executed exactly once, when the class is first loaded.
   - Static Variable: 
   When you declare a variable as static, then a single copy of the variable is created and divided among all objects at the class level.
   - Static Methods:
   They can directly call other static methods only and access static data directly.


9. **What is the differences between overriding and overloading?**
   - When two or more methods in the same class have the same name but different parameters, it’s called overloading.   
   - When the method signature (name and parameters) are the same in the superclass and the child class, it’s called overriding.

10. **What is the differences between super and this?**  
    ```super()``` is used to call super class constructor  
    ```this()``` used to call constructors in the same class, means to call parameterized constructors.

11. **What is the Java load sequence?**  
    JVM maintains a runtime pool in permgen area where classes are loaded. Whenever a class is referenced default class loader finds the class in the class path and loads it into this pool. And this is not specific to user defined classes or classes provided in JDK. When a class is referenced it is loaded into the memory.  
    Classes loaded by the ClassLoader are stored internally in the ClassLoader instance.  
    When class needs to be added to the memory following function is called.

12. **What is Polymorphism ? And how Java implements it ?**  
    Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
    In programming, polymorphism refers to the same object exhibiting different forms and behaviors. It is implemented by method overloading and method overriding.

13. **What is Encapsulation ? How Java implements it? And why we need encapsulation?**  
    - Encapsulation in OOP refers to binding the data and the methods to manipulate that data together in a single unit (class).

    - Encapsulation is grouping data memebers of a class together and only allows getters or setter of that class to read and modify the data. This allows for better security by limiting other classes from accessing data member of other classes and limits their ability to modify the data only to what the setter method allows.

14. **What is Interface and what is abstract class? What are the differences between them?**  
    - *1.What is an Abstract Class?* 
    A class that contains an abstract keyword on the declaration is known as an abstract class. It is necessary for an abstract class to have at least one abstract method. It is possible in an abstract class to contain multiple concrete methods.
    - *2.What is an Interface?*
    An interface is a sketch that is useful to implement a class. The methods used in the interface are all abstract methods. The interface does not have any concrete method.
    - *3.Difference between Abstract Class and Interface in Java?*

 | Abstract Class                                                                          | Interface                                                           |
|-----------------------------------------------------------------------------------------|---------------------------------------------------------------------|
| An abstract class can contain both abstract and non-abstract methods.                   | Interface contains only abstract methods.                           |
| An abstract class can have all four; static, non-static and final, non-final variables. | Only final and static variables are used.                           |
| To declare abstract class abstract keywords are used.                                   | The interface can be declared with the interface keyword.           |
| It supports multiple inheritance.                                                       | It does not support multiple inheritance.                           |
| The keyword ‘extend’ is used to extend an abstract class.                               | The keyword implement is used to implement the interface.           |
| It has class members like private and protected, etc.                                   | It has class members public by default.                             |

15. **design a parking lot (put the code to codingQuestions/coding1 folder, )**  
    If you have no ability to design it, please find the solution in internet, then understand it, and re-type it.(Do NOT just copy and paste)

16. **What are Queue interface implementations and what are the differences and when to use what?**  
    - LinkedList and PriorityQueue are the classes that implement the Queue interface.
    - LinkedList implements the Queue interface, providing first in, first out (FIFO) queue operations for add, poll, and so on.
    The PriorityQueue class is a priority queue based on the heap data structure. This queue orders elements according to the order specified at construction time, which can be the elements' natural ordering or the ordering imposed by an explicit Comparator.