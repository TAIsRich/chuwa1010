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
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(numbers[1]);
        System.out.println(numbers[4]);
        numbers[4] = 5;
        System.out.println(numbers[4]);

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
        int[] numbers = {6,5,4,8,9,7,1,3,2};
        int[] numbers1 = {6,5,4,8,9,7,1,3,2};
        int[] numbers2 = {6,5,4,8,9,7,1,3,2};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers,4));
        Arrays.sort(numbers1, 3,6);
        System.out.println(Arrays.toString(numbers1));
        Arrays.parallelSort(numbers2);
        System.out.println(Arrays.toString(numbers2));
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
        int[] numbers = {6,5,4,8,9,7,1,3,2};
        System.out.println(Arrays.toString(numbers));
        int[] num = Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(num));
        int[] num1 = Arrays.copyOfRange(num, 1,3);
        System.out.println(Arrays.toString(num1));

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
        Integer numbers[] = new Integer[] {1,2,8,5,6};
        Integer numbers1[] = new Integer[] {1,2,8,5,6};
        List<Integer> list = Arrays.asList(numbers);
        System.out.println(list);
        System.out.println(list.equals(numbers1));
        System.out.println(Arrays.equals(numbers,numbers1));
        Arrays.fill(numbers1,2);
        System.out.println(Arrays.toString(numbers1));
    }
}
