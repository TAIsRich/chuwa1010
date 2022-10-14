HW2 solution

 1.Encapsulation;

```java
public class Bird { 
    String color; 
    int legs;
    public void setColor(String color) 
    { 
        this.color = color; 
    }  
    public String getColor() 
    { 
        return this.color; 
    } 
    public void setLegs(String legs) 
    { 
        this.legs = legs; 
    } 
    public String getLegs() 
    { 
        return this.legs; 
    } 
}
```

​    Polymorphism;

```java
public class Bird { 
    public void birdColor() {
    System.out.println("Birds have different colors");
  }
}
Public class Parrots extends Bird{
  Public void birdColor(){
    System.out.println("Parrots are green");
  }
}
Public class Pigeon extends Bird{
  Public void birdColor(){
    System.out.println("Pigeon are white");
  }
}
```

​    Inheritance:

```java
public class Bird { 
    String color; 
    int legs; 
    public void fly() 
    { 
        System.outp.println( 
            "This bird is flying"); 
    } 
} 
Public class Parrots extends Bird{
  Public void fly(){
    System.out.println("Parrots can fly");
  }
}
```

2. A wrapper class is a class which contains the primitive data types. Wrapper class will covert primitive data types into objects. Data Structure in the Collection framework such as ArrayList and Vector stores only the objects and not the primitive types. 

3. Hashmap:

   (1).No method is synchronized.

   (2).Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe.

   (3).Threads are not required to wait and hence relatively performance is high.

   (4).Null is allowed for both key and value.

   (5).It is non-legacy.

​       Hashtable:

​       (1).Every method is synchronized.

​       (2).At a time only one thread is allowed to operate the Hashtable’s object. Hence it is thread-safe.

​       (3).It increases the waiting time of the thread and hence performance is low.

​       (4).Null is not allowed for both key and value.

​       (5).It is a legacy.

4. String pool is a storage space in the Java heap memory where string literals are stored. A pool of strings decreases the number of String objects created in the JVM, thereby reducing memory load and improving performance.

5. Garbage collection in Java is the process by which Java programs perform automatic memory management. 

6. Access modifiers are object-oriented programming that is used to set the accessibility of classes, constructors, methods, and other members of Java. The four types of access modifiers in Java are: Default, Private, Protected, Public. 

7. The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable which means it is impossible to inherit or override.

   final field: define constants which value could not bechanged.

   final method: prevent other methods overriding. 

   final class: can’t be extended by other classes in the inheritance.

8. The static keyword in Java is used to share the same variable or method of a given class.

   static field: only one instance and could be shared by all instances of the class.

   static method:

   ​     They can directly call other static methods only.

   ​     They can access static data directly.

   static class: A class can be made static only if it is a nested class.

9. 

   | Overriding                                                   | Overloading                                          |
   | ------------------------------------------------------------ | ---------------------------------------------------- |
   | Implements “runtime polymorphism”                            | Implements “compile time polymorphism”               |
   | The method call is determined at runtime based on the object type | The method call is determined at compile time        |
   | Occurs between superclass and subclass                       | Occurs between the methods in the same class         |
   | Have the same signature (name and method arguments)          | Have the same name, but the parameters are different |
   | On error, the effect will be visible at runtime              | On error, it can be caught at compile time           |

10. The this keyword points to a reference of the current class, while the super keyword points to a reference of the parent class. 

11. It will load the static method and variable first , then to the constructor.

12. In Java, polymorphism refers to the ability of a class to provide different implementations of a method, depending on the type of object that is passed to the method. Java use overriding and overloading to implements it.

13. Encapsulation refers to the bundling of fields and methods inside a single class. Java use access modifier and setter/getter method to implement it.  It prevents outer classes from accessing and changing fields and methods of a class.

14. Interface are a kind of code contract, which must be implemented by a concrete class.

    Abstract class are similar to normal classes, with the difference that they can include abstract method, which are methods without a body. Abstract classes cannot be instantiated.

15. design a parking lot (put the code to codingQuestions/coding1 folder, )
    \1.  If you have no ability to design it, please find the solution in internet, then understand it, and re-type 
    it.(Do NOT just copy and paste)

16. Priority Queue:PriorityQueue class which is implemented in the collection framework provides us a way to process the objects based on the priority. 

    LinkedList:LinkedList is a class which is implemented in the collection framework which inherently implements the linked list data structure.

    Priority Blocking Queue: PriorityBlockingQueue is one alternative implementation if thread-safe implementation is needed.