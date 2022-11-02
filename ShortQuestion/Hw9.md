### hw9
1.  List all of the annotations you learned from class and homework to
    annotaitons.md
2.  Type the Comment feature for the class project.
3.  In postman, call the APIs in PostController and CommentController.
4.  what is JPA? and what is Hibernate?
    JPA is a specification and defines the way to manage relational database data using java objects. Hibernate is an implementation of JPA. It is an ORM tool to persist java objects into the relational databases.
5.  What is Hiraki? what are the benefits of a connection pool?
    It’s a solid high-performance JDBC connection pool. A connection pool is a cache of database connections maintained so that the connections can be reused when future requests to the database are required.
6.  What is the  @OneToMany, @ManyToOne, @ManyToMany? write some examples.
    These are the relationships between tables, eg. one user can have many bills from the hospital. Many students can register for the same course. A customer can purchase many products. Products can purchase by many customers.
7. What is the cascade = CascadeType?ALL orphan removal = true? and what are the other CascadeType and their features? In which situation do we choose which one?
   The cascade persist is used to specify that if an entity is persisted then all its associated child entities will also be persisted. CascadeType. ALL is that the persistence will propagate (cascade) all EntityManager operations ( PERSIST, REMOVE, REFRESH, MERGE, DETACH ) to the relating entities. orphan removal = true is an item deleted from table when the is no longer referenced by its parent Post entity.
8.  What is the fetch = FetchType?LAZY, fetch = FetchType.EAGER? what is the difference? In which situation did you choose which one?
    fetch = FetchType?LAZY loads the data when it needs. Eager is loaded the data immediately
9.  What is the rule of the JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?
    These strategies have a defined set of keywords to use in method names. Based on the formed method name, the method performs predefined operations. Eg. findByName,findByAge

10. Try to use JPA advanced methods in your class project. In the repository layer, you need to use the naming convention to use the method provided by JPA.
11. Check out a new branch(https://github.com/TAIsRich/springboot-redbook/tree/hw02_01_jdbcTemplate) from branch 02_post_RUD, replace the dao layer using JdbcTemplate.
12. (Optional) use JDBC to read the data from the database.
