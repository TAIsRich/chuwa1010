package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author b1go
 * @date 8/22/22 6:48 PM
 */
@Repository
public class PostRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Post> findAll() {
        String sql = "SELECT * FROM posts";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Post>(Post.class));
    }

    public Optional<Post> findById(Long id) {
        String sql = "SELECT * FROM posts WHERE id = ?";
        Post post = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Post>(Post.class), new Object[] {id});
        return Optional.ofNullable(post);
    }

    public int createPost(Post post) {
        String sql = "INSERT INTO posts (title, description, content) VALUES(?, ?, ?)";
        return jdbcTemplate.update(sql, new Object[] {post.getTitle(), post.getDescription(), post.getContent()});
    }

    public int updatePost(Post post){
        String sql = "UPDATE posts SET title = ?, description = ?, content = ? WHERE ID = ?";

        return jdbcTemplate.update(sql, new Object[] {post.getTitle(), post.getDescription(), post.getContent(), post.getId()});
    }

    public int deletePostById(int id) {
        String sql="DELETE FROM posts WHERE ID = ?";
        return jdbcTemplate.update(sql, new Object[] {id});
    }
}
