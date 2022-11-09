## HW9

1. ###### *what is JPA? and what is Hibernate?*

   JPA is a Java specification for managing relational data in Java applications which allows us to access and persist data between Java object and relational database. 

   Hibernate is a java framework and ORM tool that is used to provide the implementation of the JPA methods.

2. ###### *What is Hiraki? what is the benefits of connection pool?*

   Hiraki is a JDBC *DataSource* implementation that provides a connection pooling mechanism. A connection pool is a cache of database connections maintained so that the connections can be reused when future requests to the database are required. Compared to other implementations, it promises to be lightweight and better performing.

3. ###### *What is the `@OneToMany, @ManyToOne, @ManyToMany`? write some examples.*

   `@OneToMany` : it refers to one parent entity that has a correspondence to zero or more child entities.

   `@ManyToOne`: it means that one parent record can have multiple child records. In other words, multiply records of a table can associate themselves with a common record in another table.

   `@ManyToMany`: many to many relationship occurs when multiple records in a table are associated with multiple records in another table. 

4. ###### *What is the `cascade = CascadeType.ALL, orphanRemoval = true`? and what are the other CascadeType and their features? In which situation we choosewhich one?*

   `CascadeType.ALL`: Propagates all operations -- including Hibernate-specific ones--from a parent to a child entity.

   `CascadeType.PERSIST`: Propagates persist from parent to target entity.

   `CascadeType.REMOVE`: Propagtes remove from parent to target entity.

   `CascadeType.REFRESH`: Propagates refresh from parent to target entity.

   `CascadeType.DETACH`: Propagates detach from parent to target entity.  

5. ###### *What is the `fetch = FetchType.LAZY, fetch = FetchType.EAGER`? what is thedifference? In which situation you choose which one?*

   There are two ways in which data is loaded: eager and lazy.

   * Eager fetch means that when a record is fetched from the database, all the associated records from related tables are also fetched. So, if we fetch a tournament record, all the registrations for the tournament are also fetched. Eager fetch is the default type used by Hibernate but it is not always the most efficient.
   * Lazy fetch on the other hand, fetches the records only when they are needed.
   * `FetchType.Lazy`: If we don't need data from comment, JPA doesn't fetch it only fetch data from post when we need data from comment, then JPA fetch comment data.
   * `FetchType.Eager`: when we fetch post, JPA also fetch comment at the same time.

6. ###### *What is the rule of JPA naming convention? Shall we implement the method byourselves? Could you list some examples?*

   Spring uses lower snake case by default, which means it uses only lower case letterse and separates words with underscores by using quotes areound identifiers, we tell the database it should also match the case when comparing those identifiers with table and column names.

   If we want to customize naming conventions, we need to provide an implementation of PhysicalNamingStrategy and then register it so that Hibernate knows to use it. Using Spring, this is done by setting the spring.jpa.hibernate.physical-strategy property in our application.properties: for example:

   ```java
   public class UpperCaseNamingStrategy extends SpringPhysicalNamingStrategy {
       @Override
       protected Identifier getIdentifier(String name, boolean quoted, JdbcEnvironment jdbcEnvironment) {
           return new Identifier(name.toUpperCase(), quoted);
       }
   }
   spring.jpa.hibernate.naming.physical-strategy=com.baeldung.namingstrategy.UpperCaseNamingStrategy
   ```

7. ###### *Try to use JPA advanced methods in your class project. In the repository layer,you need to use the naming convention to use the method provided by JPA.*

   ```java
   @Repository 
   public interface EmployeeRepository extends JPARepository<  
                                                      Employee,Long>        
   {
        List<Employee> findAll();
        Optional<Employee> findById(Long employeeId);
        List<Employee> findByFirstNameAndLastName(String firstNm, 
                                                  String lastNm);
   }
   ```

8. ###### *Check out a new branch(https://github.com/TAIsRich/springboot-redbook/tree/hw02_01_jdbcTemplate) from branch 02_post_RUD, replace the dao layer usingJdbcTemplate.*

9. ###### *(Optional) use JDBC to read the data from database.*
