package CreditCardNotification;

public class NotifyFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "SMS":
                return new SmsNotification();
            case "EMAIL":
                return new EmailNotification();
            case "WhatsApp":
                return new WhatsApp();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
