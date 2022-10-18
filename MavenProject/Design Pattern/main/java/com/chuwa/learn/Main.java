package com.chuwa.learn;

public class Main {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
//        Singleton s1=Singleton.INSTANCE;
//        Singleton s2=Singleton.INSTANCE;
        print(s1==s2);
    }
    public static <E>  void print(E e){
        System.out.println(e);
    }
}