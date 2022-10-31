package com.chuwa.mongoblog.service;

import com.chuwa.mongoblog.payLoad.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
