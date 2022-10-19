1. Practice collection

   Please see "myProject" folder under "coding" folder

   

2. What is the checked exception and unchecked exception in Java,could you give one example?

   URL: https://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/

   ***Checked Exception*** is a type of exception that must be either caught or declared in the method in which it is thrown, for example, **IO**Exception and **SQL**Exception are kinds of Cheched Exceptions.

   ***Unchecked Exception*** In Java, exceptions under **Error** and **RuntimeException** classes are unchecked exceptions, everything else under throwable is checked. 

   

3. Can there be multiple finally blocks?

   No

   

4. When both catch and finally return values, what will be the final result?

   If both *catch* and *finally* return, the receiving method will get the returned value **from the *finally* block**.

   

5. What is **Runtime/uncheckedexception**? what is Compile/CheckedException?

   The uncheckexception happened in runtime, while the checkedException happened in compile time.

   

6. What is the difference between **throw** and **throws**?

   | The <u>throw</u> keyword is used inside a function. It is used when it is required to throw an Exception logically. | The **<u>throws</u>** keyword is used in the function signature. It is used when the function has some statements that can lead to exceptions. |
   | ------------------------------------------------------------ | ------------------------------------------------------------ |
   | The **throw** keyword is used to throw an exception explicitly. It can throw only one exception at a time. | The **throws** keyword can be used to declare multiple exceptions, separated by a comma. Whichever exception occurs, if matched with the declared ones, is thrown automatically then. |
   | Syntax of **throw** keyword includes the instance of the Exception to be thrown. Syntax wise throw keyword is followed by the instance variable. | Syntax of **throws** keyword includes the class names of the Exceptions to be thrown. Syntax wise throws keyword is followed by exception class names. |
   | **throw** keyword cannot propagate checked exceptions. It is only used to propagate the unchecked Exceptions that are not checked using the throws keyword. | **throws** keyword is used to propagate the checked Exceptions only. |

   

7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime

   exception before Exception?

   **Catch scope should be from small to large.**

   

8. What is **optional**? why do you use it? write an optional example.

   Java 8 has introduced a new class Optional in **java.util package**. It can help in writing a neat code without using too many null checks. By using Optional, we can specify alternate values to return or alternate code to run. This makes the code more readable because the facts which were hidden are now visible to the developer.

   '

   ```java
   // Java program without Optional Class
   //output -> Exception in thread "main" java.lang.NullPointerException
   public class OptionalDemo {
     public static void main(String[] args) {
       String[] words = new String[10];
       String word = words[5].toLowerCase();
       System.out.print(word);
     }
   }
   
   
   // Java program with Optional Class
   //output -> word is null
   import java.util.Optional;
   
   public class OptionalDemo {
   	public static void main(String[] args) {
   		String[] words = new String[10];
   		Optional<String> checkNull = Optional.ofNullable(words[5]);
   		if (checkNull.isPresent()) {
   			String word = words[5].toLowerCase();
   			System.out.print(word);
   		} else {
   			System.out.println("word is null");
       }
   	}
   }
   
   ```

   '

9. Why finally always be executed?

   The finally block is always get executed unless there is an abnormal program termination either resulting from a JVM crash or from a call to System.exit().

   

10. What is Java 8 new features?

    **Default method and static method in interface**

    **Lambda & functional interface**

    **Optional**

    **Method Reference**

    **Stream API** 

    

11. What are the types of design patterns in Java?

    **Creational Pattern**

    **Structural Pattern**

    **Behavioral Pattern**

    

12. What are the SOLID Principles?

    URL: https://www.educative.io/answers/what-are-the-solid-principles-in-java

    **SOLID** principles are object-oriented design concepts relevant to software development. SOLID is an acronym for five other class-design principles: **S**ingle Responsibility Principle, **O**pen-Closed Principle, **L**iskov Substitution Principle, **I**nterface Segregation Principle, and **D**ependency Inversion Principle.

    

13. How can you achieve thread-safe singleton patterns in Java?

    Steps:

    1. **static volatile** variable

    2. make constructor be **private**

    3. static synchronized **getInstance** method (for lazy load)

    4. make sure **thread safe**

       

14. What do you understand by the Open-Closed Principle (OCP) ?

    

    Software entities (e.g., classes, modules, functions) should be *open* for an extension, but *closed* for modification.

    

15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.



​	**a. It mean that if the object of type A can do something, the object of type B could also be able tp perform the same thing**

​	b. It means that all the objects of typeA could execute all the methods present in its subtypeB

​	c. It means if a method is present in classA, it should also be present in classB so that the object of

​	type B could substitute object of type A.

​	d. It means that for the classB to inherit classA, objects of typeB and objects of typeA must be same.



16. Watch the design pattern video, and type the code, submit it to **MavenProject** folder.

    singleton: https://www.bilibili.com/video/BV1Np4y1z7BU?p=22

    Factory: https://www.bilibili.com/video/BV1Np4y1z7BU?p=35&vd_source=310561eab1216a27f7accf859bf7f6 d9

    Builder: https://www.bilibili.com/video/BV1Np4y1z7BU?p=50&vd_source=310561eab1216a27f7accf859bf7f6 d9

    Publisher_Subscriber: https://www.bilibili.com/video/BV1Np4y1z7BU?p=114&vd_source=310561eab1216a27f 7accf859bf7f6d9



Please see it my "MavenProject" folder under "Coding" folder