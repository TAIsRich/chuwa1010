### @Table
declare table
### @Entity
declare class as entity class
### @Id
declare primary key
### @UniqueConstraint
set unique attribute
### @GeneratedValue
strategy for primary key generating
### @Column
declare attribute
### @UpdateTimestamp
set this property as update timestamp of containing entity
### @CreationTimestamp
set property as the creation timestamp of the containing entity
```angular2html
@Entity
@Table(
    name="posts",
        uniqueConstraints ={@UniqueConstraint(columnNames = {"title"})}
        )
public class Post {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private  long id;

    @Column(name =" title",nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "content", nullable = false)
    private String content;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;
}
```
### @Repository
declare dao
```angular2html
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {}
```
### @RestController
declare restful controller
### @RequestMapping
set request url
### @Autowired
inject collaborating beans to this class
### @PostMapping
declare receiving post request
### @GetMapping
declare receiving get request
```angular2html
@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
        PostDto postResponse = postService.createPost(postDto);
        return new ResponseEntity<>(postResponse,
                HttpStatus.CREATED);
    }
    @GetMapping
    public List<Post> getAll(){
        return postService.getAllPost();
    }

}
```
### @Service
```angular2html
public class PostServiceImpl implements PostService {}
```
### @Document
`@Document("blog")`
### @RequestParams
declare params in url

` @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER,required = false)`

### @JsonProperty("col-name")  
set member variable key name in JSON as  col-name;
### @OneToMany
a mapping relationship that one row data in a table can be related with many items from another table

### @ManyToOne
a mapping relationship that one row data in a table can only be related with an item from another table,
but this item can be related with many rows in this table

### @ManyToMany
a mapping relationship that one row data in a table can be related with many items from another table
and this item can also be related with many rows in this table
### @NamedQuery
### @NamedQueries  
defined queries.
```
@NamedQuery(name="queryName", query="query statement")

@NamedQueries({

@NamedQuery(name="queryName", query="query statement"),

@NamedQuery(name="queryName", query="query statement")

...
})
```
### @Query 
can define JPQL or SQL query
` @Query("select p from Post p where p.id = :key or p.title = :title")`
### @Param("status")
`Post getPostByIDOrTitleWithJPQLNamedParameters(@Param("key") Long id, @Param("title") String title);`
### @Transactional

###  @PersistenceContext