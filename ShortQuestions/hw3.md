### 2
`checked exception` is exception that can be noticed at compile time. E.g. IOException,SQLException

`unchecked exception` checked by JVM and happens at run time. E.g. ArrayIndexOutOfBoundsException, NullPointerException

### 3
Yes, but for each try-catch block, only one finally allowed.

### 4
It will return the finally return value

### 5
`checked exception` is exception that can be noticed at compile time. E.g. IOException,SQLException

`unchecked exception` checked by JVM and happens at run time. E.g. ArrayIndexOutOfBoundsException, NullPointerException

### 6
`throw` is a keyword used inside of function block to throw specific exception

`throws` uses after function declaration, declares what kind of exceptions might happen and those exceptions can be thrown in this function.

#### 7
Because Runtime exception is subclass of Exception, which means the Runtime Exception is included by Exception. If we put the Exception before runtime Exception, even though JVM find a runtime exception, it will be thrown as exception instead. Since both exception and runtime exception can find it, and the exception is before it, the exception would be thrown everytime and the runtime exception would never be thrown.

### 8
Optional is a container object, we use it to figure out whether a member variable absent value in an object

### 9
We need a block to protect our program even though an exception thrown. For example, close file or buffer in finally to make sure that although has exception, the file can be closed successfully before program end.

### 10
 `forEach()` in Iterable
 
`default` keyword in interface, to allow new method added to interface and avoid overriding of its implement classes

`static method for interface`

`functional interface` interface only has one abstract function

`lambda express` unnamed function format like `(parameters)->{....}`

`Stream` API support pipeline to do a sequence of operations for a set of data(objects)

`java.time` API to operate time in simple way.

### 11
`Creational Design Pattern:`
```
Factory Pattern
Abstract Factory Pattern
Singleton Pattern
Prototype Pattern
Builder Pattern
```
`Structural Design Pattern:`
```
Adapter Pattern
Bridge Pattern
Composite Pattern
Decorator Pattern
Facade Pattern
Flyweight Pattern
Proxy Pattern
```
`Behavioral Design Pattern:`
```
Chain Of Responsibility Pattern
Command Pattern
Interpreter Pattern
Iterator Pattern
Mediator Pattern
Memento Pattern
Observer Pattern
State Pattern
Strategy Pattern
Template Pattern
Visitor Pattern
```
### 12
`single-responsibility` each class should only support one responsibility

`open-close` add new feature but do not change the existing code

`liskov substitution` parent object can call subclass function and the function should get a correct result and have no exception or error

`interface segregation` to make the interfaces hava each single and less functional blueprint to avoid the implement class have to override useless logic

`dependency inversion` class should depend on abstract class or interface rather than concrete class

### 13
use `synchronized` to declare a block to make sure when a thread came, all other thread are blocked before this thread release the resource.
### 14
Open-closed means that once we want to add some new code or new feature, we can add it but we can not change any exiting function or logic

### 15
a is correct