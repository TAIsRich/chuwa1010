package DesignPattern.subscriber;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        subscriptionSubject.attach(new User("John") );
        subscriptionSubject.notify(" Hello");
    }
}
