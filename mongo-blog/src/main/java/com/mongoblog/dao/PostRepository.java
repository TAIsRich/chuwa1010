package com.mongoblog.dao;

import com.mongoblog.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, Long> {
}
