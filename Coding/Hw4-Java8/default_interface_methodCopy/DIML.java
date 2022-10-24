package com.chuwa.tutorial.t06_java8.features.default_interface_methodCopy;

public interface DIML {
    static final String BLOG = "How are you?";
    int add(int a, int b);
    default int substract(int a, int b) {return a-b;}
    static String blogName(){return BLOG;}
}
