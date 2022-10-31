package com.chuwa.mongoblog.dao;

import com.chuwa.mongoblog.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface PostRepository extends MongoRepository<Post,Long>{
    // no need to add any method/code;
}