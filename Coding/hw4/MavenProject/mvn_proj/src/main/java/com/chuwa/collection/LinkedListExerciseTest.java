package com.chuwa.collection;
import java.util.*;
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
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.addLast(4);
        list.addFirst(2);
        list.add(0,1);
        System.out.println("current list is:"+list);

        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(5,6,7));
        list.addAll(list2);
        System.out.println("current list is:"+list);

        LinkedList<Integer> list3 = new LinkedList<>(Arrays.asList(0,0,0));
        list.addAll(0, list3);
        System.out.println("current list is:"+list);

        list.getFirst();
        list.getLast();
        list.get(3);
        System.out.println("----------");

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
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,6,5,6,7));
        System.out.println("current list is:"+list);

        list.removeFirst();
        list.removeLast();
        list.remove(1);
        list.remove(Integer.valueOf(4));
        list.removeLastOccurrence(Integer.valueOf(6));

        System.out.println("current list is:"+list);

        list.sort((a,b)->(b-a));
        System.out.println("current list is:"+list);

    }
}
