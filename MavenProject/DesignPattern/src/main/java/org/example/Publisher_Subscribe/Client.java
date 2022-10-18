package org.example.Publisher_Subscribe;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();

        subject.attach(new WeChatUser("zxc"));
        subject.attach(new WeChatUser("asd"));
        subject.attach(new WeChatUser("qwe"));

        subject.notify("update");
    }
}
