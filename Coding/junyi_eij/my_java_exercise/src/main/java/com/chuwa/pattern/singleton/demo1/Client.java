package com.chuwa.pattern.singleton.demo1;

public class Client {
    public static void main(String[] args){
        // create a Singleton object
        Singleton i1 = Singleton.getInstance();

        Singleton i2 = Singleton.getInstance();

        // check i1 and i2 are actually the same object
        // if true, it means that we can only create one singleton
        System.out.println(i1==i2);// the address of i1 is equal to the address of i2,
                                    //means they are the same object, will return true
    }
}
