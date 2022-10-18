package org.example;

public class SMSNotification implements Notification {
    @Override
    public void notify(User u) {
        System.out.println("Hey "+ u.getFirstName() + ", you have successfully registered to add and here is your SMS, " +
                "please use this for future references");
    }

    public void publicNotify() {
        System.out.println("40% off when you buy Popeyes between 06/13 - 06/19");
    }
}
