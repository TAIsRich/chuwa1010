package com.chuwa.rebook.service;

import com.chuwa.rebook.entity.Post;
import com.chuwa.rebook.payload.PostDto;
import com.chuwa.rebook.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
   PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(long id);
    PostDto updatePost(PostDto postDto,long id);
    void  deletePostById(long id);
}
