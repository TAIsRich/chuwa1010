
# hw2

#####  Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo

repo as example)

1.  Encapsulation;

2.  Polymorphism;

3.  Inheritance;

##### 2.  What is wrapper class in Java and Why we need wrapper class?

wrapper class is a class that contains primitive data type. wrapper class can convert primitive data type into object. The collection framework only stores the object. And java.util.package only handle object. Wrapper class will help at this situation.

##### 3. What is the difference between HashMap and HashTable?-- HashMap is non-synchronized and is not thread-safe.  HashTable is thread safe and synchronized. HashMap allow null key and value while HashTable not.

##### 4.  What is String pool in Java and why we need String pool? --String pool is a java heap memory to store the string literal. String allow to change the string while string in java is immutable.

##### 5.  What is Java garbage collection?
 Java garbage collection is  the JVM automatically determined the memory that is no longer user, it helps to save the memory.

##### 6.  What are access modifiers and their scopes in Java?    
  Public—can access all, private –only can access the same class, protect—only in the same package, default –when class or method or variable not specific. It has more visibility than private, but less than protect and public.

##### 7.  What is final key word? (Filed, Method, Class) 
Final is use to restrict the user, so the other user can’t change the class, method, variable.

##### 8.  What is static keyword? (Filed, Method, Class). When do we usually use it?  
Static key word use for memory management, it used to share the same variable or method.

##### 9.  What is the differences between overriding and overloading?
override is happened at runtime, it must have the same method  name, parameter, type od data. Private and final can’t override, Usually use in the base and child class. Overloading is  happened at compile time, it must have different parameters, but same return type. It usually done in the same class

##### 10.  What is the differences between super and this? 
Super points to a reference of the parent class, this points to a reference of a the current class.

##### 11.  What is the Java load sequence?
The jvm will load the static method and variable first , then to the constructor.

##### 12.  What is Polymorphism ? And how Java implements it ? 
it refers to the same object have different forms and behaviors. Use Overriding and Overloading to implements.

##### 13.  What is Encapsulation ? How Java implements it? And why we need encapsulation? 
To binding the method and data to manipulation together in a single unit. Use the access modifiers and getter/setter method to access.

##### 14.  What is Interface and what is abstract class? What are the differences between them? 
Interfaces are kind of code contract, it must implement by concrete class. Abstact class is like a class that can have some abstract method, and the abstract class can’t instantiated.

##### 15.  design a parking lot (put the code to codingQuestions/coding1 folder, )

1.  If you have no ability to design it, please find the solution in internet, then understand it, and re-type

it.(Do NOT just copy and paste)
