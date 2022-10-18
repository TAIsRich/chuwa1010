####Question 2: What is the checked exception and unchecked exception in Java,could you give one example?
1. checked exception must use **catch** or **throws**
   1. IOException (FileNotFound)
   2. SQLException (ID/Data doesn't exits)
2. Unchecked exception - **runtime exception** 
   1. NullPointerException 
   2. IndexOutOfBoundsException

####Question 3: Can there be multiple finally blocks?
No, finally can only be used once with a try or try-catch block.

####Question 4: When both catch and finally return values,what will be the final result?
If both catch and finally return, the receiving method will get the returned value from the finally block.

####Question 5: What is Runtime / unchecked exception? what is Compile/Checked Exception?
1. Runtime / unchecked exception: the unexpected exception happens during the program running such as null pointer exception
2. Compile/Checked Exception: the excepted exception that we can write on try/catch blocks such as IOException

####Question 6: What is the difference between throw and throws?
1. throw is used to throw an exception explicitly in the code, inside the function or the block of code.
2. throws is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.
3. throw only allow one exception at a time
4. throws can declare multiple exceptions using throws can  be thrown by the method、

throw example
```
public void check(int num) {
    if (num < 0) {
        throw new Exception("num cannot less than 0.");
    }
}

```

throws example
```
public void check(int num) throws Exception{
    if (num < 0) {
        count++;
    }
}
```

####Question 7: Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
Because we need to put the small exception first then large exception later. The catch scope should be from small to large.

####Question 7: What is optional? why do you use it? write an optional example.
To avoid Null checks and run time NullPointerExceptions


####Question 8: Why finally always be executed?
When you open a file and get exception, then throwed and returned, but never closed. 

####Question 10: What is Java 8 new features?
1. lambda expression
2. forEach()
3. stream package
4. Method parameter reflection
5. improved type inference

####Question 11: What are the types of design patterns in Java ?
1. singleton

####Question 12: What are the SOLID Principles ?
1. The single-responsibility principle: A class should have one and only one reason to change, meaning that a class should have only one job
2. The open-closed principles: a class should be extendable without modifying the class itself
3. The Liskov substitution principles: every subclass or derived class should be substitutable for their base or parent class
4. The interface segregation principles: A client should never be implemented an interface that is doesn't use, or client shouldn't be forced to depend on methods they do not use.
5. The dependency inversion principles: entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstraction.

####Question 13: How can you achieve thread-safe singleton patterns in Java ?
Use Singleton
1. Eager load, faster but take more memory
2. Lazy load, slower but take less memory

####Question 14: What do you understand by the Open-Closed Principle (OCP) ?
Objects or entities should be open for extension but closed for modification. This means that a class should be extendable without modifying the class itself.


####Question 15: Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer. 
1. It means that if the object of type A can do something,the object of type B could also be able to perform the same thing
2. It means that all the objects of type A could execute all the methods present in its subtype B
3. It means if a method is present in class A,it should also be present in class B so that the object of type B could substitute object of type A.
4. It means that for the class B to inherit class A,objects of type B and objects of type A must be same.

Answer: 1