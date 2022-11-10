package Pattern.Publisher_Subscriber;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject ss = new SubscriptionSubject();
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charles");
        ss.attach(user1);
        ss.attach(user2);
        ss.attach(user3);
        ss.notify("Hello!");
    }
}
