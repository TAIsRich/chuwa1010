package com.chuwa.exercise.collection;

import org.junit.Test;

/**
 * @author Wenbo Geng
 * @date 10/17/22 4:46 PM
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
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.addLast(2);
        list.addFirst(3);
        list.add(1, 4);

        list.addAll(new LinkedList<> (Arrays.asList(5, 6)));

        list.addAll(2, new LinkedList<Integer> (Arrays.asList(7, 8)));

        System.out.println("Get first: " + list.getFirst());
        System.out.println("Get last: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));
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
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addLast(5);
        list.addFirst(6);
        list.add(2, 7);

        list.remove();
        list.removeFirst();
        list.removeLast();
        list.remove(1);

        Integer idx = 4;
        list.remove(idx);

        list.sort((a, b) -> a - b);
        list.sort((a, b) -> b - a);

        Collections.sort(list);
        Collections.sort(list, (a, b) -> b - a);
    }
}
