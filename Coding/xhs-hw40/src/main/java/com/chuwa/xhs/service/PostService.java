package com.chuwa.xhs.service;

import com.chuwa.xhs.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    List<PostDto> getAllPost();

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto,long id);

    void deletePostById(long id);
}
