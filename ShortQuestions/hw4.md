# Homework 4

### 1.  What is generic in Java?  and type the generic code by yourself.
Generic is the letter such as `<E> <T> <K>` indicating the customizable type of the arguments of a method or elements of a structure. 
Please see *Coding\chuwa-eij-tutorial\02-java-core\src\main\java\com\chuwa\tutorial\t01_basic\generic* for code.
### 2.  Read those codes and type it one by one by yourself. the push the code to your branch.
Please see *Coding\chuwa-eij-tutorial\02-java-core\src\main\java\com\chuwa\tutorial\t06_java8\features* for code.
### 3.  practice stream API at least 3 times
Please see *Coding/hw4/* for code.
### 4.  Write the Singleton design pattern include eager load and lazy load. 
```
//eager load
Class Singleton (){
	Private static Singleton instance = new Singleton();
	Private Singleton(){}
  Public static Singleton getInstance(){
		return instance;
}
```
```
//lazy load
Class Singleton(){
	Private volatile Singleton instance;
	Private Singleton(){}
	Public static Singleton getInstance(){
		If (instance == null){
			synchronized( Singleton.class){
				if(instance == null) instance = new Singleton();
		    }
		}
		return instance;
    }
}
```
### 5.  What is Runtime Exception? could you give me some examples?
Runtime exceptions are exceptions thrown during run time in execution, such as `NullPointerException`, `ArrayIndexOutofBoundsException`, and `ArithmeticException`.
### 6.  Could you give me one example of NullPointerException?
```
String str;
System.out.println(str.charAt(0));
//above code will throw NullPointerException
```

### 7. What is the Optional class?
Optional API in Java 8 is a class to allow null value to be handled without invoking `NullPointerException`. 
Example:
```
String str; //init a null object
String ret = Optional.of(str).orElse(“”); //provide default empty string if null
```

### 8.  What is the @FunctionalInterface?
`@FucntionalInterface` is a sanity check decorator for a functional interface, which is defined to have only one abstract method to be overridden when implementing and is used for lambda functions to achieve functional programing.
### 9.  what is lamda?
Lambda API provides an elegant way to provide abstract method body to an overriding interface without a full method declaration.
### 10. What is Method Reference?
Method Reference is a Java 8 syntax that calls a method similar to a field using the Class::method syntax, which is usually used inline for lambda functions or stream API. There are 3 ways to call them:
1.	Static method: `Class::method`
2.	Method associated with a instance: `new Class()::method`
3.	Constructor: `Class::new`

### 11. What is Java 8 new features?
-	Stream: processes data structure in a vectorized manner like Python 
-	Optional: provides null value handling to avoid `NullPointerException` 
-	Lambda: provides functional programming support by allowing a way to provide overriding method body in a more elegant way
-	Default and static method for non-abstract method to allow extensibility in interfaces

### 12. Lambda can use unchanged variable outside of lambda? what is the details?
Yes. If the variable is unchanged (either effectively unchanged or declared final), then the variable can be used in later code.