package com.chuwa.cassandra_blog.entity;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("post")
public class Post {
    @PrimaryKey
    private UUID id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String content;


    public Post() {
    }

    public Post(UUID id, String title, String description, String content) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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


}