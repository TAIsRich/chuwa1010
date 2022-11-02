**4**

JPA is short for Java Persistence API. It is a collection of classes and methods to persistently store the vast amounts of data into a database. JPA use JDBC to CRUD database, and also transfer result from database to Java Entities.

Hibernate: the most popular ORM framework, an open source object relational mapping (ORM) tool that provides a framework to map object-oriented domain models to relational databases for web applications.

**5**

Hikari is a JDBC DataSource implementation that provides a connection pooling mechanism.

The benefits of using it is reducing the cost of opening and closing connections by maintaining a “pool” of open connections that can be passed from database operation to database operation as needed.

**6**

@OneToMany: Foreign key may exist. E: A post has many comments. A student takes many classes.

@ManyToOne: Many classes is taken by the student. 

@ManyToMany: In the case of a many-to-many relationship, both sides can relate to multiple instances of the other side. E: A doctor can have many patients and vice versa. 

**7**

cascade = CascadeType.ALL, orphanRemoval = true -> all cascade operations on owning entity applied to related entity. If the relationship between a parent and child is removed, the child record would be an orphan record which does not have parent record. Therefore, the child record would be removed too.

CascadeType.PERSIST : owning entity saved -> related entity saved
CascadeType.MERGE : owning entity merged -> related entity merged
CascadeType.REFRESH : owning entity refreshed -> related entity refreshed
CascadeType.REMOVE : owning entity removed -> related entity removed
CascadeType.DETACH : owning entity detached -> related entity detached
CascadeType.ALL : all cascade operations on owning entity applied to related entity


**8**

fetch = FetchType.LAZY：fetch the records only when they are needed. more efficient.

fetch = FetchType.EAGER: default type by Hibernate, when a record is fetched from the database, all the associated records from related tables are also fetched


**9**

rule of JPA naming convention: the JPA default table name is the name of the class (minus the package) with the first letter capitalized. Each attribute of the class will be stored in a column in the table.

we could implement it by extending PhysicalNamingStrategy.

```Java
public class UpperCaseNamingStrategy extends SpringPhysicalNamingStrategy {
    @Override
    protected Identifier getIdentifier(String name, boolean quoted, JdbcEnvironment jdbcEnvironment) {
        return new Identifier(name.toUpperCase(), quoted);
    }
}
```