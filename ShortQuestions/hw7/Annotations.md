`@Override`  : overides a method from a abstract class or from an interface

`@Test`  : forms the core of test case

### Springboot 

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

##### Service
`@Service`  : defines a service class, such as business basic logic, and call external APIs









