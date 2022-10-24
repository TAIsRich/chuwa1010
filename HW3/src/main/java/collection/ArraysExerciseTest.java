package collection;

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
        int num = numbers[3];

        System.out.println("numbers' index at 3: " + numbers[3] + ", and int num = " + num);
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
        int[] numbers1 = {1, 3, 2, 3, 4, 2, 1, 5, 6, 2, 23, 21, 4, 6, 7, 53};
        System.out.println("current int[] number1: " + Arrays.toString(numbers1));
        Arrays.sort(numbers1);
        System.out.println("After sort: " + Arrays.toString(numbers1));

        int[] numbers2 = {2, 34, 23, 43, 4, 6, 12, 34, 42, 54};
        System.out.println("current int[] number2: " + Arrays.toString(numbers2));
        Arrays.parallelSort(numbers2);
        System.out.println("After parallelSort: " + Arrays.toString(numbers2));

        int[] number3 = {1, 23, 3, 5, 10, 93, 40, 1, 2, 3, 5, 3, 5};
        Arrays.sort(number3);
        System.out.println("After sort number3: " + Arrays.toString(number3));
        Arrays.binarySearch(number3, 2);
        int size = number3.length - 1;
        System.out.println("93 at index: " + size + ". Using binary search and found out 93 is at " + Arrays.binarySearch(number3, 93));




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
        int[] number1 = {1, 2, 3, 4, 5};
        int[] copyNumber1 = Arrays.copyOf(number1, number1.length);
        System.out.println("copyNumber1: " + Arrays.toString(copyNumber1));

        int[] copyRange = Arrays.copyOfRange(number1, 0, 2);
        System.out.println("copyRange from index 0 to index 2: " + Arrays.toString(copyRange));

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
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(numbers);
        System.out.println("numbers list: " + Arrays.toString(numbers));
        System.out.println("asList: " + list);

        Integer[] number1 = {1, 2, 3, 4, 5, 6, 7};
        Integer[] number2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("It should return true for number 1 and number 2. Result: " + Arrays.equals(number1, number2));

        Integer[] number3 = {1, 2, 3, 4, 5, 6, 7};
        Integer[] number4 = {1, 2, 2, 4, 5, 6, 7};
        System.out.println("It should return false for number 3 and number 4. Result: " + Arrays.equals(number3, number4));

        Arrays.fill(numbers, 20);
        System.out.println("numbers fill with 20: " + Arrays.toString(numbers));

    }
}
