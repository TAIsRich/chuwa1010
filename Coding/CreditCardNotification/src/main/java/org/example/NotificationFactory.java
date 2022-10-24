package org.example;

public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new WhatsAppNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
