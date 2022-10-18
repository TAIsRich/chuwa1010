package com.chuwa.exercise.collection;

import org.junit.Test;

/**
 * @author Wenbo Geng
 * @date 10/17/22 4:46 PM
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
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int l = numbers.length;
        int num = numbers[0];
        numbers[0] = 11;
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
        int[] numbers = {11, 9, 89, 5, 2, 6, 77, 10, 18};
        int target_idx = Arrays.binarySearch(numbers, 9);

        Arrays.sort(numbers, 0, 5);
        Arrays.sort(numbers);

        numbers = new int[] {11, 9, 89, 5, 2, 6, 77, 10, 18};
        Arrays.parallelSort(numbers);
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
        int[] numbers = {11, 9, 89, 5, 2, 6, 77, 10, 18};
        int[] numbers_copy = Arrays.copyOf(numbers, 5);
        int[] numbers_copyRange = Arrays.copyOfRange(numbers, 6, 8);

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
        Integer[] numbers = new Integer[] {11, 9, 89, 5, 2, 6, 77, 10, 18};
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = new int[] { 1, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10 };
        Arrays.equals(numbers1, numbers2);
        List<Integer> l = Arrays.asList(numbers);
        Arrays.fill(l, 1);
    }
}
