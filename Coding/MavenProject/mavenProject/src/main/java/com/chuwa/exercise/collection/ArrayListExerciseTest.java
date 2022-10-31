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
        List<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(4);
        array.add(10);
        System.out.println(array.get(0));
        System.out.println(array.get(2));
        System.out.println(array.size());

        List<Integer> array2 = new ArrayList<>();
        array2.addAll(array);

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
        List<Integer> a = new ArrayList<>();
        a.add(11);
        a.add(1);
        a.add(5);
        a.add(3);

        a.remove(1);
        a.remove(1);
        System.out.println("After remove: " + a);

        //removeRange(int fromIndex, int toIndex)
        //fromIndex : inclusive
        //toIndex : exclusive
        //removeRange() is a protected method in ArrayList
        //we need to extend to ArrayList class to call this method
        //a.removeRange(0, 2)

        a.removeAll(a);
        System.out.println("After remove all: " + a);

        a.add(3);
        a.add(6);
        a.clear();
        System.out.println("After clear: " + a);

        //5, 8, 6, 6
        a.add(5);
        a.add(8);
        a.add(6);
        a.add(6);

        //5, 7, 6, 6
        a.set(1, 7);
        System.out.println("Set index 1 as value 7: " + a.get(1));

        //10, 14, 12, 12
        a.replaceAll(e -> e * 2);
        System.out.println("After replacing all: " + a);

        //10, 14, 12, 12
        System.out.println("check contains of 12: " + a.contains(12)); //true
        System.out.println("check index of 12: " + a.indexOf(12));     //2
        System.out.println("check last index of 12: " + a.lastIndexOf(12));  //3
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
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        Iterator<Integer> i = a.iterator();
        while (i.hasNext()) {
            Integer num = i.next();
            System.out.println("next: " + num);
            //The remove() method can remove items from a collection while looping.
            if (num > 3) {
                i.remove();
            }
        }

        System.out.println(a);

        List<Integer> b = new ArrayList<>();
        b.add(7);
        b.add(2);

        Iterator<Integer> it = b.iterator();
        it.forEachRemaining((e) -> System.out.println("for each: " + e));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<Integer> a = new ArrayList<>();
        a.add(8);
        a.add(6);
        a.add(11);
        a.sort((b, c) -> b - c);
        System.out.println("ascending order: " + a);

        a.sort(Comparator.reverseOrder());
        System.out.println("descending order: " + a);

        Collections.sort(a);
        System.out.println("Collections sorted order: " + a);

    }
}
