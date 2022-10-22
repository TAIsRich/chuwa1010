package com.chuwa.pattern.builder.demo2;

public class Client {
    public static void main(String[] args) {
        // create Phone object
        // Phone phone = new Phone(); // this is not available since Phone constructor is private
        // instead, we use innerclass Phone.Builder to get Phone object
        // and note that we have not assigned cpu, screen, etc. to this phone,
        // we can also do it in below clause by chain

        Phone phone = new Phone.Builder()
                .cpu("Intel")
                .screen("Samsung")
                .memory("brandA")
                .mainBoard("brandB")
                .build();
        System.out.println(phone);// this will invoke toString() method in Phone class if it exists.
    }
}
