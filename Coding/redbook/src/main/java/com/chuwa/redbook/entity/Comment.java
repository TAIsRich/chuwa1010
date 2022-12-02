package com.chuwa.redbook.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // JsonProperty will change the name of parameter that it presents in front-end
    // if we use @JsonProperty("user_name") for this variable, then it will show as user_name for this name variable in front-end
    @JsonProperty("name")
    private String name;
    private String email;
    private String body;

    // here we establish the relationship between Comment and Post
    // FetchType LAZY means when Java reads a post, it wouldn't read its all comments at the same time
    // FetchType Eager means When reading a post, also reading all comments of it, this mode is not efficient
    @ManyToOne(fetch = FetchType.LAZY) // a post can have many comments, so a Comment is ManyToOne to Post
    @JoinColumn(name = "post_id", nullable = false) // define an outer key, here post_id is a Comment's relation to a Post
    private Post post;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public Comment() {
    }

    public Comment(long id, String name, String email, String body, LocalDateTime createDateTime, LocalDateTime updateDateTime) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
        this.createDateTime = createDateTime;
        this.updateDateTime = updateDateTime;
    }


    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
