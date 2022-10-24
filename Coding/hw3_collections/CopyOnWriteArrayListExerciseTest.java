package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Wenbo Geng
 * @date 10/17/22 4:46 PM
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
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList ();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0, 4);

        List<Integer> subList = new ArrayList<Integer> () {{add(5); add(6); add(7);}};
        list.addAll(subList);

        list.addIfAbsent(3);
        list.addIfAbsent(8);

        list.addAllAbsent(subList);
        list.addAllAbsent(new ArrayList<Integer> () {{add(9); add(10); add(11);}});
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
        while (itr.hasNext())
            itr.remove();
    }
}
