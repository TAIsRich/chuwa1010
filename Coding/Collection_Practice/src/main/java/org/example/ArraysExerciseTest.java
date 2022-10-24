package org.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
        int a = numbers[5];

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
        int[] numbers = { 5, 2, 3, 10, 5, 1, 7, 15, 9, 10 };
        Arrays.binarySearch(numbers,5);
        Arrays.sort(numbers);
        Arrays.sort(numbers, 0,5);
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
        int[] numbers = { 5, 2, 3, 10, 5, 1, 7, 15, 9, 10 };
        int[] newArray = Arrays.copyOf(numbers, 7);
        int[] anotherArray = Arrays.copyOfRange(numbers, 0, 5);
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
        String[] array = {"a", "b", "c" };
        List list = Arrays.asList(array);
        System.out.println(list);

        int[] numbers1 = { 5, 2, 3, 10};
        int[] numbers2 = {5, 1, 7, 15, 9, 10};
        System.out.println(Arrays.equals(numbers1, numbers2));

        Arrays.fill(numbers1, 20);
        System.out.println(Arrays.toString(numbers1));
    }

}
