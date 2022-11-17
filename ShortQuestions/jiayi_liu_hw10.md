1. #### List all of the annotations you learned from class and homework to annotaitons.md

   Please see it in ShortAnswers/annotations.md

   

2. #### type the code, you need to checkout new branch from branch **02_post_RUD**, name the new branch with **https://github.com/TAIsRich/springboot-redbook/tree/hw05_01_slides_JPQL**.

   

   

3. #### What is JPQL?

   JPQL is Java Persistence Query Languages defined in JPA specification, which syntax is very similar to the SQL syntax. JQPL works with Java classes and instances.

   

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

   - It is an Interface which is present **in org.hibernate package** and it is used to create Session Object.

   - It is immutable and thread-safe in nature.

     ```java
     //buildSessionFactory() method gathers the meta-data which is in the cfg Object. 
     //From cfg object it takes the JDBC information and create a JDBC Connection.
     
     SessionFactory factory=cfg.buildSessionFactory();
     ```

   **Session** 

   - **Session is an interface which is present in org.hibernate package. Session object is created based upon SessionFactory object i.e. factory.**
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

    **Hibernate caching acts as a layer between the actual database and your application**. It reduces the time taken to obtain the required data — **as it fetches from memory instead of directly hitting the database**. It is very useful when you need to fetch the same kind of data multiple times.

    **There are mainly two types of caching:**

    - First level cache
    - Second-level cache

    

11. #### What is the difference between first-level cache and second-level cache?

    URL: https://medium.com/swlh/what-is-hibernate-caching-introduction-of-level-1-level-2-cache-8ea7339a5052#:~:text=Hibernate%20caching%20acts%20as%20a,kind%20of%20data%20multiple%20times.

    #### ***First-level cache gets data from the session level and is turned on by default.***

    when you query an entity or object, **for the very first time it is retrieved from the database and stored into the first-level cache (associated with the hibernate session)**. 

    If we query for the same entity or object again with the same session object, **for the second time of same query in the same session, it will be loaded from cache and no SQL query will be executed.** Take a look at the below code snippet.

    ```java
    // We have one record in DB with the Employee details like, 101, John Doe, UK
    
    // Open hibernate session
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    
    //the first time
    // Fetch an Employee entity from the database very first time
    Employee employee = (Employee) session.load(Employee.class, empId);
    System.out.println("First call output : " + employee.getName());
    
    //the second time
    // Request for Employee entity again
    employee = (Employee) session.load(Employee.class, empId);
    System.out.println("Second call output : "employee.getName());
     
    session.getTransaction().commit();
    HibernateUtil.shutdown();
     
    // Output:
    // First call output : John Doe
    // Second call output : John Doe
    ```

    

    #### ***The second-level cache gets data from cross-sessions level and has to be turned on by configuration.***

    Suppose your application has 2 active sessions session1 and session2 respectively. Now, session1 has requested data having id=101 so that will be fetched from a database as it is the first call, and then it is stored into the second-level (SessionFactory) as well as in the first-level (session) cache also. Now, session2 requires the same data so it has also been queried with the same id=101. So this time session2 will get data from the SessionFactory, it will not going to hit the database. Take a look at the below code snippet.

    ```java
    // Open hibernate session
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    
    // Employee entity is fecthed very first time (It will be cached in both first-level and second-level cache)
    Employee employee = (Employee) session.load(Employee.class, empId);
    System.out.println(employee.getName());
    
    // Fetch the employee entity again
    employee = (Employee) session.load(Employee.class, empId);
    System.out.println(employee.getName()); //It will return from the first-level
    
    // Evict from first level cache (That will remove employee object from first-level cache)
    session.evict(employee);
    
    // Fetch same entity again using same session
    employee = (Employee) session.load(Employee.class, empId);
    System.out.println(employee.getName()); //It will return from the second-level
    
    // Fetch same entity again using another session
    employee = (Employee) anotherSession.load(Employee.class, empId);
    System.out.println(employee.getName());//It will return from the second-level
    
    System.out.println("Response from the first-level : " + HibernateUtil.getSessionFactory().getStatistics().getEntityFetchCount());
    System.out.println("Response from the second-level : " + HibernateUtil.getSessionFactory().getStatistics().getSecondLevelCacheHitCount());
     
    // Output:
    // Response from the first-level : 1
    // Response from the second-level : 2
    ```

    

    

12. #### How do you understand @Transactional? (不要clone，要自己抄写并测试transactional，https://github.com/TAIsRich/tutorial-transaction)

    

13. #### Write a simple factory design pattern.

