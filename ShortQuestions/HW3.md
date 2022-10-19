HW3 solution

2. Checked exceptions: These are the exceptions that are checked at compile time. In checked exception, there are two types: fully checked and partially checked exceptions. A fully checked exception is a checked exception where all its child classes are also checked, like IOException, InterruptedException. A partially checked exception is a checked exception where some of its child classes are unchecked, like Exception.

   Uncehcked exceptions: These are the exceptions that are not checked at compile time. 

3. No, there can be only one finally block, and it must follow the catch blocks.

4. If both catch and finally return, the receiving method will get the return value from the finally block.

5. Uncehcked exceptions: These are the exceptions that are not checked at compile time. 

   Checked exceptions: These are the exceptions that are checked at compile time.

6. Throws:  is used to declare which exceptions can be thrown from a method

   throw: is used to explicitly throw an exception within a method or block of code

7. 

8. The purpose of the class is to provide a type-level solution for representing optional values instead of *null* references.

9. The finally block always executes when the try block exits.

10. Jave 8 new features: defalut method and static method in interface, lambda&Functional Interface

11. Creational Design Pattern: Singleton Pattern, Prototype Pattern

    Structural Design Pattern: Bridge Pattern, Proxy Pattern

    Behavioral Design Pattern: Iterator Pattern, State Pattern

12. SOLID stands for:

    S: single responsibility principle

    O: open-closed principle.

    L: liskov substitution principle.

    I: interface segregation principle.

    D: dependency inversion principle.

13. There are three ways through which we can achieve thread safety.

    1. Create the instance variable at the time of class loading.
    2. Synchronize the getInstance() method. 
    3. Use synchronized block inside the if loop and volatile variable

14. the open–closed principle states "software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification"; that is, such an entity can allow its behaviour to be extended without modifying its source code.

15. choose 1. cause if a class B is subtype of class A then object of type A maybe substituded with any object of type B. 

    