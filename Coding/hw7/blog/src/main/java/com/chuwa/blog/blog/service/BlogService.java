package com.chuwa.blog.blog.service;

import com.chuwa.blog.blog.models.Blog;
import com.chuwa.blog.blog.playload.BlogDto;

import java.util.List;

public interface BlogService {
    BlogDto createBlog(BlogDto blogDto);
    List<Blog> getALLBlog();
}
