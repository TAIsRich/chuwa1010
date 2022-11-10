1. #### List all of the annotations you learned from class and homework to annotaitons.md

   Please see it in ShortAnswers/annotations.md

   

2. #### type the code, you need to checkout new branch from branch **02_post_RUD**, name the new branch with **https://github.com/TAIsRich/springboot-redbook/ tree/hw05_01_slides_JPQL**.

   

   

3. #### What is JPQL?

   JPQL is Java Persistence Query Languages, which syntax is very similar to the SQL syntax. JQPL works with Java classes and instances.

   

4. #### What is @NamedQuery and @NamedQueries?

   `@NamedQuery` works in the **Entity level** to predefine a query based on java class.

   `@NamedQueries` is used to collects all `@NamedQuery` queries into a collection for the java class.

   

5. #### What is @Query? In which Interface we write the sql or JPQL?

   `@Query` works on the repository interface (DAO), and it is used to define a JPQL/SQL query.

   

6. #### What is HQL and Criteria Queries?

   **HQL** is a hibernate query language extended from standard JPQL, which shortens query string by omitting the "SELECT *" syntax. 

   **Criteria** **queries** uses a criteria object to specify the SQL equivalent of WHERE statement conditions.

   

7. #### What is EnityManager?

   An `EntityManager` instance is associated with a persistence context. A persistence context is a set of entity instances in which for any persistent entity identity there is a unique entity instance. Within the persistence context, the entity instances and their lifecycle are managed. The `EntityManager` API is used to create and remove persistent entity instances, to find entities by their primary key, and to query over entities.

   

8. #### What is SessionFactory and Session?

   **SessionFactory** 

   - It is an Interface which is present in org.hibernate package and it is used to create Session Object.

   - It is immutable and thread-safe in nature.

     ```java
     //buildSessionFactory() method gathers the meta-data which is in the cfg Object. 
     //From cfg object it takes the JDBC information and create a JDBC Connection.
     
     SessionFactory factory=cfg.buildSessionFactory();
     ```

   **Session** 

   - Session is an interface which is present in org.hibernate package. Session object is created based upon SessionFactory object i.e. factory.
   - It opens the Connection/Session with Database software through Hibernate Framework.
   - It is a light-weight object and it is not thread-safe.
   - Session object is used to perform CRUD operations.

   ```java
   Session session = factory.buildSession();
   
   ```

   

9. #### What is Transaction? how to manage your transaction?

   - Transaction object is used whenever we perform any operation and based upon that operation there is some change in database.

   - Transaction object is used to give the instruction to the database to make the changes that happen because of operation as a permanent by using commit() method.

     ```java
     Transaction tx = session.beginTransaction();
     tx.commit();
     ```

     

10. #### What is hibernate Caching?

    Hibernate Caching is the Spring Data JPA Hibernate mechanism with a lazy read from the database that provides a persistance level caching to read data if data is already fetched from database.

11. #### What is the difference between first-level cache and second-level cache?

    First-level cache gets data from the session level and is turned on by default.

    The second-level cache gets data from cross-sessions level and has to be turned on by configuration.

    

12. #### How do you understand @Transactional? (不要clone，要自己抄写并测试transactional，https://github.com/TAIsRich/tutorial-transaction)

    

13. #### Write a simple factory design pattern.

