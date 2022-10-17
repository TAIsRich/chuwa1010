1. :
   ```
   //Encapsulation
   public class Employee{
       private String name;
       private String phoneNumber;

       public String getName(){
           return name;
       }

       public void printPosition(){
           return 0;
       }
   }

   //Inheritance and polymorphism
   class Engineer extends Employee{
       @override
       public void printPosition(){
           System.out.println("Engineer");
       }
   }

   class Manager extends Employee{
       @override
       public void printPosition(){
           System.out.println("Engineer");
       }
   }
   ```
2. Wrapper classes wrap the primitive data types in Java into objects, so that we can use those data types at where only objects can be used like when initializing a collection object.
3. HashMap is non-synchronized and not thread safe, while HashTable is synchronized and thread safe. HashMap allows null key and value, but HashTable doesn't. HashMap is more efficient than HashTable.
4. String pool stores the string literals we created and the same string literal would be stored only once if not specified, so that the memory space can be saved.
5. Garbage collector automatically deallocating the memory of the objects that would be no longer used.
6. There are following access modifiers in Java:
   - public: accessible from everywhere
   - private: accessible only within the class
   - protected: accessible within the same package and its subclass
   - default: accessible within the same package
7. final keyword makes a field, class, or method can't be modified, which prevent the field be changed, class be inherited, and method be overrided.
8. static keyword makes a field, class, or method belongs to a class but not an instance of that class. When we use it on a field, we can let the value of that field shared between different instances of a class, and we use static on a class or method when it doesn't need to work on a specific instance.
9. Override happens at runtime, and the parameters and return type must be the same. Overload happens at compile time, the parameters must be different, and the return type can be different.
10. Super refers to the parent class and this refers to the class instance itself.
11. JVM load the static variable and block first, and then the constructor.
12. Polymorphism refers to the same object exhibiting different forms and behaviors. Java implements it by override and overload.
13. Encapsulation refers to binding the data and the methods to manipulate that data together in a single unit. Java implements it by access modifiers.
14. An abstract class is a class which can't be instantiated. An interface is a contract to specify the behavior of a class. Abstract class cannot be multiple inheritanced but interface can.
16. LinkedList and PriorityQueue implements the Queue interface. LinkedList is a linked list as its name, and PriorityQueue is based on the heap data structure and we use it when we need the elements be sorted.
