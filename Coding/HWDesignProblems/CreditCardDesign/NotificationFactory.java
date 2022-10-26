package HWDesignProblems.CreditCardDesign;

public class NotificationFactory {
    public Notification createNotification(String Method) throws ErrorMessage{
        switch (Method) {
            case "SMS":
                return new SMSNotice();
            case "EMAIL":
                return new EmailNotice();
            case "WHATSAPP":
                return new WhatsAppNotice();
            default:
                throw new ErrorMessage(ResultCode.FAILED);
        }
    }
}
