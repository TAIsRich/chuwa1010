# HW2

1. Write up Example code to demonstrate the three foundmental concepts of OOP.(referenceCodeDemo repo as example)

Please find example in MavenProject/hw2/java/main

2. What is wrapper class in Java and Why we need wrapper class?

Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects. In that way, wrapper classes make the Java code completely object-oriented. 

3. What is the difference between HashMap and HashTable?

HashMap and Hashtable store key and value pairs in a hash table. When using a Hashtable or HashMap, we specify an object that is used as a key and the value that you want to be linked to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table. Now let us discuss with the help of an example.

HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
HashMap is generally preferred over HashTable if thread synchronization is not needed.

4. What is String pool in Java and why we need String pool ?

String pool is a storage space in the Java heap memory where string literals are stored. It is also known as String Constant Pool or String Intern Pool. It is privately maintained by the Java String class. By default, the String pool is empty. A pool of strings decreases the number of String objects created in the JVM, thereby reducing memory load and improving performance.

5. What is Java garbage collection?

Java applications obtain objects in memory as needed. It is the task of garbage collection (GC) in the Java virtual machine (JVM) to automatically determine what memory is no longer being used by a Java application and to recycle this memory for other uses. Because memory is automatically reclaimed in the JVM, Java application developers are not burdened with having to explicitly free memory objects that are not being used.

6. What are access modifiers and their scopes in Java?

Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are public, protected, default, and private.

Private: We can access the private modifier only within the same class and not from outside the class.

Default: We can access the default modifier only within the same package and not from outside the package. And also, if we do not specify any access modifier it will automatically consider it as default.

Protected: We can access the protected modifier within the same package and also from outside the package with the help of the child class. If we do not make the child class, we cannot access it from outside the package. So inheritance is a must for accessing it from outside the package.

Public: We can access the public modifier from anywhere. We can access public modifiers from within the class as well as from outside the class and also within the package and outside the package.

7. What is final keyword?

filed 
```bash
final int THRESHOLD = 5;
// Final variable

final int THRESHOLD;
// Blank final variable

static final double PI = 3.141592653589793;
// Final static variable PI

static final double PI;
// Blank final static  variable
```

method
```bash
// prevent override
public final int add(int a, int b){return a+b;}
```

class
```bash
// prevent inheritance
// make class immutable
final class Myclass(){}
```

8. What is static keyword? When to use it?

The static keyword in Java is used to share the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks, and nested classes.

```bash
public class example{
    // static varibale
    private static Set<Item> ItemSet = new HashSet<>();
}
    // static block
    static{
        ItemSet.add(new Item(field1:'example1'));
    }
    // static method
    static Set<Item> getItem(){
        return ItemSet;
    }
```

9. What is the differences between overriding and overloading ?

Overriding occurs when the method signature is the same in the superclass and the child class. Overloading occurs when two or more methods in the same class have the same name but different parameters.

10. What is the differences between super and this ?

this keyword mainly represents the current instance of a class. On other hand super keyword represents the current instance of a parent class.

11. What is the Java load sequence ?

It's java determined where is the entry point and the procedures to start the run.

12. What is Polymorphism ? And how Java implements it ?

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance. Can use override or overload method to implement it in Java.

13. What is Encapsulation ? How Java implements it? And why we need encapsulation?

Encapsulation in Java refers to integrating data (variables) and code (methods) into a single unit. In encapsulation, a class's variables are hidden from other classes and can only be accessed by the methods of the class in which they are found. Encapsulation in Java is an object-oriented procedure of combining the data members and data methods of the class inside the user-defined class, so that each class can be indepent and not affected by others.

14. What is Interface and what is abstract class? What are the differences between them?

Interfaces are a kind of code contract, which must be implemented by a concrete class. Abstract classes are similar to normal classes, with the difference that they can include abstract methods, which are methods without a body. Abstract classes cannot be instantiated.

16. What are Queue interface implementations and what are the differences and when to use what?

The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order. 