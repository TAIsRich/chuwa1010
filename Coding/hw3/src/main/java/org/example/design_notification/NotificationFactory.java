package org.example.design_notification;

public class NotificationFactory {
    public void notification(User user) throws NotificationException {
        switch (user.getPreference()) {
            case "Email":
                Notification notification = new EmailNotification();
                notification.notify(user);
                notification.broadcast();
                break;
            case "SMS":
                Notification notification2 = new SMSNotification();
                notification2.notify(user);
                notification2.broadcast();
                break;
            case "WhatsAPP":
                Notification notification3 = new WhatsAPPNotification();
                notification3.notify(user);
                notification3.broadcast();
                break;
            default:
                throw new NotificationException("Invalid Preference.");
        }
    }
}
