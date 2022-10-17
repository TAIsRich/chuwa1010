###### 2. What is wrapper class in Java and Why we need wrapper class?
Java wrapper class allows an object, which stores primitive data types, to be created. 
In other words, a primitive value can be wrapped into a wrapper class object. Wrapper class allows 
primitive data types to be used in Java programming. 

###### 3. What is the difference between HashMap and HashTable?
```
HashMap is non-syncronized, HashTable is syncronized. 
HashMap is faster, HashTable is slower. 
HashMap is not thread safe, HashTable is thread safe. 
HashMap allows one null key and null values, HashTable doesn't allow null key or value. 
HashMap iterator is fail-safe, HashTable iterator is not fail-safe. 
```

###### 4. What is String pool in Java and why we need String pool?
String Constant Pool in Java is a special storage space in Java Heap memory where strings
are stored. Since strings are immutable in Java, JVM can optimize the amount of memory allocated for 
strings by storing only one copy of each literal string in the pool. 

###### 5. What is Java garbage collection?
Java garbage collection is an automatic process of looking at heap memory, identifying unused objects, 
and deleting these objected so hat memory can be freed up for other use. 

###### 6. What are access modifiers and their scopes in Java?
Access modifiers helps to restrict the scope of a class, constructor, variabe, method, or data member. 
There are four types of access modifiers - default, private, protected and public. 
````
Default(no keyword required) - accessible only within the same package
Private - accessible only within the same class
Protected - accessible within the same package or subclasses in different packages
Public - accessible from everywhere
````

###### 7. What is final key word? (Field, Method, Class)
The final keyword is a non-access modifier used for classes, attributes and methods, which makes them
non-changeable(impossible to inherit or override). 
````
Final variable - constant variable(cannot be modified)
Final methods - prevent method override
Final class - prevent inheritance
````

###### 8. What is static keyword? (Field, Method, Class). When do we usually use it?
The static keyword means that the particular member belongs to a type itself, rather than to an instance 
of that type. 
Static field - when we declare a field static, exactly a single copy of that field is created and shared among 
all instances of that class
Static fields are used when the value of variable is independent of objects, and when the value is supposed to
be shared across all objects. 
Static methods - belong to a class instead of an object. We can call them without creating the object of the
class in which they reside. 
Static methods are widely used in utility and helper classes. 
Static class - provides a way of grouping elements that we'll only use in one place. This helps to keep our code
more organized and readable.

###### 9. What is the differences between overriding and overloading?
````
Overriding happens at runtime, whereas overloading happens at compile time. 
Overloading givesbetter performance than overriding. 
Private and final methods can be overloaded, whereas cannot be overridden.  
Override occurs between superclass and subclass, overload occurs between the methods in the same class. 
Override method has the same signature(name and method arguments), overload method has the same name, but different
parameters.
Return type of method must be the same in the case of overriding, whereas it doesn't matter in case of method 
overloading
Overriding is mostly used to provide the implementation of the method that is already provided by its parent class, 
whereas overloading is mostly used to increase the readability of the code. 
````

###### 10. What is the differences between super and this?
Super keyword is used to access methods of the immediate parent class while this is used to access methods of 
the current class. 

###### 11. What is the Java load sequence?
JVM loads static block is called first, then load static variables. Then constructor is loaded. Non-static variables
are loaded after. 

###### 12.  What is Polymorphism ? And how Java implements it ?
In programming, polymorphism refers to the same object exhibiting different forms and behaviors. 
````
Static polymorphism - overload(within the same class, happens at compile time)
Dynamic polymorphism - override(within the child class, happens at run time)
````

###### 13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
Encapsulation refers to binding the data and the methods to manipulate that data together in asingle unit(class). 
By encapsulating a class' variables, other classes cannot access them, and only the methods of the class can access them. 
Java has four(4) access modifiers to enable encapsulation - default, private, protected and public. 

###### 14.  What is Interface and what is abstract class? What are the differences between them?
````
An interface is a completely "abstract class" that is used to group related methods with empty bodies. 
An abstract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from 
another class).
Interface can have only abstract methods. An abstract class can have abstract and non-abstract methods(default methods and
static methods).
Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
Abstract class can provide the implementation of the interface. Interface can’t provide the implementation of an abstract 
class.
A Java interface can be implemented using the keyword “implements” and an abstract class can be extended using the keyword 
“extends”. 
An interface can extend one or more Java interfaces; an abstract class can extend another Java class and implement multiple 
Java interfaces.
Interface supports multiple inheritance; an abstraction does not support multiple inheritance.
Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.
````

###### 15. Design parking lot - see codingQuestions section. 

###### 16. What are Queue interface implementations and what are the differences and when to use what?
Some class that implements Queue interface - ArrayDeque, LinkedList, PriorityQueue, ConcurrentLinkedDeque, 
ConcurrentLinkedQueue, etc. 
````
ArrayDeque/LinkedList/PriorityQueue - not thread-safe, unsynchronized
ConcurrentLinkedDeque, ConcurrentLinkedQueue - synchronized
````
