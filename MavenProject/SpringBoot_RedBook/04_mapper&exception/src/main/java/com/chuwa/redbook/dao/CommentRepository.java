package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author b1go
 * @date 6/23/22 11:05 PM
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {


    List<Comment> findByPostId(long postId);
}
