package com.chuwa.redbook.controller;

import com.chuwa.redbook.dao.JDBCPostRepository;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.payload.PostDto;
import com.chuwa.redbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author b1go
 * @date 8/22/22 7:14 PM
 */
@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    private JDBCPostRepository jdbcPostRepository;

    @PostMapping
    public ResponseEntity<Optional<Post>> createPost(@RequestBody Post post) {
        Optional<Post> postResponse = jdbcPostRepository.insertPost(post);
        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return jdbcPostRepository.getAllPost();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Post>> getPostById(@PathVariable(name = "id") long id) {
        return ResponseEntity.ok(jdbcPostRepository.getPost(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<Post>> updatePostById(@RequestBody Post post, @PathVariable(name = "id") long id) {
        Optional<Post> postResponse = jdbcPostRepository.updatePost(post,id);

        return new ResponseEntity<>(postResponse, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable(name = "id") long id) {
        jdbcPostRepository.deletePost(id);
        return new ResponseEntity<>("Post entity deleted successfully.", HttpStatus.OK);
    }

}
