package com.example.mongoblog.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Blog {
    @Id
    private long id;
    private String title;
    private String description;
    private String content;

    @CreatedDate
    private LocalDate createTime;

    @LastModifiedDate
    private LocalDate updateTime;

    public Blog(){

    }

    public Blog(long id, String title, String description, String content, LocalDate createTime, LocalDate updateTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public LocalDate getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
    }

    public long getId() {
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

    public void setId(long id) {
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
}
