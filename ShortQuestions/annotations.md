## Spring Boot Annotations

1. @SpringBootApplication

   this annotation enables three features: Spring Boot's auto configuration feature, component scanning, and java-based Spring configuration.

2. @Entity

   defines that a class can be mapped to a table

   @Table 

   allows you to specify the details and properties of the table (optional)

    - @Id & @GeneratedValue

      defines the primary key and generate the identifier

    - @Column

      allows you to specify the details and properties of a column in the table

    - @CreationTimestamp & @UpdateTimestamp

      allows the creation or update timestamp be persisted in the table

   	- sss

3. @Repository

   this annotation is used to indicate that the class is a repository which provides the mechanism for CRUD

4. @Controller

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