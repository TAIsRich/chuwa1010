package com.chuwa.mongo_blog.dao;

import com.chuwa.mongo_blog.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Post, String> {

}
