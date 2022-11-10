package com.example.mongoblog.service.impl;

import com.example.mongoblog.dao.PostRepository;
import com.example.mongoblog.entity.Post;
import com.example.mongoblog.payload.PostDto;
import com.example.mongoblog.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post savedPost = postRepository.save(post);

        PostDto postResponse = new PostDto();
        postResponse.setId(savedPost.getId());
        postResponse.setContent(savedPost.getContent());
        postResponse.setDescription(savedPost.getDescription());
        postResponse.setTitle(savedPost.getTitle());

        return postResponse;
    }

    @Override
    public List<PostDto> getAllPost() {
        return null;
    }
}
