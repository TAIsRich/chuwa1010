package com.chuwa.learn;

import java.util.HashMap;

public class User {
    private String usernamae;
    private HashMap<String,String> account;
    private String seleted;
    User(String n,String seleted,String account){
        usernamae=n;
        this.seleted=seleted;
        this.account = new HashMap<String,String>();
        this.account.put("email","");
        this.account.put("SMS","");
        this.account.put("WhatsAPP","");
        this.account.replace(seleted,account);
    }

    public String getSeleted() {
        return seleted;
    }

    public void setSeleted(String seleted,String account) {
        this.seleted = seleted;
        this.account.replace(this.seleted,account);
    }
    public void setSeleted(String seleted) {
        this.seleted = seleted;
    }
    public String getSelectedAccount(){
        return this.account.get(seleted);
    }

    public String getUsernamae() {
        return usernamae;
    }

    public void setUsernamae(String usernamae) {
        this.usernamae = usernamae;
    }
}
