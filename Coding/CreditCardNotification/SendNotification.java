package org.example;

public class SendNotification implements Notification {
    private String firstName;
    private String notificationType;

    public SendNotification(String firstName, String notificationType) {
        this.firstName = firstName;
        this.notificationType= notificationType;
    }

    @Override
    public void callNotification(){
        System.out.println("Hey" +this.firstName+"you hava you have successfully registered to add and here is your , please use this for future references.");
    }

    @Override
    public void chooseNotificationType() {
        if(this.notificationType == NotificationType.SMS.toString()) {
            System.out.println("you refer SMS");
        } else if(this.notificationType == NotificationType.email.toString()) {
            System.out.println("you prefer email");
        } else {
            try{
                throw new Exception("the notification type is not existed.");
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                System.out.println("choose your prefer notification type.");
            }
        }
    }

    @Override
    public void broadCastPublicNotification(){
        System.out.println("40% off when you buy Popeyes between 06/13 - 06/19.");
    }

}
