**Q1**

generic: is a generic class or interface or method that is parameterized over types. 

could use E(element), T(type), K(key), V(value), N(number), ?(unsure)

Please check code at coding/hw4/Generic folder.

**Q4**

lazy load：

```java
package org.example;

public class SingletonQ4Lazy {
    //lazy load
    //1.static private variable
    private static SingletonQ4Lazy instance = new SingletonQ4Lazy();

    //2 private constructor
    private SingletonQ4Lazy(){

    }

    //3 public static getInstance method
    public static SingletonQ4Lazy getInstance(){
        return instance;
    }

}
```

eager load:

```java
package org.example;

public class SingletonQ4Eager {
    //eager load

    //1. static volatile variable
    private static volatile SingletonQ4Eager instance;

    //2 private constructor
    private SingletonQ4Eager(){

    }


    //3 static synchronized getInstance method
    public static SingletonQ4Eager getInstance(){
        //4 make sure thread safe
        if(instance == null){
            synchronized (SingletonQ4Eager.class){
                if(instance == null){
                    instance = new SingletonQ4Eager();
                }
            }
        }
        return instance;
    }
}

```

**Q5**

Runtime Exception: superclass of those exceptions that can be thrown during the execution of java program. 

E:ArrayIndexOutOfBoundsException. It could happen when array's index ranges from 0 to 9 the program requests array[10].

**Q6**

NullPointerException example:

```java
   public class test {
    public static void main(String[] args) {
        String str = null;
        if (str.equals("a")){
            System.out.print("Same");
        }
    }
}
```

**Q7**

Optional class:  a container object which may or may not contain a non-null value. It could avoid null checks and runtime NullPointerException.

**Q8**

@FunctionalInterface: It is used for sanity check in java Functional Interface.  This annotation could ensure that the functional interface can't have more than one abstract method.

**Q9**

lambda: It is a short block of code which takes in parameters and returns a value. It works with Functional interface and could replace anonymous inner class. It does not need a name and can be implemented right in the body of a method.

**Q10**

Method Reference: used to refer method of functional interface. It is compact and easy form of lambda expression.

**Q11**

Java 8 new features: static methods and default methods in interface, functional interface, lambda, method reference, streamAPI, optional

**Q12**

Yes, lambda could use unchanged variable outside of the lambda. It could use final variables, variables are not changed, or variables are changed by setter before used.
