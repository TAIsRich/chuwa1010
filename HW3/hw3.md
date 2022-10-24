## Hw#3
#### 1. Practice  collection
#### 2. What is the checked exception and unchecked exception in Java, could you give one example?
   Check exception check at compile time, if some code within the a method that throws a check exception, then the method must either handle the exception or it must specify the exception using the throws keyword.  If use FileReader() , it must throw the IOException to handle if there is no file exist.
   In Java, exceptions under Error and RuntimeException classes are unchecked exceptions, it is not require to check the exception.
#### 3. Can there be multiple finally blocks?
   No, there is only one finally blocks. The finally block does not contain any return, continue, break statements because it does not allow controls to leave the finally block.
#### 4. When both catch and finally return values, what will be the final result?
   The final result will be the finally return value.
#### 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
   A checked exception is caught at compile time whereas a runtime or unchecked exception is, as it  states, at runtime. A checked exception must be handled either by re-throwing or with a try catch block, whereas an unchecked isn’t required to be handled.
#### 6. What is the difference between throw and throws?
   Throw keyword is used throw an exception explicitly in the code, inside the function or the block of code. The throw keyword is followed by an instance of Exception to be thrown, use within the method.
   Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code. throws is used with the method signature.
#### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception ?
   Because we want to throw a smaller exception first, and then to the broad one.
#### 7. What is optional? why do you use it? write an optional example.
   Optional is a container object used to contain not-null objects. Optional object is used to represent   null with absent value. This class has various utility methods to facilitate code to handle values as 'available' or 'not available' instead of checking null values.
   String[] words = new String[10];
   Optional<String> checkNull
   = Optional.ofNullable(words[5]);
   if (checkNull.isPresent()) {
   String word = words[5].toLowerCase();
   System.out.print(word);
   }
   else
   System.out.println("word is null");

#### 8. Why finally always be executed ?
   A finally block is always get executed whether the exception has occurred or not.
   If an exception occurs like closing a file or DB connection, then the finally block is used to clean up the code.
#### 9. Practice collection problems here: https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/ src/main/java/com/chuwa/exercise/collection
#### 10. What is Java 8 new features ?
    Default and static method in interface.
    Optional class,
    Lambda expression and functional interface.
    Stream API.
#### 11. What are the types of design patterns in Java ?
    Singleton,
    Builder,
    Factory,
    Publisher- subscriber,
    Strategy.
#### 12. What are the SOLID Principles ?
    Single Responsibility Principle (SRP), According to SRP a class should always handle single   functionality or there should not be more than one reason for a class to change.
    Open Closed Design Principle says that software entities like classes, modules, functions, etc. should  be open for extension, but closed for modification.
    Liskov Substitution Principle (LSP) must be substitutable for supertype. The main concept behind LSP SOLID design principle is that derived class or subclass must enhance functionality not reduce.
    Interface Segregation Principle (ISP) should not be forced to implement unnecessary methods which they will not use.
    Dependency Injection or Inversion principle should depends upon abstractions rather than upon concrete details.
#### 13. How can you achieve thread-safe singleton patterns in Java ?
    Create the instance variable at the time of class loading.
    Synchronize the getInstance() method.
    Use synchronized block inside the if loop and volatile variable
#### 14. What do you understand by the Open-Closed Principle (OCP) ?
    Software entities (classes, modules, functions, ...) should be open for extension but closed for modification
#### 15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
    The answer is 1.
1. It mean that if the object of type A can do something, the object of type B could also be able tp perform the same thing
2. It means that all the objects of type A could execute all the methods present in its subtype B
3. It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.
4. It means that for the class B to inherit class A, objects of type B and objects of type A must be same.

