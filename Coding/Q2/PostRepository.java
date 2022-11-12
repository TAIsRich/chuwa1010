package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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

/**
 * @author b1go
 * @date 8/22/22 6:48 PM
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    @Query("select p from Post p where p.id = ?1 or p.title = ?2")
    Post getPostByIdOrTitleJPQLIndexParameters(Long id, String title);

    @Query("select p from Post p where p.id = :key or p.title = :title")
    Post getPostByIdOrTitleJPQLNamedParameters(@Param("key") Long id, @Param("title") String title);

    @Query(value = "select * from posts p where p.id = ?1 or p.title = ?2", nativeQuery = true)
    Post getPostByIdOrTitleWithSQLIndexParameters(Long id, String title);

    @Query(value = "select * from posts p where p.id = :key or p.title = :title", nativeQuery = true)
    Post getPostByIdOrTitleWithSQLNamedParameters(@Param("key") Long id, @Param("title") String title);
}
