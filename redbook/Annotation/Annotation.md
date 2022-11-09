1. @Table is a table in database
2. @Entity specifies the class is an entity
3. @Id primary key of the entity
4. @GenerateValue the generation strategies for the value of primary key
5. @Column use to mapping the enity attribute and the database table column
6. @Repository specifies that interface is a repository
7. @Autowired injects object dependently implicitly
8. @Component denote a class as a component
9. @RequestMapping use to map web request onto specific handler class
   @Autowired
   private PostService postService;
10. @GetMapping handle the HTTP Get request
    @GetMapping
    public List<PostDto> getAllPosts() {
    return postService.getAllPost();
    }
11. @PostMapping handle the HTTP post request
    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
    PostDto postResponse = postService.createPost(postDto);
    return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }
12. @DeleteMapping
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable(name = "id") long id) {
    postService.deletePostById(id);
    return new ResponseEntity<>("Delete Successfully", HttpStatus.OK);
    }
13. @PutMapping
    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePostById(@RequestBody PostDto postDto, @PathVariable(name = "id") long id) {
    PostDto postDto1 = postService.updatePost(postDto, id);
    return new ResponseEntity<>(postDto1, HttpStatus.OK);
    }
14. @Requestbody
15. @Pathvariable
16. @Data lambda injection to create setter and getter
17. @Setter, create setter for class
18. @Getter create getter for class
19. @Transactional The @Transactional annotation is metadata that specifies that an interface, class, or method must have transactional semantics;
20. @TransactionalManagement
21. @Component the class is a component, need to scan 
22. @ControllerService use for global exception
23. @ExceptionHandler  to map the exception class
24. @NotNull validate not null
25. @min()  not less than
26. @Max()  not greater than
27. @valid the request param to valid 
28. @Bean  tells the spring to add this to IOC
29. @Configuration tells that there is something in this class need to scan and add to IOC