## HW10 Spring Data

1. **List all of the annotations you learned from class and homework to annotaitons.md**


2. **type the code, you need to checkout new branch from branch 02_post_RUD,
   name the new branch with https://github.com/TAIsRich/springboot-redbook/
   tree/hw05_01_slides_JPQL.**


3. **What is JPQL?**

   JPQL is java persistence query language defined in JPA specification. It is used to create queries against entities to store in a relational database.
JPQL is developed based on SQL syntax. But it won’t affect the database directly. JPQL can retrieve information or data using SELECT clause, can do bulk updates using UPDATE clause and DELETE clause. EntityManager.createQuery() API will support for querying language.



4. **What is @NamedQuery and @NamedQueries?**

   - @NamedQuery: one single query contains name and query.
   - @NamedQueries: two or more queries, that contains its name and its query.


5. **What is @Query? In which Interface we write the sql or JPQL?**

   @Query just query itself. Using SQL or JPQL in repository interface.


6. **What is HQL and Criteria Queries?**

    - HQL: Hibernate Query Language, HQL queries are translated by Hibernate into conventional SQL queries, which in turns perform action on database.
    - Criteria Queries: lets us build nested, structured query expressions in Java, providing a compile-time syntax checking that is not possible with a query language like HQL or SQL.
   


7. **What is EnityManager?**

   The EntityManager is an API that manages the lifecycle of entity instances. An EntityManager object manages a set of entities that are defined by a persistence unit. Each EntityManager instance is associated with a persistence context.


8. **What is SessionFactory and Session?**

   - SessionFactory is a factory class for Session objects. It is available for the whole application while a Session is only available for particular transaction.   
   - Session is short-lived while SessionFactory objects are long-lived. SessionFactory provides a second level cache and Session provides a first level cache.


9. **What is Transaction? how to manage your transaction?**

   Transaction represents a unit of work. If one step fails, the whole transaction fails (which is termed as atomicity). A transaction can be described by ACID properties(atomicity, consistency, isolation, and durability).It could be managed by using methods like commit() , rollback().


10. **What is hibernate Caching?**
    Caching is a mechanism to enhance the performance of a system. It is a buffer memory that lies between the application and the database. Cache memory stores recently used data items in order to reduce the number of database hits as much as possible. It includes 1st level-cache and second-level cache.


11. **What is the difference between first-level cache and second-level cache?**  
    The first level cache is associated with the Session Object, while the second-level cache is associated with the SessionFactory object. This means first-level cache's scope is limited to session-level while second-level cache's scope is at the application level.


12. **How do you understand @Transactional? (不要clone，要⾃⼰抄写并测试
    transactional，https://github.com/TAIsRich/tutorial-transaction)**

   


13. **Write a simple factory design pattern.**

