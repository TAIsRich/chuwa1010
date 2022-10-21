package com.chuwa.tutorial.t01_basic.generic;

/**
 * @author b1go
 * @date 7/25/22 12:14 AM
 */
public class GenericMultiArguments {

    public static <T1, T2, T3> void temp(T1 x, T2 y, T3 z) {
        System.out.println("This is X = " + x);
        System.out.println("This is not y, ok, I am kidding,this y = " + y);
        System.out.println("This is z = " + z);
    }

    public static void main(String[] args) {
        temp(20L, "50", 70f);
    }
}
