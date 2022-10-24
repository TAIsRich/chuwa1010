package notification_design;

public class SMSNotification implements Notification{
    @Override
    public void send_notification(String message) {
        System.out.println("SMS: " + message);
    }
}
