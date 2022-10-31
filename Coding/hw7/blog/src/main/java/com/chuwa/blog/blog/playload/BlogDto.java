package com.chuwa.blog.blog.playload;

public class BlogDto {
    private String id;
    private String title;
    private String content;

    public BlogDto( String title, String content) {

        this.title = title;
        this.content = content;
    }
    public BlogDto(){}

    public String getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
