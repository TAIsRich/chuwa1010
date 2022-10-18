package com.chuwa.learn;

public class SMSUser extends User{

    SMSUser(String n,String sms) {
        super(n,sms);
    }
    @Override
    public void notifyOne() {
     System.out.println(getUsernamae()+", you have successfully registered to add and here is your SMS: "+getAccount()+", please use this for future references.");
    }
    public String accountType(){
        return "sms";
    }

}
