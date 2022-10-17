### HW2

1. *Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demo repo as example)*
   - *Encapsulation*
```java
class Student {
    private float GPA;
    public float getGPA() {
        return GPA;
    } 
}
```
   - *Inheritance*
```java

class Animals {
    void eat() {
        System.out.println("Eating");
    }
}

class Cat extends Animals{

    void sound() {
        System.out.println("Miao");
    }
}

public class Test {
    public static void main(String args[]) {
        Cat myCat = new Cat();
        cat.eat();
        cat.sound();
    }
}



```
   - *Polymorphism*
  
```java

class Addition {
    static int add (int a, int b) {
        return a + b;
    }
    static int add (int a, int b, int c) {
        return a + b + c;
    }
}

class Test {
    public static void main(String args[]) {
        System.out.println(Addition.add(1, 2));
        System.out.println(Addition.add(1, 2, 3));
    }
}

```

2. *What is wrapper class in Java and Why we need wrapper class*

    A Wrapper class is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. In other words, we can wrap a primitive value into a wrapper class object.

3. *What is the difference between HashMap and HashTable?*

    - Firstly, Hashtable is thread-safe and can be shared between multiple threads in the application.
    - Another difference is null handling. HashMap allows adding one Entry with null as key as well as many entries with null as value. In contrast, Hashtable doesn't allow null at all. 
    - HashMap uses Iterator to iterate over values, whereas Hashtable has Enumerator for the same.
  
4. *What is String pool in Java and why we need String pool*
   The string pool is used to increase performance and decrease memory overhead.
5. *What is Java garbage collection?*

    Garbage collection in Java is the process by which Java programs perform automatic memory management.

6. *What are access modifiers and their scopes in Java?*

    Access Modifiers In Java Access modifiers in java are reserved keywords in java programming languages which are used with classes, variables, methods and constructors to define their scope, for example a class with public key word (modifier) means it is available to be used in the entire java project.

7. *What is final key word? (Filed, Method, Class)*
The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).

8. *What is static keyword? (Filed, Method, Class). When do we usually use it*
   The static keyword in Java is used mainly for memory management. It is used with variables, methods, blocks, and nested classes. It is a keyword used to share the same variable or method of a given class.

9. *What is the differences between overriding and overloading?*
    Overloading vs Overriding The main difference between overloading and overriding is that the overloading function is used in the same class (a concept in computer languages). On the other hand, the method of one class is inherited by the other class under overriding.

10. *What is the differences between super and this?*
    super () refers to the immediate parent class while this refers to the object of the current class. 2.super () can be used to call the methods of immediate parent class while this is used to call the methods of the current class.

11. *What is the Java load sequence?*
    The Java platform uses a delegation model for loading classes. The basic idea is that every class loader has a "parent" class loader. When loading a class, a class loader first "delegates" the search for the class to its parent class loader before attempting to find the class itself.

12. *What is Polymorphism ? And how Java implements it*
    The word polymorphism means, having many forms. In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form.
    A real-life example of polymorphism is that a person at the same time can have different characteristics. Like a man at the same time can be a father, a husband, and an employee. So the same person posses different behavior in different situations. This is called polymorphism.
13. *What is Encapsulation ? How Java implements it? And why we need encapsulation*
    Encapsulation is defined as the wrapping up of the data under a single unit. It is the mechanism that binds together the code and the data it manipulates. Another way to think about encapsulation is that it is a protective shield that prevents the data from being accessed by the code outside this shield.

14. *What is Interface and what is abstract class? What are the differences between them*

    An interface is a contract that describes the behavior of a class without specifying its implementation. An abstract class provides a default implementation of all the methods whereas the interface defines the contract. An abstract class is a superclass while the interface is a subclass.

    