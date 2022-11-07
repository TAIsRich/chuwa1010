package com.chuwa.redbook.dao.impl;

import com.chuwa.redbook.entity.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class PostJPQLRepositoryImplTest {
    @Autowired
    private PostJPQLRepositoryImpl repository;

    private Post post = new Post(null, "title test", "description test", "content test", null, null);

    @Test
    void  getAllPostWithJPQL(){
        List<Post> posts = repository.getAllPostWithJPQL();
        System.out.println(posts);
    }

    @Test
    void  insetPost(){
        //avoid duplicated title
        post.setTitle(post.getTitle() + LocalDateTime.now());
        Post savedPost = repository.insertPost(post);
        System.out.println(savedPost);
    }

    @Test
    void updatePost(){
        //must set id
        post.setId(12L);
        post.setTitle(post.getTitle() + LocalDateTime.now());
        Post savedPost = repository.insertPost(post);
        System.out.println(savedPost);
    }


    @Test
    void getPostById(){
        Post postById = repository.getPostById(Long.valueOf(8));
        System.out.println(postById);
    }

    @Test
    void deleteById(){
        post.setTitle(post.getTitle() + LocalDateTime.now());
        Post savedPost = repository.insertPost(post);
        System.out.println(savedPost);

        Long id = savedPost.getId();
        repository.deleteById(id);
        Post postById = repository.getPostById(id);
        System.out.println(postById);
    }

    @Test
    void  insetData(){
        //avoid duplicated title
        post.setTitle(post.getTitle() + LocalDateTime.now());
        Post savedPost = repository.insertData(post);
        System.out.println(savedPost);
    }

    //learn Session Factory
    @Test
    void testSessionFactory(){
        //create sessionFactory according to configurations
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        //create session
        Session session = sessionFactory.openSession();

        Transaction transaction = null;

        try{
            //session start a transaction
            transaction = session.beginTransaction();

            //txn
            post.setTitle(post.getTitle() + LocalDateTime.now());
            post.setCreateDateTime(LocalDateTime.now());
            post.setUpdateDateTime(LocalDateTime.now());
            Post savedPost = (Post) session.merge(post);
            System.out.println(savedPost);

            //commit txn 该txn要么成功，要么失败,是个原子操作。
            transaction.commit();
        } catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            //close session
            session.close();
        }

    }

}

