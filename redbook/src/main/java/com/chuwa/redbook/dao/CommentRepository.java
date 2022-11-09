package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findByPostId(long postId);

//    @Query("select c from Comment c where c.email=?1 and c.name=?2")
//    Comment getCommentbyemailandname(String email, String name);
//
//    @Query("select c from Comment c where c.id=:key and c.post=:post")
//    Comment getCommentByidAndPost(@Param("id") Long key, @Param("post") Post post);
}
