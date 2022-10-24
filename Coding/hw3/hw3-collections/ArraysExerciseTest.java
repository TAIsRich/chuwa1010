package org.example;

import org.junit.Test;

import java.lang.reflect.Array;
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
        int n = numbers[1];
        System.out.println(n);
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
        int[] numbers = { 1, 2, 5, 8, 7, 6, 9 };
        System.out.println(Arrays.binarySearch(numbers,2));

        Arrays.sort(numbers, 2,5);//5,8,7
        for(int i: numbers) {
            System.out.println(i);// 1 2 5 8 7 6 9
        }

        Arrays.parallelSort(numbers);
        for(int i: numbers) {
            System.out.println(i);
        }



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
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[] n = Arrays.copyOfRange(numbers, 0,4);//declude 4
        for(int i: n) {
            System.out.println(i);// 1 2 3 4
        }

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
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 5});
        System.out.println(numbers.equals(list));

        Arrays.fill(numbers, 20);
        for(int i: numbers) {
            System.out.println(i);// fill all elements in the numbers with 20
        }

    }
}
