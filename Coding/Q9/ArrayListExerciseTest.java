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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int ele = list.get(0);
        int size = list.size();
        List<Integer> anotherList = new ArrayList<>();
        anotherList.add(2);
        anotherList.add(3);
        list.addAll(anotherList);
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
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(0);
        list.remove(new Integer(2));
        System.out.println(list);
        list.add(2);
        list.add(1);
//        list.removeRange(0, 1);
//        System.out.println(list);
//        removeRange(int,int) has protected access in java.util.ArrayList
        list.removeAll(list);
        System.out.println(list);
        list.add(0);
        list.clear();
        list.add(0);
        list.set(0, 1);
        list.add(2);
        boolean check = list.contains(0);
        int index = list.indexOf(1);
        index = list.lastIndexOf(1);
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
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        Iterator<Integer> ite1 = list.iterator();
        while (ite1.hasNext()) {
            System.out.println(ite1.next());
        }
        List<String> shapes = new ArrayList<>();
        shapes.add("square");
        shapes.add("circle");
        Iterator<String> ite2 = shapes.iterator();
        ite2.forEachRemaining((shape) -> System.out.println(shape));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(1);
        Collections.sort(list, Comparator.reverseOrder());
    }
}
