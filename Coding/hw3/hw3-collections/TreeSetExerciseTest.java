package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class TreeSetExerciseTest {
    /**
     * e.g.
     * Set<Integer> set= new TreeSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * contains(Object o)
     *
     * first()
     * last()
     * subSet(E fromElement, E toElement)
     * headSet(E toElement)
     * tailSet(E fromElement)
     *
     * remove(Object o)
     *
     * size()
     * isEmpty()
     *
     *
     */

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(0);
        ts.add(1);
        ts.add(3);

        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);

        //no duplicate
        ts.addAll(a);
        System.out.println(ts);
        System.out.println(ts.size());
        System.out.println(ts.contains(3));

        System.out.println("first: " + ts.first());
        System.out.println(ts.last());
        // do not include 3, only 1 and 2
        System.out.println(ts.subSet(1,3));
        System.out.println(ts.headSet(1));
        System.out.println(ts.tailSet(0));

        ts.remove(0);
        System.out.println("remove 0: " + ts);
        ts.clear();
        System.out.println(ts.isEmpty());
    }
}
