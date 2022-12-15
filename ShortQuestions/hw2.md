**Q2**

Wrapper class is a class whose object wraps or contains primitive data types.

It is used since it could provide a way to use primitive data types as objects.

**Q3**

HashMap allows null key and null value. HashMap is not synchronized but faster. HashMap is not thread-safe.

HashTable do not allow null key or value. Hashtable is synchronized but slower. Hashtable is thread-safe.

**Q4**

String pool is a special storage space in Java Heap memory where string literals are stored.

We need it because it could reduce the amount of string obejcts created in the memory. When a string is created, JVM will check the string pool. 
If the same string exists already, it will return a reference instead of creating a new string.

**Q5**

It is a feature in java which could destroy the objects which are not in use to free up memory.

**Q6**

Default:declarations are visible within the package

Private: declarations are visible within the class

Protected:  declarations are visible within the package or subclasses

Public: declarations are visible everywhere. 

**Q7**

final field: define constants which value could not bechanged.

final method: prevent other methods overriding. The method can not be modified from a subclass.

final class: prevent inheritance and make the class immutable. The class could not be extended.

**Q8**

static field: only one instance and could be shared by all instances of the class.

static method: could be directly used by calling class name.

static class: a class that is created inside a class. it could access static data of the outer class and be accessed by outer class name.

**Q9**

overload: occurs between the same class but different methods. same name but different parameters. compile time polymorphism.

override: occurs between superclass and subclass. same name and parameter. runtime polymorphism.

**Q10**

super: represent an instance of the parent class and could be used to access methods and fields of the parent class.

this:  represent the current instance of a class and access current class's methods and fields.

**Q11**

without the parent class: static variable/block -> constructor

with the parent class: static variable/block of the parent class -> static variable/block of the child class -> constructor of the parent class
-> constructor of the child class

**Q12**

Polymorphism: the same object exhibiting different forms and behaviors.

It is implemented by method overloading and method overriding.

**Q13**

Encapsulation: bind variables and methods for manipulating data together as a sing unit .

It is implemented by make the data private and write getter and setter methods in the class.

It is used beacuse it could help data hiding and have control on data and methods.

**Q14**

Interface: a kind of code contract, which must be implemented by a concrete class. similar to a sketch that is used to implement a class.

Abstract class: a class include abstract methods and cannot be instantiated.

difference: Multiple inheritance could be archived by interface but not abstract class. An interface could use implements keyword or extends while abstract class could
only use extends. An interface could not have constuctors while abstarct class could. Interface could only have public access modifier.

**Q16**

PriorityQueue: process according to priority. used when the objects are supposed to be processed based on the priority. 

LinkedList: store elements in the form of linked list. used when modifications to a collection are frequent like inserti or delete operations.

ArrayDeque:  a growable array that allows to add or remove an element from both sides. used when needs LIFO (Last-In-First-Out) stacks or needs a resizeable queue.
