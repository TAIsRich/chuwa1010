4. JPA is a Java specification for managing relational data in Java applications which allows us to access and persist data between Java object and relational database. Hibernate is a java framework and ORM tool that is used to provide the implementation of the JPA methods.
5. Hikari is a JDBC DataSource implementation that provides a connection pooling mechanism. A connection pool is a cache of database connections maintained which the benefits is that the connections can be reused when future requests to the database are required.
6. 
   - @OneToMany: one row in a table is mapped to multiple rows in another table
   - @ManyToOne: multiple rows in a table is mapped to one row in another table
   - @ManyToMany: multiple rows in a table is mapped to multiple rows in another table
7. cascade = CascadeType.ALL, orphanRemoval = true means that all operations would be propagated including hibernate specific ones from a parent to a child entity, and dependent entities are removed when the relationship to their parent entity is destroyed. The other CascadeType are:
   - CascadeType.PERSIST: propagates the persist operation from a parent to a child entity
   - CascadeType.MERGE: propagates the merge operation from a parent to a child entity
   - CascadeType.REMOVE: propagates the remove operation from parent to child entity
   - CascadeType.DETACH: when removes the entity from the persistent context, the child entity will also get removed from the persistent context
   - CascadeType.REFRESH: when reread the value of a given instance from the database, the child entity also gets reloaded from the database
8. FetchType.LAZY means only fetch the related entities from the database when you use the relationship, and FetchType.EAGER means get all elements of a relationship when selecting the root entity
9. JPA generate query method by using query method subject keywords and column names. For example find…By, read…By, get…By. And we should not implement the method by ourselves in most cases as long as we can use those generated methods.