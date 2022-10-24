package Coding.collection;

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
    int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    @Test
    public void learn_Inserting_And_Retrieving() {

        System.out.println(arr[1]);
        arr[1]=300;
        System.out.println(arr[1]);
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

        for (int n : arr) {
            System.out.println(n);
        }
        System.out.println(Arrays.binarySearch(arr, 10));
        Arrays.sort(arr);
        Arrays.sort(arr, 0,2);
        Arrays.parallelSort(arr);
        for (int n : arr) {
            System.out.println(n);
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
        int[] num = Arrays.copyOf(arr, arr.length);
        for(int n : num){
            System.out.println(n);
        }
        num = Arrays.copyOfRange(arr, 0, 5);
        for(int n : num){
            System.out.println(n);
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
        Integer[] numbers = { 1, 2, 3, 5, 4, 6, 7, 8, 9, 10 };
        List<Integer> list = Arrays.asList(numbers);
        System.out.println(list);

        Integer[] numbers1 = { 1, 2, 3, 5, 4, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.equals(numbers, numbers1));
        Arrays.fill(numbers1, 100);
        System.out.println(Arrays.equals(numbers, numbers1));
    }
}
