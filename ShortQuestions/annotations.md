# Annotations

- **1. `@SpringBootApplication`**
  - `@SpringBootApplication` annotation can be used to enable the three features, `@EnableAutoConfiguration`, `@ComponentScan`, and `@Configuration`.
    - `@EnableAutoConfiguration`: Spring Boot auto-configuration attempts to automatically configure your Spring application based on the jar dependencies that you have added.
    - `@ComponentScan`: enable `@Component` scan on the package where the application is located
    - `@Configuration`: allow to register extra beans in the context or import additional configuration classes
```
    @SpringBootApplication
    public class RedbookApplication {
        public static void main(String[] args) {
            SpringApplication.run(RedbookApplication.class, args);
        }
    }
```

- **2. `@RestController`**  
This annotation is applied to a class to mark it as a request handler. Spring RestController annotation is used to create RESTful web services using Spring MVC.

- **3. `@RequestMapping`**  
One of the most important annotations in spring is the @RequestMapping Annotation which is used to map HTTP requests to handler methods of MVC and REST controllers.

- **4. `@Autowired`**
We can use `@Autowired` annotation on properties to get rid of the setter methods. When we will pass values of autowired properties using <property>, Spring will automatically assign those properties with the passed values or references.

- **5. `@PostMapping`**  
Annotation for mapping HTTP POST requests onto specific handler methods.

- **6. `@GetMapping`**  
Annotation for mapping HTTP GET requests onto specific handler methods.

- **7. `@PutMapping`**  
Annotation for mapping HTTP PUT requests onto specific handler methods.

- **8. `@DeleteMapping`**  
Annotation for mapping HTTP DELETE requests onto specific handler methods.

```
    @RestController
    @RequestMapping("/api/v1/posts")
    public class PostController {
    
        @Autowired
        private PostService postService;
    
        @PostMapping
        public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
            return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
        }
    
        @GetMapping
        public List<PostDto> getAllPosts() {
            return postService.getAllPost();
        }
    
        @GetMapping("/{id}")
        public ResponseEntity<PostDto> getPostById(@PathVariable(name = "id") long id) {
            return ResponseEntity.ok(postService.getPostById(id));
        }
    
        @PutMapping("/{id}")
        public ResponseEntity<PostDto> updatePostById(@RequestBody PostDto postDto, @PathVariable(name = "id") long id) {
            PostDto postResponse = postService.updatePost(postDto, id);
            return new ResponseEntity<>(postResponse, HttpStatus.OK);
        }
    
        @DeleteMapping("/{id}")
        public ResponseEntity<String> deletePost(@PathVariable(name = "id") long id) {
            postService.deletePostById(id);
            return new ResponseEntity<>("Post entity deleted successfully.", HttpStatus.OK);
        }
    }
```

- **9. `@Service`**  
The "Service" make the PostService as a Bean.

```
    @Service
    public class PostServiceImpl implements PostService {
    }
```

- **10. `@Repository`**  
The `@Repository` Annotation is a specialization of @Component annotation which is used to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects.

```
    @Repository
    public interface PostRepository extends JpaRepository<Post, Long> {
        // We do not need to do anything.
    }
```

- **11. `@Entity`**  
The `@Entity` annotation specifies that the class is an entity and is mapped to a database table.

- **12. `@Table`**  
The `@Table` annotation specifies the name of the database table to be used for mapping.

- **13. `@Id`**  
The `@Id` annotation specifies the primary key of an entity

- **14. `@Column`**  
The `@Column` annotation is used for Adding the column the name in the table of a particular MySQL database.

- **15. `@CreationTimestamp`**  
Marks a property as the creation timestamp of the containing entity

- **16. `@UpdateTimestamp`**  
Marks a property as the update timestamp of the containing entity.

```
    @Entity
    @Table(
            name = "posts",
            uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
    )
    public class Post {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    
        @Column(name = "title", nullable = false)
        private String title;
    
        @Column(name = "description", nullable = false)
        private String description;
    
        @Column(name = "content", nullable = false)
        private String content;
    
        @CreationTimestamp
        private LocalDateTime createDateTime;
    
        @UpdateTimestamp
        private LocalDateTime updateDateTime;
    
        public Post() {
        }
        
        ...
        
    }
```