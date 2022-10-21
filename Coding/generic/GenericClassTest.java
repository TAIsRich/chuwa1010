package com.chuwa.hw4_1019.Coding.generic;

/**
 * @author Chenyu
 * @date 10/19/22
 */

public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<Integer> case1 = new GenericClass<>(1);
        System.out.println(case1.getObj());

        GenericClass<Double> case2 = new GenericClass<>(3.0);
        System.out.println(case2.getObj());

        GenericClass<String> case3 = new GenericClass<>("hello chuwa");
        System.out.println(case3.getObj());
    }
}
