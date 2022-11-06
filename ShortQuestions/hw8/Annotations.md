`@Override`  : overides a method from a abstract class or from an interface

`@Test`  : forms the core of test case

### Springboot 
`@SpringBootApplication`: a collection including following annotations:

- `@EnableAutoConfiguration`: enable Spring Boot’s auto-configuration mechanism

- `@ComponentScan`: enable `@Component` scan on the package where the application is located (see the best practices)

- `@Configuration`: allow to register extra beans in the context or import additional configuration classes

##### Entity
`@Entity` :  the class is an entity and is mapped to a database table

`@Table`: specify the details of the table that will be used to persist the entity in the database

`@UniqueConstraint`: ensure that all values in a column are different.

`@id`: indicating the member field below is the primary key of the current entity.

`@GeneratedValue`: configure the way of increment of the specified column, for example:
```
@GeneratedValue(strategy = GenerationType.IDENTITY)
//specify auto_increment
```
`@Column`: adding the column the name in the table of a particular MySQL database

`@CreationTimestamp`, `@UpdateTimestamp`: make it easy to track the timestamp of the creation and last update of an entity. used in Hibernate.

##### controller
`@RestController`: create RESTful web services using Spring MVC. Spring RestController takes care of mapping request data to the defined request handler method. Once response body is generated from the handler method, it converts it to JSON or XML response.

`@RequestMapping`: map web requests onto specific handler classes and/or handler methods. (used to map the HTTP request)

`@Autowired`: used for automatic dependency injection. Spring framework is built on dependency injection and we inject the class dependencies through spring bean configuration file.

`@PostMapping`  `@GetMapping`  `@PutMapping`  `@DeleteMapping`  ： map the HTTP request per POST, GET, PUT, DELETE

`@RequestBody`  maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization of the inbound HttpRequest body onto a Java object

`@PathVariable` can be used to handle template variables in the request URI mapping, and set them as method parameters.

##### Service
`@Service`  : defines a service class, such as business basic logic, and call external APIs

##### Exception
`@ResponseStatus`: mark a method or exception class with the status code and reason message that should be returned. It causes Spring boot to respond with the specified HTTP status code whenever the exception is thrown from your controller.









