package com.chuwa.redbook.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BlogAPIException extends RuntimeException{
    private HttpStatus httpstatus;
    private String message;

    public BlogAPIException(String message, HttpStatus httpstatus) {
        this.httpstatus = httpstatus;
        this.message = message;
    }

    public BlogAPIException(String message, HttpStatus httpstatus, String message1) {
        super(message);
        this.httpstatus = httpstatus;
        this.message = message1;
    }

    public HttpStatus getHttpstatus() {
        return httpstatus;
    }

    public void setHttpstatus(HttpStatus httpstatus) {
        this.httpstatus = httpstatus;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
