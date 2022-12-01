
### what is JPA? and what is Hibernate?
A JPA (Java Persistence API) is a specification of Java which is used to access, manage, and persist data between Java object and relational database.
It is considered as a standard approach for Object Relational Mapping.JPA use JDBC to CRUD database, and also transfer
result from database to Java Entities.

A Hibernate is a Java framework which is used to store the Java objects in the relational database system.
It is an open-source, lightweight, ORM (Object Relational Mapping) tool.

Hibernate is an implementation of JPA. So, it follows the common standards provided by the JPA.
JPA is a standard of Object RElational Mapping. It is an interface that defines a set of annotations for creating the BRM.

### What is Hiraki? what is the benefits of connection pool?
HikariCP is solid high-performance JDBC connection pool.
A connection pool is a cache of database connections maintained so that the connections can be reused when future requests to the database are required

### What is the @OneToMany, @ManyToOne, @ManyToMany? write some examples.
@OneToMany: the one side will be our point of reference.  e.g. "One Post can have many comments".

@ManyToOne: the many side will keep reference of the one side.  e.g. There will be a column state_id in the table cities.

@ManyToMany: members of each party can hold reference to arbitrary number of members of the other party e.g. doctors and patients
会产生中间表

### What is the cascade = CascadeType.ALL, orphanRemoval = true? and whatare the other CascadeType and their features? In which situation we choose which one?
Cascading means propagating an operation from the owning entity to the related entity.
When a record in the owning entity (parent table) is saved, updated or deleted, the change
should be reflected in the related entity (child table) as well.


Propagates all operations from parent to target entity.
when the relationship between parent and child entity broke, the child entity will become orphan and will be removed

CascadeType.ALL – Propagates all operations from parent to target entity.
CascadeType.PERSIST – Propagates persist from parent to target entity.
CascadeType.MERGE – Propagates merge from parent to target entity.
CascadeType.REMOVE – Propagates remove from parent to target entity.
CascadeType.REFRESH – Propagates refresh from parent to target entity.
CascadeType.DETACH – Propagates detach from parent to target entity.

### What is the fetch = FetchType.LAZY, fetch = FetchType.EAGER? what is the difference? In which situation you choose which one?
There are two ways in which data is loaded: eager and lazy. Eager fetch means that when a record is fetched from the database, all the associated records from related tables are also fetched. So if we fetch a tournament record, all the registrations for the tournament are also fetched.

Eager fetch is the default fetch type used by Hibernate but it is not always the most efficient. Lazy fetch on the other hand, fetches the records only when they are needed.

**FetchType.Lazy**

If we don't need data from comment, JPA doesn't fetch it
Onyly fetch data from post
when we need data from comment, then JPA fecth comment data

**FetchType.Eager**

when we fetch post, JPA also fetch comment at the same time.
### What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?
Spring uses lower snake case by default, which means it uses only lower case letters and separates words with underscores
By using quotes around our identifiers, we tell the database it should also match the case when comparing those identifiers with table and column names.
e.g. select "first_name" from "person"; vs select "first_name" from "PERSON";

if we want to customize naming convention, we need to provide an implementation of PhysicalNamingStrategy and then register it so that Hibernate knows to use it.
Using Spring, this is done by setting the spring.jpa.hibernate.naming.physical-strategy property in our application.properties:
for example:

   ```
   public class UpperCaseNamingStrategy extends SpringPhysicalNamingStrategy {
       @Override
       protected Identifier getIdentifier(String name, boolean quoted, JdbcEnvironment jdbcEnvironment) {
           return new Identifier(name.toUpperCase(), quoted);
       }
   }
   
   spring.jpa.hibernate.naming.physical-strategy=com.baeldung.namingstrategy.UpperCaseNamingStrategy (in application.properties)
```
### Try to use JPA advanced methods in your class project. In the repository layer,you need to use the naming convention to use the method provided by JPA.
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