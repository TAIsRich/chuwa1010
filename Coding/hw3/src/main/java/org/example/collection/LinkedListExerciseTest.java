package org.example.collection;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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
        list.add(3, 3);

        List<Integer> list2 = new LinkedList<Integer>();
        list2.add(4);
        list2.add(5);

        list.addAll(list2);
        System.out.println(list);
        list.addAll(0, list2);
        System.out.println(list);

        list.getFirst();
        list.getLast();
        list.get(0);
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
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(3);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        list.remove(0);
        list.remove(new Integer(3));
        list.removeLastOccurrence(4);


    }
}
