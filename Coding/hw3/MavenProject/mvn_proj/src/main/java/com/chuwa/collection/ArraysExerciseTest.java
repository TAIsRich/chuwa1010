package com.chuwa.collection;

import org.junit.Test;
import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class ArraysExerciseTest {

    /**
     * e.g.
     * int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
     * numbers[?]
     *
     * numbers[?] = #
     */

    @Test
    public void learn_Inserting_And_Retrieving() {
        int[] nums = {1,2,3,4};
        int n = nums[1];
        nums[2] = 5;

    }

    /**
     * binarySearch()
     * e.g.
     * Arrays.binarySearch(numbers, 4);
     *
     * sort(array)
     * sort(array, fromIndex, toIndex)
     * e.g.
     * Arrays.sort(numbers);
     *
     * Arrays.parallelSort(numbers);
     */
    @Test
    public void learn_search_and_sort() {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.binarySearch(nums, 7));

        int[] nums2 = {2,5,4,1};
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {2,5,4,1};
        Arrays.sort(nums3,1,4);
        System.out.println(Arrays.toString(nums3));

        int[] nums4 = {2,5,4,1};
        Arrays.parallelSort(nums4);
        System.out.println(Arrays.toString(nums4));
        System.out.println("--------");
    }

    /**
     * copyOf()
     * e.g.
     * Arrays.copyOf(numbers, numbers.length);
     *
     * copyOfRange()
     * e.g.
     * Arrays.copyOfRange(numbers, 0, 5);
     */
    @Test
    public void learn_copy_of_array() {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(nums));

        int[] copy = Arrays.copyOf(nums, 8);
        System.out.println(Arrays.toString(copy));

        int[] copy2 = Arrays.copyOf(nums, 3);
        System.out.println(Arrays.toString(copy2));

        System.out.println("--------");

    }

    /**
     * asList()
     * e.g.
     * List<Integer> list = Arrays.asList(numbers);
     *
     * equals()
     * e.g.
     * Arrays.equals(numbers1, numbers2);
     *
     * fill()
     * e.g.
     * Arrays.fill(numbers, 20);
     *
     */

    @Test
    public void learn_common_operations() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list);

        int[] a1 = {1,2,3,4};
        int[] a2 = {1,2,3,4};
        System.out.println(Arrays.equals(a1, a2));

        int[] a3 = new int[3];
        Arrays.fill(a3, 100);
        System.out.println(Arrays.toString(a3));

        System.out.println("--------");
    }
}
