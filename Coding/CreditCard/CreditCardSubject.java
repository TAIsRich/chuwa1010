package org.example;

import java.util.ArrayList;

public class CreditCardSubject implements CreditCard{
    //Observer design pattern

    private ArrayList<User> userList = new ArrayList<>();
    private Notification n;

    @Override
    public void attach(User u) throws invalidPreferenceException {
        userList.add(u);

        switch(u.getPreference()){
            case "SMS":
                n = new SMSNotification();
                n.notify(u);
                n.publicNotify();
                break;
            case "Email":
                n = new EmailNotification();
                n.notify(u);
                n.publicNotify();
                break;
            case "WhatsApp":
                n = new WhatsAPPNotification();
                n.notify(u);
                n.publicNotify();
                break;
            default:
                System.out.println(u.getFirstName() + " is not added successfully.");
                throw new invalidPreferenceException("invalid preference error");

        }
    }
}
