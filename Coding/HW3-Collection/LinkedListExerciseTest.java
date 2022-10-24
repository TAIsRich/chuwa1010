package Collection;
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
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        ((LinkedList<Integer>) list).addLast(2);
        ((LinkedList<Integer>) list).addFirst(3);
        list.add(3, 4);

        List<Integer> list1 = new LinkedList<Integer>();
        list1.add(5);
        list1.add(6);
        list.addAll(list1);
        System.out.println(list);
        list.addAll(0,list1);
        System.out.println(list);

        ((LinkedList<Integer>) list).getFirst();
        ((LinkedList<Integer>) list).getLast();
        System.out.println(list.get(2));

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
        list.add(3);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.add(4);
        list.add(5);
        list.remove(0);
        list.remove(new Integer(4));
        list.removeLastOccurrence(5);
        System.out.println(list);

    }
}
