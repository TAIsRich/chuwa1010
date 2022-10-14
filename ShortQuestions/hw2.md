1. Write up Example code to demonstrate the three foundmental concepts of OOP.(reference Code Demo repo as example)

   \1. Encapsulation; 

   ![1665693289403](https://raw.githubusercontent.com/yanch-1/yyy/main/1665693289403.jpg?token=GHSAT0AAAAAABZ3RNKWJTD6FW3KHL45U7XGY2JZELA)

   \2. Polymorphism; 

   ![1665693917899](https://raw.githubusercontent.com/yanch-1/yyy/main/1665693917899.jpg?token=GHSAT0AAAAAABZ3RNKXMVNLENRF3FJTLCZWY2JZE5A)

   \3. Inheritance;

   ![1665693587071](https://raw.githubusercontent.com/yanch-1/yyy/main/1665693587071.jpg?token=GHSAT0AAAAAABZ3RNKXRYGZD73HYLELD2JCY2JZFNQ)

2. What is **wrapperclass** in Java and Why we need wrapper class?

   > Java is an object-oriented language that converts a primitive data type into a class object; hence, wrapper class objects enable us to convert the original passed value. 
   >
   > To convert data to a compatible format or to hide the complexity of the underlying entity using abstraction. 

3. What is the difference between **HashMap** and **HashTable**?

   - HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
   - HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
   - HashMap is generally preferred over HashTable if thread synchronization is not needed.

   ![1665694093956](https://raw.githubusercontent.com/yanch-1/yyy/main/1665694093956.jpg?token=GHSAT0AAAAAABZ3RNKWR237HMAURMJPJOKCY2JZHAQ)

4. What is **Stringpool** in Java and why we need Stringpool?

   > It is created to decrease the number of string objects created in the memory. Whenever a new string is created, JVM first checks the string pool. If it encounters the same string, then instead of creating a new string, it returns a reference existing string to the variable.

5. What is Java **garbagecollection**?

   > Java garbage collection is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program.

6. What are **access modifiers** and their scopes in Java?

   > The four access modifiers in Java are **public, protected, default, private**.
   >
   > | **Modifier** | **Description**                                              |
   > | ------------ | ------------------------------------------------------------ |
   > | Default      | declarations are visible only within the package (package private) |
   > | Private      | declarations are visible within the class only               |
   > | Protected    | declarations are visible within the package or all subclasses |
   > | Public       | declarations are visible everywhere                          |

7. What is **final** keyword?(Filed, Method, Class)

   > The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override). 
   >
   > Field: create a constants
   >
   > Class: prevent inheritance
   >
   > Methods: prevent overriding
   >
   > Final keyword in method parameters: inside the method the variables can not be reassigned.

8. What is **static** keyword? (Filed, Method, Class). When do we usually use it?

   > The static keyword is a non-access modifier used for methods and attributes. Static methods/attributes can be accessed without creating an object of a class. The static keyword in Java is mainly used for memory management. The static keyword in Java is used to share the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks, and nested classes. The static keyword belongs to the class than an instance of the class.

   > When to use static variables and methods?
   >
   > Use the static variable for the property that is common to all objects. For example, in class Student, all students share the same college name. Use static methods for changing static variables.

   > A class can be made **static** only if it is a nested class. We cannot declare a top-level class with a static modifier but can declare [nested classes](https://www.geeksforgeeks.org/nested-classes-java/) as static. Such types of classes are called Nested static classes. Nested static class doesn’t need a reference of Outer class. In this case, a static class cannot access non-static members of the Outer class. 

   > If you need to do the computation in order to initialize your static variables, you can declare a 'static block' that gets executed exactly once, when the class is first loaded.

   > When a 'variable' is declared as static, then a single copy of the variable is created and shared among all objects at the class level. Static variables are, essentially, global variables. All instances of the class share the same static variable.

   > Any static member can be accessed before any objects of its class are created, and without reference to any object. 'Methods' declared as static have several restrictions: 
   >
   > - They can only directly call other static methods.
   > - They can only directly access static data.
   > - They cannot refer to [this](https://www.geeksforgeeks.org/this-reference-in-java/) or [super](https://www.geeksforgeeks.org/super-keyword/) in any way.

9. What is the differences between **overriding** and **overloading**?

   ![1665696556714](https://raw.githubusercontent.com/yanch-1/yyy/main/1665696556714.jpg?token=GHSAT0AAAAAABZ3RNKWR5WW6KZWORS3SMOWY2JZHOA)

10. What is the differences between **super** and **this**?

    > 'This' keyword used to call default constructor of the same class. 'Super' keyword used to call default constructor of the parent class. this keyword used to access methods of the current class as it has reference of current class. One can access the method of parent class with the help of super keyword.

11. What is the Java **load sequence**?

    ![1665706928048](https://raw.githubusercontent.com/yanch-1/yyy/main/1665706928048.jpg?token=GHSAT0AAAAAABZ3RNKXDLPAKPYUKJYSJ5HWY2JZH4Q)

    ![1665706955820](https://raw.githubusercontent.com/yanch-1/yyy/main/1665706955820.jpg?token=GHSAT0AAAAAABZ3RNKXH6MDAYU4H56JSDDWY2JZIHA)

12. What is **Polymorphism** ? And how Java implements it ?

    > Polymorphism in Java can be achieved in two ways i.e., method overloading(compile time) and method overriding(run time). Polymorphism in Java is mainly divided into two types. Compile-time polymorphism can be achieved by method overloading, and Runtime polymorphism can be achieved by method overriding.

13. What is **Encapsulation** ? How Java implements it? And why we need encapsulation?

    > Encapsulation in Java is **the process by which data (variables) and the code that acts upon them (methods) are integrated as a single unit**. By encapsulating a class's variables, other classes cannot access them, and only the methods of the class can access them.

    > Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables. It is more defined with the setter and getter method.

    > - **Flexibility**: It’s more flexible and easy to change the encapsulated code with new set of requirements. For example, if the requirement for adding/removing the project of a employee changes, we can easily update the logic in the setter method () or provided methods.
    > - **Reusability**: Encapsulated code can be reused throughout the application or across multiple applications.
    > - **Maintainability**: When application code is encapsulated in separate units (classes, interfaces, methods, getters/setters etc) so it’s easy to change or update a part of the application without affecting other parts, thus reducing the effort and time of the [developer](https://medium.com/javarevisited/top-10-frameworks-full-stack-java-developers-can-learn-in-2020-5995021401e5).
    > - **Testability:** For an encapsulated class writing unit tests are easier as the member variables are not scattered all around, thus reducing the time and effort of the tester as well.
    > - **Data Hiding:** The caller of the methods will have no idea about the internal logic of the class as the member variables are not visible to the caller function. Caller only knows the parameters which are to be passed to the setter method (or any method) for getting initialized with that value. For e.g

14. What is **Interface** and what is **abstract** class? What are the differences between them?

    #### **Abstract class vs Interface** 

    - **Type of methods:** Interface can have only abstract methods. An abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also. From Java 9, it can have private concrete methods as well.
    - **Final Variables:** Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
    - **Type of variables:** Abstract class can have final, non-final, static and non-static variables. The interface has only static and final variables.
    - **Implementation:** Abstract class can provide the implementation of the interface. Interface can’t provide the implementation of an abstract class.
    - **Inheritance vs Abstraction:** A Java interface can be implemented using the keyword “implements” and an abstract class can be extended using the keyword “extends”.
    - **Multiple implementations:** An interface can extend one or more Java interfaces; an abstract class can extend another Java class and implement multiple Java interfaces.
    - **Multiple Inheritance:** Interface supports multiple inheritance; an abstraction does not support multiple inheritance.
    - **Accessibility of Data Members:** Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.

    

    Consider using abstract classes if any of these statements apply to your situation: 

    - In the java application, there are some related classes that need to share some lines of code then you can put these lines of code within the abstract class and this abstract class should be extended by all these related classes.
    - You can define the non-static or non-final field(s) in the abstract class so that via a method you can access and modify the state of the object to which they belong.
    - You can expect that the classes that extend an abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).

    Consider using interfaces if any of these statements apply to your situation: 

    - It is a total abstraction, All methods declared within an interface must be implemented by the class(es) that implements this interface.
    - A class can implement more than one interface. It is called multiple inheritances.
    - You want to specify the behavior of a particular data type but are not concerned about who implements its behavior.

15. design a parking lot (put the code to **codingQuestions**/coding1 folder, )

    \1. Ifyouhavenoabilitytodesignit,pleasefindthesolutionininternet,thenunderstandit,andre-type it.(**Do NOT just copy and paste**)

16. What are Queue interface implementations and what are the differences and when to use what?

    [PriorityQueue](https://www.geeksforgeeks.org/priority-queue-class-in-java-2/); [LinkedList](https://www.geeksforgeeks.org/linked-list-in-java/); [PriorityBlockingQueue](https://www.geeksforgeeks.org/priorityblockingqueue-class-in-java/);

    1.[**PriorityQueue:**](https://www.geeksforgeeks.org/priority-queue-class-in-java-2/) PriorityQueue class which is implemented in the collection framework provides us a way to process the objects based on the priority. It is known that a queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play. Let’s see how to create a queue object using this class.

    2.[**LinkedList:**](https://www.geeksforgeeks.org/linked-list-in-java/) LinkedList is a class which is implemented in the collection framework which inherently implements the [linked list data structure](https://www.geeksforgeeks.org/data-structures/linked-list/). It is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays or queues. Let’s see how to create a queue object using this class.

    3.[**PriorityBlockingQueue:**](https://www.geeksforgeeks.org/priorityblockingqueue-class-in-java/) It is to be noted that both the implementations, the PriorityQueue and LinkedList are not thread-safe. PriorityBlockingQueue is one alternative implementation if thread-safe implementation is needed. PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules as class [PriorityQueue](https://www.geeksforgeeks.org/priority-queue-class-in-java-2/) and supplies blocking retrieval operations. 
    Since it is unbounded, adding elements may sometimes fail due to resource exhaustion resulting in [OutOfMemoryError](https://www.geeksforgeeks.org/understanding-outofmemoryerror-exception-java/). Let’s see how to create a queue object using this class.