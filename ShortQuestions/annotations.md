@Required: It applies to the bean setter method. It indicates that the annotated bean must be populated at configuration time with the required property, 
else it throws an exception Bean InitilizationException.

@Autowired: Spring provides annotation-based auto-wiring by providing @Autowired annotation. It is used to autowire spring bean on setter methods, instance variable, and constructor. When we use @Autowired annotation, the spring container auto-wires the bean by matching data-type.

@Configuration: It is a class-level annotation. The class annotated with @Configuration used by Spring Containers as a source of bean definitions.

@ComponentScan: It is used when we want to scan a package for beans. It is used with the annotation @Configuration. We can also specify the base packages to scan for Spring Components.

@Bean: It is a method-level annotation. It is an alternative of XML <bean> tag. It tells the method to produce a bean to be managed by Spring Container.

@Component: It is a class-level annotation. It is used to **mark a Java class as a bean**. A Java class annotated with @Component is found during the classpath. 
The Spring Framework pick it up and configure it in the application context as a Spring Bean.

@Controller: The @Controller is a class-level annotation. It is a specialization of @Component. It marks a class as a web request handler. It is often used to serve web pages. By default, it returns a string that indicates which route to redirect. It is mostly used with @RequestMapping annotation.

@Service: It is also used at class level. It tells the Spring that class contains the business logic.
public class PostServiceImpl  implements PostService {
@Autowired
private PostRepository postRepository;
}

@SpringBootApplication anotation is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning.
@SpringBootApplication
public class RedbookApplication {
}

@ENTITY: The entities are the persistence objects stores as a record in the database.
@Id primary key of the entity
@GenerateValue the generation strategies for the value of primary key
@Column use to mapping the enity attribute and the database table column
@Table is a table in database

@Entity
@Table(
//specify the table name to be "posts"
name = "posts",
uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)

@Document is an annotation provided by Spring data project. 
It is used to identify a domain object, which is persisted to MongoDB. So you can use it to map a Java class into a collection inside MongoDB.

@Repository: It is a class-level annotation. The repository is a DAOs (Data Access Object) that access the database directly. 
The repository does all the operations related to the database.

@GetMapping: It maps the HTTP GET requests on the specific handler method. It is used to create a web service endpoint that fetches.
It is used instead of using: @RequestMapping(method = RequestMethod.GET)

@PostMapping: It maps the HTTP POST requests on the specific handler method. It is used to create a web service endpoint that creates.
It is used instead of using: @RequestMapping(method = RequestMethod.POST)

@PutMapping: It maps the HTTP PUT requests on the specific handler method. It is used to create a web service endpoint that creates or updates.
It is used instead of using: @RequestMapping(method = RequestMethod.PUT)

@DeleteMapping: It maps the HTTP DELETE requests on the specific handler method. It is used to create a web service endpoint that deletes a resource. 
It is used instead of using: @RequestMapping(method = RequestMethod.DELETE)

@PatchMapping: It maps the HTTP PATCH requests on the specific handler method. It is used instead of using: @RequestMapping(method = RequestMethod.PATCH)

@RequestBody: It is used to bind HTTP request with an object in a method parameter. Internally it uses HTTP MessageConverters to convert the body of the request. 
When we annotate a method parameter with @RequestBody, the Spring framework binds the incoming HTTP request body to that parameter.

@ResponseBody: It binds the method return value to the response body. It tells the Spring Boot Framework to serialize a return an object into JSON and XML format.

@PathVariable: It is used to extract the values from the URI. It is most suitable for the RESTful web service, where the URL contains a path variable. 
We can define multiple @PathVariable in a method.
@PutMapping("/{id}")
public ResponseEntity<PostDto> updatePostById(@RequestBody PostDto postDto, @PathVariable(name="id") long id){
PostDto postResponse= postService.updatePost(postDto, id);
return new ResponseEntity<>(postResponse, HttpStatus.OK);
}

@RequestParam: It is used to extract the query parameters form the URL. It is also known as a query parameter. It is most suitable for web applications. 
It can specify default values if the query parameter is not present in the URL.

@RequestHeader: It is used to get the details about the HTTP request headers. We use this annotation as a method parameter. 
The optional elements of the annotation are name, required, value, defaultValue. For each detail in the header, we should specify separate annotations. 
We can use it multiple time in a method

@RestController: It can be considered as a combination of @Controller and @ResponseBody annotations. 
The @RestController annotation is itself annotated with the @ResponseBody annotation. It eliminates the need for annotating each method with @ResponseBody.

@RequestAttribute: It binds a method parameter to request attribute. It provides convenient access to the request attributes from a controller method. 
With the help of @RequestAttribute annotation, we can access objects that are populated on the server-side.

@JsonProperty: customize the property name in Json.

@JsonPropertyOrder: customize the order of properties in Json file.

@ManytoOne: the relationship between two tables is many to one.

@Query: this annotation can only be used to annotate repository interface methods. The call of the annotated methods will trigger the execution of
the statement found in it. This annotation supports both native SQL and JPQL.

@Transactional: is the metadata that specifies the semantics of the transactions on a method.Transactional annotation provides the application the ability
to declaratively control transaction boundaries on CDI managed beans, as well as classes defined as managed beans by the Java EE specification, at both the 
class and method level where method level annotations override those at the class level.

@SpringBootApplication: it is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and 
component scanning. It’s same as declaring a class with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations.

@EnableTransactionManagement：enables Spring's annotation-driven transaction management capability. It is not required.  
It is optional in Spring boot, provided that spring-data* or spring-tx are found in classpath.

@bean:  is a method-level annotation and a direct analog of the XML <bean/> element. The annotation supports most of the attributes offered by <bean/>, 
such as: init-method , destroy-method , autowiring , lazy-init , dependency-check , depends-on and scope.
It is used to mark a method as one that creates a bean and Spring will then add it to the context for us. The return type of the method defines the type of bean that is created.

@Configuration: indicates that the class has @Bean definition methods. So Spring container can process the class and generate 
Spring Beans to be used in the application. This annotation is part of the spring core framework.

@Qualifier: There may be a situation when you create more than one bean of the same type and want to wire only one of them with a property. 
In such cases, you can use the @Qualifier annotation along with @Autowired to remove the confusion by specifying which exact bean will be wired. 
Basically, it could help identify which bean we want to use.

@PreAuthorize @PostAuthorize: both @PreAuthorize and @PostAuthorize annotations provide expression-based access control.
The @PreAuthorize annotation checks the given expression before entering the method, whereas the 
@PostAuthorize annotation verifies it after the execution of the method and could alter the result.
@PreAuthorize(“hasRole(‘ROLE_VIEWER')”) 

@HystrixCommand(fallbackMethod = "handleCitizenDownTime"): when failed, then call handleCitizenDownTime method to handle in microservice.

@Aspect: indicate this is an AOP class.

