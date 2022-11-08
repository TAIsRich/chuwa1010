package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author b1go
 * @date 8/22/22 6:48 PM
 */
// no more need to extends JpaRepository as we will use Jdbc template
@Repository
public interface PostRepository {
    List<Post> findAll();
    Post save(Post post);
    Optional<Post> findById(Long id);

    Post update(Post post);

    void delete(Post post);


}
