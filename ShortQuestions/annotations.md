# Annotations
## Entity
- `@Entity` defines a POJO model class as database mapping
- `@Table` defines SQL table design parameters
- `@UniqueConstraint` adds `UNIQUE` constraint to a column
- `@Id` defines `PRIMARY KEY` constraint to a column
- `@GenerateValue` defines incrementing rule for a primary key
- `@Column` defines a column's parameter
- `@CreateTimestamp` injects a current time to the field when created
- `@UpdateTimestamp` injects a current time to the field when updated
- `@ManyToOne`
- `@OneToMany`
- `@ManyToMany`
- `@JoinColumn` maps a POJO entity with a related database entity by specifying a foreign key name and nullable
- `@NamedQuery` defines a name for a JPQL query in an entity class
- `@NamedQueries` groups multiple named queries together in an entity class
- `@Valid` defines the DTO to be validated

## Controller
- `@RestController` defines a contoller class as the REST API controller layer to handle requests
- `@RequestMapping` defines the starting path variable
- `@Autowired` injects a service layer implementation
- `@PostMapping` defines a POST method
- `@GetMapping` defines a GET method with path variable
- `@PutMapping` defines a PUT method with path variable
- `@DeleteMapping` defines a DELETE method with path variable
- `@PathVariable` maps field names in path variable with a Java field
- `@RequestBody` defines a request body source from DTO
- `@JsonProperty` maps Json field names with a Java field
- `@JsonPropertyOrder` defines the Json field names' order

## DAO
- `@Repository` defines an interface as the DAO type
- `@Query` maps a Java abstract method with a JPQL/SQL query
- `@Transactional` defines a series of operations in a method as atomic.

## Service
- `@Service` defines a class as the service layer implementation

## Other
- `@ResponseStatus` defines a class with a returned http response status
- `@Configuration` defines a Java class as the configuration file for the IOC container
- `@EnableAutoConfiguration` enables classpath definitions for bean scan
- `@Bean` is used on method level and tells the IOC container to put the dependency as a component for the framework
- `@Component` is used on class level and tells the IOC container to put the dependency as a component for the framework
- `@ControllerAdvice` can define an exception handler to return certain behavior to the controller level
- `@ExceptionHandler` defines a method to handle a specific exception belong to a exception class
- `@NotEmpty` defines a field with validation constraint to be not empty
- `@Email` defines a field with validation constraint to adhere to email format
- `@Size` defines a field with validation constraint to certain min and max sizes
- `@ComponentScan` defines a specified path for Spring to search for components to put into IOC container.
- `@Resource` inejcts a bean by name then by type
- `@Inject` is the Java standard version of Spring `@Autowired`
- `@Primary` decorates a bean to let IOC container know the primary bean to choose
- `@Qualifier` defines a name to let the IOC container use the bean with specfied name


