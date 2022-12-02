package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.PostDto;
import com.chuwa.redbook.payload.PostResponse;
import com.chuwa.redbook.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

//    private PostRepository postRepository;
//    public PostServiceImpl(PostRepository postRepository) {
//        this.postRepository = postRepository;
//    } // the same as the following line:

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PostDto createPost(PostDto postDto) {

        // 把payload转换成entity，这样才能dao去把该数据存到数据库中。

//        Post post = new Post();
//        post.setTitle(postDto.getTitle());
//        post.setDescription(postDto.getDescription());
//        post.setContent(postDto.getContent());
        // 此时已成功把request body的信息传递给entity

        // let make it as a method, just for simplifying the format
        // convert DTO to entity
        //Post post = mapToEntity(postDto);// use modelMapper instead
        Post post = modelMapper.map(postDto, Post.class);

        //call save method of DAO, it will save the information from entity into MySQL database
        // save() will return the data entity in database
        Post savedPost = postRepository.save(post);

        // we transfer the data of savedPost into what frond-end specifically need, and return to controller
//        PostDto postResponse = new PostDto();
//        postResponse.setId(savedPost.getId());
//        postResponse.setTitle(savedPost.getTitle());
//        postResponse.setDescription(savedPost.getDescription());
//        postResponse.setContent(savedPost.getContent());
        // we create a mapToDTO method, also to simplify the format

        // convert entity to DTO, DTO will be used by controller
        //PostDto postResponse = mapToDTO(savedPost);// use modelMapper instead
        PostDto postResponse = modelMapper.map(savedPost, PostDto.class);
        return postResponse;
    }


    // we use lambda and stream API here
    @Override
    public List<PostDto> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        List<PostDto> postDtos = posts.stream()
                .map(p -> modelMapper.map(p, PostDto.class))
                .collect(Collectors.toList());
        return postDtos;
    }


    // we use Optional
    @Override
    public PostDto getPostById(long id) {
//        Optional<Post> postOpt = postRepository.findById(id);
//        postOpt.orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        // if not throwing exception, we know that post is not null
        // then we can get this post like we normally do
        // findById() method will return an Optional Object,
        // with get() it will return the original object, which is Post
//        Post post = postRepository.findById(id).get();

        // above three lines can be integrated into one:

        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        return modelMapper.map(post, PostDto.class);
    }

    @Override
    public PostDto updatePost(PostDto postDto, long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        // update data from DTO to this entity
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        //save the updated post back into database, and return an entity that reflects the latest data
        Post updatedPost = postRepository.save(post);
        return modelMapper.map(updatedPost, PostDto.class);
    }

    @Override
    public void deletePostById(long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        postRepository.delete(post);
    }

    @Override
    public PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir) {
        // Sort Class is provided by Springboot frame
        // we just compare our variable sortDir with String "asc",
        // if equal, we sort by ascending order, otherwise descending
        // note that Sort.by() is a static method, there are 2 key things
        // one is sortBy, like we want to sort by id, the other is .ascending() or .descending()
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
                : Sort.by(sortBy).descending();

        // create pageable instance
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, sort);
        // some other way to create PageRequest
//      PageRequest pageRequest = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
//      PageRequest pageRequest = PageRequest.of(pageNo, pageSize, Sort.by(sortBy).descending());
        Page<Post> pagePosts = postRepository.findAll(pageRequest);

        // get content for page object
        List<Post> posts = pagePosts.getContent();
        List<PostDto> postDtos = posts.stream()
                .map(post -> modelMapper.map(post, PostDto.class))
                .collect(Collectors.toList());

        // we integrate Page object with postDtos,
        // just like combine page information and post information into one object, which is postResponse object
        PostResponse postResponse = new PostResponse();
        postResponse.setContent(postDtos);
        postResponse.setPageNo(pagePosts.getNumber());
        postResponse.setPageSize(pagePosts.getSize());
        postResponse.setTotalElements(pagePosts.getTotalElements());
        postResponse.setTotalPages(pagePosts.getTotalPages());
        postResponse.setLast(pagePosts.isLast());

        return postResponse;
    }
    /**
    //no longer use these method as we now implement modelMapper
    private Post mapToEntity(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());

        return post;
    }

    private PostDto mapToDTO(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setDescription(post.getDescription());
        postDto.setContent(post.getContent());

        return postDto;
    }
    */
}
