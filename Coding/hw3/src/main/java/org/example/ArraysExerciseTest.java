package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
    public <E> void print(E e){
        System.out.println(e);
    }
    public void printList(){
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+",");
        }
        System.out.println();
    }
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    @Test
    public void learn_Inserting_And_Retrieving() {
        print(numbers[3]);
        numbers[3]='#';
        printList();

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

        print(Arrays.binarySearch(numbers,4));
        numbers[0]=9;
        Arrays.sort(numbers);
        printList();
        numbers[5]=11;
        Arrays.sort(numbers,3,7);
        printList();
        Arrays.parallelSort(numbers);
        printList();

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
        int[] copy = Arrays.copyOf(numbers,numbers.length);
        for (int i=0;i<copy.length;i++){
            print(copy[i]);
        }
        int[] copy2 = Arrays.copyOfRange(numbers,2,7);
        for (int i=0;i<copy2.length;i++){
            print(copy2[i]);
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
      ArrayList<Integer> list = new ArrayList<>( Arrays.stream(numbers).boxed().collect(Collectors.toList()));
      int[] nums={1,2,3,4,5};
      print(Arrays.equals(numbers,nums));
      Arrays.fill(numbers,20);
      printList();

    }
}
