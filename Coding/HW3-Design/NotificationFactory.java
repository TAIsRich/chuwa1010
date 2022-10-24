public class NotificationFactory {
    public Notification createNotification(String channel) throws NotificationException{
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "WHATSAPP":
                return new WhatsappNotification();
            default:
                throw new NotificationException(ResultCode.FAILED);
        }
    }
}