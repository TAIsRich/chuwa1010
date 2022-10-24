## HW4 - Generic, Java 8 Features

1. **What is generic in Java? and type the generic code by yourself. (In Coding folder)**

   Generic allows type to be a parameter to methods, classes, and interfaces. There's two types of generic: generic method & generic class. A generic method has a type parameter so that this method can be called with arguments of different types. A generic class is implemented normally with a type parameter section.

2. **Read those codes and type it one by one by yourself. then push the code to your branch. Java 8 features. (In Coding folder)** 

3. **Practice stream API at least 3 times**

4. **Write the Singleton design pattern include eager load and lazy load.**

   - eager load

     ```java
     public class Singleton {
         private static Singleton instance = new Singleton();
         
         private Singleton(){}
         
         public static Singleton getInstance() {
             return instance;
         }
     }
     ```

   - lazy load

     ```java
     public class Singleton{
         private static volatile Singleton instance;
         
         private Singleton(){}
         
         public static Singleton getInstance() {
             if (instance == null) {
                 synchronized (Singleton.class) {
                     if (instance == null){
                         instance = new Singleton();
                     }
                 }
             }
             return instance;
         }
     }
     ```

5. **What is Runtime Exception? could you give me some examples?**

   RuntimeException is the superclass of all classes that exceptions are thrown during the normal operation of the JVM. The RuntimeException and its subclasses are unchecked exceptions. Some exceptions are ArithmeticException, IndexOutOfBoundsException, NullPointerException.

   - ArithmeticException Example

     ```java
     public class Main {
         public static void main(String[] args) {
             int x = 100;
             int y = 0;
             //devide by zero
             System.out.println( x / y );
         }
     }
     ```

   - IndexOutOfBoundsException Example

     ```java
     public class Main {
         public static void main(String[] args) {
             String[] str = new String[5];
     		//index 5 is out of bound
             str[5] = "Hello";
         }
     }
     ```

   - NullPointerException Example (see Q6)

6. **Could you give me one example of NullPointerException?**

   ```java
   public class Main {
       public static void main(String[] args) {
           String[] str = new String[10];
           //str[9] = null, NullPointerException
           int len = str[9].length();
           
           System.out.print(len);
       }
   }
   ```

7. **What is the Optional class?**

   Optional class is introduced to avoid NullPointerException in java. It provides methods which let us check the presence of value for a particular variable.

8. **What is the @FunctionalInterface?**

   It is a notation which used to do the sanity check that ensures the functional interface contains only one abstract method. 

9. **What is lambda?**

   Lambda works with functional interface and provides implementation of functional interface. Lambda is able to replace anonymous inner class, which means that we don't need to overwrite the method again for providing the implementation. 

10. **What is Method Reference?**

    Method reference is a short and easily readable writing syntax for lambda expression.

11. **What is Java 8 new features?**

    - default and static method in Interface
    - Functional Interface
    - Lambda & Method Reference
    - Optional Class
    - Stream API

12. **Lambda can use unchanged variable outside of lambda? what is the details?**

    The unchanged variable means:

    - final variable
    - non-final variable which value is never changed after initialization, aka “effectively final variable" 
    - object variable (able to set)
