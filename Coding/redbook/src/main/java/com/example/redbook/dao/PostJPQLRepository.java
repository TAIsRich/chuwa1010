package com.example.redbook.dao;

import com.example.redbook.entity.Post;

import java.util.List;

public interface PostJPQLRepository {

    List<Post> getAllPostWithJPQL();
}

