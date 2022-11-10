package com.chuwa.redbook.dao;


import com.chuwa.redbook.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // No need to write code
    //namingConvention
    //List<Post> findByTitleContainingOrDescrptionContainingOrContentContaining(String keywordInTitle, String keywordInDescription, String keywordInContent);
}