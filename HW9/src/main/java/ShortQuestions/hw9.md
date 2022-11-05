#### 1. List all of the annotations you learned from class and homework to annotations.md
#### 2. Type the Comment feature for the class project.
#### 3. In postman, call of the APIs in PostController and CommentController.
#### 4. what is JPA? and what is Hibernate?
JPA is Java Persistence API that used to access, manage and persist data between Java object and relational database. 
Comparing with JDBC, JPA is higher standard API for persistence and object/relational mapping for the Java. 

Hibernate is an implementation of JPA. Hibernate is an Object-relational Mapping tool that is used to save the java objects in the relational database system.
It is used in mapping java data types with SQL data types and database tables. It uses HQL (Hibernate Query Language) to execute database operations. To create Session instances, it uses SessionFactory interface. 

#### 5. What is Hiraki? what is the benefits of connection pool?
HikariCP is JDBC connection pool project, which is a cache of database connections. Using caching can make the reused data execute faster. 

#### 6. What is the  @OneToMany, @ManyToOne, @ManyToMany? write some examples
It used for relational database, 
1. @OneToMany: one table relates two more tables.
   2. One user has many posts
2. @ManyToOne: many tables relate to one table.
   3. many comments relate to one user.
3. @ManyToMany: many tables relate to many tables.
   4. employee and project

#### 7. What is the  cascade = CascadeType.ALL, orphanRemoval = true? and what are the other CascadeType and their features? In which situation we choose which one?
cascade = CascadeType.ALL is the persistence will propagate all EntityManager operations to the relating entities.

Other operations: PERSIST, REMOVE, REFRESH, MERGE, DETACH
#### 8. What is the  fetch = FetchType.LAZY, fetch = FetchType.EAGER? what is the difference? In which situation you choose which one?
1. fetch = FetchType.Lazy -> fetch when needed 
2. fetch = FetchType.EAGER -> fetch immediately 

normally use fetch = FetchType.Lazy

#### 9. What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?
The rule for JPA naming convention is all lower case and using space to separates words. When it matches to database, for example, firstName will convert to fist_name;
#### 12. (Optional) use JDBC to read the data from database.