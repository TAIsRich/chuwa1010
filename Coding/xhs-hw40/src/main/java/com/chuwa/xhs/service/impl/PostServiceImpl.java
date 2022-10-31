package com.chuwa.xhs.service.impl;

import com.chuwa.xhs.dao.PostRepository;
import com.chuwa.xhs.entity.Post;
import com.chuwa.xhs.exception.ResourceNotFoundException;
import com.chuwa.xhs.payload.PostDto;
import com.chuwa.xhs.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
@Override
public PostDto createPost(PostDto postDto){
    //convert Dto to Entity
    Post post = mapToEntity(postDto);

    //save post to database
    Post newPost=postRepository.save(post);

    //convert entity to Dto
    PostDto postResponse = mapToDTO(newPost);

    return postResponse;
}
@Override
    public List<PostDto> getAllPost() {
        List<Post> posts=postRepository.findAll();
        List<PostDto> postDtos=posts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());
        return postDtos;
    }

    @Override
    public PostDto getPostById(long id){
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));

        return mapToDTO(post);
    }

    @Override
    public PostDto updatePost(PostDto postDto, long id) {
        //  Question, why do we need to find it out firstly?
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post updatePost = postRepository.save(post);
        return mapToDTO(updatePost);
    }

    @Override
    public void deletePostById(long id) {
        //  Question, why do we need to find it out firstly?
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        postRepository.delete(post);
    }


    private PostDto mapToDTO(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setDescription(post.getDescription());
        postDto.setContent(post.getContent());

        return postDto;
    }

    private Post mapToEntity(PostDto postDto){
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        return post;
    }
}
