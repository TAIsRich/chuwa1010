####Question 1: What is generic in Java?
Generic means parametrized type. It can allow multiple type of objects. Normally use T or E to represent generic.
It has generic class, generic method
```
public static <T extends Compare<T>> T getSum(T x) {
}

public class getSum<T> {
}
```
####Question 2: Read those codes and type it one by one by yourself. the push the code to your branch
####Question 3: practice stream API at least 3 times
####Question 4: Write the Singleton design pattern include eager load and lazy load.
Singleton design pattern is to prevent building too many same objects.
**Eager load:** 
1. create private static singleton object 
2. create private singleton contractor 
3. public static getInstance method
   1. return singleton Object

**Lazy load:**
1. private static volatile variable - instance
2. private singleton contractor 
3. public static getInstance method

   ```
   if (instance == null) {
        synchronized(Singleton.class);
        if (instance == null) {
            instance = new Singleton();
        }
   }
   ```
   
4. return instance
####Question 5: What is Runtime Exception? could you give me some examples?
Runtime Exception is the Exception happened during running the program. 
1. NullPointerException
2. OutOfBoundsException
####Question 6: Could you give me one example of NullPointerException?
NullPointerException happens when value is null.
```
People p1;
System.out.println(p1);

```
####Question 7: What is the Optional class?
1. To avoid Null checks and run time NullPointerException
####Question 8: What is the @FunctionalInterface?
1. Functional Interface only has one single Abstract method
   1. If write 2 abstract methods with @ functionalInterface, it will throw errors
2. @FunctionInterface for sanity check
   1. If no @FunctionalInterface, it will not do sanity check, and we also can not use lambda
3. can have a lot of default methods
4. Lambda is the implementation of the abstract method

####Question 9: what is Lambda?
1. Lambda is to replace anonymous inner class 
2. work with functional interface
3. Lambda can use unchanged variable outside of lambda
   1. final variable 
   2. non-final variable however never changed 
   3. object variable

####Question 10: What is Method Reference?
Method References are a special type of lambda expressions. They're often used to create simple lambda expression by referencing existing methods.
4 Types of method reference
1. static method 
   1. `ContainingClass::staticMethodName`
2. instance methods of particular objects
   1. `containingObject::instanceMethodName`
3. instance methods of arbitrary objects of a particular type
   1. `ContainingType::methodName`
4. constructor
   1. `ClassName::new`

####Question 11: What is Java 8 new features?
1. Reference 
2. Default methods and static method in interface
3. Lambda & Functional Interface 
4. Optional
5. Method Reference 
6. Stream API

####Question 12: Lambda can use unchanged variable outside of lambda? what is the details?
1. Yes, it can use. But the unchanged outside variable should be 
   1. final variable
   2. non-final variable however never changed 
   3. object variable
