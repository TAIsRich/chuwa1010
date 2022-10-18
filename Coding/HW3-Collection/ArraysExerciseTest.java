package Collection;
import org.junit.Test;

import java.util.*;
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
        System.out.println(numbers[0]);
        numbers[0] = 100;
        System.out.println(numbers[0]);

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
        int[] numbers = {10, 2, 22, 69,30};
        Arrays.sort(numbers);
        for (int n : numbers) {
            System.out.println(n);
        }
        System.out.println(Arrays.binarySearch(numbers, 10));
        Arrays.parallelSort(numbers);
        Arrays.sort(numbers, 0,2);

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
        int[] numbers = { 1, 2, 3, 5, 4, 6, 7, 8, 9, 10 };
        int[] num = Arrays.copyOf(numbers, numbers.length);
        for(int n : num){
            System.out.println(n);
        }

        num = Arrays.copyOfRange(numbers, 0, 5);
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
