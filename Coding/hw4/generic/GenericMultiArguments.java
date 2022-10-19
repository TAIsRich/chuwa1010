package com.chuwa.tutorial.t01_basic.generic;

/**
 * @author b1go
 * @date 7/25/22 12:14 AM
 */
public class GenericMultiArguments {

    public static <T1, T2, T3> void temp(T1 x, T2 y, T3 z) {
        System.out.println(x.getClass());
        System.out.println(y.getClass());
        System.out.println(z.getClass());

    }
    public static void main(String[] args) {
        temp(1, "2", 3L);
    }
}
