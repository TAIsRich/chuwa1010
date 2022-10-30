package com.chuwa.rebook.controller;

import com.chuwa.rebook.entity.Post;
import com.chuwa.rebook.payload.PostDto;
import com.chuwa.rebook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<PostDto> getAll(){
        return postService.getAllPost();
    }
    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable(name ="id") long id){
        return ResponseEntity.ok(postService.getPostById(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePostById(@RequestBody PostDto postDto,@PathVariable(name ="id") long id){
        PostDto postRes = postService.updatePost(postDto,id);
        return  new ResponseEntity<>(postRes,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable(name ="id") long id){
        postService.deletePostById(id);
        return new ResponseEntity<>("Post deleted",HttpStatus.OK);
    }

}
