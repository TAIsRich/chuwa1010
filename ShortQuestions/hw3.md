###### 2. What is the checked exception and unchecked exception in Java, could you give one example?
- ``Checked exceptions`` happen at compile time. If some code within a method throws a checked exception, then the method must either handle(catch) the exception or it must specify the exception using the throws keyword.
One example would be IOException, e.g., FileNotFoundExcption. 
- ``Unchecked exceptions`` includes error and runtime exceptions. Some examples includ NullPointerException and IndexOutOfBoundsException. 
###### 3.Can there be multiple finally blocks?
No, only one ``finally`` block. 
###### 4. When both catch and finally return values, what will be the final result?
The value returned by ``finally`` will be the final result. 
###### 5. What is Runtime/unchecked exception? what is Compile/Checked Exception?
- ``Runtime/unchecked`` exceptions happen during runtime. Some common unchecked exceptions include ``NullPointerException``, ``ArrayIndexOutOfBoundsException`` and ``IllegalArgumentException``.
- ``Compile/Checked`` exceptions happen during compile time. Some common checked exceptions include ``IOException``, ``SQLException`` and ``ParseException``.
###### 6. What is the difference between throw and throws?
``Throw`` is used to create a custom error. It is used together with an exception type.
``Throws`` indicates what exception type may be thrown by a method.
| throw | throws |
| :-----| :----- |
| Used to throw an exception for a method | Used to indicate what exception type may be thrown by a method |
| Cannot throw multiple exceptions | Can declare multiple exceptions |
| Throw is followed by an object (new type) and used inside the method | throws is followed by a class and used with the method signature |
###### 7. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception？
The ``catch`` scope should be from small to large. 
###### 8. What is optional? why do you use it? write an optional example.
``Optional`` is a new type introduced in Java 8. It is used to represent a value that may or may not be present. In other words, an ``Optional`` object can either contain a non-null value (in which case it is considered present) or it can contain no value at all (in which case it is considered empty). ``Optional`` is generally used as a return type for methods that might not always have a result to return. 
```
public class OptionalExample {
	public static void main(String[] args) {
		String[] words = new String[10];
		Optional<String> check = Optional.ofNullable(words[5]);
		if (check.isPresent()) {
			String w = words[5].toLowerCase();
			System.out.println(w);
		} else {
			System.out.println("word is null");
		}
	}
}
```
###### 9. Why finally always be executed ?
``Finally`` block is always get executed unless there is an abnormal program termination either resulting from a JVM crash or from a call to System.exit(). The finally block is used to clean up the code even if an exception occurs. 

###### 10. What is Java 8 new features ?
- Stream API
- Default and static methods in Interfaces
- Lambda expressions
###### 11. What are the types of design patterns in Java ?
- Creational design pattern
  - Factory pattern
  - Singleton pattern
  - Builder pattern
- Structural design pattern
  - Adapter pattern
  - Composite pattern
  - Decorator pattern
- Behavioral design pattern
  - Command pattern
  - Iterator pattern
  - Visitor pattern
###### 12. What are the SOLID Principles ?
```
S - single-responsibility principle, every class should have only one responsibility
O - open–closed principle, Software entities should be open for extension, but closed for modification
L - Liskov substitution principle: "Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it."
I - interface segregation principle: "Clients should not be forced to depend upon interfaces that they do not use."
D - dependency inversion principle: "Depend upon abstractions, not concretions."
```
###### 13. How can you achieve thread-safe singleton patterns in Java ?
- Eager initialization (eager load) declare getInstance() synchronized directly, only one thread can access getInstance(), but may decrease the performance. 
- Lazy initialization (lazy load) uses double check locking, multiple threads can access getInstance(), the performance overhead gets reduced because of synchronized().
###### 14. What do you understand by the Open-Closed Principle (OCP) ?
Open-closed Principle (OCP) states: Objects or entities should be open for extension but closed for modification. This means that a class should be extendable without modifying the class itself.
###### 15. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
- [x] It mean that if the object of type A can do something, the object of type B could also be able to perform the same thing
- [ ] It means that all the objects of type A could execute all the methods present in its subtype B 
- [ ] It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.
- [ ] It means that for the class B to inherit class A, objects of type B and objects of type A must be same.
