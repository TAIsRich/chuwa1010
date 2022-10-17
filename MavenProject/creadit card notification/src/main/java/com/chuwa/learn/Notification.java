package com.chuwa.learn;

import java.util.ArrayList;

public class Notification {
    public void passUserDetail(User u){
        String name = u.getUsernamae();
        String accountType = u.getSeleted();
        String account = u.getSelectedAccount();
        String message =name+" you have successfully registered to add and here is your , please use this for future references.";
        if(send(name,accountType,account,message)){
            //TODO
        }
        else {
            System.out.println("error");
        }
    }
    private boolean send(String name, String accountType, String account,String message){
        if(account.equals(""))
            return false;
        if(accountType.equals("email")){
            return true;
        } else if (accountType.equals("SMS")) {
            return true;
        }else {
            return true;
        }
    }
    public void notifyAll(ArrayList<User> users, String message){
        for (User user:users){
            String name = user.getUsernamae();
            String accountType = user.getSeleted();
            String account = user.getSelectedAccount();
            send(name,accountType,account,message);
        }

    }

}
