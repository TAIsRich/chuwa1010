package notification_design;

public class NotificationFactory {
    public Notification createNotification(String notificationPreference){
        Notification notification = null;

        if(notificationPreference.equals("Email")){
            notification = new EmailNotification();
        }else if(notificationPreference.equals("SMS")){
            notification = new SMSNotification();
        }else if(notificationPreference.equals("WhatsAPP")){
            notification = new WhatsAPPNotification();
        }else{
            throw new RuntimeException("Invalid notification preference");
        }

        return notification;
    }
}
