package com.chuwa.learn.PublisherAndSubcriber;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();
        weixinUser u1= new weixinUser("u1");
        weixinUser u2= new weixinUser("u2");
        weixinUser u3= new weixinUser("u3");
        subject.attach(u1);
        subject.attach(u2);
        subject.attach(u3);
        subject.notify("update");
    }
}
