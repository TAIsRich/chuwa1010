package com.chuwa.mongoblog.controller;

import com.chuwa.mongoblog.payload.PostDto;
import com.chuwa.mongoblog.service.PostService;
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

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping //Http post -->
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        PostDto postResponse = postService.createPost(postDto);

        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }

}
