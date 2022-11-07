 1. `@SpringBootApplication`

    This annotation is used to mark the main class of a Spring Boot application. It encapsulates `@SpringBootConfiguration`,`@EnableAutoConfiguration`, and `@ComponentScan` annotations with their default attributes. 

 2. `@Entity`

    This class is an entity and is mapped to a database table

 3. `@Table`

    Specify the details of the table that will be used to persist the entity in the database

 4. `@Id`

    indicating the meber field below is the primary key of the current entity

 5. `@GeneratedValue`

    configure the way of increment of the specified column

 6. `@Column`

    adding the column the name in the table of a particular MySQL database

 7. `@CreationTimestamp`,`@UpdateTimestamp`

    make it easy to track the timestamp of the creation and last update of an entity

 8. `@Repository`

    The `@Repository` annotation can have a special role when it comes to converting database exceptions to Spring-based unchecked exceptions.

 9. `@RestController`

    create RESTful web service using Spring MVC. Spring RestController takes care of mapping request data to the defined request handler method. Once response body is generated from the handler method, it converts it to JSON or XNL response.

10. `@RequestMapping`

    map web requests onto specific handler classes and handler methods

11. `@Autowired`

    used for automatic dependency injection. Spring framework is built on dependency injection and we inject the class dependencies through spring bean configuration file