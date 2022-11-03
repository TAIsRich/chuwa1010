package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(long postId);
    List<Comment> findByNameContainsIgnoreCaseOrderByName(String name);
    List<Comment> findByEmailEndsWithIgnoreCaseOrderByEmail(String emailDomain);
    List<Comment> findByCreateDateTimeBetweenOrderByCreateDateTime(LocalDateTime from, LocalDateTime to);
}
