package com.chuwa.exercise.collection;

import org.junit.Test;

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
        int[] arr = {2, 3, 4, 5, 6};
        List<Integer> list = new LinkedList<>();
        for(int num : arr) list.add(num);
        list.addLast(7); list.addFirst(1); list.add(0, 0);
        List<Integer> copy = new LinkedList<>();
        int size = list.size();
        for(int i=0; i<size; i++) copy.add(list.get(i));
        list.addAll(copy);
        list.addAll(1, copy);

        int first = list.getFirst();
        int last = list.getLast();
        int random = list.get(3);
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
        String[] arr = {"ni", "hao", "niu", "bi", "shi", "bu", "shi"};
        List<String> list = new LinkedList<>();
        for(String s : arr) list.add(s);
        String first = list.removeFirst();
        String last = list.removeLast();
        String random1 = list.remove(1);
        String random2 = list.remove("hao");
        boolean b = list.removeLastOccurrence("shi");
    }
}
