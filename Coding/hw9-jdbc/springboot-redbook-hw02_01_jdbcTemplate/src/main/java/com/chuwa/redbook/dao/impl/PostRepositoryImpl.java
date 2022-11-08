package com.chuwa.redbook.dao.impl;

import com.chuwa.redbook.dao.PostRepository;
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
public class PostRepositoryImpl implements PostRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public PostRepositoryImpl() {
    }


    @Override
    public List<Post> findAll() {
        final String sql = "select * from posts";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Post>(Post.class));
    }

    @Override
    public Post save(Post post) {
        final String sql = "insert into posts (title, description, content, create_date_time, update_date_time)"
                + "VALUES (?, ?, ?, ?, ?)";

        final KeyHolder keyHolder = new GeneratedKeyHolder();
        int result = jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, post.getTitle());
            ps.setString(2, post.getDescription());
            ps.setString(3, post.getDescription());
            ps.setObject(4, LocalDateTime.now());
            ps.setObject(5, LocalDateTime.now());
            return ps;
        }, keyHolder);

        if (post.getId() == null) {
            return result > 0 ? findById(keyHolder.getKey().longValue()).get() : null;
        } else {
            return result > 0 ? findById(post.getId()).get() : null;
        }
    }

    @Override
    public Optional<Post> findById(Long id) {
        final String sql = "select * from posts where id=?";
        Post post = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Post.class), new Object[] {id});
        return Optional.ofNullable(post);
    }

    @Override
    public Post update(Post post){
        final String sql = "UPDATE POSTS " +
                "SET title = ?, description = ?, content = ? , update_date_time = ? " +
                "WHERE ID = ?";
        jdbcTemplate.update(sql, new Object[] {
                post.getTitle(),
                post.getDescription(),
                post.getContent(),
                LocalDateTime.now(),
                post.getId()
        });

        return post;
    }

    @Override
    public void delete(Post post) {
        final String sql = "delete from posts where id = ?";
        jdbcTemplate.update(sql, new Object[]{post.getId()});
    }
}
