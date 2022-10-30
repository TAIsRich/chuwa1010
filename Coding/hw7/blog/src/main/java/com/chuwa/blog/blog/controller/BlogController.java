package com.chuwa.blog.blog.controller;

import com.chuwa.blog.blog.models.Blog;
import com.chuwa.blog.blog.playload.BlogDto;
import com.chuwa.blog.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/blogs")
public class BlogController {
    @Autowired
    private BlogService bs;
    @PostMapping
    public ResponseEntity<BlogDto> createBlog(@RequestBody BlogDto blogDto){
        BlogDto blogResponse =bs.createBlog(blogDto);
        return  new ResponseEntity<>(blogResponse, HttpStatus.CREATED);
    }
    @GetMapping
    public List<Blog> getAll(){
        return bs.getALLBlog();
    }
}
