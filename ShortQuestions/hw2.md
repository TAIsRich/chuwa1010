**Q2**

Wrapper class is a class whose object wraps or contains primitive data types.

It is used since it could provide a way to use primitive data types as objects.

**Q3**

HashMap allows null key and null value. HashMap is not synchronized but faster. HashMap is not thread-safe.

HashTable do not allow null key or value. Hashtable is synchronized but slower. Hashtable is thread-safe.

**Q4**

String pool is a special storage space in Java Heap memory where string literals are stored.

We need it because it could reduce the amount of string obejcts created in the memory. When a string is created, JVM will check the string pool. 
If the same string exists already, it will return a reference instead of creating a new string.

**Q5**

It is a feature in java which could destroy the objects which are not in use to free up memory.

**Q6**

Default:declarations are visible within the package

Private: declarations are visible within the class

Protected:  declarations are visible within the package or subclasses

Public: declarations are visible everywhere. 

**Q7**

final field: define constants which value could not bechanged.

final method: prevent other methods overriding. The method can not be modified from a subclass.

final class: prevent inheritance and make the class immutable. The class could not be extended.

**Q8**


