package com.example.redbook.service;

import com.example.redbook.payload.PostDto;
import com.example.redbook.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    //PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);
    PostDto updatePost(PostDto postDto, long id);
    void deletePostById(long id);

    List<PostDto> getAllPosts();

    List<PostDto> getAllPostWithJPQL();
}
