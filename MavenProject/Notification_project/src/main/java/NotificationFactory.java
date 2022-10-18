public class NotificationFactory {
    public Notification createNotification(String preference) {
        if (preference == null || preference.isEmpty()) {
            return null;
        }
        switch (preference) {
            case "SMS" :
                return new SMSNotification();
            case "email" :
                return new EmailNotification();
            case "WhatsAPP" :
                return new WhatsAPPNotification();
            default:
                throw new IllegalArgumentException("Unknown Preference "+preference);
        }
    }
}
