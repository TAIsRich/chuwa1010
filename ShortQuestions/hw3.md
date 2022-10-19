1.  Practice  collection

### ArrayList

`**add()**`

*Adding Elements*

- `add(Object)`**:** This method is used to add an element at the end of the ArrayList.
- `add(int index, Object)`**:** This method is used to add an element at a specific index in the ArrayList and moves all element previously present from that index one position ahead.

`**contains(Object)**`

*Returns true if this list contains the specified element.*

`**get(int index)**`

************************************Returns the element at specific index************************************

`**boolean addAll(Collection c)**`

********************************Returns true if the elements of specified list is appended and list changes********************************

`**size()**`

*Returns the number of elements in this list.*

`**remove()**`

- `remove(int index)`: Removes the element at the specified position in this list.
- `remove(Element e)`: Removes the first occurrence of the specified element from this list, if it is present.

`**removeRange(int fromIndex, int toIndex)**`

*Remove all elements within the specified range from an ArrayList object.*

**[FromIndex, toIndex)**

`**removeAll(Collection c)**`

*Remove all elements that are contained in this collection and returns **true** if this list changed as a result of the call.* 

*************Will throw `java.lang.NullPointerException` if Collection c is null.*

`**clear()**`

*Remove all the elements from a list.*

******`set(int index, Element e)`******

*Replace the element at the specified position in this list with the specified element.*

***Returns Value:** This method returns the **element** previously at the specified position.*

******************`indexOf(Element e)`******************

*Returns the index of the **first occurrence** of the specified element in this list, or **-1** if this list does not contain the element.*

**********************************************`lastIndexOf(Element e)`**********************************************

*Returns the index of the **last occurrence** of the specified element in this list, or **-1** if this list does not contain the element.*

```java
import java.util.ArrayList;
class arrayListTest {
	// create an arrayList
	ArrayList<Integer> al1 = new ArrayList<Integer>();
	ArrayList<Integer> al2 = new ArrayList<Integer>(10); // arrayList with size 10

	// add() method
	ArrayList<String> dict = new ArrayList<String>();
	dict.add("Amazon");
	dict.add("Ebay");
	dict.add("Microsoft");
	// return dict; ----- ["Amazon", "Ebay", "Microsoft"]

	// contains() method
	dict.contains("Amazon"); // true

	// get() method
	dict.get(1); // return "Ebay"

	// addAll(Collection c) method
	ArrayList<String> food = new ArrayList<String>();
	food.add("apple");
	food.add("banana");
	food.addAll(dict);
	// return food; ----- ["apple", "banana", "Amazon", "Ebay", "Microsoft"]

	// size() method
	dict.size(); // 3

	// remove() method
	food.remove(2); // food: ["apple", "banana", "Ebay", "Microsoft"]
	food.remove("Ebay"); // food: ["apple", "banana", "Microsoft"]

	// removeRange() method
	// dict = ["Amazon", "Ebay", "Microsoft"]
	dict.removeRange(0, 2); // dict = ["Microsoft"]
	
	// removeAll() method
	ArrayList<Integer> orig = new ArrayList<Integer>();
	orig.add(1);
	orig.add(2);
	orig.add(3);
	ArrayList<Integer> rm = new ArrayList<Integer>();
	rm.add(1);
	rm.add(2);
	orig.removeAll(rm); // orig: [3]
	
	// clear() method
	food.clear(); // food: []
} 

class startNewPara {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);

	// set() method
	al.set(2, 30); // al: [1, 2, 30, 4, 5]
	
	// indexOf() method
	al.indexOf(4); // return 3

	// lastIndexOf() method
	al.add(1); // al: [1, 2, 30, 4, 5, 1]
	al.lastIndexOf(1); // return 5
}
```
### List Iterator

**`hasPrevious()`** 

*It is used to check if we have previous item for the item pointed by current iterator or not.*

**`previous()`** 

*It returns the previous element of the list, and moves the iterator one position back.*

**`add()`** 

*It is used to add an item while iterating through the List.*

**`set()`** 

*Replaces the element returned by either next() or previous() with the specified element*

**`nextIndex()`** 

*Returns the index of the element that the next() method will return*

**`previousIndex()`** 

*Returns the index of the element that the previous() method will return*

```java
class myClass {
	public static void main(String args[]) {
		List<Integer> list = new Arraylist<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		ListIterator<Integer> it = list.ListIterator();
		// Some functions of ListIterator
		it.hasNext(); // bool
		it.hasPrevious(); // bool
		it.next();
		it.previous();
		it.set()
	**}**

}
```


1.  What is the checked exception and unchecked exception in Java, could you give one example?

    - Checked Exceptions: 
    A checked exception is an exception that occurs at the compile time, these are also called as compile time exceptions.
    e.g: For example, if you use FileReader class in your program to read data from a file, if the file specified in its constructor doesn't exist, then a `FileNotFoundException` occurs, and the compiler prompts the programmer to handle the exception.
    - Unchecked Exceptions: 
    An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.
    For example, if you have declared an array of size 5 in your program, and trying to call the 6th element of the array then an `ArrayIndexOutOfBoundsExceptionexception` occurs.

    For example, if you have declared an array of size 5 in your program, and trying to call the 6th element of the array then an `ArrayIndexOutOfBoundsExceptionexception` occurs.
2.  Can there be multiple finally blocks?
    No
    
3.  When both catch and finally return values, what will be the final result?
    Method will ultimately return value returned by finally block irrespective of value returned by catch block. 

4.  What is Runtime/unchecked exception? what is Compile/Checked Exception?
    - Checked Exceptions: 
    A checked exception is an exception that occurs at the compile time, these are also called as compile time exceptions.
    - Unchecked Exceptions: 
    An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.
5.  What is the difference between throw and throws
    throw keyword uses the exception object whereas the throws keyword uses the name of the exception classes
7. What is optional? why do you use it? write an optional example.
   Optional is a container object used to contain not-null objects. Optional object is used to represent null with absent value. This class has various utility methods to facilitate code to handle values as 'available' or 'not available' instead of checking null values.
8. Why finally always be executed ?

    The finally block always executes when the try block exits. This ensures that the finally block is executed even if an unexpected exception occurs. But finally is useful for more than just exception handling — it allows the programmer to avoid having cleanup code accidentally bypassed by a return, continue, or break.

9.  Practice collection problems here: https://github.com/TAIsRich/chuwa-eij-tutorial/tree/main/02-java-core/
src/main/java/com/chuwa/exercise/collection
10. What is Java 8 new features ?
    Lambda & Functional Interface; Stream API 
11. What are the types of design patterns in Java ?
    Creational Design Pattern; Structural Design Pattern; Behavioral Design Pattern
12. What are the SOLID Principles ?
    Single Responsibility Principle
    Open/Closed Principle
    Liskov Substitution Principle
    Interface Segregation Principle
    Dependency Inversion Principle

13. What do you understand by the Open-Closed Principle (OCP) ?
    The open closed principle states that the software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification. The two key terms here are open for extension and closed for modification.
14. Liskov’s substitution principle states that if class B is a subtype of class A, then object of type A may be
substituted with any object of type B. What does this actually mean? (from OA ) choose your answer.
    a. It mean that if the object of type A can do something, the object of type B could also be able tp
    perform the same thing
    b. It means that all the objects of type A could execute all the methods present in its subtype B
    c. It means if a method is present in class A, it should also be present in class B so that the object of
    type B could substitute object of type A.
    d. It means that for the class B to inherit class A, objects of type B and objects of type A must be same.

    a

