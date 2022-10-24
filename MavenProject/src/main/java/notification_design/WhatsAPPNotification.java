package notification_design;

public class WhatsAPPNotification implements Notification{
    @Override
    public void send_notification(String message) {
        System.out.println("WhatsAPP: " + message);
    }
}
