2. Checked expection are checked at compile time and it must be handled like IOException. Unchecked expection are occured at runtime like NullPointerExpection.
3. No.
4. The returned values in the finally would be the final result.
5. Same with question 2?
6. Throws is been used to declare an expection which can be throw by throw keyword.
7. Because if we put Exception before other expections, all expections would be catch by Exception block then other catch blocks are meaningless.
8. Optional is a container object which been used to wrap an object which may contain a null value. We use it to avoid null references. Example:
   ```
   String str = null;
   Optional<String> optStr = Optional.of(str);
   if(optStr.isPresent()){
       System.out.println(optStr.get());
   }
   ```
9. Same with question 1?
10. :
   - Default and static methods in interface
   - Optional class
   - forEach() in Iterable interface
   - Collection improvements
   - IO improvements
   - Concurrency improvements
   - Stream API
   - Time API
   - Functional interface and Lambda expressions
11. Creational, structural, and behavioral.
12. SOLID Principles are:
    - Single-responsibility principle: a class should have one and only one reason to change, meaning that a class should have only one job.
    - Open–closed principle: Objects or entities should be open for extension but closed for modification.
    - Liskov substitution principle: Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T.
    - Interface segregation principle: A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use.
    - Dependency inversion principle: Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.
13. To make singleton pattern thread-safe in Java, we can synchronize the getInstance method.
14. The Open-Closed Principle means that the objects or entities should be open for extension but closed for modification.
15. 3. It means if a method is present in class A, it should also be present in class B so that the object of type B could substitute object of type A.
16. In MavenProject/src/[builder or factory or publisher_subscriber or singleton]
