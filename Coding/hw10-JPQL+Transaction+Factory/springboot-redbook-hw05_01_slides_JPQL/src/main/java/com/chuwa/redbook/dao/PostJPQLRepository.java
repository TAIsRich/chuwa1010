package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author b1go
 * @date 8/22/22 6:48 PM
 */

// If we use JPQL, then we don't use "extends", we don't need JPA frame
// But we will need an EntityManager, it will be created in the implementation class,
@Repository
public interface PostJPQLRepository {

    List<Post> getAllPostWithJPQL();
}
