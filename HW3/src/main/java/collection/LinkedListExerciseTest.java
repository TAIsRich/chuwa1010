package collection;

import org.junit.Test;

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
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(0, 10);
        System.out.println(list);

        List<Integer> subList = new LinkedList<Integer>();
        subList.add(11);
        subList.add(12);
        list.addAll(subList);
        System.out.println(list);
        list.addAll(0, subList);
        System.out.println(list);

        System.out.println("get list 0: " + list.get(0));
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
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);

        list.remove(0);
        System.out.println("list remove index 0: " + list);

        list.sort((a, b) -> a.compareTo(b));
        System.out.println("sort list: " + list);


    }
}
