package Collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */

/** You can't change the size of the array after it's constructed.
 * However, you can change the number of elements in an ArrayList whenever you want.
**/
 public class ArraysExerciseTest {

    public <E> void print(E e){
        System.out.print(e+ " ");
    }

    @Test
    public void learn_Inserting_And_Retrieving() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        numbers [9] = 11;
        for(int number: numbers) print(number);
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
        int[] numbers = { 12, 24, 143, 24,65, 86, 17, 48, 49, 10 };
        print(Arrays.binarySearch(numbers,24));
        print(Arrays.binarySearch(numbers,20));
        System.out.println();
        Arrays.sort(numbers,4,9);
        for(int number: numbers) print(number);
        System.out.println();
        Arrays.sort(numbers);
        for(int number: numbers) print(number);

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
        int[] num2 = Arrays.copyOf(numbers, numbers.length);
        int[] num3 = Arrays.copyOfRange(numbers, 3,8);
        for(int num: num2) print(num);
        for(int num: num3) print(num);
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
        Integer[] numbers = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> list = Arrays.asList(numbers);
        List<Integer> list2 = Arrays.asList(numbers);
        print(list.equals(list2));
        print(list.get(3));
        print("\n");
        Arrays.fill(numbers,10);
        for(int number: numbers) print(number);

    }
}
