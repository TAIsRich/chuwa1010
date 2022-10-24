1. In MavenProject/src/main/java/generic
2. In MavenProject/src/main/java/java8_features
3. In Coding/stream-api-exercises/src/test/java/space/gavinklfong/demo/streamapi/StreamApiTest.java
4. Eager load:
   ```
   public class Singleton{
       private static Singleton instance = new Singleton();

       private Singleton(){}

       public static Singleton getInstance(){
           return instance;
       }
   }
   ```
   Lazy load:
   ```
   public class Singleton{
       private static synchronized Singleton instance;

       private Singleton(){}

       public static synchronized Singleton getInstance(){
           if(instance == null){
	       instance = new Singleton();
           }

	   return instance;
       }
   }
   ```
5. Runtime exceptions are expections which would be thrown at runtime and they are unchecked exceptions. For example NullPointerException and InvalidArgumentException.
6. For example:
   ```
   public static void main(String args[]){
       List<Integer> list = null;
       System.out.println(list.size());
   }
   ```
7. Optional is a container object which may or may not contain a non-null value, which be used to avoid Null checks and runtime NullPointerExceptions.
8. Functional interface is the interface which has one single abstract method, can have many default methods, and use Lambda as the implementation of the abstract method.
9. Lambda is been used to create anonymous method and work as the implementation of the abstract method of the functional interface.
10. We can use ClassName::methodName] to reference an exist method of a class or an object.
11. Java 8 new features including:
    - Default method and static method in interface
    - Lambda and functional interface
    - Optional
    - Method reference
    - Stream API
12. Lambda can use unchanged variable outside of Lambda as long as it is final or the address it referenced never changed.
