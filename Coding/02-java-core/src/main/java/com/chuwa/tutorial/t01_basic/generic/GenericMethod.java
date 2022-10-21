package com.chuwa.tutorial.t01_basic.generic;

import java.lang.Integer;

/**
 * @author b1go
 * @date 7/25/22 12:03 AM
 */
public class GenericMethod {
    public static void main(String[] args) {
        System.out.printf("min of %d, %d and %d is %d\n\n", 3, 4, 5,
                minGenericTest.minimum(3, 4, 5));
        System.out.printf("min of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7,
                minGenericTest.minimum(6.6, 8.8, 7.7));
        System.out.printf("min of %s, %s and %s is %s\n", "pear", "apple", "orange",
                minGenericTest.minimum("pear", "apple", "orange"));
    }
}

class minGenericTest {
    /**
     * determines the largest of three Comparable objects
     */
    public static <T extends Comparable<T>> T minimum(T x, T y, T z) {
        T min = x;
        if (y.compareTo(min) < 0)
            min = y;
        if (z.compareTo(min) < 0)
            min = z;

        return min;
    }
}
