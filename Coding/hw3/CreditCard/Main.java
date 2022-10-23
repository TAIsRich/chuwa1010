package org.example;

public class Main {
    public static void main(String[] args) {
        //Observer design pattern
        CreditCardSubject cc = new CreditCardSubject();

        User a = new User("Seungcheol","Choi","SMS");
        User b = new User("Jeonghan","Yoon","WhatsApp");
        User c = new User("Joshua","Hong","Email");
        User d = new User("Junhui","Wen","AA");

        try {
            cc.attach(a);
            cc.attach(b);
            cc.attach(c);
            cc.attach(d);
        } catch (invalidPreferenceException e) {
            System.out.println(e);
        }



    }
}