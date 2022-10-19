###### 1. What is generic in Java? and type the generic code by yourself. 
``Generics`` means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using ``Generics``, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
- Generic Class
```
public class GenericClass<T> {
	T obj;

	public GeneticClass(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return this.obj;
	}
}
```
- Generic Method 
```
public class GenericMethod {
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
}
```
- Generic MultiArguments
```
public class GenericMultiArguments {
	public static <T1, T2, T3> void temp(T1 x, T2 y, T3 z) {
		System.out.println("This is x = " + x);
		System.out.println("This is y = " + y);
		System.out.println("This is z = " + z);
	}
}
```

###### 4. Write the Singleton design pattern include eager load and lazy load.
- Eager load
```
public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}	
}
```
- Lazy Load
```
public class Singleton {
	private static volatile Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
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

###### 5. What is Runtime Exception? could you give me some examples?
``Runtime/unchecked exceptions`` happen during runtime. Some common unchecked exceptions include ``NullPointerException``, ``ArrayIndexOutOfBoundsException`` and ``IllegalArgumentException``.

###### 6. Could you give me one example of NullPointerException?
```
public class NullPointerExceptionExample() {
	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3};
		System.out.println(arr[3]);
	}
}
```

###### 7. What is the Optional class?
``Optional`` class is a container object which may or may not contain a non-null value. If a value is present, isPresent() will return true and get() will return the value. Optional class can avoid Null checks and run time NullPointerExceptions. 

###### 8. What is the @FunctionalInterface?
``@FunctionalInterface`` is an informative annotation type used to indicate that an interface type declaration is intended to be a functional interface, which has exactly one abstract method. Instances of functional interfaces can be created with lambda expressions, method references, or constructor references.

###### 9. what is lamda?
``Lambda`` expressions basically express instances of functional interfaces. Lambda expressions implement the only abstract function within the functional interface instead of overriding it and therefore implement the interface. 

###### 10. What is Method Reference?
``Method reference`` can be utilized to refer to a functional interface method. It is compact and easy form of lambda expression. 

###### 11. What is Java 8 new features?
- Reference
- Default method and static method in interface
- Lambda & Functional Interface
- Optional
- Method Reference
- Stream API

###### 12. Lambda can use unchanged variable outside of lambda? what is the details?
``Lambda`` can use variables outside of lambda, as long as the variable is
- final variable
- non-final variable however never changed
- object variable
