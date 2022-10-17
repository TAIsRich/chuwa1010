package com.chuwa.learn;

import java.util.ArrayList;

public class NotificationSystem {
    private Notification notification;
    private ArrayList<User> users;
    NotificationSystem(){
        notification= new Notification();
        users= new ArrayList<>();
    }
    public boolean addUser(User user){
        if(users.add(user)){
            notification.passUserDetail(user);
            return true;
        }

        return false;
    }
    public void notifyALL(){
        String message="40% off when you buy Popeyes between 06/13 - 06/19";
        notification.notifyAll(users,message);
    }
}
