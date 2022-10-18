package org.example.collection;

import org.junit.Test;

import java.util.Set;
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
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(3);

        set.addAll(set2);
        System.out.println(set.contains(new Integer(4)));

        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.subSet(0, 2));
        System.out.println(set.headSet(2));
        System.out.println(set.tailSet(0));

        set.remove(new Integer(1));

        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
