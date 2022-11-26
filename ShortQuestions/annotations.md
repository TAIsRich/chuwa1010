 1. ###### `@SpringBootApplication`

    This annotation is used to mark the main class of a Spring Boot application. It encapsulates `@SpringBootConfiguration`,`@EnableAutoConfiguration`, and `@ComponentScan` annotations with their default attributes. 

 2. ###### `@Entity`

    This class is an entity and is mapped to a database table

 3. ###### `@Table`

    Specify the details of the table that will be used to persist the entity in the database

 4. ###### `@Id`

    indicating the meber field below is the primary key of the current entity

 5. ###### `@Resource`

    Inject collaborating beans to this class.

    By name > By type

 6. ###### `@GeneratedValue`

    configure the way of increment of the specified column

 7. ###### `@Primary`

    Define which implementation bean primarilu inect

 8. ###### `@Qualifier`

    define which implementation should be excluded

 9. ###### `@Column`

    adding the column the name in the table of a particular MySQL database

 10. ###### `@CreationTimestamp`,`@UpdateTimestamp`

    make it easy to track the timestamp of the creation and last update of an entity

 11. ###### `@Repository`

     The `@Repository` annotation can have a special role when it comes to converting database exceptions to Spring-based unchecked exceptions.

 12. ###### `@RestController`

     create RESTful web service using Spring MVC. Spring RestController takes care of mapping request data to the defined request handler method. Once response body is generated from the handler method, it converts it to JSON or XNL response.

13. ###### `@RequestMapping`

    map web requests onto specific handler classes and handler methods

14. ###### `@Autowired`

    used for automatic dependency injection. Spring framework is built on dependency injection and we inject the class dependencies through spring bean configuration file

15. ###### `@Service`

     defines a service class, such as business basic logic, and call external APIs

16. ###### `@ResponseStatus`

    mark a method or exception class with the status code and reason message that should be returned. It causes Spring boot to respond with the specified HTTP status code whenever the exception is thrown from your controller.

17. ###### `@PathVariable`

    It is used to extract the values from the URI. It is most suitable for the RESTful web service, where the URL contains a path variable. We can define multiple `@PathVariable` in a method.

18. ###### `@Bean`

    It is a method-level annotation. It is an alternative of XML <bean> tag. It tells the method to produce a bean to be managed by Spring Container.

19. ###### `@Value`

    It is used to assign default values to variables and method argumens.

20. ###### `@Configuration`

    It is a class-level annotation. The class annotated with `@Configuration` used by Spring Containers as a source of bean definitions.

    



