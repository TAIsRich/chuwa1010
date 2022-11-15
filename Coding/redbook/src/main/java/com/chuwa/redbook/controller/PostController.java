package com.chuwa.redbook.controller;

import com.chuwa.redbook.payload.PostDto;
import com.chuwa.redbook.payload.PostResponse;
import com.chuwa.redbook.service.PostService;
import com.chuwa.redbook.util.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


//@RestController declares that this class is a restcontroller
//@RequestMapping defines the base url, so here we always start our API with /api/v1/posts...
@RestController
@RequestMapping("/api/v1/posts") //very important
public class PostController {

    //autowired annotation will make it unnecessary to initialize postService, it will be done automatically
    @Autowired
    private PostService postService;

    // the return of all the following method will directly to POSTMAN
    @PostMapping // Http POST -->
    public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto postDto) {
        PostDto postResponse = postService.createPost(postDto);
        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }

    /* Replace this by paging getAllPosts()

    @GetMapping // GET --> // if no id, GET will return all entities
    public List<PostDto> getAllPosts() {
        // in normal cases, we don't just return the result of content we need
        // instead, we will return a ResponseEntity object as an encapsulation
        // ResponseEntity will add some extra information besides the data from database, like httpStatus
        return postService.getAllPosts();
    }

     */
    @GetMapping()
    public PostResponse getAllPosts(
            @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam(value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
            @RequestParam(value = "sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIR, required = false) String sortDir
    ) {
        // for example, we can have an url like:
        // GET /api/v1/posts?pageNo=0&pageSize=10&sortBy=id&sortDir=desc
        // note that: everything behind "?" is Request Parameter
        // if we do not specify these parameters,like  GET /api/v1/posts, then our predefined Default parameters will be used

        // required = false means this request parameter is optional for an url request
        return postService.getAllPosts(pageNo, pageSize, sortBy, sortDir);
    }

    @GetMapping("/{id}") //{id} is a path variable, it goes like GET /api/v1/posts/2   , here id=2,
    public ResponseEntity<PostDto> getPostById(@PathVariable(name = "id") long id) {
        // this ResponseEntity.ok() is a static method
        return ResponseEntity.ok(postService.getPostById(id));  // another format like return format in next method
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePostById(@Valid @RequestBody PostDto postDto, @PathVariable(name = "id") long id) {
        PostDto postResponse = postService.updatePost(postDto, id);
        // this is returned by ResponseEntity Constructor
        return new ResponseEntity<>(postResponse, HttpStatus.OK); // similar format of previous method return
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable(name = "id") long id) {
        // we use String here because we don't have to return postResponse when using DELETE
        //so we can just return a ResponseEntity with a notice String
        postService.deletePostById(id);
        return new ResponseEntity<>("Post entity deleted successfully.", HttpStatus.OK);
    }

}
