SpringBoot Annotations

### Basic Setup
* `@SpringBootApplication`: is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan with their default attributes
* `@Configuration`: allow to register extra beans in the context or import additional configuration classes
* `@ComponentScan`: enable @Component scan on the package where the application is located
* `@EnableAutoConfiguration`: enable Spring Boot’s auto-configuration mechanism

### Request Responses
* `@GetMapping`: annotation maps HTTP GET requests onto specific handler methods. It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).
* `@RequestMapping`:  is used to map HTTP requests to handler methods of MVC and REST controllers
* `@RequestParam`: allows you to send parameters in the get request and use them in Java. It also supplies a default value.

### Component Types
* `@Component`: allows Spring to automatically detect our custom beans
* `@Service`: is a specialization of @Component annotation, @Service are used to write business logic in a different layer
* `@Repository`: is a specialization of @Component annotation, This annotation is a general-purpose stereotype annotation which very close to the DAO pattern where DAO classes are responsible for providing CRUD operations on database tables
* `@Controller`:  indicates that the annotated class is a controller. It is a specialization of @Component and is autodetected through classpath scanning.
* `@RestController`: is a specialized version of the controller. It includes the @Controller and @ResponseBody annotations

### Testing
* `@SpringBootTest`: can be used as an alternative to the standard spring-test @ContextConfiguration annotation when you need Spring Boot features
* `@Validated`: is a class-level annotation that we can use to tell Spring to validate parameters that are passed into a method of the annotated class

### Misc
* `@Bean`: is applied on a method to specify that it returns a bean to be managed by Spring context
* `@Autowired`:  is to inject the dependancy into a bean

JPA:
* `@Entity`: An entity represents a table stored in a database. Every instance of an entity represents a row in the table.
* `@ID`: defines the primary key
* `@Table`: define the table name
* `@Column`: to mention the details of a column in the table.
* `@ManyToOne`: allows you to map a Foreign Key column
* `@JoinColumn`:allows you to specify the Foreign Key column name.