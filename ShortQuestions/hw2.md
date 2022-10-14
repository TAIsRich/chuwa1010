### What is *wrapper class* in Java and Why we need _wrapper class_?
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, 
where primitive types cannot be used (the list can only store objects):
 
 `ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid`
 
`ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid`

Another useful method is the toString() method, which is used to convert wrapper objects to strings.

### What is the difference between *HashMap* and _HashTable_?
1. HashMap is non-synchronized. It is not thread-safe and can't be shared between many threads without proper synchronization code.
2. HashMap allows one null key and multiple null values.
3. Hashtable is synchronized. It is thread-safe and can be shared with many threads.
4. Hashtable doesn't allow any null key or value.
5. HashMap is generally preferred over Hashtable if thread synchronization is not needed.

### What is String pool in Java and why we need String pool?
String pool is a special storage in java Heap memory where string literals are stored. It is used to store String values, 
when a String literal is created, JVM first checks the String Pool before creating a new String object corresponding to it.

### What is Java garbage collection?
Java applications obtain objects in memory as needed. It is the task of garbage collection (GC) in the Java virtual machine (JVM) 
to automatically determine what memory is no longer being used by a Java application and to recycle this memory for other uses.

Garbage collection frees the programmer from manually dealing with memory deallocation. 
As a result, certain categories of application program bugs are eliminated or substantially reduced by GC:

- Dangling pointer bugs, which occur when a piece of memory is freed while there are still pointers to it, and one of those pointers is dereferenced. By then the memory may have been reassigned to another use with unpredictable results.
- Double free bugs, which occur when the program tries to free a region of memory that has already been freed and perhaps already been allocated again.
- Certain kinds of memory leaks, in which a program fails to free memory occupied by objects that have become unreachable, which can lead to memory exhaustion.

### What are access modifiers and their scopes in Java?
Access modifier： keywords that can be used to control the visibility of fields, methods, and contractors in java class.

1. private: only can see from the same class.
2. Default:  can see from the same class, same package and same package non-subclass.
3. protected: can see from the same class, same package, same package non-subclass and different package subclass.
4. public: can see from the same class, same package, same package non-subclass, different package subclass and different class non-subclass.

### What is final key word? (Filed, Method, Class)
The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).

The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

### What is static keyword? (Filed, Method, Class). When do we usually use it?
The static keyword in Java is mainly used for memory management. The static keyword in Java is used to share the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks, and nested classes. The static keyword belongs to the class than an instance of the class. The static keyword is used for a constant variable or a method that is the same for every instance of a class.

(https://www.geeksforgeeks.org/static-keyword-java/)

### What is the differences between overriding and overloading?

Overriding occurs when the method signature is the same in the superclass and the child class. 

Overloading occurs when two or more methods in the same class have the same name but different parameters.

Overriding: 
1. Overriding is Dynamic polymorphism - run time
   - Method overriding is the process of redefining a parent class's method in a subclass.
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

### What is the differences between super and this?
**super** is used to access method of the parent class.
**this** is used to access method of the current class.

### What is the Java load sequence?


### What is Polymorphism ? And how Java implements it ?
### What is Encapsulation ? How Java implements it? And why we need encapsulation?
### What is Interface and what is abstract class? What are the differences between them?
### What are Queue interface implementations and what are the differences and when to use what?
