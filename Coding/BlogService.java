package com.chuwa.mongoblog.service;

import com.chuwa.mongoblog.payload.BlogDto;
import org.springframework.context.annotation.Bean;
public interface BlogService {

    BlogDto createBlog(BlogDto blogDto);
}
