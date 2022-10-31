package com.chuwa.mongoblog.entity;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.time.LocalDateTime;

//these are not needed for mongoDB database:
//@Entity
//@Table(
//        name="posts",
//        uniqueConstraints= {
//                @UniqueConstraint(columnNames = {"title"})
//        }
//)

//mongoDB use @Document instead of @Entity
//a table/collection will be created named "post",
// with fields: id, title, description, content...
// non-sql doesn't need to have structured fields, but, only the defined fields could be added into database
@Document
public class Post {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name= "title", nullable= false)
    private String title;

//    @Column(name="description", nullable=false)
    private String description;

//    @Column(name="content", nullable=false)
    private String content;

    @CreationTimestamp
    private LocalDateTime createDatetime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public Post(){

    }

    //public Post()这个method要不要都没有影响
    public Post(Long id, String title, String description, String content, LocalDateTime createDatetime, LocalDateTime updateDateTime) {
        this.id= id;
        this.title= title;
        this.description= description;
        this.content= content;
        this.createDatetime = createDatetime;
        this.updateDateTime=updateDateTime;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreateDatetime() {
        return createDatetime;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreateDatetime(LocalDateTime createDatetime) {
        this.createDatetime = createDatetime;
    }

    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    @Override
    public String toString() {
        return "Post{"+
                "id=" + id+
                ", title='" + title + '\''+
                ", description='" + description + '\''+
                ", createDateTime=" + createDatetime+
                ", updateDateTime=" + updateDateTime+
                '}';
    }
}
