package com.chuwa.redbook.payload;

import java.util.Date;

public class ErrorDetail {
    private Date timeStamp;
    private String message;
    private String detail;

    public ErrorDetail(Date timeStamp,String message, String detail){
        this.timeStamp=timeStamp;
        this.message=message;
        this.detail=detail;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getTimeStamp(){
        return timeStamp;
    }
    public void setTimeStamp(Date timeStamp){
        this.timeStamp=timeStamp;
    }
}
