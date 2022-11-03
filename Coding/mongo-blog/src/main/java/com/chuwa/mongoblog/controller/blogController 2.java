package com.chuwa.mongoblog.controller;

import com.chuwa.mongoblog.Repository.BlogRepository;
import com.chuwa.mongoblog.model.Blog;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/api/blogs/")
public class blogController {
    private BlogRepository blogRepository;

    public blogController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }


    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Blog createBlog(@RequestBody Blog blog) {
        return blogRepository.save(blog);
    }


    @GetMapping("{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable String id) {
        Blog blog = blogRepository.findOne(id);
        if (blog == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.ok(blog);
    }


    @DeleteMapping("{id}")
    public Long deleteBlog(@PathVariable String id) {
        return blogRepository.delete(id);
    }


    @PutMapping("")
    public Blog putBlog(@RequestBody Blog blog) {
        return blogRepository.update(blog);
    }

}
