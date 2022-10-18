public class SendNotification implements Notification{
    private String firstName;
    private NotificationType notificationType;

    public SendNotification(String firstName, NotificationType notificationType) {
        this.firstName = firstName;
        this.notificationType = notificationType;
    }

    @Override
    public void callNotification() {
        System.out.println("Hey" + this.firstName+ "you have successfully registered to add and here is your , please use this for future references.");
    }

    @Override
    public void chooseNotificationType() {
        if (this.notificationType == NotificationType.email) {
            System.out.println("you prefer Email");
        } else if (this.notificationType == notificationType.SMS) {
            System.out.println("you prefer SMS");
        } else if (this.notificationType == notificationType.WhatsAPP) {
            System.out.printf("you prefer WhatsApp");
        } else {
            try {
                throw new Exception("no other choice");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void broadCastPublicNotification() {
        System.out.println("40% off when you buy Popeyes between 06/13 - 06/19");
    }
}
