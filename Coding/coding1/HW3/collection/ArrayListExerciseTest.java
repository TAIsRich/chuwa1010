package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
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
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(2);
        arr.add(3);
        System.out.println(arr.get(1));
        System.out.println(arr.size());
        arr.addAll(Arrays.asList(1,2,3));
        System.out.println(arr);
        System.out.println(arr.size());
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
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(3);
        arr.set(2,23);
        System.out.println(arr);
        arr.clear();
        arr.add(2);
        arr.add(1);
        arr.add(100);
        Collections.replaceAll(arr, 1,10);
        System.out.println(arr);
        System.out.println(arr.contains(2));
        System.out.println(arr.indexOf(2));
        System.out.println(arr.lastIndexOf(10));
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
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(100);
        arr.add(10);
        arr.add(8);
        arr.iterator();
        Iterator<Integer> it = arr.iterator();
        System.out.println(it.hasNext());
        System.out.println(it.next());
        it.remove();
        System.out.println(it.next());
        it.forEachRemaining(System.out::println);
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(100);
        arr.add(10);
        arr.add(8);
        Collections.sort(arr);
        System.out.println(arr);
        arr.sort(Comparator.reverseOrder());
        System.out.println(arr);
    }
}
