# HW9
## 1. **List all of the annotations you learned from class and homework to annotaitons.md**

## 2. **Type the Comment feature for the class project**

## 3. **In postman, call of the APIs in PostController and CommentController.**
**PostController:**
Post: {{localhost}}/api/v1/posts
Get: {{localhost}}/api/v1/posts
Get by id: {{localhost}}/api/v1/posts/3
Get All posts by page number: {{localhost}}/api/v1/posts/?pageNo=2&pageSize=3&sortBy=id&sortDir=asc
Put (update) by id:{{localhost}}/api/v1/posts/10
Delete by id: {{localhost}}/api/v1/posts/2
**CommentController:**
Post: {{localhost}}/api/v1/posts/10/comments
Get by post id: {{localhost}}/api/v1/posts/4/comments/
Get by post id and comment id: {{localhost}}/api/v1/posts/3/comments/4
Put (update) by post id and comment id: {{localhost}}/api/v1/posts/3/comments/1
Delete by post id and comment id: {{localhost}}/api/v1/posts/3/comments/2
## 4. **what is JPA? and what is Hibernate?**

JPA is used to access, manage, and persist data between java objects and relational database. JPA uses JDBC to CRUD database.
JPA is the standard of ORM. **Hibernate** is an ORM framework/tool which implements JPA. Hibernate is used to store the java objects in the relational database.

## 5. **What is Hikari? what is the benefits of connection pool?**

Hikari is a high performance JDBC connection pool. A connection pool is a cache of database connections maintained so that the connections can be reused. Similar to the thread pool, it can reduce the resource usage by reducing the number of times of creating and closing new connection objects.

## 6. **What is the `@OneToMany`, `@ManyToOne`, `@ManyToMany`? write some examples.**

@OneToMany - map the entity to another one by one-to-many relationship
        - one row in a table is mapped to multiple rows in another table
          e.g. one student registers many courses.

@ManyToOne - map the entity to another one by many-to-one relationship
        - multiple rows in a table is mapped to one row in another table
          e.g. many courses are registered by one student

@ManyToMany - map the entity to another one by many-to-many relationship
        - multiple rows in a table is mapped to multiple rows in another table
          e.g. many students register many courses

## 7. **What is the `cascade = CascadeType.ALL, orphanRemoval = true`? and what are the other CascadeType and their features? In which situation we choose which one?**

`cascade = CascadeType.Remove`: specify no automatic action is taken since disconnecting a relationship is not a remove.
`orphanRemoval = true`: specify the disconnected instance is automatically removed. Thi is useful for clearning up dependent objects(such as description) that should not exist without a reference from an owner object(such as Post).
`cascade = CascadeType.ALL`: propagates all operations from the owning entity to the related entity.

    - `CascasdeType.PERSIST` - propagates the persist operation, when we want to perform save() or persit() to both parent and related entities
    - `CascasdeType.MERGE` - propagates the merge operation, the related entity is merged when the parent entity is merged
    - `CascasdeType.REMOVE` - propagates the remove operation, removes all related entities when the parent entity is removed
    - `CascasdeType.DETACH` - propages the detach operation, detaches all related entities when the parent entity is detached
    - `CascasdeType.PERSIST` - all cascade operations on owning entity appplied to related entity.

## 8. **What is the `fetch = FetchType.LAZY, fetch = FetchType.EAGER`? what is the difference? In which situation you choose which one?**

    - EAGER: when a entity is fetched, all the related entities are also fetched.
    - LAZY: the related entities will not be fetched automatically, instead we should make a call to fetch.
    - Eager fetch is the default fetch type in Hibernate, we should use it when we need all of related entities. Otherwise, we can use the lazy fetch to choose which entities be fetched when needed.

## 9. **What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?**

The JPA default table name is the name of the class (minus the package) with the first letter capitalized. Each attribute of the class will be stored in a column in the table.

JPA will implement the method depends on the table's column names in the database. We can use the supported keywords along with the column names inside the method name. So we don't need to implement most of methods by ourselves.

  `findByLastnameAndFirstName(a,b)`, `findByStartDateAfter`, `findByStartDateBefore`, `deleteByAgeGreaterThan`, `findByFirstnameStartingWith`, `findByAgeOrderByLastnameDesc`, `findByFirstnameIgnoreCase`

## 10. **Try to use JPA advanced methods in your class project. In the repository layer, you need to use the naming convention to use the method provided by JPA.**
    List<Post> findByTitleContainingOrDescrptionContainingOrContentContaining(String keywordInTitle, String keywordInDescription, String keywordInContent);

## 11. **Check out a new branch hw_02 from branch 02_post_RUD, replace the dao layer using JdbcTemplate.**