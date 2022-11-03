package com.example.mongoblog.service;

import com.example.mongoblog.payload.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPost();
}
