## Spring Boot Annotations

1. @SpringBootApplication

   =@EnableAutoConfiguration + @ComponentScan + @Configuration

   this annotation enables three features: Spring Boot's auto configuration feature, component scanning, and java-based Spring configuration.

2. Spring Basic

   Define Beans:

   - class level: @Component, @Service, @Repository, @Controller

   - method level: @Bean -> @Configuration -> @ComponentScan

     defines a bean with @Bean, annotating a class with @Configuration to indicate this class contains bean, and use @ComponentScan to tell Spring to scan and generate bean

   Dependency Injection:

   - @Autowired: By type-> By name OR @Qualifier -> @Primary -> By name
   - @Resource: By name -> By type
   - @Inject

3. @Entity

   defines that a class can be mapped to a table

   @Table 

   allows you to specify the details and properties of the table (optional)

    - @Id & @GeneratedValue

      defines the primary key and generate the identifier

    - @Column

      allows you to specify the details and properties of a column in the table

    - @CreationTimestamp & @UpdateTimestamp

      allows the creation or update timestamp be persisted in the table

    - @ManyToOne, @OneToMany, @OneToOne, @ManyToMany

      relationships between entities

    - @JoinColumn

      marks a column as a join column for an entity association

    - @NamedQuery @ NamedQueries

      declare a query or a set of queries in the entity class 

4. @Repository

   this annotation is used to indicate that the class is a repository which provides the mechanism for CRUD

   - @Query & @Param

     - JPQL

       ```java
       @Query("select p from Post p where p.id = :key or p.title = :title")
       Post getPostByIdOrTitle(@Param("key") Long id,
                               @Param("title") String title);
       ```

     - SQL

       ```java
       @Query(value = "select * from posts p where p.id = ?1 or p.title = ?2", nativeQuery = true);
       Post getPostByIdOrTitle(Long id, String title);
       ```

   - @PersistenceContext

     used to declare an EntityManager

   - @Transactional

     used to tell the Spring that a transaction is required to execute the methods

5. @Controller

   this annotation is used to create RESTful web services using Spring MVC. It is a convenient annotation which combines @Controller and @ResponseBody

   - @RequestMapping

     it is used to map web requests onto specific handler classes (controller class)

   - @Autowired

     auto wire bean on a constructor,  setter method, property, or methods with multiple parameters

   - @PostMapping

     handling HTTP request POST

   - @GetMapping, @PutMapping, @DeleteMapping, @PatchMapping

   - @RequestBody

     maps the HTTP request body to a transfer object

   - @PathVariable

     set the template variables in the URL as method parameters

6. Exception

   - @ControllerAdvice

     annotating the GlobalExceptionHandler class

   - @ExceptionHandler

     annotating the specific exception handler method

7. Validation

   - @Size, @NotEmpty

     used in entity class, to specify the condition/requirement

   - @Valid

     used in controller class, to make sure the given data is valid

## Jackson Annotations

1. @JsonProperty

   it is used to map property names with JSON keys during serialization and deserialization
