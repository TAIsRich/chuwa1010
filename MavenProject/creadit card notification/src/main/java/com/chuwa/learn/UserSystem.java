package com.chuwa.learn;
import java.util.ArrayList;

public class UserSystem {
    private ArrayList<User> users;
    UserSystem(){
        users = new ArrayList<>();
    }
    public boolean addUser(User user){
        user.notifyOne();
        return users.add(user);
    }
    public void broadcast(String message) {
        for(User user: users){
            if(user.accountType().equals("email")){
                System.out.println(user.getAccount()+" email: " + message);
            }
            if(user.accountType().equals("sms")){
                System.out.println(user.getAccount()+" sms: " + message);
            }
            if(user.accountType().equals("WhatsApp")){
                System.out.println(user.getAccount()+" WhatsApp: " + message);
            }
        }
    }
}
