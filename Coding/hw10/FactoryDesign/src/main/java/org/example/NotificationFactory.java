package org.example;

public class NotificationFactory {

    public Notification pushNotification(String s){
        if(s == null || s.isEmpty()){
            return null;
        }
        switch (s){
            case "SMS":
                return new SMSNotification();
            case "email":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("invalid notification");
        }
    }

}
