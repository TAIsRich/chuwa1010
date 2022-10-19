1. What is generic in Java? and type the generic code by yourself.

   a. https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t01_basic/generic

   **Generics** means **parameterized types**. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

   ```java
   public class GenericClass<T> {
       // T -> Integer, User, Product
       T obj;
   
       public GenericClass(T obj) {
           this.obj = obj;
       }
   
       public T getObj() {
           return this.obj;
       }
   }
   
   public class GenericClassTest {
   
       public static void main(String[] args) {
           // Test for Integer type
           GenericClass<Integer> obj1 = new GenericClass<>(5);
           System.out.println(obj1.getObj());
   
           // Test for double type
           GenericClass<Double> obj2 = new GenericClass<>(15.777755);
           System.out.println(obj2.getObj());
   
           // Test for String type
           GenericClass<String> obj3 = new GenericClass<>("That's my first Generic Class");
           System.out.println(obj3.getObj());
       }
   }
   
   ```

   

2. Read those codes and type it one by one by yourself. the push the code to your branch.

   https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/src/main/java/com/chuwa/tutorial/t06_java8

   please see it in my "MavenProject" folder under "Coding" folder. The code is the the directory named "tutorial" of "MavenProject"

3. practice stream API at least **3** times

   a. https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82

   FInished

   

4. Write the Singleton design pattern include eager load and lazy load.

   ***Eager Load & Lazy Load***

   ```java
   public class Singleton {
       // 1, static variable
       private static Singleton instance = new Singleton();
       
     	// 2, make constructor be private
    		// 保证不能new， 一旦可以new, 就可以建造很多instance， 则就不再是singleton 
    		private Singleton() {
    		}
   
   		// 3. static getInstance method
    		// static保证在没有instance的情况下，可以调该方法。 
     	public static Singleton getInstance() {
    	  	return instance;
       }
   }
   
   //--------------------------------------------------------------------------------
   
   public class Singleton {
     //1. static volatile varible
     private static volatile Singleton instance;
     
     //2. make constructor be private
     //保证不能new, 一旦可以new, 就可以建造很多instance
     private Singleton() {}
     
     //3. static synchronized getInstance method
     //static在保证没有instance的情况下，可以调用该方法
     public static Singleton getInstance() {
     	if (instance == null) {
       	//4. make sure thread safe
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

   

   

5. What is Runtime Exception? could you give me some examples?

   The RuntimeException and its subclasses are unchecked exceptions. The most common exceptions are **NullPointerException**, **ArrayIndexOutOfBoundsException**, **ClassCastException**, **InvalidArgumentException** etc.

   

6. Could you give me one example of NullPointerException?

   `public class NullPointerExceptionExample  {`    

   ​	`private static void printLength(String str)  {`        

   ​		`System.out.println(str.length());`    

   ​	`}`     

   ​	`public static void main(String args[])  {`       

   ​		`String myString = null;`       

   ​		`printLength(myString);`  

   ​	`}`

   `}`

   

7. What is the Optional class?

   *Optional is a container object which may or may not contain a non-null value*.

   

8. What is the @FunctionalInterface?

   A **functional interface** is an interface that contains only one abstract method. They can have only one functionality to exhibit. From Java 8 onwards, [lambda expressions](https://www.geeksforgeeks.org/lambda-expressions-java-8/) can be used to represent the instance of a functional interface. 

   ***Runnable***, ***ActionListener***, ***Comparable*** are some of the examples of functional interfaces. 

   

9. what is lamda?

   A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

   

10. What is Method Reference?

    [Functional Interfaces in Java](https://www.geeksforgeeks.org/functional-interfaces-java/) and [Lambda Function](https://www.geeksforgeeks.org/lambda-expressions-java-8/) are prerequisites required in order to grasp grip over method references in Java.

11. What is Java 8 new features?

    **Default methos and static method in interface**

    **Lambda & Functional Interface**

    **Optional**

    **Method Reference**

    **Stream API**

12. Lambda can use unchanged variable outside of lambda? what is the details?

    Yes, but it has to be never changed

    