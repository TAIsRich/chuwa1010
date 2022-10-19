package notification_design;

public class EmailNotification implements Notification{
    @Override
    public void send_notification(String message) {
        System.out.println("Email: " + message);
    }
}
