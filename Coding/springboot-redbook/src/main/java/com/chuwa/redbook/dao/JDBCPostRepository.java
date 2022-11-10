package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Repository
public class JDBCPostRepository{
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Optional<Post> insertPost(Post post) {
        String sql="INSERT INTO Posts(ID, TITLE, DESCRIPTION,CONTENT,CREATE_DATE_TIME,UPDATE_DATE_TIME) VALUE(?,?,?,?,?,?)";
        int id =jdbcTemplate.update(sql,post.getId(),post.getTitle(),post.getDescription(), LocalDateTime.now(), LocalDateTime.now());
        return getPost(id);
    }


    public List<Post> getAllPost() {
        String sql= "select * from posts";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Post.class));
    }


    public Optional<Post> getPost(long id) {
        String sql= "select * from posts where id=?";
        Post post = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Post>(Post.class), new Object[]{id});
        return Optional.ofNullable(post);
    }


    public Optional<Post> updatePost(Post post, long id) {
        String sql ="update posts set title =?, description=?, content=?, update_date_time=?, where id=?";
        jdbcTemplate.update(sql,new Object[]{
            post.getTitle(),post.getDescription(),post.getContent(),LocalDateTime.now(),id
        });
        return getPost(id);
    }

    public void deletePost(long id) {
        String sql="delete from posts where id=?";
        jdbcTemplate.update(sql,new Object[]{id});
    }
}
