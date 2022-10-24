package org.example.design_notification;

public class Client {
    public static void main(String[] args) throws NotificationException {
        User user1 = new User("Firstname1", "Zhang");
        User user2 = new User("Firstname2", "Li");
        User user3 = new User("Firstname3", "Zhao");
        user1.setPreference("Email");
        user2.setPreference("SMS");
        user3.setPreference("WhatsAPP");

        NotificationFactory notificationFactory = new NotificationFactory();

        try {
            notificationFactory.notification(user1);
            notificationFactory.notification(user2);
            notificationFactory.notification(user3);
        } catch (NotificationException e) {
            System.out.println(e);
        }
    }
}
