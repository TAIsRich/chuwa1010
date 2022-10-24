package PublishScribe;

public class PublishSubscribe {
    public static void main(String[] args) {
        //new account
        SubscriptionSubject subject = new SubscriptionSubject();

        //subscribe
        subject.attach(new WeixinUser("A"));
        subject.attach(new WeixinUser("B"));
        subject.attach(new WeixinUser("C"));

        //account update, notify subscribers
        subject.notify("New message!");

    }

}
