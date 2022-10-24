package org.example;

import generic_tutorial.GenericClass;

public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<>(5);
        System.out.println(obj1.getObj());

        GenericClass<Double> obj2 = new GenericClass<>(123.323423434);
        System.out.println(obj2.getObj());

        org.example.GenericClass<String> obj3 = new org.example.GenericClass<>("Wow");
        System.out.println(obj3.getObj());
    }
}
