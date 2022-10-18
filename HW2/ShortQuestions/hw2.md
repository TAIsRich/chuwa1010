####Question 2: What is wrapper class in Java and Why we need wrapper class?
Wrapper class provides a way to use primitive data types as objects. We must use wrapper class when working Collection object.

For example, `ArrayList<int> numbers = new ArrayList<int>();`

####Question 3: What is the difference between HashMap and HashTable?
1. HashMap is non-synchronized. It is not thread-safe and can't be shared between many threads without proper synchronization code.
2. HashMap allows one null key and multiple null values.
3. Hashtable is synchronized. It is thread-safe and can be shared with many threads.
4. Hashtable doesn't allow any null key or value.
5. HashMap is generally preferred over Hashtable if thread synchronization is not needed.
####Question 4: What is String pool in Java and why we need String pool?
String pool is a special storage in java Heap memory where string literals are stored. It is used to store String values, when a String literal is created, JVM first checks the String Pool before creating a new String object corresponding to it.
####Question 5: What is Java garbage collection?
It is automatic memory management. If some objects will no longer be needed, the Java garbage collection will find these unused objects and deletes them to free up memory.
####Question 6: What are access modifiers and their scopes in Java?
Access modifier： keywords that can be used to control the visibility of fields, methods, and contractors in java class.
scopes in java:
1. private: only can see from the same class.
2. Default:  can see from the same class, same package and same package non-subclass.
3. protected: can see from the same class, same package, same package non-subclass and different package subclass.
4. public: can see from the same class, same package, same package non-subclass, different package subclass and different class non-subclass.
####Question 7: What is final key word? (Filed, Method, Class)
When a filed, a method, or a class is final, it means that it cannot be changed. It will stay on constant.
####Question 8: What is static keyword? (Filed, Method, Class). When do we usually use it?
Static keyword is used for memory management, it used to share the same variable or methods of a given class, and it used for a constant variable or a method that is same for every instance of class. The main method of a class is generally labeled static.
1. static field
2. static method
3. static class
####Question 9: What is the differences between overriding and overloading?
Overriding: 
1. Overriding is Dynamic polymorphism - run time
   1. Method overriding is the process of redefining a parent class's method in a subclass.
2. Overriding gives less performance because the binding is being done at run time
3. Private and final methods can not be overridden.
4. Return type of method must be the same in the case of overriding.
5. Argument myst be the sam ein the case of overriding.
6. Base and derived(child) classes are required here.
7. Mostly used to provide the implementation of the method that is provided by its base class.

Overloading:
1. Overloading is static polymorphism - compile time
2. Overloading gives better performance because the binding is being done at compile time. 
3. Private and final methods can be overloaded.
4. Return type of method does not matter in case of method overloading.
5. Arguments must be different in the case of overloading.
6. It is being done in the same class.
7. Mostly used to increase the readability of the code.
####Question 10: What is the differences between super and this?
1. super is used to access method of the parent class.
2. this is used to access method of the current class.
####Question 11: What is the Java load sequence?
The class loaders in the JVM are organized into a three hierarchy, win which every class loader has a parent.
1. Before loading a class, a good practice for a class loader is to check whether the class's parent can load or already has loaded the required class. 
####Question 12: What is Polymorphism ? And how Java implements it ?
Polymorphism refers to the same object exhibiting different forms and behaviors. It has static Polymorphism (overload) and dynamic Polymorphism(override). 
For example, a class shape has a method called getArea, 2 other classes named Rectangle and Circle extend from shape class with the same method called getArea. We can override the getArea method in the child class based on the requirement of each shape.

####Question 13: What is Encapsulation ? How Java implements it? And why we need encapsulation?
Encapsulation is getter and setter methods, it refers to binding the data and the method to manipulate that data together in a single unite class.
We also need add access modifiers to control the visibility of method, class or variable to be private, protected or public.
####Question 14: What is Interface and what is abstract class? What are the differences between them?
Interface:
1. Interface is a class can implement multiple interfaces.
2. Interface doesn't have access modifiers, only public modifier inside the interface.
3. Interface annot contain data field.
4. Interface help define a class's peripheral ability.

Abstract class:
1. The class can only inherit one abstract class.
2. Abstract class can have an access modifier.
3. Abstract class can have data field.
4. Abstract class defines the identity of a class
####Question 16: What are Queue interface implementations and what are the differences and when to use what?
1. Queue interface extends the Collection interface is used to hold the elements about to be processed in FIFO. It has Deque and PriorityQueue extends from Queue interface. Deque implements LinkedList class and ArrayDeque class. 
2. `Queue<Obj> queue = new PriorityQueue<Obj> ();` is used to create queue object. Queue has methods: adding, removing, Iterating.
3. PriorityQueue processes the objects based on the priority, it follows FIFO algorithm. 
4. LinkedList implements the linked list data structure. 
5. The elements are linked using pointers and addresses. Each element is known as a node. We prefer to use it when we want to easily to insert and delete an element.