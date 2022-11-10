package com.chuwa.redbook.payload;


import org.springframework.lang.NonNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PostDto {
    private Long id;
    /**
     * 1. title should not be null or empty
     * 2. title should have at least 2 characters
     * Question, our database have set it as nullable=false,
     * why do we need to set validation here? what is the benefits?
     */
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;
    private String description;
    private String content;

    public PostDto() {

    }

    public PostDto(String title, String description, String content) {

        this.title = title;
        this.description = description;
        this.content = content;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
