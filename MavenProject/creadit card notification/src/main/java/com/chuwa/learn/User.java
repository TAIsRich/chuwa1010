package com.chuwa.learn;

public class User implements Notify{
    private String usernamae;
    private String account;
    User(String n,String account) {
        usernamae = n;
        this.account=account;
    }

    public String getUsernamae() {
        return usernamae;
    }

    public void setUsernamae(String usernamae) {
        this.usernamae = usernamae;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    public String accountType(){
        return "";
    }
    @Override
    public void notifyOne() {

    }
}
