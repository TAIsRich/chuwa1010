package org.example;

public class Main {
    public static void main(String[] args) {

        SendNotification notf1 = new SendNotification("Amy", "email");
        notf1.chooseNotificationType();
        notf1.broadCastPublicNotification();

    }
}