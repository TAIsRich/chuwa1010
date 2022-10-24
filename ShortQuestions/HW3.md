1. Practice collection

   Files in *Coding/hw3/collection* folder.

2. ###### What is the checked exception and unchecked exception in Java, could you give one example?

   1. A checked exception is an exception that occurs at the time of compilation also called as compile time exceptions. These exceptions cannot simply be ignored at the time of compilation; the programmer should take care of theses exceptions. If you use FileReader class in your program to read data from a file, if the file specified in its construcotr doesn't exist, then FileNotFoundException occurs, and the compiler prompts the programmer to handle the exception.

   2. An unchecked exception is the one which occurs at the time of execution also called as runtime exceptions. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation. If you have declared an array of size 5 in your program, and trying to call the 6th element of the array then an ArrayIndexOutOfBoundsExceptionexception occurs. 

3. ###### Can there be multiple finally blocks?

   No, finally block can only be used once with a try or try-catch block.

   Finally block is a block used to execute important code such as closing the connection and it will always executed whether an exception is handled or not. Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.

4. ###### When both catch and finally return values, what will be the final result?

   If both 'catch' and 'finally' return, the receiving method will get the returned value from the 'finally' block.

5. ###### What is Runtime/unchecked exception? What is Compile/Checked Exception?

   Checked exceptions are checked by a 'try' and 'catch' statement to attempt to catch exceptions in compile time. Unchecked exceptions are not caught, which will throw exceptions at run time and interrupt the process. 

6. ###### What is the difference between throw and throws?

   The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. We can throw either checked or unchecked exception. The throw keyword is mainly used to throw custom exceptions.

   Throws is a keyword in Java which is used in the signature of method to indicate that this method might throw one of the listed type exceptions. The caller to these methods has to handle the exception using a try-catch block. 

7. ###### Run the below three pieces codes, Noticed the printed exceptions. Why do we put the Null/Runtime exception before Exception?

   Because we want to catch exceptions scope from small to large. This way we can catch more specific exceptions.

8. ###### What is optional? Why do you use it? write an optional example.

   Optional is to avoid Null checks and run time NullPointerExceptions

9. ###### Why finally always be executed?

   'finally' will be executed whether or not the exception is handled

10. ###### What is Java 8 new features?

    1. Lambda and Functional Interface

       Functional interface has one single abstract method

       @FunctionalInterface - for sanity check

       Can have a lot of default methods

       Lambda is the implementation of the abstract method

       Lambda is to replace anonymous inner class. Before Java 8, we can use Anonymous Class to override this method.

    2. Optional:  Avoid Null checks and run time NullPointerExceptions
    3. Stream API: There are many ways to create a stream instance of different sources. Once created, the instance will not modify its source, therefore allowing the creation of multiple instances from a single source. Java 8 stream can't be resued. That is, one stream only can be used once.

11. ###### What are the types of design patterns in Java?

    1. Factory Pattern
    2. Abstract Factory Pattern
    3. Singleton Pattern
    4. Prototype Pattern
    5. Builder Pattern.

12. ###### What are the SOLID Principles?

    SOLID principles are an object-oriented approach that are applied to software structure design. It is conceptualized by Robert C. Martin. These five principles have changed the world of object-oriented programming, and also changed the way of writing software. It also ensures that the software is modular, easy to understand, debug, and refactor. 

    he word SOLID acronym for:

    - Single Responsibility Principle (SRP)
    - Open-Closed Principle (OCP)
    - Liskov Substitution Principle (LSP)
    - Interface Segregation Principle (ISP)
    - Dependency Inversion Principle (DIP)

13. ###### How can you achieve thread-safe singleton patterns in Java?

    Singleton can restrict the limit of the number of object creation to only one. This often ensures that there is access control to resource, for example, socket or database connection.

14. ###### What do you understand by the Open-Closed Principle?

    The application or module entities the methods, functions, variables, etc. The open-closed principle states that accroding to new requirements the module should be open for extension but closed for modification. The extension allows use to implement new functionality to the module. 

15. ###### Liskov's substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (From OA) choose your answer.

    1. It means that if the object of type A can do something, the object of type B could also be able tp perform the same thing
    2. It means that all the objects of type A could execute all the methods present in its subtype B
    3. It means if method is present in class A, it should also be present in class B so taht the object of type B could substitute object of type A
    4. It means that for the class B to inherit class A, objects of type B and object of type A must be same

16. ###### Watch the design pattern video, and type the code, sumit it to MavenProject folder 

    Files in *MavenProject/design-pattern* folder.