package org.example;

public class EmailNotification implements Notification {
    @Override
    public void sendNtf() {
        System.out.println("Email notify");
    }
}
