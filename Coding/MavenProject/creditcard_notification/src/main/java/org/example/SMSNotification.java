package org.example;

public class SMSNotification implements Notification{
    @Override
    public void sendNtf() {
        System.out.println("SMS notify");
    }
}
