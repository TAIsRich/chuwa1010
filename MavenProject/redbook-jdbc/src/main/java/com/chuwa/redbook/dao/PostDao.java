package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.payload.PostDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostDao{
    public Post save(Post post);
    public List<Post> findAll();
    public Optional<Post> findById(long id);
    public void delete(Post post);
}
