1. Write up Example code to demonstrate the three foundmental concepts of OOP. (reference Code Demorepo as example)

1. Encapsulation;
public class Encapsulation{
    private int a=1;
    get A(){
    }
    set A(int a){
        this.a=a;
    }
}
2. Polymorphism;
public class Polymorphism{
    public class Mathma(){
        public void add(){
        }
    }
    public Addi extends Mathma(){
        public void add(){
        }
    }
    public static void main(String Args[]){
        Mathma addi= new Addi();
        addi.add();
    }
}
3. Inheritance;
public class Inheritance(){
}
public class Subinheritance extends Inheritance(){
}

2. What is wrapper class in Java and Why we need wrapper class?
The wrapper classes in java are used to convert primitive types (int, char, float, etc) into corresponding objects.
Each of the 8 primitive types has corresponding wrapper classes.
byte ~ Byte; boolean ~ Boolean; char ~ Character; double ~ Double; float ~ Float; int ~ Integer; long ~ Long; short ~ Short
The objects are necessary if we wish to modify the arguments passed into the method (because primitive types are passed by value). 
The classes in java.util package handles only objects and hence wrapper classes help in this case also.

3. What is the difference between HashMap and HashTable?
HashMap is similar to HashTable, but it is unsynchronized. It allows to store the null keys as well, but there should be only one null key object and there can be any number of null values.  This class makes no guarantees as to the order of the map. To use this class and its methods, you need to import java.util.HashMap package or its superclass.

4. What is String pool in Java and why we need String pool?
Designers of Java were aware of the fact that String data type is going to be majorly used by the programmers and developers. Thus, they wanted optimization from the beginning. They came up with the notion of using the String pool (a storage area in Java heap) to store the String literals. They intended to decrease the temporary String object with the help of sharing. An immutable class is needed to facilitate sharing. The sharing of the mutable structures between two unknown parties is not possible. Thus, immutable Java String helps in executing the concept of String Pool.

5. What is Java garbage collection?
The garbage collection process is to identify the objects which are no longer needed by a program so that their resources can be reclaimed and reused. These identified objects will be discarded.
The main goal of using garbage collection is to free the heap memory by eliminating unnecessary objects.

6. What are access modifiers and their scopes in Java?
In java, access modifiers are used to set the accessibility (visibility) of classes, interfaces, variables, methods, constructors, data members, and the setter methods.
Public: a class or interface may be accessed from outside the package. Constructors, inner classes, methods and field variables may be accessed wherever their class is accessed.
Protected: are visible in the same package but no other package except if a class extends then it is visible even if it is outside the package. 
Private: accessed only within the class in which they are declared.
No modifier (default modifier): are visible to the other classes which are inside the package and invisible to the classes which are outside the package.

7. What is final key word? (Filed, Method, Class)
final is a keyword. 
The variable declared as final should be initialized only once and cannot be changed. 
Java classes declared as final cannot be extended.
Methods declared as final cannot be overridden.

8. What is static keyword? (Filed, Method, Class). When do we usually use it?
The keyword static means that the particular member belongs to a type itself, rather than to an instance of that type.
We can apply the keyword to variables, methods, blocks and nested classes.


9. What is the differences between overriding and overloading?
When two or more methods in the same class have the same name but different parameters, it’s called overloading. 
When the method signature (name and parameters) are the same in the superclass and the child class, it’s called overriding.

10. What is the differences between super and this?
super() is used to call super class constructor
this() used to call constructors in the same class, means to call parameterized constructors.

11. What is the Java load sequence?
JVM maintains a runtime pool in permgen area where classes are loaded. Whenever a class is referenced default class loader finds the class in the class path and loads it into this pool. And this is not specific to user defined classes or classes provided in JDK. When a class is referenced it is loaded into the memory.
Classes loaded by the ClassLoader are stored internally in the ClassLoader instance.
When class needs to be added to the memory following function is called.

12. What is Polymorphism ? And how Java implements it ?
Polymorphism means many forms.
A single object can refer to the super-class or sub-class depending on the reference type which is called polymorphism.

13. What is Encapsulation ? How Java implements it? And why we need encapsulation?
Encapsulation is a mechanism where you bind your data (variables) and code (methods) together as a single unit. Here, the data is hidden from the outer world and can be accessed only via current class methods. This helps in protecting the data from any unnecessary modification. 
can achieve by declaring the variables of a class as private and providing public setter and getter methods to modify and view the values of the variables.
hiding data from outside environment by providing access specifiers to variable.

14. What is Interface and what is abstract class? What are the differences between them?
Multiple inheritances cannot be achieved in java. To overcome this problem the interface concept is introduced.
An interface is a template which has only method declarations and not the method implementation.
An interface in java is a blueprint of a class or you can say it is a collection of abstract methods and static constants. In an interface, each method is public and abstract but it does not contain any constructor. Thus, interface basically is a group of related methods with empty bodies. 
Abstract class is a restricted class that cannot be used to create objects.
We can create the Abstract class by using the “Abstract” keyword before the class name. An abstract class can have both “Abstract” methods and “Non-abstract” methods that are a concrete class.
A class declared as abstract keyword is known as abstract class.
an abstract class allows you to create functionality that subclasses can implement or override.
An interface only allows you to define functionality, not implement it. And whereas a class can extend only one abstract class, it can take advantage of multiple interfaces.

15. design a parking lot (put the code to codingQuestions/coding1 folder, )
1. If you have no ability to design it, please find the solution in internet, then understand it, and re-type it.(Do NOT just copy and paste)
16. What are Queue interface implementations and what are the differences and when to use what?
