package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.payLoad.PostDto;
import com.chuwa.redbook.payLoad.PostResponse;
import com.chuwa.redbook.service.PostService;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    /**
     * use this modelMapper to replace the mapToDto, mapToEntity methods.
     */
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PostDto createPost(PostDto postDto) {
        // 把payload转换成entity，这样才能dao去把该数据存到数据库中。
//        Post post = new Post();
//        if (postDto.getTitle() != null) {
//            post.setTitle(postDto.getTitle());
//        } else {
//            post.setTitle("");
//        }
//        post.setDescription(postDto.getDescription());
//        post.setContent(postDto.getContent());
        // 此时已成功把request body的信息传递给entity

        //covert DTO to Entity
        // use modelMapper to replace mapToEntity
        //Post post = mapToEntity(postDto);
        Post post = modelMapper.map(postDto, Post.class);

        // 调用Dao的save 方法，将entity的数据存储到数据库MySQL
        // save()会返回存储在数据库中的数据
        Post savedPost = postRepository.save(post);

        // 将save() 返回的数据转换成controller/前端 需要的数据，然后return给controller
//        PostDto postResponse = new PostDto();
//        postResponse.setId(savedPost.getId());
//        postResponse.setTitle(savedPost.getTitle());
//        postResponse.setDescription(savedPost.getDescription());
//        postResponse.setContent(savedPost.getContent());

        //PostDto postResponse = mapToDTO(savedPost);
        //return postResponse;
        return modelMapper.map(savedPost, PostDto.class);
    }

    @Override
    public List<PostDto> getAllPost() {
        List<Post> posts = postRepository.findAll();
        //replace mapToDto with modelMapper
        //List<PostDto> postDtos = posts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());
        List<PostDto> postDtos = posts.stream().map(post -> modelMapper.map(post, PostDto.class)).collect(Collectors.toList());

        return postDtos;
    }

    @Override
    public PostDto getPostById(long id){
        Post post= postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        //replace mapToDto with modelMapper
        return modelMapper.map(post, PostDto.class);
        //return mapToDTO(post);
    }

    @Override
    public PostDto updatePost(PostDto postDto, long id){
        Post post= postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post","id", id));
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post updatePost= postRepository.save(post);
        //replace mapToDto with modelMapper
        return modelMapper.map(updatePost, PostDto.class);
        //return mapToDTO(updatePost);
    }

    @Override
    public void deletePostById(long id){
        Post post= postRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Post", "id",id));
        postRepository.delete(post);
    }
    
    //分页
    public PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort= sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() 
                : Sort.by(sortBy).descending();
        //create pageable instance
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, sort);
//        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
//        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, Sort.by(sortBy).descending());

        Page<Post> pagePosts = postRepository.findAll(pageRequest);

        //get content for page object
        List<Post> posts = pagePosts.getContent();

        //replace mapToDto with modelMapper
       // List<PostDto> postDtos = posts.stream().map(post-> mapToDTO(post)).collect(Collectors.toList());
        List<PostDto> postDtos = posts.stream().map(post -> modelMapper.map(post, PostDto.class)).collect(Collectors.toList());

        PostResponse postResponse = new PostResponse();
        postResponse.setContent(postDtos);
        postResponse.setPageNo(pagePosts.getNumber());
        postResponse.setPageSize(pagePosts.getSize());
        postResponse.setTotalElements(pagePosts.getTotalElements());
        postResponse.setTotalPages(pagePosts.getTotalPages());
        postResponse.setLast(pagePosts.isLast());
        return  postResponse;
    }

/*
    private PostDto mapToDTO(Post post){
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setDescription(post.getDescription());
        postDto.setContent(post.getContent());

        return postDto;
    }

    private Post mapToEntity(PostDto postDto){
        Post post= new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        return post;
    }

 */
}
