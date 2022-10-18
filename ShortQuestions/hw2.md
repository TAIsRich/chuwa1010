### 1. Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)
1. Encapsulation;
2. Polymorphism;
3. Inheritance;

### 2. What is wrapper class in Java and Why we need wrapper class?
    In java primitive type are not objects and therefore they don't have any methods to manipulate these data. But if we convert them to an object use wrapper, we can use the methods provided by these classes to maniuplate them.

### 3. What is the difference between HashMap and HashTable?

|HashMap | HashTable |
|-----------|------------|
|No method is synchronized (no lock) | Every method is synchronized (has lock)|
|Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe.|	Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe.|
|Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe.|	It increases the waiting time of the thread and hence performance is low.|
|Null is allowed for both key and value.|	Null is not allowed for both key and value. Otherwise, we will get a null pointer exception.|
|It is introduced in the 1.2 version.|	It is introduced in the 1.2 version.|
|It is non-legacy.|	It is a legacy.|
    
### 4. What is String pool in Java and why we need String pool?
String pool contains frequently used words, so we don’t need to create one when we need it.

### 5. What is Java garbage collection?
Garbage collection in java is done when memory are no longer point to by pointers. When certain threshold is reached, the JVM will pause the application and all its thread to perform garbage collection. So this process may cause performance issue if not configured properly.

### 6. What are access modifiers and their scopes in Java?
|Modifier|Description|
|--------|-------|
|Default|declarations are visible only within the package (package private)|
|Private|declarations are visible within the class only|
|Protected|declarations are visible within the package or all subclasses|
|Public| declarations are visible everywhere|

### 7. What is final key word? (Filed, Method, Class)
Final **variable** can not be changed once it is initialized.
Final **method** prevent any inherited classed from override the method.
Final **class** can not be inherited. Member variables in final classes can be made final as needed, but it should be noted that all member methods in final classes are implicitly designated as final methods. final class is **immutable**.

### 8. What is static keyword? (Filed, Method, Class). When do we usually use it?
Static **variable**: only one instance and could be shared by all instances of the class.
Static **method** could be directly used by calling class name without making an object.
Static **class** is created inside a class, is called a static nested class in Java. It cannot access non-static data members and methods. It can be accessed by outer class name.


### 9. What is the differences between overriding and overloading?
|Method Overloading | Method Overriding|
|-------------------|------------------|
|Overloading happens at compile time.| Overriding happens at runtime|
|Gives better performance because the binding is being done at compile time.| Gives less performance because the binding is being done at run time.|
|Private and final methods can be overloaded.|Private and final methods can NOT be overridden.|
|Return type of method does not matter in case of method overloading.|Return type of method must be the same in the case of overriding.|
|Arguments must be different in the case of overloading.|Arguments must be the same in the case of overriding.|
|It is being done in the same class.| Base and derived(child) classes are required here.|
|Mostly used to increase the readability of the code.|Mostly used to provide the implementation of the method that is already provided by its base class.|

### 10. What is the differences between super and this?
- This points represent the **current** instance of the class, and access current class's methods and fields. 
The most common use of the **this** keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter). 

- Super represent an instance of the parent class and could be used to access methods and fields of the **parent** class.


### 11. What is the Java load sequence?
static variable/block -> constructor

### 12. What is Polymorphism ? And how Java implements it ?
In programming, **polymorphism** refers to the same object exhibiting different forms and behaviors. It is implemented by method overloading and method overriding.
>*For example, take the Shape Class. The exact shape you choose can be anything. It can be a rectangle, a circle, a polygon or a diamond. So, these are all shapes but their properties are different. This is called Polymorphism.

### 13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
- **Encapsulation** in OOP refers to binding the *data* and the *methods* to manipulate that data together in a single *unit* (class).

- **Encapsulation** is grouping data memebers of a class together and only allows getters or setter of that class to read and modify the data. This allows for better security by limiting other classes from accessing data member of other classes and limits their ability to modify the data only to what the setter method allows. 

### 14. What is Interface and what is abstract class? What are the differences between them?
- **Interfaces** are a kind of code contract, which must be implemented by a concrete class. A class can implement multiple interface at once. Every variable in an interface must be final and static therefore the same values apply to every object in that class.
- **Abstract** class have variable that can be decalred or not declared and methods with or without body. Abstract classes cannot be instantiated and only one abstract class can be extended.

### 15. design a parking lot (put the code to codingQuestions/coding1 folder, )
    1. If you have no ability to design it, please find the solution in internet, then understand it, and re-type it.(Do NOT just copy and paste)
We’ll make the following assumptions
1) The parking lot has multiple levels. Each level has multiple rows of spots. 
2) The parking lot can park motorcycles, cars, and buses. 
3) The parking lot has motorcycle spots, compact spots, and large spots. 
4) A motorcycle can park in any spot. 
5) A car can park in either a single compact spot or a single large spot. 
6) A bus can park in five large spots that are consecutive and within the same row. It cannot park in small spots. 
In the implementation, we have created an abstract class Vehicle, from which Car, Bus, and Motorcycle inherit. To handle the different parking spot sizes, we have just one class ParkingSpot which has a member variable indicating the size

### 16. What are Queue interface implementations and what are the differences and when to use what?
There are 2 different queue interface, one is linkedlist and the other is priority queue. Priority queue interface are used when some elements in the queue need to be processed on priority. And Linkedlist inetrface are used when elements in the queue are insert at the head or the end or removed from the front or back.


