package org.example;

import org.junit.Test;

import java.util.*;


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
        LinkedList<Integer> list = new LinkedList<>(
                Arrays.asList(2,3,7,5,1)
        );
        list.add(9);
        list.addLast(15);
        list.addFirst(10);
        list.add(3, 20);
        List<Integer> anotherList = new ArrayList<>(
                Arrays.asList(1,2,3)
        );
        list.addAll(anotherList);
        list.addAll(0, anotherList);

        list.getFirst();
        list.getLast();
        list.get(2);

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
        LinkedList<Integer> list = new LinkedList<>(
                Arrays.asList(10,5,1,9,2,3,7,5,1)
        );
        list.removeFirst();
        list.removeLast();
        list.remove(0);
        list.remove(Integer.valueOf(5));
        list.removeLastOccurrence(1);

        list.sort(Comparator.naturalOrder());
    }

}
