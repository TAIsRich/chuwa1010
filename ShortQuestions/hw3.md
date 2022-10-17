**Q2**

checked exception: exceptions that are checked at compile time E: FileNotFoundException 

unchecked exception:  exceptions thatoccurs at execution and are not checked at compile time E: NullPointerException Exception

**Q3**

Yes. A try block could be followed by mupltiple catch blocks.

**Q4**

The final result will be values finally returned.

**Q5**
unchecked exception:  exceptions that are not checked at compile time and occurs at execution

checked exception: exceptions that are checked at compile time

**Q6**

throw: used to throw an exception from a method or a block

throws: used to declare which exceptions can be thrown from a method. It is used with a try-catch block or throws.

**Q7**

Beacause catch scope should be from small to large and Null/Runtime exception's cope is smaller than Exception.

**Q7**

optional: a container object which may or may not contain a non-null value. 

It is used because could avoid using too many null checks and specify alternate values to return or alternate code to run.

E:

```java
import java.util.Optional;

public class Main {
    public static void main(String[] args)
    {
        String[] str = new String[10];
        Optional<String> o = Optional.ofNullable(str[2]);
        if (o.isPresent()) {
            String word = str[2].toLowerCase();
            System.out.print(word);
        }
        else
            System.out.println("word is null");
    }
}
```

**Q8**

It could be the file is open and never closed after getting exception and throwing or returning.

**Q10**

Java 8 new features: Optional class, default and static methods in interfaces, Functional interfaces and lambda expressions.

**Q11**

Creational Design Pattern: Singleton Pattern, Prototype Pattern

Structural Design Pattern: Bridge Pattern, Proxy Pattern

Behavioral Design Pattern: Iterator Pattern, State Pattern

**Q12**

It includes 5 principles in java:

S: single responsibility principle

O: open-closed principle.

L: liskov substitution principle.

I: interface segregation principle.

D: dependency inversion principle.

**Q13**

There are three ways could achieve it.

1： Create the instance variable at the time of class loading

2： Synchronize the getInstance() method

3： Use synchronized block inside the if loop and volatile variables

**Q14**

OCP: software entities should be open for extension, but closed for modification。

**Q15**

choose 1: It mean that if the object of type A can do something, the object of type B could also be able to
perform the same thing.

