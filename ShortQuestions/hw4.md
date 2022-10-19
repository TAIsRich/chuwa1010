**Q1**

generic: is a generic class or interface or method that is parameterized over types. 

could use E(element), T(type), K(key), V(value), N(number), ?(unsure)

Please check code at coding/hw4/Generic folder.

**Q4**

lazy load：

```
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

```
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
