package com.chuwa.hw4_1019.Coding.generic;

/**
 * @author Chenyu
 * @date 10/20/22
 */

public class GenericMethod {
    public static void main(String[] args) {
        System.out.printf("the maximum value among %d, %d, and %d is %d\n\n", 3, 4, 5,
                MaximumGenericTest.maximum(3, 4, 5));
        System.out.printf("the maximum value among %.1f, %.1f, and %.1f is %.1f\n\n", 3.3, 5.5, 4.4,
                MaximumGenericTest.maximum(3.3, 5.5, 4.4));
        System.out.printf("the maximum value among %s, %s, and %s is %s\n\n", "3.3", "5.5", "4.4",
                MaximumGenericTest.maximum("3.3", "5.5", "4.4"));

    }
}


class MaximumGenericTest {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0) max = y;
        if(z.compareTo(max) > 0) max = z;
        return max;
    }
}