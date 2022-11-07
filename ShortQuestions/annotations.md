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

- `@JsonProperty` is a marker annotation to define logical property. `@JsonProperty` can be annotated at non-static setter or getter method or non-static object field. The logical property is used in serialization and de-serialization of JSON.

- `@JoinColumn` marks a column as a join column for an entity association or an element collection.

- `@ManyToOne` mapping means that multiple rows in a table is mapped to one row in another table.

- `@OneToMany` mapping means that one row in a table is mapped to multiple rows in another table.

- `@ManyToMany` mapping means that multiple rows in a table is mapped to multiple rows in another table.

  The ***mappedBy*** parameter in `@ManyToOne`, `@ManyToMany`, and `@OneToMany` is what we use to tell Hibernate which variable we are using to represent the parent class in our child class.
  
  The `@OneToMany(fetch = FetchType.EAGER)` means that we **does load** the foreign keys.
  
  The `@OneToMany(fetch = FetchType.LAZY)` means that we does **NOT** load the foreign keys.

- `@NamedQuery` is defined as a query with a **predefined unchangeable query string**. Instead of dynamic queries, usage of named queries may improve code organization by separating the JPQL query strings from POJO. **It also passes the query parameters** rather than embedding literals dynamically into the query string and results in more efficient queries.

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

- `@PersistenceContext`The ***EntityManager*** is the interface that lets us interact with the **persistence context.** Whenever we use the ***EntityManager***, we are actually interacting with the **persistence context***.*

- `@Transactional` makes sure that all of operations are atomic

  ```java
  @Repository
  @Transactional
  public class PostJPQLRepositoryImpl implements PostJPQLRepository {
  
      @PersistenceContext
      EntityManager entityManager;
  
      @Override
      public List<Post> getAllPostWithJPQL() {
          TypedQuery<Post> posts = entityManager.createNamedQuery("Post.getAll", Post.class);
          return posts.getResultList();
      }
  }
  
  ```

- `@Query` JPQL interacts with database for CRUD operations

  ```java
  /**
  * JPQL
  * use Entity name other than database table name.
  * index Parameters
  * @return post
  */
  
  @Query("select p from Post p where p.id = :key or p.title = :title")
  Post getPostByIDOrTitleWithJPQLNamedParameters(@Param("key") Long id,
                                                     @Param("title") String title);
  
  ```

  

## Service

- `@Service` defines a class as the service layer implementation



## Other

- `@ResponseStatus` defines a class with a returned http response status