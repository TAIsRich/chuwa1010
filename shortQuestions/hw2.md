HW2

1. Demonstrate the 3 foundamental concepts of OOP
   
    (1) Encapsulation
    
    ```java
    // User Class
    class User {
    
        // Private fields
        private String userName;
        private String password;
    
        //Parameterzied constructor to create a new users
        public User(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }
    }
    ```
    
    (2) *Polymorphism;*
    
    ```java
    public class Shape {
    
        public double getArea() {
            return 0;
        }
    
    }
    
    // A Rectangle is a Shape with a specific width and height
    class Rectangle extends Shape {   // extended form the Shape class
    
        private double width;
        private double height;
    
        public Rectangle(double width, double heigh) {
            this.width = width;
            this.height = heigh;
        }
    
        @Override
        public double getArea() {
            return width * height;
        }
    
    }
    
    // A Circle is a Shape with a specific radius
    class Circle extends Shape {
        private double radius;
    
        public Circle(double radius) {
            this.radius = radius;
        }
    
        @Override
        public double getArea() {
            return 3.14 * radius * radius;
        }
    
    }
    
    public class Client {
        public static void main(String args[]) {
            Shape[] shape = new Shape[2]; // Creating shape array of size 2
    
            shape[0] = new Circle(2); // creating circle object at index 0
            shape[1] = new Rectangle(2, 2); // creating rectangle object at index 
            System.out.println("Area of the Circle: " + shape[0].getArea());
            System.out.println("Area of the Rectangle: " + shape[1].getArea());
        }
    }
    ```
    
    (3) *Inheritance;*
    
    ```java
    
    public abstract class Person {
        private String name;
        private String phoneNumber;
    
        // abstract class have constructors
        public Person(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    
        public Person(String name) {
            this.name = name;
        }
    
        public Person(){
            System.out.println("Person non-arguments construtor");
        }
    
        public void walk() {
            System.out.println("People Walk");
        }
    
        public void meeting() {
            System.out.println("People meeting");
        }
    }
    
    public class Student extends Person{
        public Student(String name, String phoneNumber) {
            super(name, phoneNumber);
        }
    
        public Student(){}
    
        @Override
        public void walk() {
            super.walk();
        }
    
        public void walkable() {
            super.walk();
            super.meeting();
        }
    
        public static void main(String[] args) {
            Student student = new Student();
            student.meeting();
        }
    }
    
    public class Faculty extends Person {
        public Faculty(String name, String phoneNumber) {
            super(name, phoneNumber);
        }
     
    
        // show override unforced methods
        @Override
        public void walk() {
            super.walk();
        }
    }
    public class main {
        public static void main(String[] args) {
            Student student = new Student();
            student.walk();   
            student.meeting(); 
        }
    }
    
    //Person non-arguments construtor
    //People Walk
    //People meeting
    ```
    
2. What is wrapper class
   
       Java is an object-oriented language that converts a primitive data type into a class object; hence, wrapper class objects enable us to convert the original passed value. These wrapper classes support the multithreading and synchronisation process.
   
    *Why we need wrapper class?*
   
    - Wrapper Class will **convert primitive data types into objects**. The objects are necessary if we wish to modify the arguments passed into the method (because primitive types are **passed by value**).
    - The classes in **java.util package** handles only objects and hence **wrapper classes** help in this case also.
    - **Data** **structures** in the Collection framework such as **ArrayList and Vector** store only the objects (reference types) and not the **primitive types.**
    - The object is needed to support **synchronization** in **multithreading**.
3. What's the difference between HashMap and HashTable?
- HashMap is non-syncronized and is not thread safe while HashTable is thread safe and is synchronized.
- HashMap allows one null key and values can be null whereas HashTable doesn't allow null key or value.
- HashMap is faster than HashTable.
- HashMap iterator is fail-safe where HashTable iterator is not fail-safe.
- HashMap extends AbstractMap class where HashTable extends Dictionary class.

*4. What is String pool in Java and why we need String pool?*

      String Pool is a storage area in Java heap.

It is created to decrease the number of string objects created in the memory. Whenever a new string is created, JVM first checks the string pool. If it encounters the same string, then instead of creating a new string, it returns a reference existing string to the variable. 

1. *What is Java garbage collection?*
   
    Garbage collection (GC) is a memory recovery feature built in Java. One or more garbage collectors (GC engines) that automatically free up memory space that has been allocated to objects no longer needed by the program. Automatic memory management can eliminate common problems such as forgetting to free an object and causing a memory leak or attempting to access freed memory for an object that's already been freed.
    
    The garbage collector provides the following benefits:
    
    - Frees developers from having to manually release memory.
    - Allocates objects on the managed heap efficiently.
    - Reclaims objects that are no longer being used, clears their memory, and keeps the memory available for future allocations. Managed objects automatically get clean content to start with, so their constructors don't have to initialize every data field.
    - Provides memory safety by making sure that an object can't use for itself the memory allocated for another object.
    
2. *What are access modifiers and their scopes in Java?*
Access modifiers are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are public, protected, default, and private.

![Untitled](week1%20bca67d1ac97a42239d63a812fc38756f/Untitled.png)

 *7. What is final key word? (Filed, Method, Class)*

The *final* keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).   

7.1 final Variable
 Purpose: define constants
7.2 final Method
 Purpose: prevent override
7.3 final Class
Purpose:
1. prevent inheritance, like Integer, String etc;
2. Make class immutable

*8. What is static keyword? (Filed, Method, Class). When do we usually use it?*

 *static* keyword means that the particular member belongs to a type itself, rather than to an instance of that type. This means we'll create only one instance of that static member that's shared across all instances of the class.

   8.1 In Java, when we declare a field *static*, exactly a single copy of that field is created and shared among all instances of that class. There will always be only one copy of *static* field belonging to it. The value of this *static* field is shared across all objects of either the same class.

  8.2 Similar to *static* fields, *static* methods also belong to a class instead of an object. So, we can call them without creating the object of the class in which they reside. We also commonly use *static* methods to create utility or helper classes so that we can get them without creating a new object of these classes.

  8.3 Java allows us to create a class within a class. It provides a way of grouping elements that we'll only use in one place. This helps to keep our code more organized and readable. Nested classes that we declare *static* are called ***static* nested classes.** The *static* nested classes behave exactly like any other top-level class, but are enclosed in the only class that will access it, to provide better packaging convenience.

When to use static methods ?
1. ⼯具类的⽅法⼀般都设计成static。
2. Integer, String, Math, System etc.

9. *What is the differences between overriding and overloading?*

| Override | Overload |
| --- | --- |
| Overrriding happens at runtime | Overload happens at compile time |
| gives less performance because binding is being done at run time | Gives better performance because binding is being done at compile time |
| Private and final methods can NOT be overridden. | Private and final methods can be overloaded |
| Return type of method must be the same. | Return type of method does not matter. |
| Arguments must be the same  | Arguments must be different |
| Base and child classes are required | It is being done in the same class |
| Mostly used to provide the implementation of the method that is already provided by its base class  | Mostly used to increase the readability of the code. |

*10. What is the differences between super and this?*

| --- | --- | --- |

*11. What is the Java load sequence?*

Initialization of a class consists of:

- executing its static initializers (§2.11) and
- the initializers for static fields (§2.9.2) declared in the class.

Initialization of an interface consists of executing the initializers for fields declared in the interface.

Before a class or interface is initialized, its direct superclass must be initialized, but interfaces implemented by the class need not be initialized. Similarly, the superinterfaces of an interface need not be initialized before the interface is initialized.


*12. What is Polymorphism ? And how Java implements it ?*

**Polymorphism** is one of the [core concepts of object-oriented programming (OOP)](https://stackify.com/oops-concepts-in-java/) and describes situations in which something occurs in several different forms. In computer science, it describes the concept that you can access objects of different types through the same interface. Each type can provide its own independent implementation of this interface.

Inheritance lets us inherit attributes and methods from another class. **Polymorphism** uses those methods to perform different tasks. This allows us to perform a single action in different ways.

For example, think of a superclass called `Animal` that has a method called `animalSound()`. Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):

```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Cat extends Animal {
  public void animalSound() {
    System.out.println("The cat says: meow meow");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
```

*13. What is Encapsulation ? How Java implements it? And why we need encapsulation?*

Encapsulation in OOP refers to binding the data and the methods to manipulate that data together in a single unit (class). In encapsulation, a class's variables are hidden from other classes and can only be accessed by the methods of the class in which they are found.

 Java implements it by declaring the variables as private, public, or protected. aka, add access modifiers for this class.

<Access_Modifier> class <Class_Name> {

private <Data_Members>;

private <Data_Methods>;

}

 we need encapsulation because:

1. Encapsulation provides ultimate control over the data members and data methods inside the class. 
2. The standard IDEs provide in-built support for ‘Getter and Setter’ methods, which increases the programming pace. 
3. Encapsulation prevents access to data members and data methods by any external classes. The encapsulation process improves the security of the encapsulated data.
4. Changes made to one part of the code can be successfully implemented without affecting any other part of the code.

*14. What is Interface and what is abstract class? What are the differences between them?*

**Abstract class** is a restricted class that **cannot be used to create objects**.

We can create the Abstract class by using the “Abstract” keyword before the class name. An abstract class can have both “Abstract” methods and “Non-abstract” methods that are a concrete class.

An **interface** is a template which has only method declarations and not the method implementation.

| Abstract Class | Interfaces |
| --- | --- |

*15. design a parking lot (put the code to codingQuestions/coding1 folder, )*
     Please see the code in codingQuestions/coding1
****

 *16. What are Queue interface implementations and what are the differences and when to use what?*

In Java, the queue is implemented as an interface that inherits the Collection interface. Queue has two different implementations.

To implement queue using Arrays, we first declare an array that will hold n number of queue elements

```java
class Queue { 
    private static int front, rear, capacity; 
    private static int queue[]; 
   
    Queue(int size) { 
        front = rear = 0; 
        capacity = size; 
        queue = new int[capacity]; 
    } 
   
    // insert an element into the queue
    static void queueEnqueue(int item)  { 
        // check if the queue is full
        if (capacity == rear) { 
            System.out.printf("\nQueue is full\n"); 
            return; 
        } 
   
        // insert element at the rear 
        else { 
            queue[rear] = item; 
            rear++; 
        } 
        return; 
    } 
   
    //remove an element from the queue
    static void queueDequeue()  { 
        // check if queue is empty 
        if (front == rear) { 
            System.out.printf("\nQueue is empty\n"); 
            return; 
        } 
   
        // shift elements to the right by one place uptil rear 
        else { 
            for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
   
       
      // set queue[rear] to 0
            if (rear < capacity) 
                queue[rear] = 0; 
   
            // decrement rear 
            rear--; 
        } 
        return; 
    } 
   
    // print queue elements 
    static void queueDisplay() 
    { 
        int i; 
        if (front == rear) { 
            System.out.printf("Queue is Empty\n"); 
            return; 
        } 
   
        // traverse front to rear and print elements 
        for (i = front; i < rear; i++) { 
            System.out.printf(" %d = ", queue[i]); 
        } 
        return; 
    } 
   
    // print front of queue 
    static void queueFront() 
    { 
        if (front == rear) { 
            System.out.printf("Queue is Empty\n"); 
            return; 
        } 
        System.out.printf("\nFront Element of the queue: %d", queue[front]); 
        return; 
    } 
} 
 
public class Main {
    public static void main(String[] args) { 
        // Create a queue of capacity 4 
        Queue q = new Queue(4); 
   
        System.out.println("Initial Queue:");
       // print Queue elements 
        q.queueDisplay(); 
   
        // inserting elements in the queue 
        q.queueEnqueue(10); 
        q.queueEnqueue(30); 
        q.queueEnqueue(50); 
        q.queueEnqueue(70); 
   
        // print Queue elements 
        System.out.println("Queue after Enqueue Operation:");
        q.queueDisplay(); 
   
        // print front of the queue 
        q.queueFront(); 
         
        // insert element in the queue 
        q.queueEnqueue(90); 
   
        // print Queue elements 
        q.queueDisplay(); 
   
        q.queueDequeue(); 
        q.queueDequeue(); 
        System.out.printf("\nQueue after two dequeue operations:"); 
   
        // print Queue elements 
        q.queueDisplay(); 
   
        // print front of the queue 
        q.queueFront(); 
    } 
}
```

As we have implemented the Queue data structure using Arrays in the above program, we can also implement the Queue using Linked List.

```java
class LinkedListQueue
{
 private Node front, rear; 
 private int queueSize; // queue size 
  
 //linked list node
 private class Node { 
 int data;
 Node next;
 }
  
 //default constructor - initially front & rear are null; size=0; queue is empty
 public LinkedListQueue()
 {
 front = null;
 rear = null;
 queueSize = 0;
 }
 
 
//check if the queue is empty
 public boolean isEmpty()
 {
 return (queueSize == 0);
 }
  
 //Remove item from the front of the queue.
 public int dequeue()
 {
 int data = front.data;
 front = front.next;
 if (isEmpty()) 
 {
 rear = null;
 }
 queueSize--;
 System.out.println("Element " + data+ " removed from the queue");
 return data;
 }
  
 //Add data at the rear of the queue.
 public void enqueue(int data)
 {
 Node oldRear = rear;
 rear = new Node();
 rear.data = data;
 rear.next = null;
 if (isEmpty()) 
 {
 front = rear;
 }
 else  {
 oldRear.next = rear;
 }
 queueSize++;
 System.out.println("Element " + data+ " added to the queue");
 }
 //print front and rear of the queue
 public void print_frontRear() {
     System.out.println("Front of the queue:" + front.data 
     + " Rear of the queue:" + rear.data);
 }
}
class Main{
 public static void main(String a[]){
  
 LinkedListQueue queue = new LinkedListQueue();
 
 queue.enqueue(6);
 queue.enqueue(3);
 queue.print_frontRear();
 queue.enqueue(12);
 queue.enqueue(24);
 queue.dequeue();
 queue.dequeue();
 queue.enqueue(9);
 
 queue.print_frontRear();
 }
}
```

On of the most common problem with array implementation is the size of the array which requires to be declared in advance. Due to the fact that, the queue can be extended at runtime depending upon the problem, the extension in the array size is a time taking process and almost impossible to be performed at runtime since a lot of reallocations take place. Due to this reason, we can declare the array large enough so that we can store queue elements as enough as possible but the main problem with this declaration is that, most of the array slots (nearly half) can never be reused. It will again lead to memory wastage. So the difference between the implementation way of Array and Linked List is that using LinkedList you can easily allocate and change the memory you need to use.