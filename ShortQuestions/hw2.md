### 2
wrapper class is class java support for primary type variables. Since primary type variables are not objects. But sometimes we need to handle primary type variables in object way. In this case we can transfer the primary type variables to wrapper class objects first.
### 3
Hashmap is unsynchronized, and we can set key or value in hashmap as null.
But hashtable is synchronized. and doesn't accept null.
### 4
String pool is a pool stored in heap memory used for stored all strings created by `String s= "XXXX"` way.
Since when String pool created a string, it would not create twice. All string variables created by  `String s= "XXXX"` way had same value would point to the same address in string pool.
In this case, we can avoid creating duplicated string to save memory.
### 5
garbage collection is the way that the java used for recycling memory, when jvm found some memory would not be used in this program. It would recycle this memory.
### 6
private <  no access modifier < protected < public

`private` only member inside of same class can call this member.

`no access modifier` only classes in same package with this class can call this member.

`protected` classes in same package and this class's subclass can call this member.

`public` all classes can call it.

### 7
`final field` constant variables

`final method` functions can not be overrided.

`final class` class can not be inherited.
### 8
`static  field` variables belong to class, all objects co-use it

`static method` classes belong to class, can only access to static field and static functions.

`static class` normally is inner class

Usually set static member in tool class, like Arrays, Math class.
### 9
`override` override functions that inherit from parent class or interface. The return type and parameters must same as overrided function.

`overload` overload functions in same class, the function has same name with original function but different parameters.
### 10
`super` call parent class members

`this` call members in this object. It points to this object's address.

### 11
1. if a class called, jvm would first load static method at heap
2. then when the object of class created by new, jvm would process constructor and  create a space at heap to store this object.
### 12
Polymorphism means that functions have same name, but have different actions.
There are two ways to implements it which are override and overload.
### 13
Encapsulation is collecting data and packs them as a class. When program wants to call some data from this class, must follow the rules defined inside of this class(public functions).
Set field as private, and create getter and setter to access and operate them.
We use it to make sure the safe of data.

### 14
`interface` only has one abstract function, a class can inherit multiple interfaces

`abstract` can have no or many abstract functions, it's class and a class can only inherit one class
### 16
`PriorityQueue` sorted by value sequence

`LinkedList` stored by insert order