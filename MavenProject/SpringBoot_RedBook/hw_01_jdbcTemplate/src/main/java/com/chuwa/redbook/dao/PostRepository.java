package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.*;


public interface PostRepository {
    List<Post> findAll();

    Optional<Post> findById(long id);

    Post save(Post post);

    void delete(long id);

    Post update(Post post);
}
