package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wenbo Geng
 * @date 10/17/22 4:46 PM
 */
public class ArrayListExerciseTest {
    /**
     * new ArrayList()
     * add elements
     * get element
     * get Size
     * list.addAll(anotherList)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        List<Integer> arr2 = new ArrayList<>() {{ add(1); add(2); add(3);}};
        List<Integer> arr3 = new ArrayList<>(); arr3.addAll(arr1);
        List<Integer> arr4 = new ArrayList<>(Arrays.asList(1, 2, 3));

        int val = arr1.get(0);
        int size = arr1.size();
    }

    /**
     * remove(int index)
     * remove(Object o)
     * removeRange(int fromIndex, int toIndex)
     * removeAll(Collection<?> c)
     * clear()
     *
     * Update:
     * set(int index, E e)
     * replaceAll(UnaryOperator<E> operator)
     *
     * check:
     * contains(Object o)
     * indexOf(Object o)
     * lastIndexOf(Object o)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
        arr.remove(1);
        Integer idx = 2;
        arr.remove(idx);
        arr.removeRange(0, 2);

        ArrayListExerciseTest alet = new ArrayListExerciseTest();
        alet.add(1);
        alet.add(2);
        alet.add(3);
        alet.add(4);
        alet.removeRange(0,2);

        List<Integer> arr_r = new ArrayList<Integer> (Arrays.asList(1,2,4,5));
        arr_r.removeAll(arr_r);
        arr_r.clear();

        arr.set(3, 4);
        arr.removeAll(Arrays.asList(2, 3));

        Integer i = 4, j = 5;
        if (arr.contains(i))
            System.out.println(i);
        else
            System.out.println(arr.size());
    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     * forEachRemaining(Consumer<? super E> action) -- from Java8
     */

    @Test
    public void learn_Iterator() {
        List<Integer> l1 = new ArrayList<> (Arrays.asList(1, 2, 3, 4, 5, 6));
        Iterator<Integer> iterator = l1.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num == 4)
                iterator.remove();
        }
        l1.iterator().forEachRemaining(num -> System.out.println(num));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<Integer> l1 = new ArrayList<> (Arrays.asList(12, 213, 43, 5, 465, 77, 8));
        l1.sort((a, b) -> a - b);
        List<Integer> l2 = new ArrayList<> (Arrays.asList(123, 9, 10, 89, 124, 56, 11));
        l2.sort((a, b) -> b - a);

        List<Integer> l3 = new ArrayList<> (Arrays.asList(123, 9, 10, 89, 124, 56, 11));
        Collections.sort(l3);
        List<Integer> l4 = new ArrayList<> (Arrays.asList(123, 9, 10, 89, 124, 56, 11));
        Collections.sort(l4, (a, b) -> b - a);

        List<Integer> l5 = new ArrayList<> (Arrays.asList(123, 9, 10, 89, 124, 56, 11));
        l5.sort(Comparator.reverseOrder());

        List<Integer> l6 = new ArrayList<> (Arrays.asList(123, 9, 10, 89, 124, 56, 11));
        Collections.sort(l6, Comparator.reverseOrder());
    }
}
