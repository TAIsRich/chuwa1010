package com.mongoblog.controller;

import com.mongoblog.entity.Post;
import com.mongoblog.service.PostImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping("/api/v1/post")
public class PostController {

    @Autowired
    PostImpl postImpl;
    public Post createPost(@RequestBody Post post){

        return postImpl.createPost(post);


    }

}
