package Observer;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();

        subject.attach(new WeixinUser("a"));
        subject.attach(new WeixinUser("b"));
        subject.attach(new WeixinUser("c"));

        subject.notify("Hi! There's new update!");
    }
}
