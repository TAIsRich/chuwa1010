package org.example;

public class WhatsAPPNotification implements Notification{
    @Override
    public void sendNtf() {
        System.out.println("WhatsApp notify");
    }
}
