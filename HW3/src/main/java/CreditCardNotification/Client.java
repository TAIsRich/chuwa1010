package CreditCardNotification;

public class Client {
    public static void main(String[] args)
    {
        NotifyFactory notificationFactory = new NotifyFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
