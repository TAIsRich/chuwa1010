package com.chuwa.mongoblog.Repository;

import com.chuwa.mongoblog.model.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository {
    Blog save(Blog blog);

    List<Blog> saveAll(List<Blog> blogs);

    List<Blog> findAll();

    List<Blog> findAll(List<String> ids);

    Blog findOne(String id);

    long delete(String id);

    long delete(List<String> ids);

    long deleteAll();

    Blog update(Blog person);

    long update(List<Blog> persons);

}
