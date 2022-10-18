package org.example.collection;

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
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = numbers[0];
        numbers[0] = 11;
        System.out.println(number == numbers[0]);
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
        int[] numbers = { 99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.binarySearch(numbers, 4));

        Arrays.sort(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = { 88, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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
        int[] numbers = { 1, 2, 3, 5, 4, 6, 7, 8, 9, 10};
        int[] num = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(num));

        int[] num2 = Arrays.copyOfRange(numbers, 0, 3);
        System.out.println(Arrays.toString(num2));
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
        Integer[] numbers = { 1, 2, 3, 5, 4, 6, 7, 8, 9, 10};
        List<Integer> list = Arrays.asList(numbers);
        Arrays.fill(numbers, 20);
        System.out.println(Arrays.toString(numbers));

        Integer[] numbers2 = { 1, 2, 3, 5, 4, 6, 7, 8, 9, 10};
        System.out.println(Arrays.equals(numbers, numbers2));
    }
}
