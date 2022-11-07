package org.example;

public class Main {
    public static void main(String[] args) {
       NotificationFactory notificationFactory = new NotificationFactory();
       Notification notification = notificationFactory.pushNotification("SMS");
       notification.notifyUser();
    }
}