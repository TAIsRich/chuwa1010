package org.example;

import org.junit.Test;

import java.util.*;

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
        set.add(2);

        List<Integer> list = new ArrayList<>(
                Arrays.asList(5,1,3,7,9)
        );
        set.addAll(list);
        set.contains(7);

        set.first();
        set.last();
        System.out.println(set.subSet(1,7));
        System.out.println(set.headSet(3));
        set.tailSet(1);
        set.remove(1);
        set.size();
        set.isEmpty();
    }
}
