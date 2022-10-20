package org.example.design_notification;

public class EmailNotification implements Notification{
    @Override
    public void notify(User user) {
        System.out.println("Hey" + user.getFirstName() + ", you have successfully registered to add " +
                "and here is your" + user.getPreference() + ", please use this for future references.");
    }

    @Override
    public void broadcast() {
        System.out.println("40% off when you buy Popeyes between 06/13 - 06/19.");
    }
}
