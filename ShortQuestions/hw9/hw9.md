﻿### 4. what is JPA? and what is Hibernate?

-   A JPA (Java Persistence API) is a specification of Java which is used to access, manage, and persist data between Java object and relational database. It is considered as a standard approach for Object Relational Mapping.
-   A Hibernate is a Java framework which is used to store the Java objects in the relational database system. It is an open-source, lightweight, ORM (Object Relational Mapping) tool.Hibernate is an implementation of JPA. So, it follows the common standards provided by the JPA.

### 5. What is Hiraki? what is the benefits of connection pool?

-   Hikari is a JDBC DataSource implementation that provides a connection pooling mechanism.
-   Using connection pools helps to both alleviate connection management overhead and decrease development tasks for data access. Each time an application attempts to access a backend store (such as a database), it requires resources to create, maintain, and release a connection to that datastore. 
- A connection pool is a cache of database connections maintained so that the connections can be reused when future requests to the database are required


### 6. What is the  `@OneToMany, @ManyToOne, @ManyToMany`? write some examples.

-   `@OneToMany`: one object in this table can have many relationships to another table, like a country can have many states
-   `@ManyToOne`:  the many side will keep reference of the one side, many states belongs to one country.

-   `@ManyToMany`: set up a table to hold @ManyToOne && @OneToMany. A course can have many students to attend, a student can take many courses.

### 7. What is the  `cascade = CascadeType.ALL, orphanRemoval = true`? and what are the other CascadeType and their features? In which situation we choose which one?

-   The meaning of  `CascadeType.ALL`  is that the persistence will propagate (cascade) all EntityManager operations (PERSIST, REMOVE, REFRESH, MERGE, DETACH) to the relating entities.
-   `orphanRemoval = true`  is to delete orphaned entities from the database.
-   Types:
    -   CascadeType.PERSIST: cascade type presist means that save() or persist() operations cascade to related entities.
    -   CascadeType.MERGE: cascade type merge means that related entities are merged when the owning entity is merged.
    -   CascadeType.REFRESH: cascade type refresh does the same thing for the refresh() operation.
    -   CascadeType.REMOVE: cascade type remove removes all related entities association with this setting when the owning entity is deleted.
    -   CascadeType.DETACH: cascade type detach detaches all related entities if a “manual detach” occurs.
    -   CascadeType.ALL: cascade type all is shorthand for all of the above cascade operations.

### 8. What is the  `fetch = FetchType.LAZY, fetch = FetchType.EAGER`? what is the difference? In which situation you choose which one?

-   FetchType.EAGER: tells Hibernate to get all elements of a relationship when selecting the root entity.
-   FetchType.LAZY: tells Hibernate to only fetch the related entities from the database when you use the relationship. (Preferred)

### 9. What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?

-   Spring uses lower snake case by default, which means it uses only lower case letters and separates words with underscores.
-   Yes
-   `firstName`  ->  `first_name`
