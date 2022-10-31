package com.chuwa.redbook.service;

import com.chuwa.redbook.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    //Get all post as list
    List<PostDto> getAllPost();

    //update a post by id
    PostDto updatePost(PostDto postDto, long id);

    //delete a post by id
    void deletePostById(long id);

    PostDto getPostById(long id);
}
