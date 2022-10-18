package org.example.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class CopyOnWriteArrayListExerciseTest {

    /**
     * e.g.
     * List list = new CopyOnWriteArrayList();
     *
     * add(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addIfAbsent(E e)
     * addAllAbsent(Collection c)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList();
        list.add(1);
        list.add(2);
        list.add(2, 3);
        list.addIfAbsent(4);

        CopyOnWriteArrayList<Integer> list2 = new CopyOnWriteArrayList();
        list2.add(5);
        list2.add(6);
        list.addAll(list2);

        CopyOnWriteArrayList<Integer> list3 = new CopyOnWriteArrayList();
        list3.add(7);
        list3.add(8);
        list.addAllAbsent(list3);
    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     */

    @Test
    public void learn_Iterator() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        //Created an iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            if (str.equals("Orange")) {
                list.remove(str);
                continue;
            }
            System.out.print(str + " ");
        }
    }
}
