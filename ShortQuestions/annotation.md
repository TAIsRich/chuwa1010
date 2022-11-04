# Annotations

## Entity (hibernate)

**javax.persistence** package

- `@Entity`: Specifies that the class is an entity. This annotation can be applied on Class, Interface of Enums.

  ```java
  import javax.persistence.Entity;
  
  @Entity
  public class Employee implements Serializable {
  }
  ```



- `@Table`: It specifies the table in the database with which this entity is mapped. In the example below the data will be stores in the “employee” table. Name attribute of [@Table](https://www.digitalocean.com/community/users/table) annotation is used to specify the database table name.

  ```java
  import javax.persistence.Entity;
  import javax.persistence.Table;
  
  @Entity
  @Table(name = "employee")
  public class Employee implements Serializable {
  }
  ```



- `@Column`: Specify the column mapping using [@Column](https://www.digitalocean.com/community/users/column) annotation. Name attribute of this annotation is used for specifying the database table’s column name.

  ```java
  import javax.persistence.Column;
  import javax.persistence.Entity;
  import javax.persistence.Table;
  
  @Entity
  @Table(name = "employee")
  public class Employee implements Serializable {
   
    @Column(name = "employee_name")
    private String employeeName;
  }
  ```



- `@Id`: This annotation specifies the primary key of the entity.

  ```java
  import javax.persistence.*;
  
  @Entity
  @Table(name = "employee")
  public class Employee implements Serializable { 
    @Id
    @Column(name = "id")
    private int id;
  }
  ```



- `@GeneratedValue`: This annotation specifies the generation strategies for the values of primary keys.

  ```java
  import javax.persistence.*;
  
  @Entity
  @Table(name = "employee")
  public class Employee implements Serializable {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    private int id;
  }
  ```



- `@UniqueConstrant`: adds `UNIQUE` constraint to a column

- `@CreateTimestamp`: injects a current time to the field when created

- `@UpdateTimestamp`: injects a current time to the field when updated



## Controller

- `@RestController`: is used for making restful web services with the help of the @RestController annotation. This annotation **is used at the class level** and **allows the class to handle the requests made by the client**.
- `@RequestMapping` defines the starting path variable
- `@Autowired` injects a service layer implementation
- `@PostMapping` defines a POST method
- `@GetMapping` defines a GET method with path variable
- `@PutMapping` defines a PUT method with path variable
- `@DeleteMapping` defines a DELETE method with path variable
- `@PathVariable` maps field names in path variable with a Java field
- `@RequestBody` defines a request body source from DTO



## DAO

- `@Repository`

  @Repository Annotation is a specialization of **@Component** annotation which **is used to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects**. Though it is a specialization of @Component annotation, so Spring Repository classes are autodetected by spring framework through classpath scanning. **This annotation is a general-purpose stereotype annotation which very close to the [DAO pattern](https://www.geeksforgeeks.org/data-access-object-pattern/) where DAO classes are responsible for providing CRUD operations on database tables.**



## Service

- `@Service` defines a class as the service layer implementation



## Other

- `@ResponseStatus` defines a class with a returned http response status