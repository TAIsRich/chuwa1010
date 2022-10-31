package com.chuwa.rebook.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(
    name="posts",
        uniqueConstraints ={@UniqueConstraint(columnNames = {"title"})}
        )
public class Post {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
            //set primary key ID ↓
    )
    private  long id;

    @Column(name =" title",nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "content", nullable = false)
    private String content;

    @CreationTimestamp
    private LocalDateTime createDateTime;



    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public Post() {

    }
    public Post(long id, String description, String content) {
        this.id = id;
        this.description = description;
        this.content = content;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    @Override
    public String toString(){
        return "Post{id:"+id+
                ",title:"+title+
                ",description:"+description+
                ",content:"+content+
                ",created:"+createDateTime+
                ",updated"+updateDateTime+"}";
    }
}
