## Chuwa Training - Hw2 Xinyu Zhang
#### 1. Write up Example code to demonstrate the three foundmental concepts of OOP.(referenceCodeDemo repo as example)
   1. Encapsulation; 

   2. Polymorphism; 
   3. Inheritance;

#### 2. What is wrapper class in Java and Why we need wrapper class?
```
a Wrapper class is a class whose object wraps or contains primitive data types
we can wrap a primitive value into a wrapper class object

```
#### 3. What is the difference between HashMap and HashTable?
```
HashMap:
1. Null is allowed for both key and value'
2. no method is synchronized
3. not thread-safe
4. better performance

HashTable:
1. NUll is not allowed, we will get null pointer exception
2. every methos is synchronized
3. thread-safe
4. performance is low
```
#### 4. What is String pool in Java and why we need String pool?
```
String pool is a storage space in Heap memorey where string literals are stored
because string is immutable, string pool decreases the number of string objects created in the JVM,
therefor reducing memoery load and improve performance
```
#### 5. What is Java garbage collection?
```
Garbage collection is a process in Java where unused memory is recycled.
the unreachable or unreferenced objets are automatically removed from Heap memory
```
#### 6. What are access modifiers and their scopes inJava?
```
`Default`: are visible only within the package (package private)
`Public`: are visibal everywhere
`Private`: are visible within the class
`Protected`: are visible within package or all subclasses
```
#### 7. What is final keyword?(Filed,Method,Class)
```
Final Filed: can’t be re-referenced.
Final Method: can’t be overridden
Final Class: can’t be inherited, make class immutable
```
#### 8. What is static keyword?(Filed,Method,Class).When do we usually use it?
```
Static Field: if this field is common to all objects we can use static field
Static Method: can directly call static method using class name
Static Class: a class can be static only if it is a nested class

```
#### 9. What is the differences between overriding and Overloading ?
```
Overrideing: 
1. happens at runtime
2. less performance
3. private and final methods can not be Overirdden
4. happens during class inheritance
5. same method signature, but method body is different
6. mostly used to provide the implementation of the method this is already provided by its based class

Overloading:
1. happens at compile time
2. better performance
3. private and final methods can be Overloaded
4. happens in the same class
5. method names are the same but with different method parameters
6. mostly used to increase the readability of the code
```
#### 10. What is the differences between super and this?
```
this: points to a reference of current class, call current class's constructor
super: points to a reference of the parent class, call parent class's constructor
```
#### 11. What is the Java load sequence?
```
static variable / block -> constructor -> non static variable
```
#### 12. What is Polymorphism? And how Java implements it ?
```
Polymorphism refers to the same onject exhibiting different forms and behaviors
* Static polymorphism - Overload - compile time
* Dynamicc polymorphism - Override - run time

```
#### 13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
```
Encapsulation refers to bulding the data and the methods to manipulate that data together in a single unit(class)
In Java, we declare the variables of a class as private and provide public Getter/Setter method to implements encapsulation
Because it can protect our data, users have no idea about the inner implementation of the class

```
#### 14. What is Interface and what is abstract class? What are the differences between them?
```
Interface: interface does not contain any concrete methods
Abstract class: a class has the abstract keyword in its declaration is abstract class. abstract class should have one abstract method
```

| Interface                                               | Abstract Class                                             |
|---------------------------------------------------------|------------------------------------------------------------|
| a class can implement multiple interfaces               | The class can inherit only one Abstract Class              |
| only contain abstract method                            | can have abstract method and concrete method               |
| An interface cannot be declared private or protected    | cannot be declared private                                 |
| An interface cannot declare constructors or destructors | An abstract class can declare constructors and destructors |

#### 15. design a parking lot (put the code to codingQuestions/coding1 folder, )

#### 16. What are Queue interface implementations and what are the differences and when to use what?
```
Queue interface extends the Collection interface, and many classes implement the Queue interface like ArrayDeque, LinkedList
ArrayDeque is more efficient than LinkedList for add or remove operation at both ends,
LinkedList is efficient for remove the current element during the iteration 



```