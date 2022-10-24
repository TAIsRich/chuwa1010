package com.chuwa.generic;

public class GenericClassTest {
    public static void main(String[] args) {
        //Test for Integer Type
        GenericClass<Integer> obj1 = new GenericClass<>(6);
        System.out.println(obj1.getObj());

        GenericClass<Double> obj2 = new GenericClass<>(6.6666);
        System.out.println(obj2.getObj());

        GenericClass<String> obj3 = new GenericClass<>("this is a string");
        System.out.println(obj3.getObj());

    }



}
