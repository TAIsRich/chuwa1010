package com.chuwa.redbook.dao.impl;

import com.chuwa.redbook.dao.PostDao;
import com.chuwa.redbook.dao.mapper.PostRowMapper;
import com.chuwa.redbook.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class PostDaoImpl implements PostDao {
    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public Post save(Post post) {
        JdbcTemplate insert = jdbcTemplate;
        insert.update("INSERT INTO POSTS (ID, TITLE, DESCRIPTION, CONTENT, CREATE_DATE_TIME, UPDATE_DATE_TIME)" +
                "VALUES(?,?,?,?,?,?)",
                new Object[] {post.getId(), post.getTitle(), post.getDescription(), post.getContent(), post.getCreateDateTime(), post.getUpdateDateTime()});
        post.setId(insert.queryForObject("SELECT MAX(id) from posts;", long.class));
        //TODO: improve last insert id lookup
        return post;
    }

    @Override
    public List<Post> findAll() {
        JdbcTemplate select = jdbcTemplate;
        return select.query("select ID, TITLE, DESCRIPTION, CONTENT from POSTS",
                new PostRowMapper());
    }

    @Override
    public Optional<Post> findById(long id) {
        JdbcTemplate select = jdbcTemplate;
        try {

            return Optional.of(
                    (Post) select.query("select ID, TITLE, DESCRIPTION, CONTENT from POSTS WHERE ID = ?",
                    new Object[] {id},
                    new PostRowMapper()).get(0));
        }catch(Exception e){
            return Optional.empty();
        }
    }

    @Override
    public void delete(Post post) {
        JdbcTemplate delete = jdbcTemplate;
        long id = post.getId();

         delete.update("delete from POSTS WHERE ID = ?",
                            new Object[] {id});

    }
}
