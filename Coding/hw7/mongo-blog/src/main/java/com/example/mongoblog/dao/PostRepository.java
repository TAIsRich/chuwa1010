package com.example.mongoblog.dao;

import com.example.mongoblog.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository <Post, String> {
    // The template <Post, String> means a post and its id
}
