package com.chuwa.blog.blog.dao;

import com.chuwa.blog.blog.models.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends MongoRepository<Blog,String> {
}
