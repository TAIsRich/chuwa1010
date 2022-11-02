package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class PostRepositoryImpl implements PostRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Post> findAll() {
        String sql = "SELECT * FROM POSTS";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Post.class));
    }

    @Override
    public Optional<Post> findById(long id) {
        String sql = "SELECT * FROM POSTS WHERE ID = ?";
        Post post = jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Post.class),
                id);
        return Optional.ofNullable(post);
    }

    @Override
    public Post save(Post post) {
        String sql = "INSERT INTO posts(title, description, content, create_date_time, update_date_time)" +
                "VALUES(?, ?, ?, ?, ?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int result = jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, post.getTitle());
            ps.setString(2, post.getDescription());
            ps.setString(3, post.getContent());
            ps.setObject(4, LocalDateTime.now());
            ps.setObject(5, LocalDateTime.now());
            return ps;
        }, keyHolder);

        return findById(keyHolder.getKey().longValue()).get();
    }

    @Override
    public void delete(long id) {
        String sql="DELETE FROM POSTS WHERE ID = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Post update(Post post) {
        String sql = "UPDATE POSTS " +
                "SET TITLE = ?, DESCRIPTION = ?, CONTENT = ?, UPDATE_DATE_TIME = ?" +
                "WHERE ID = ?";

             jdbcTemplate.update( sql,
                post.getTitle(),
                post.getDescription(),
                post.getContent(),
                LocalDateTime.now(),
                post.getId());

             return post;

    }

}
