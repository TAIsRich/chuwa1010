package com.chuwa.learn;

public class Main {
    public static void main(String[] args) {
        UserSystem sys= new UserSystem();
        sys.addUser(new EmailUser("em","test@gmail"));
        sys.addUser(new SMSUser("sms","11111111"));
        sys.addUser(new WhatsAppUser("whats","wefwep"));

        sys.broadcast("40% off when you buy Popeyes between 06/13 - 06/19");
    }
}