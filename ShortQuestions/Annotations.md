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

@JsonProperty
@JsonProperty(name) tells Jackson ObjectMapper to map the JSON property name to the annotated Java field's name.
@JsonProperty can also be used in payload package(DTO). 

Example
```
@JsonProperty("name")
    private String name;
```

@ManyToOne
@ManyToOne annotation allows you to map a Foreign Key column. 

@JoinColumn
The @JoinColumn annotation allows you to specify the Foreign Key column name. 

Example
```
@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;
```

@NamedQuery
We can use @NamedQuery annotation to specify a named query within an entity class and then declare that method in repository.
@NamedQueries
We can use @NamedQuery annotation to specify multiple queries within an entity class and then declare the methods in repository.

```
@Entity
@NamedQueries({
	@NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title = :title"),
 	@NamedQuery(name = "Book.findByPublishingDate", query = "SELECT b FROM Book b WHERE b.publishingDate = :publishingDate")
})
public class Book implements Serializable {
...
}
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

@Query
This annotation is used to execute both JPQL and native SQL queries.
```
@Query("select p from Post p where p.id = ?1 or p.title = ?2")
Post getPostByIdOrTitleJPQLIndexParameters(Long id, String title);
```

@Transactional
We can use @Transactional to wrap a method in a database transaction. It allows us to set propagation, isolation, timeout, read-only, and rollback conditions for our transaction.

@PersistenceContext
The @PersistenceContext annotation in your code is being used to indicate that the EntityManager must be automatically injected, in other words its lifecycle will be managed by the container running your application 
```
@Transactional
public class PostJPQLRepositoryImpl implements PostJPQLRepository {
	@PersistenceContext
    	EntityManager entityManager;
	...
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
@GetMapping
The @GetMapping annotated methods in the @Controller annotated classes handle the HTTP GET requests matched with the given URI expression.

@PutMapping
The @PutMapping annotated methods in the @Controller annotated classes handle the HTTP PUT requests matched with the given URI expression.

@DeleteMapping
The @DeleteMapping annotated methods in the @Controller annotated classes handle the HTTP DELETE requests matched with the given URI expression.

@PathVariable
The @PathVariable annotation can be used to handle template variables in the request URI mapping.

@RequestParam
We can use @RequestParam to extract query parameters, form parameters, and even files from the request.
```
@GetMapping("/jpql-named/{id}")
public ResponseEntity<PostDto> getPostByIdOrTitleJPQLNamed(@PathVariable(name = "id") long id,
                                                           @RequestParam(value = "title", required = false) String title) {
    return ResponseEntity.ok(postService.getPostByIdJPQLNamedParameter(id, title));
}
```
