package com.example.mongoblog.service.impl;

import com.example.mongoblog.dao.BlogRepository;
import com.example.mongoblog.entity.Blog;
import com.example.mongoblog.payload.BlogDto;
import com.example.mongoblog.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogServiceImpl implements BlogService {
    private BlogRepository blogRespository;

    public BlogServiceImpl(BlogRepository blogRepository){
        this.blogRespository = blogRepository;
    }

    @Override
    public BlogDto createBlog(BlogDto blogDto) {
        Blog b = mapToEntity(blogDto);

        Blog savedBlog = blogRespository.save(b);

        BlogDto bdtResponse = mapToDto(savedBlog);
        return bdtResponse;
    }

    @Override
    public List<BlogDto> getAllPost() {
        List<Blog> blogs = blogRespository.findAll();
        List<BlogDto> blogDtos = blogs.stream().map(
                        blog -> mapToDto(blog))
                .collect(Collectors.toList());
        return  blogDtos;
    }

    public Blog mapToEntity(BlogDto blogDto){
        Blog b = new Blog();
        b.setTitle(blogDto.getTitle());
        b.setContent(blogDto.getContent());
        b.setDescription(blogDto.getDescription());
        return b;
    }

    public BlogDto mapToDto(Blog blog){
        BlogDto blogDto = new BlogDto();
        blogDto.setContent(blog.getContent());
        blogDto.setTitle(blog.getTitle());
        blogDto.setDescription(blog.getDescription());
        return blogDto;
    }
}
