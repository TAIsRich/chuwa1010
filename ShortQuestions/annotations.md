1. @SpringBootApplication: mark the main class of a Spring Boot application
2. Entity
   1. @Entity: specifies the class is an entity and is mapped to a database table
   2. @Table: specifies the name of the database table to be used for mapping
   3. @Id: specifies the primary key of an entity
   4. @GeneratedValue: provides for the specification of generation strategies for the values of primary keys
   5. @Column: specify the mapped column for a persistent property or field
   6. @CreationTimestamp: marks a property as the creation timestamp of the containing entity
   7. @UpdateTimestamp: marks a property as the update timestamp of the containing entity
   8. @OneToMany: one row in a table is mapped to multiple rows in another table
   - @ManyToOne: multiple rows in a table is mapped to one row in another table
   - @ManyToMany: multiple rows in a table is mapped to multiple rows in another table
3. @Repository: indicates the class provides the mechanism for storage, retrieval, search, update and delete operation on objects
4. @Service: mark the class as a service provider
5. Controller
   1. @RestController: adds the @Controller and @ResponseBody annotations which creates Restful controllers
   2. @RequestMapping: map web requests to Spring Controller methods
   3. @PostMapping: annotates methods in the @Controller annotated classes handle the HTTP POST requests matched with the given URI expression
   4. @ResponseBody: maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization of the inbound HttpRequest body onto a Java object
   5. @Autowired: marks a Constructor, Setter method, Properties and Config() method as to be autowired that is ‘injecting beans'(Objects) at runtime by Spring Dependency Injection mechanism
   6. @PutMapping: mapping HTTP PUT requests onto specific handler methods
   7. @PathVariable: handle template variables in the request URI mapping, and set them as method parameters
   8. @ResponseStatus: marks a method or exception class with the status code and reason message that should be returned

6. @Query: value attribute of the method with this annotation contains the JPQL or SQL query to execute

7. @NameQuery: defines the single named query

8. @NameQueries: defines the multiple named queries

9. Exception handling

   1. @ControllerAdvice: handling exceptions across the whole application

   2. @ExceptionHandler: define exception handling methods

10. Validation

    1. @Valid: using on controller to validate the data passed into it
    2. Validation annotations: @NotNull, @NotEmpty, @NotBlank, @Min, @Max, @Email

11. @ComponentScan: specify the packages that we want to be scanned for use with @Configuration classes

12. @Component: a generic stereotype for any Spring-managed component

13. @Service: classes at the service layer

14. @Repository: classes at the persistence layer

15. @Primary: set one bean as prime

16. @Qualifier: let the spring to pick one bean to inject if no primary
