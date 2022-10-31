Annotations

@SpringBootApplication

A single @SpringBootApplication annotation can be used to enable three features including:
@EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
@ComponentScan: enable @Component scan on the package where the application is located
@Configuration: allow to register extra beans in the context or import additional configuration classes

Example
```
@SpringBootApplication
public class RedbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedbookApplication.class, args);
	}

}
```

###### Used by entity
@Entity
The class annotated with @Entity indicats that it is a JPA(Java Persistence API) entity and is mapped to a DB table. (If no @Table  annotation exists, it is assumed that this entity is mapped to a table named after the class.)

@Table
The @Table annotation specifies the table created in DB. For example, the name of the DB, constraints, etc.

Example
```
@Entity
@Table(
    name = "posts",
    uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
```

@Id
The @Id annotation specifies the primary key of an entity. 

@GeneratedValue
@GeneratedValue provides for the specification of generation strategies for the values of primary keys.

Example
```
@Id
@GeneratedValue(
        strategy = GenerationType.IDENTITY
)
```

@Column
@Column annotation is used for Adding the column to a table.

Example
```
@Column(name = "title", nullable = false)
private String title;
```

@CreationTimestamp
store creation time

@UpdateTimestamp
store last update time

Example
```
@CreationTimestamp
private LocalDateTime createDateTime;

@UpdateTimestamp
private LocalDateTime updateDateTime;
```

###### Used by dao

@Repository
The @Repository annotation is used to define a repository.

Example
```
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // no need to add any method/code;
}
```

###### Used by service

@Service
The @Service annotation is used to identity service component.

Example
```
@Service
public class PostServiceImpl implements PostService {
}
```

###### Used by controller
@RestController
Spring RestController annotation is a convenience annotation that is itself annotated with @Controller and @ResponseBody. This annotation is applied to a class to mark it as a request handler. Spring RestController annotation is used to create RESTful web services using Spring MVC.

@RequestMapping
@RequestMapping annotation is for mapping all the incoming HTTP request URLs to the corresponding controller methods.

@Autowired
Autowired allows Spring to resolve and inject collaborating beans into our bean.

@PostMapping
The @PostMapping annotated methods in the @Controller annotated classes handle the HTTP POST requests matched with the given URI expression.

@RequestBody
@RequestBody annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization of the inbound HttpRequest body onto a Java object.

Example
```
@RestController
@RequestMapping("/api/v1")

public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/posts")
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
        PostDto postResponse = postService.createPost(postDto);
        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }
}
```

