package com.chuwa.redbook.service;

import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.payload.PostDto;
import com.chuwa.redbook.payload.PostResponse;

import java.util.List;

public interface PostService {
    //declare method, and implement later
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();

    /** getAllPosts method by using paging:
     * paging (分页)
     * @param  int pageNo, int pageSize, String sortBy, String sortDir
     * @return  PostResponse
     */
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);


    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}

