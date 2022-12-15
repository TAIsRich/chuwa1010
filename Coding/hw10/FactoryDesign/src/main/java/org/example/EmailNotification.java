package org.example;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("email notification");
    }
}
