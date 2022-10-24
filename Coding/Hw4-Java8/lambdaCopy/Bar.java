package com.chuwa.tutorial.t06_java8.features.lambdaCopy;

@FunctionalInterface
public interface Bar {
    String method(String string);//唯一一个abstract method

    default String defaultBar(){
        String s="default Bar method";
        System.out.println(s);
        return s;
    }
    default String defaultCommon(){
        String s="defaultCommon from Bar";
        System.out.println(s);
        return s;
    }
}
