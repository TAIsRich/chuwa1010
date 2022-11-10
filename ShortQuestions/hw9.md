###### 2. Type the Comment feature for the class project.
###### 3. In postman, call of the APIs in PostController and CommentController.
###### 4. what is JPA? and what is Hibernate?
JPA is a standard of Object Relational Mapping. It is an interface that defines a set of annotations for creating the object relational mapping.
Hibernate is an object–relational mapping tool for the Java programming language. It provides a framework for mapping an object-oriented domain model to a relational database.

###### 5. What is Hiraki? what is the benefits of connection pool?
Hiraki is a JDBC connection pool. 
A connection pool is a cache of database connections maintained so that the connections can be reused when future requests to the database are required. Connection pools may significantly reduce the overall resource usage.
###### 6. What is the @OneToMany, @ManyToOne, @ManyToMany? write some examples.
- @OneToMany mapping means that one row in a table is mapped to multiple rows in another table. e.g. a class has methods
- @ManyToOne mapping means that multiple rows in a table is mapped to one row in another table. e.g. orders placed by a customer
- @ManyToMany mapping means that multiple entities are related to multiple occurrences of another entity. e.g. a student takes multiple classes, and a class is registered by multiple students
###### 7. What is the cascade = CascadeType.ALL, orphanRemoval = true? and what are the other CascadeType and their features? In which situation we choose which one?
- CascadeType.ALL means that the persistence will propagate (cascade) all EntityManager operations (PERSIST, REMOVE, REFRESH, MERGE, DETACH) to the relating entities.
- orphanRemoval = true means that "child" entity to be removed when it's no longer referenced from the "parent" entity

- CascadeType.REMOVE means to delete a child entity when the deletion of its parent happens. 
- CascadeType.PERSIST means that save() or persist() operations cascade to related entities.
- CascadeType.MERGE means that related entities are merged when the owning entity is merged.
- CascadeType.REFRESH does the same thing for the refresh() operation.
- CascadeType.DETACH detaches all related entities if a “manual detach” occurs.

###### 8. What is the fetch = FetchType.LAZY, fetch = FetchType.EAGER? what is the difference? In which situation you choose which one?
- fetch = FetchType.EAGER: when fetch parent entity, all related child entities fetch at the same time;
- fetch = FetchType.LAZY: only fetch when we request the data
###### 9. What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?
JPA can implement methods according to table names and key words entered. We don't need to implement methods. 
For example, findByLastnameOrFirstname(a, b), JPA will help us find records where lastName = a or firstName = b. 

###### 10. Try to use JPA advanced methods in your class project. In the repository layer, you need to use the naming convention to use the method provided by JPA.

###### 11. Check out a new branch(https://github.com/TAIsRich/springboot-redbook/tree/hw02_01_jdbcTemplate) from branch 02_post_RUD, replace the dao layer using JdbcTemplate.

###### 12. (Optional) use JDBC to read the data from database.
