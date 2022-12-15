package com.chuwa.redbook.payload;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CommentDto {
    private long id;

    @NotEmpty(message = "Name should not be null or empty")
    private String name;
    @NotEmpty(message = "Email should not be null or empty")
    private String email;
    @NotEmpty
    @Size(min = 5, message = "Comment body must be minimum 5 characters")
    private String body;
    //{  error message for body < 5 : 500Internal Server Error
    //    "timeStamp": "2022-11-07T02:27:26.421+00:00",
    //    "message": "Validation failed for argument [1] in public org.springframework.http.ResponseEntity<com.chuwa.redbook.payload.CommentDto>
    //    com.chuwa.redbook.controller.CommentController.createComment(long,com.chuwa.redbook.payload.CommentDto):
    //    [Field error in object 'commentDto' on field 'body': rejected value [g]; codes [Size.commentDto.body,Size.body,Size.java.lang.String,Size];
    //    arguments [org.springframework.context.support.DefaultMessageSourceResolvable:
    //    codes [commentDto.body,body]; arguments []; default message [body],2147483647,5];
    //    default message [Comment body must be minimum 5 characters]] ",
    //    "details": "uri=/api/v1/posts/2/comments"
    //}

    public CommentDto(){

    }

    public CommentDto(String name, String email, String body) {
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public CommentDto(long id, String name, String email, String body) {
        this(name, email, body);
        this.id = id;
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

    @Override
    public String toString() {
        return "CommentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
