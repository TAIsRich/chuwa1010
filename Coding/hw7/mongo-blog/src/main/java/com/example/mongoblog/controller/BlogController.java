package com.example.mongoblog.controller;


import com.example.mongoblog.entity.Blog;
import com.example.mongoblog.payload.BlogDto;
import com.example.mongoblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/blogs")//base url
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping
    public ResponseEntity<BlogDto> createBlog(@RequestBody BlogDto blogDto) {
        BlogDto blogResponse = blogService.createBlog(blogDto);
        return new ResponseEntity<>(blogResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public List<BlogDto> getAllPosts(){
        return blogService.getAllPost();
    }

}
