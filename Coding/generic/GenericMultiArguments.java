package com.chuwa.hw4_1019.Coding.generic;

/**
 * @author Chenyu
 * @date 10/20/22
 */

public class GenericMultiArguments {
    public static <T1, T2, T3> void print(T1 x1, T2 x2, T3 x3) {
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }

    public static void main(String[] args) {
        print(1, "2", 3.3);
    }
}
