import org.junit.Test;

import java.util.Arrays;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class ArraysExerciseTest {
    int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    /**
     * e.g.
     * int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
     * numbers[?]
     *
     * numbers[?] = #
     */

    @Test
    public void learn_Inserting_And_Retrieving() {
        int res = arr[3];
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
        Arrays.sort(arr);
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
        int[] arr2 = Arrays.copyOf(arr, 3);
        for (int n : arr2) System.out.print(n);
        System.out.println();
        int[] arr3 = Arrays.copyOfRange( arr, 0, 4);
        for (int n : arr3) System.out.print(n);
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

        Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.fill(numbers, 20);

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
