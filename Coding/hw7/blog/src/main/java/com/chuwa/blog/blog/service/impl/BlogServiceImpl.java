package com.chuwa.blog.blog.service.impl;

import com.chuwa.blog.blog.dao.BlogRepository;
import com.chuwa.blog.blog.models.Blog;
import com.chuwa.blog.blog.playload.BlogDto;
import com.chuwa.blog.blog.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    private  BlogRepository blogRepo;
    public BlogServiceImpl(BlogRepository blogRepo){
        this.blogRepo=blogRepo;
    }
    @Override
    public BlogDto createBlog(BlogDto blogDto) {
        Blog blog = new Blog();
        blog.setTitle(blogDto.getTitle());
        blog.setContent(blogDto.getContent());

        Blog newBlog = blogRepo.save(blog);
        BlogDto blogResponse = new BlogDto(newBlog.getTitle(),newBlog.getContent());
        return blogResponse;
    }

    @Override
    public List<Blog> getALLBlog() {
        return blogRepo.findAll();
    }
}
