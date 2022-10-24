package com.chuwa.tutorial.t01_basic.generic;


public class GenericClassTestCopy {

    public static void main(String[] args){
        GenericClassCopy<Integer> obj1= new GenericClassCopy<>(5);
        System.out.println(obj1.getObj());

        GenericClassCopy<Double> obj2= new GenericClassCopy<>(45.56565);
        System.out.println(obj2.getObj());

        GenericClassCopy<String> obj3= new GenericClassCopy<>("Yayy!");
        System.out.println(obj3.getObj());
    }
}
