package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Amy Liu
 * @date 10/17/22
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
        int[] numbers= {1,2,3,4,5,6,7,8,9,10};
        int length= numbers.length;
        int num = numbers[4];
        numbers[4]=100;
        System.out.println("numbers'length: "+ length +"\nThe original number at index 4 is: "+ num + "\nThe current number at index 4 is: "+numbers[4]);

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
        int[] numbers= new int[] {2,5,35,3,65,12,4,1,6,10,6};
        System.out.println("The original array: "+ Arrays.toString(numbers));// has to be: Arrays.toString()

        //Arrays.sort(): sorting algorithm used in this method: Dual-Pivot Quicksort
        Arrays.sort(numbers, 3,8);//toIndex(8) is not included
        System.out.println("sort from index 3 to 8: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("After sorting: "+ Arrays.toString(numbers));

        // use parallel merge sorts
        // better performance for the datasets in large size, slower for the datasets in small size
        numbers= new int[] {2,5,35,3,65,12,4,1,6,10,6};
        Arrays.parallelSort(numbers);
        System.out.println("After sorting: "+ Arrays.toString(numbers));

        // the original array must be sorted by Arrays.sort() prior to calling Arrays.binarySearch()
        // if the array contains the multiple elements with the specified value, there is no guarantee which one will be found
        int index1= Arrays.binarySearch(numbers, 6);
        int index2= Arrays.binarySearch(numbers, 10);
        int index3= Arrays.binarySearch(numbers, 9);
        System.out.format("6 is at %d, 10 is at %d, 9 is at %d \n",index1, index2, index3);
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
        int[] numbers= new int[] {2,5,35,3,65,12,4,1,6,10,6};
        System.out.println("numbers: "+ Arrays.toString(numbers));
        int[] copy= Arrays.copyOf(numbers,6);//index 6 is not included
        System.out.println("copy from index 0 to 6: "+ Arrays.toString(copy));

        int[] copyRange= Arrays.copyOfRange(numbers, 3, 8);
        System.out.println("copy of the original array from index 3 to 8: " + Arrays.toString(copyRange));
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
       Integer[] numbers= new Integer[] {2,5,35,3,65,12,4,1,6,10,6};
       List<Integer> list= Arrays.asList(numbers);
       System.out.println(list);

       int[] numbers1={2,5,35,3,65,12,4,1,6,10,6};
       int[] numbers2={2,5,35,3,65,12,4,1,6,10,6};
       int[] numbers3= new int[] {2,5,35,3,65,12,4,1,6,10,6};
       System.out.println("numbers1 equals to numbers 2? "+ Arrays.equals(numbers1, numbers2));
       System.out.println("numbers1 equals to numbers 3? "+ Arrays.equals(numbers1, numbers3));

       int[] numbers4= new int[6];
       Arrays.fill(numbers4, 1);
       System.out.println("fill numbers4 with 1: "+ Arrays.toString(numbers4));
    }
}
