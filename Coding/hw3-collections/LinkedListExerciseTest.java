package org.example;

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

        LinkedList<Integer> listb = new LinkedList<Integer>();


        listb.addAll(list);
        System.out.println(listb);
        listb.add(1,2);
        System.out.println(listb);
        listb.addAll(1,list);
        System.out.println(listb);

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
        list.add(2);
        list.add(2);
        list.add(0);
        list.add(3);
        list.add(3);

        list.removeFirst();
        list.removeLast();
        list.remove(3);
        list.remove(new Object());
        list.removeLastOccurrence(2);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);




    }
}
