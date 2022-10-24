package com.chuwa.exercise.collection;

import org.junit.Test;
import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:45 PM
 */
public class LinkedListExerciseTest {

    /**
     * e.g.
     * List<Integer> list = new LinkedList<Integer>();
     * Inserting:
     * add(E e) or addLast(E e)
     * addFirst(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addAll(int index, Collection c)
     *
     * Retrieving:
     * getFirst()
     * getLast()
     * get(int index)
     *
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.addLast(2);
        list.addFirst(0);
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.addAll(list);
        System.out.println("list2: " + list2);
        list2.add(1,2);
        System.out.println("updated list2: " + list2);
        list2.addAll(1,list);
        System.out.println("insert list1 in the index 1, updated list2: " + list2);

        System.out.println("first element: " + list2.getFirst());
        System.out.println("last element: " + list2.getLast());
        System.out.println("index 2 element: " + list2.get(2));
    }

    /**
     * removeFirst()
     * removeLast()
     * remove(int index)
     * remove(Object o)
     * removeLastOccurrence()
     *
     * sort()
     */

    @Test
    public void learn_Remove_Sort() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.addLast(2);
        list.addFirst(0);
        list.add(3);
        list.add(7);
        list.add(5);

        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}
