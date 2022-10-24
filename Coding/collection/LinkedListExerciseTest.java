package Coding.collection;

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
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list is : "+list);
        list.addLast(10);
        list.addFirst(20);
        System.out.println("addLast addFirst is : "+list);
        list.add(1, 4);
        System.out.println("add(int index, E element) is : "+list);

        list.addAll(new LinkedList<> (Arrays.asList(5, 6)));
        System.out.println("addAll(Collection c) is : "+list);

        list.addAll(2, new LinkedList<Integer> (Arrays.asList(70, 80)));
        System.out.println("addAll(int index, Collection c) is : "+list);

        System.out.println("Get first: " + list.getFirst());
        System.out.println("Get last: " + list.getLast());
        System.out.println("get(int index): " + list.get(1));

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
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("list is : "+list);
        list.removeFirst();
        System.out.println("list removeFirst() is : "+list);
        list.removeLast();
        System.out.println("list removeLast() is : "+list);
        list.remove(1);
        System.out.println("list remove(int 1) is : "+list);
        Integer obj = 4;
        list.remove(obj);
        System.out.println("list remove(Object o) is : "+list);
        list.removeLastOccurrence(2);
        System.out.println("list removeLastOccurrence(6) is : "+list);
        Collections.sort(list);
        System.out.println("list is : "+list);

    }
}
