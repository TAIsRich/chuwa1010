### 1. List all of the annotations you learned from class and homework to annotaitons.md.
### 2. Type the Comment feature for the class project.
### 3. In postman, call of the APIs in PostController and CommentController.

### 4. what is JPA? What is Hibernate?
JPA(Java Persistence API) uses JDBC to CRUD database, and also transfer result from database to Java Entities. JPA is a standard of Object Relational Mapping(ORM). It is an interface that defines a set of
annotations for creating the object relational mapping(ORM).  

Hibernate is the most popular ORM framework, which implements JPA. 


### 5. What is Hikari? What is the benefits of connection pool?
Hikari is a JDBC DataSource implementation that provides a connection pooling mechanism.  

Using connection pools helps to both alleviate connection management overhead and decrease development tasks for data access. 


### 6. What is the `@OneToMany`, `@ManyToOne`, `@ManyToMany`? Write some examples.
1) `@OneToMany`: one record in a table can be associated with one or more records in another table.
    - One customer can have many orders.
2) `@ManyToOne`: ManyToOne contains a foreign key from the source object's table to the target object's table
    - Many students belong to one university.
3) `@ManyToMany`: One or more items in one table can have a relationship to one or more items in another table.
    - Many students can have many courses.


### 7. What is the `cascade = CascadeType.ALL`, `orphanRemoval = true`? What are the other CascadeType and their features? In which situation we choose which one?
`cascade = CascadeType.ALL`: All cascade operations on owning entity applied to related entity.
`orphanRemoval = true`: If we invoke setOrders(null), the related Order entities will be removed in db automatically.

The other CascadeType and their features:
`cascade = CascadeType.REMOVE`: Owning entity removed  ==>  related entity removed
`cascade = CascadeType.PERSIST`: Owning entity saved  ==>  related entity saved
`cascade = CascadeType.REFRESH`: Owning entity refreshed  ==>  related entity refreshed
`cascade = CascadeType.DETACH`: Owning entity manually detached  ==>  related entity detached


### 8. What is the `fetch = FetchType.LAZY`, `fetch = FetchType.EAGER`? What is the difference? In which situation you choose which one?
- `fetch = FetchType.LAZY`: Lazy fetch fetches the records only when they are needed.
- `fetch = FetchType.EAGER`: Eager fetch means that when a record is fetched from the database, all the associated records from related tables are also fetched. 
- Difference: 
    - `fetch = FetchType.LAZY`: 
        - 1) If we don't need data from comment, JPA doesn't fetch it;
        - 2) Only fetch data from post;
        - 3) when we need data from comment, then JPA fecth comment data.
    - `fetch = FetchType.EAGER`: 
        - When we fetch post, JPA also fetch comment at the same time.
- In which situation you choose which one? 
    - Eager fetch is the default fetch type used by Hibernate. When we use eager fetch, we will get all the related records. 
    - If we just want to fetch the records we need, we can use lazy fetch.


### 9. What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?
1) The rule of JPA naming convention: JPA will implement the method according to the column name of the table. For example, for the method name of `findByLastnameOrFirstname(a, b)`, it should have the lastname and firstname in the database. The first parameter `a` will give to lastname, and the second parameter `b` will give to firstname.
2) We do not implement the method by ourselves.
3) Examples: `findByLastnameOrFirstname(a, b)`, `findByLastnameAndFirstname(a, b)`， `deleteById(id)`


### 10. Try to use JPA advanced methods in your class project. In the repository layer, you need to use the naming convention to use the method provided by JPA.

### 11. Check out a new branch from branch 02_post_RUD, replace the dao layer using JdbcTemplate. https://github.com/TAIsRich/springboot-redbook/tree/hw02_01_jdbcTemplate

### 12. (Optional) use JDBC to read the data from database.
