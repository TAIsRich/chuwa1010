package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
        int[] arr = {0, 1, 2, 3, 4};
        int index3 = arr[3];
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
        int[] arr = {0, 1, 2, 3, 4};
        int idx = Arrays.binarySearch(arr, 4);
        Arrays.sort(arr, 1, 3);
        int[] numbers = {9, 8, 7, 6, 3, 1};
        System.out.print("Unsorted Array: ");
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
        System.out.println();
        Arrays.parallelSort(numbers);
        System.out.print("Sorted Array: ");
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
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
        int[] arr = {0, 1, 2, 3, 4};
        int[] arr2 = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOfRange(arr, 3, 4);
        System.out.println(Arrays.toString(arr3));
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
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.equals(arr, arr2));
        Arrays.fill(arr, 0);
    }
}
