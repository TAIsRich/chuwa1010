package org.example.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton i = Singleton.getInstance();

        Singleton b = Singleton.getInstance();

        System.out.println(i == b);//same object
    }
}
