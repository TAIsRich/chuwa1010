package com.chuwa.learn;

public class EmailUser extends User{

    EmailUser(String n, String email) {
        super(n,email);
    }
    @Override
    public void notifyOne() {
        System.out.println(getUsernamae()+", you have successfully registered to add and here is your email: "+getAccount()+", please use this for future references.");
    }
    @Override
    public String accountType(){
        return "email";
    }

}
