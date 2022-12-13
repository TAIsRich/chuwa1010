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
* `@RequestBody`:
* 
### Bean Types
* `@Component`: allows Spring to automatically detect our custom beans
* `@Service`: is a specialization of @Component annotation, @Service are used to write business logic in a different layer
* `@Repository`: is a specialization of @Component annotation, This annotation is a general-purpose stereotype annotation which very close to the DAO pattern where DAO classes are responsible for providing CRUD operations on database tables
* `@Controller`:  indicates that the annotated class is a controller. It is a specialization of @Component and is autodetected through classpath scanning.
* `@RestController`: is a specialized version of the controller. It includes the @Controller and @ResponseBody annotations
* `@Bean`: is applied on a method to specify that it returns a bean to be managed by Spring context
* `@Autowired`:  is to inject the dependancy into a bean

### Testing
* `@SpringBootTest`: can be used as an alternative to the standard spring-test @ContextConfiguration annotation when you need Spring Boot features
* `@Validated`: is a class-level annotation that we can use to tell Spring to validate parameters that are passed into a method of the annotated class

### JPA:
* `@Entity`: An entity represents a table stored in a database. Every instance of an entity represents a row in the table.
* `@ID`: defines the primary key
* `@Table`: define the table name
* `@Column`: to mention the details of a column in the table.
* `@OneToOne`: Defines a single-valued association to another entity that has one-to-one multiplicity
* `@ManyToOne`: a single-valued association to another entity class that has many-to-one multiplicity
* `@ManyToMany`: A relationship is a connection between two types of entities. In the case of a many-to-many relationship, both sides can relate to multiple instances of the other side.
* `@JoinColumn`:allows you to specify the Foreign Key column name. whoever owns the foreign key column gets the @JoinColumn annotation.

### Handle Exception:
* `@ExceptionHandler`: Method Level, used to handle the specific exceptions and sending the custom responses to the client
* `@ControllerAdvice`: Class Level, to handle the exceptions globally

### Validation:
* `@valid`: method level validation. We also use it to mark a member attribute for validation
* `@NotEmpty`
* `@Email`
* `@Size`


### Dependency Injections:
* `@Autowired`: is to inject the dependency into a bean, by type - > by name
* `@Resource`: do dependency injection; by name -> by type
* `@Inject`: do dependency injection
* `@Qualifier`: indicates specific bean should be autowired when there are multiple candidates.
* `@Primary`: indicates that a bean should be given preference when multiple candidates are qualified to autowire a single-valued dependency.

### Testing
* `@Mock`
* `@InjectMock`
* `@Spy`
* `@MockBean`
* `@SpringBootTest`
* `@BeforeAll`
* `@BeforeEach`
* `@Test`
* `@AfterEach`
* `@AfterAll`
