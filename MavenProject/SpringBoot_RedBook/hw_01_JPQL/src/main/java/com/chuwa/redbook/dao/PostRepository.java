package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Query
 * write by either JPQL or SQL
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    /**
     * JPQL
     * use entity name
     * with index parameters
     */
    @Query("select p from Post p where p.id = ?1 or p.title = ?2")
    Post getPostByIDOrTitleWithJPQLIndexParameters(Long id, String title);

    /**
     * JPQL
     * use entity name
     * with named parameters
     */
    @Query("select p from Post p where p.id = :key or p.title = :title")
    Post getPostByIDOrTitleWithJPQLNamedParameters(@Param("key") Long id,
                                                   @Param("title") String title);

    /**
     * SQL with nativeQuery = ture
     * use database table name
     * with index parameters
     */
    @Query(value = "select * from posts p where p.id = ?1 or p.title = ?2 p.update_date_time", nativeQuery = true)
    Post getPostByIDOrTitleWithSQLIndexParameters(Long id, String title);

    /**
     * SQL with nativeQuery = true
     * use database table name
     * with named parameters
     */
    @Query(value = "select * from posts p where p.id = :key or p.title = :title", nativeQuery = true)
    Post getPostByIDOrTitleWithSQLNamedParameters(@Param("key") Long id,
                                                  @Param("title") String title);
}
