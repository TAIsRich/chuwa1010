1. [Practice collection](https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/exercise/collection)

2. What is the checked exception and unchecked exception in Java, could you give one example?

   Checked Exceptions

   > In general, checked exceptions represent errors outside the control of the program. For example, the constructor of FileInputStream throws FileNotFoundException if the input file does not exist. **Java verifies checked exceptions at compile-time.**
   >
   > Some [common checked exceptions](https://www.baeldung.com/java-common-exceptions) in Java are *IOException*, *SQLException* and *ParseException*.

   Unchecked Exceptions

   > If a program throws an unchecked exception, it reflects some error inside the program logic. For example, if we divide a number by 0, Java will throw ArithmeticException. **Java does not verify unchecked exceptions at compile-time.** Furthermore, we don't have to declare unchecked exceptions in a method with the *throws* keyword. And although the above code does not have any errors during compile-time, it will throw *ArithmeticException* at runtime.
   >
   > Some [common unchecked exceptions](https://www.baeldung.com/java-common-exceptions) in Java are *NullPointerException*, *ArrayIndexOutOfBoundsException* and *IllegalArgumentException*.
   >
   > The *[RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html)* class is the superclass of all unchecked exceptions, so we can [create a custom unchecked exception](https://www.baeldung.com/java-new-custom-exception) by extending *RuntimeException*:

3. Can there be multiple finally blocks?

   > No, you can only have one `finally` clause *per try/catch/finally statement*, but you can have multiple try/catch/finally statements, either in the same method or in multiple methods.

4. When both catch and finally return values, what will be the final result?

   > When catch and finally block both return value, **method will ultimately return value returned by finally block irrespective of value returned by catch block**.

5. What is **Runtime/uncheckedexception**? what is Compile/Checked  Exception?

   Checked Exceptions

   > In general, checked exceptions represent errors outside the control of the program. For example, the constructor of FileInputStream throws FileNotFoundException if the input file does not exist. **Java verifies checked exceptions at compile-time.**
   >
   > Some [common checked exceptions](https://www.baeldung.com/java-common-exceptions) in Java are *IOException*, *SQLException* and *ParseException*.

   Unchecked Exceptions

   > If a program throws an unchecked exception, it reflects some error inside the program logic. For example, if we divide a number by 0, Java will throw ArithmeticException. **Java does not verify unchecked exceptions at compile-time.** Furthermore, we don't have to declare unchecked exceptions in a method with the *throws* keyword. And although the above code does not have any errors during compile-time, it will throw *ArithmeticException* at runtime.
   >
   > Some [common unchecked exceptions](https://www.baeldung.com/java-common-exceptions) in Java are *NullPointerException*, *ArrayIndexOutOfBoundsException* and *IllegalArgumentException*.
   >
   > The *[RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html)* class is the superclass of all unchecked exceptions, so we can [create a custom unchecked exception](https://www.baeldung.com/java-new-custom-exception) by extending *RuntimeException*:

6. What is the difference between **throw** and **throws**?

   > The throw and throws are the concepts of exception handling in Java where the throw keyword throws the exception explicitly from a method or a block of code, whereas the throws keyword is used in the signature of the method.

   |      | Key Difference            | throw                                                        | throws                                                       |
   | :--- | :------------------------ | :----------------------------------------------------------- | ------------------------------------------------------------ |
   | 1.   | Point of Usage            | The **throw** keyword is used inside a function. It is used when it is required to throw an Exception logically. | The **throws** keyword is used in the function signature. It is used when the function has some statements that can lead to exceptions. |
   | 2.   | Exceptions Thrown         | The **throw** keyword is used to throw an exception explicitly. It can throw only one exception at a time. | The **throws** keyword can be used to declare multiple exceptions, separated by a comma. Whichever exception occurs, if matched with the declared ones, is thrown automatically then. |
   | 3.   | Syntax                    | Syntax of **throw** keyword includes the instance of the Exception to be thrown. Syntax wise throw keyword is followed by the instance variable. | Syntax of **throws** keyword includes the class names of the Exceptions to be thrown. Syntax wise throws keyword is followed by exception class names. |
   | 4.   | Propagation of Exceptions | **throw** keyword cannot propagate checked exceptions. It is only used to propagate the unchecked Exceptions that are not checked using the throws keyword. | **throws** keyword is used to propagate the checked Exceptions only. |

7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception?

   > Catch scope should be from small to large. NullPointerException is a kind of RuntimeException, and RuntimeException is a kind of Exception.

   ```java
   public class Main {
       public static void main(String[] args) {
           int a = 0;
           int b = 3
           String s = null;
           try {
               System.out.println(b / a);
               System.out.println(s.equals("aa"));
               throw new RuntimeException();
           } catch (ArithmeticException e) {
               e.printStackTrace();
           } catch (NullPointerException e) {
               e.printStackTrace();
           } catch (RuntimeException e) {
               e.printStackTrace();
           } catch (Exception e) {
               e.getMessage();
   }
           System.out.println("End ...");
       }
   }
   
   public class Main {
       public static void main(String[] args) {
           int a = 0;
           int b = 3
           String s = null;
           try {
               // System.out.println(b / a);
               System.out.println(s.equals("aa"));
               throw new RuntimeException();
           } catch (ArithmeticException e) {
   						e.printStackTrace();
           } catch (NullPointerException e) {
               e.printStackTrace();
           } catch (RuntimeException e) {
               e.printStackTrace();
           } catch (Exception e) {
               e.getMessage();
   }
           System.out.println("End ...");
       }
   }
   public class Main {
       public static void main(String[] args) {
           int a = 0;
           int b = 3
           String s = null;
           try {
               // System.out.println(b / a);
               // System.out.println(s.equals("aa"));
               throw new RuntimeException();
           } catch (ArithmeticException e) {
               e.printStackTrace();
           } catch (NullPointerException e) {
               e.printStackTrace();
           } catch (RuntimeException e) {
               e.printStackTrace();
           } catch (Exception e) {
               e.getMessage();
   }
           System.out.println("End ...");
       }
   }
   ```

   

8. What is **optional**? why do you use it? write an optional example.

   > Optional in Java is a container for an object that may or may not hold a value. This is a fact seldom understood amongst Java engineers who use Optional as a 'fancy way' to perform null checks and to avoid NullPointerException scenarios.

   > The purpose of Optional is **to express the potential absence of a value with a data-type instead of having the implicit possibility to have an absent value just because null-reference exists in Java**.

   ```java
   public static void main(String[] args)
       {
           String[] words = new String[10];
           String word = words[5].toLowerCase();
           System.out.print(word);
       }
   //Out: Exception in thread "main" java.lang.NullPointerException
   public static void main(String[] args)
       {
           String[] words = new String[10];
           Optional<String> checkNull
               = Optional.ofNullable(words[5]);
           if (checkNull.isPresent()) {
               String word = words[5].toLowerCase();
               System.out.print(word);
           }
           else
               System.out.println("word is null");
       }
   //Out: word is null
   ```

   

9. Why finally always be executed?

   > The finally block always executes when the try block exits. This ensures that the finally block is executed even if an unexpected exception occurs.

10. Practice collection problems here:https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/ src/main/java/com/chuwa/exercise/collection

11. What is Java 8 new features ?

    [Java 8 New Features](https://www.digitalocean.com/community/tutorials/java-8-features-with-examples)

    1. forEach() method in Iterable interface
    2. default and static methods in Interfaces
    3. Functional Interfaces and Lambda Expressions
    4. Java Stream API for Bulk Data Operations on Collections
    5. Java Time API
    6. Collection API improvements
    7. Concurrency API improvements
    8. Java IO improvements

12. What are the types of design patterns in Java ?

     1. Creational Design Pattern
    		Factory Pattern
    	Abstract Factory Pattern
    	Singleton Pattern
    	Prototype Pattern
    	Builder Pattern.

    2. Structural Design Pattern
    Adapter Pattern
    Bridge Pattern
    Composite Pattern
    Decorator Pattern
    Facade Pattern
    Flyweight Pattern
    Proxy Pattern
    3. Behavioral Design Pattern
    Chain Of Responsibility Pattern
    Command Pattern
    Interpreter Pattern
    Iterator Pattern
    Mediator Pattern
    Memento Pattern
    Observer Pattern
    State Pattern
    Strategy Pattern
    Template Pattern
    Visitor Pattern

13. What are the SOLID Principles ?

    - [**S** - Single-responsiblity Principle](https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design#single-responsibility-principle)
    - [**O** - Open-closed Principle](https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design#open-closed-principle)
    - [**L** - Liskov Substitution Principle](https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design#liskov-substitution-principle)
    - [**I** - Interface Segregation Principle](https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design#interface-segregation-principle)
    - [**D** - Dependency Inversion Principle](https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design#dependency-inversion-principle)

14. How can you achieve thread-safe singleton patterns in Java ?

    ```java
    public class Singleton {
    
        /**
         * volatile 使得修改值立即更新到主程序
         * <p>
         * 双重检测锁模式看上去完美无缺，其实是存在问题，在多线程的情况下，可能会出现空指针问题，出现问
         * 题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作。
         * 要解决双重检查锁模式带来空指针异常的问题，只需要使用 volatile 关键字, volatile 关
         * 键字可以保证可见性和有序性。
         */
    
        // 1, static volatile variable
        private static volatile Singleton instance;
    
        // 2, make constructor be private
        private Singleton() {
        }
    
        // 3. static synchronized getInstance method
        public static Singleton getInstance() {
    
            // 4, make sure thread safe
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
    
            return instance;
        }
    }
    ```

    

15. What do you understand by the Open-Closed Principle (OCP) ?

    Software entities (classes, modules, methods, etc.) should be open for extension, but closed for modification.

16. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.

    1. ✅It mean that if the object of typeA can do something, the object of typeB could also be able to perform the same thing

    2. It means that all the objects of typeA could execute all the methods present in its subtype B

    3. It means if a method is present in classA, it should also be present in classB so that the object of

    type B could substitute object of type A.

    4. It means that for the classB to inherit classA, objects of typeB and objects of typeA must be same.

       

       Watch the design pattern video, and type the code, submit it to **MavenProject** folder

singleton: https://www.bilibili.com/video/BV1Np4y1z7BU?p=22

Factory: https://www.bilibili.com/video/BV1Np4y1z7BU?p=35&vd_source=310561eab1216a27f7accf859bf7f6 d9

Builder: https://www.bilibili.com/video/BV1Np4y1z7BU?p=50&vd_source=310561eab1216a27f7accf859bf7f6 d9

Publisher_Subscriber: https://www.bilibili.com/video/BV1Np4y1z7BU?p=114&vd_source=310561eab1216a27f 7accf859bf7f6d9