package com.chuwa.mongoblog.service.impl;

import com.chuwa.mongoblog.dao.PostRepository;
import com.chuwa.mongoblog.entity.Post;
import com.chuwa.mongoblog.payLoad.PostDto;
import com.chuwa.mongoblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl  implements PostService {
    @Autowired
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {this.postRepository=postRepository;} //?

    @Override
    public PostDto createPost(PostDto postDto) {
        //把payload装换成entity， 这样才能dao 把该数据存到数据库中
        Post post= new Post();
        if(postDto.getTitle()!= null){
            post.setTitle(postDto.getTitle());
        }else{
            post.setTitle("");
        }
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        post.setId(postDto.getId());
        //此时已成功把request body的信息传递给entity

        //调用Dao的save方法，将entity的数据存储到数据库
        //save()会返回存储在数据库中的数据
        Post savePost=postRepository.save(post);

        //将save()犯规的数据转换成controller/前端 需要的数据，然后return给controller
        PostDto postResponse = new  PostDto();
        postResponse.setId(savePost.getId());
        postResponse.setTitle(savePost.getTitle());
        postResponse.setContent(savePost.getContent());
        postResponse.setDescription(savePost.getDescription());

        return postResponse;
    }

}
