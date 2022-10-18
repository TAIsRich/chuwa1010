package com.chuwa.learn.PublisherAndSubcriber;

public class weixinUser implements Observer{

    private String name;
    public weixinUser(String name){
        this.name=name;
    }
    public void update(String message) {
        System.out.println(name+" "+message);
    }
}
