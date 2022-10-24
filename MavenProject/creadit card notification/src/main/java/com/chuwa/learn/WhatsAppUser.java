package com.chuwa.learn;

public class WhatsAppUser extends User{

    WhatsAppUser(String n,String whatsapp) {
        super(n,whatsapp);
    }
    @Override
    public void notifyOne() {
        System.out.println(getUsernamae()+", you have successfully registered to add and here is your WhatsApp account:"+getAccount()+" , please use this for future references.");
    }
    public String accountType(){
        return "WhatsApp";
    }
}
