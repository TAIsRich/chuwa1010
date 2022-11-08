package com.chuwa.mongoblog.service.Impl;

import com.chuwa.mongoblog.dao.BlogRepository;
import com.chuwa.mongoblog.entity.Blog;
import com.chuwa.mongoblog.payload.BlogDto;
import com.chuwa.mongoblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public BlogDto createBlog(BlogDto blogDto) {
        Blog blog = new Blog();
        blog.setId(blogDto.getId());
        blog.setTitle(blogDto.getTitle());
        blog.setContent(blogDto.getContent());
        Blog savedBlog = blogRepository.save(blog);
        BlogDto blogResponse = new BlogDto();
        blogResponse.setId(savedBlog.getId());
        blogResponse.setTitle(savedBlog.getTitle());
        blogResponse.setContent(savedBlog.getContent());
        return blogResponse;
    }
}
