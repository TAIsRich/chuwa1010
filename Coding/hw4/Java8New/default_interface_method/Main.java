package org.example;

public class Main {
    public static void main(String[] args) {
        DIMImpl d = new DIMImpl();

        System.out.println("Override method: " + d.add(1,3));
        System.out.println("Default method: " + d.substract(1,3));
        System.out.println("Static method: " + DIML.blogName());
    }
}