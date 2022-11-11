package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author b1go
 * @date 8/22/22 6:48 PM
 */
// If we want to add a query, we should only add it here in the Repository
// we extend JPA repository so those method in the interface will be implemented automatically
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    /**
     * JPQL
     * use Entity name other than database table name.
     * index Parameters
     * @return post
     */
    // Note that in Query, it is JPQL rather than SQL.
    // Because it is using Entity Post class as reference rather than posts table in our database
    @Query("select p from Post p where p.id = ?1 or p.title = ?2")
    Post getPostByIDOrTitleWithJPQLIndexParameters(Long id, String title);
    // first way to implement parameter in JPQL: using ? to indicate it is a parameter
    // and use ?1 to show it is the first parameter, then in input we just need to give parameters by the same order
    // in this case, Long id will give value to ?1 and String title will give value to ?2

    /**
     * JPQL
     * use Entity name other than database table name.
     * named Parameters
     * @return post
     */
    @Query("select p from Post p where p.id = :key or p.title = :title")
    Post getPostByIDOrTitleWithJPQLNamedParameters(@Param("key") Long id,
                                                   @Param("title") String title);
    // second way to implement parameter in JPQL: using : + param_name to show it is a parameter
    // then in input we need @Param() with the same name behind : to match
    // in this case, Long id will give to :key and String title will give to :title
    // this is more preferred way, because it is more straight-forward and we don't care order.


    /**
     * SQL
     * use database table name.
     * index Parameters
     * @return post
     */
    // We can also write SQL as Query, here note that in SQL we are using posts, the table name in database
    // p.id, p.title also need to be the same as the column name in DB
    // setting parameter is similar, by Index ot by named_parameter
    @Query(value = "select * from posts p where p.id = ?1 or p.title = ?2 p.update_date_time", nativeQuery = true)
    Post getPostByIDOrTitleWithSQLIndexParameters(Long id, String title);

    /**
     * SQL
     * use database table name.
     * named Parameters
     * @return post
     */
    @Query(value = "select * from posts p where p.id = :key or p.title = :title", nativeQuery = true)
    Post getPostByIDOrTitleWithSQLNamedParameters(@Param("key") Long id,
                                                  @Param("title") String title);
}
