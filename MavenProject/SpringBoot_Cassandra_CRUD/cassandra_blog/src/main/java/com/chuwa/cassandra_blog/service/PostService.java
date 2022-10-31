package com.chuwa.cassandra_blog.service;

import com.chuwa.cassandra_blog.payload.PostDto;

import java.util.List;
import java.util.UUID;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPost();

    PostDto getPostById(UUID id);

    PostDto updatePost(PostDto postDto, UUID id);

    void deletePostById(UUID id);
}