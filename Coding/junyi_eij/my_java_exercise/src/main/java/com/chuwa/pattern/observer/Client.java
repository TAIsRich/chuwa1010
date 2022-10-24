package com.chuwa.pattern.observer;

public class Client {
    public static void main(String[] args) {
        //1 create subject
        SubscriptionSubject subject = new SubscriptionSubject();

        //2 user subscribe subject
        subject.attach(new SubscriptionUser("Tom"));
        subject.attach(new SubscriptionUser("Alice"));
        subject.attach(new SubscriptionUser("John"));

        //3 subject update, and send message to its subscriber
        subject.notify(" I have a new post!");
    }
}
