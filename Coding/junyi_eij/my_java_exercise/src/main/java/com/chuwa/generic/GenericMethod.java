package com.chuwa.generic;

public class GenericMethod {
    public static void main(String[] args) {
        System.out.printf("Max of  %d, %d, and %d is %d \n", 3, 4, 5,
                MaximumGenericTest.maximum(3, 4, 5));

        System.out.printf("Max of  %.1f, %.1f, and %.1f is %.1f \n", 6.6, 7.7, 8.8,
                MaximumGenericTest.maximum(6.6, 7.7, 8.8));

        System.out.printf("Max of  %s, %s, and %s is %s \n", "pear", "apple", "orange",
                MaximumGenericTest.maximum("pear", "apple", "orange"));

    }
}

class MaximumGenericTest {
    /**
     * find the largest of three comparable objects
     */
    public static < T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}