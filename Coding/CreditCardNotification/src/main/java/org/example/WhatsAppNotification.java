package org.example;

public class WhatsAppNotification implements Notification{
    @Override
    public void notifyUser() {

        System.out.println("Sending a WhatsApp notification");
    }
}
