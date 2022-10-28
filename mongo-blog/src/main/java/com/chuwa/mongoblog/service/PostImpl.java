package com.chuwa.mongoblog.service;

import com.chuwa.mongoblog.dao.PostRepository;
import com.chuwa.mongoblog.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostImpl {
    @Autowired
    PostRepository postRepository;
    public Post createPost(Post post){
        Post post1 = new Post();
        post1.setTitle(post.getTitle());
        post1.setDescription(post.getDescription());
        post1.setContent(post.getContent());

        return postRepository.save(post1);
    }
}
