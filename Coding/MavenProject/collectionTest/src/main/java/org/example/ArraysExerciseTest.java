package org.example;

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
        int[] numbers = {14, 3, 15, 6, 3, 6, 6, 1, 4, 10};
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
        int[] numbers = {14, 3, 15, 6, 3, 6, 6, 1, 4, 10};
        System.out.println(Arrays.binarySearch(numbers, 3));

        Arrays.sort(numbers, 0, 3);
        for(int number : numbers) System.out.println(number);

        Arrays.sort(numbers);
        for(int number : numbers) System.out.println(number);

        //parallelSort() method uses concept of MultiThreading which makes the sorting
        // faster as compared to normal sorting method.
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
        int[] numbers = {14, 3, 15, 6, 3, 6, 6, 1, 4, 10};
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        int[] copyRang = Arrays.copyOfRange(numbers, 0, 4);
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
        Integer[] numbers = new Integer[] {14, 3, 15, 6, 3, 6, 6, 1, 4, 10};
        List<Integer> list1 = Arrays.asList(numbers);
        List<Integer> list2 = Arrays.asList(numbers);
        System.out.println(list2.equals(list1));

        int[] fill = new int[10];
        Arrays.fill(fill, 22);

        for(int i : fill) System.out.println(i);

    }
}
