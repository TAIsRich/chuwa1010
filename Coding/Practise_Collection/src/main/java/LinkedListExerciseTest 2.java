import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;

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
    LinkedList list = new LinkedList();
    @Test
    public void learn_Inserting_And_Retrieving() {
        list.add(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.getFirst();
        list.getLast();
        list.get(1);
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
        list.add(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.getFirst();
        list.getLast();
        list.get(1);
        list.removeFirst();
        list.removeLast();
        list.remove(0);
        list.removeLastOccurrence(4);
        Collections.sort(list);
    }
}
