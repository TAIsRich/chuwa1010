package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Collections;
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
        Set<Integer> set = new TreeSet<>();
        set.add(2);
        System.out.println(set);
        Set<Integer> set1 = new TreeSet<>();
        set1.add(12);
        set.addAll(set1);
        System.out.println(set);
        System.out.println(set.contains(12));
        set.remove(12);
        System.out.println(set);
        System.out.println(set.size());
        set.remove(2);
        System.out.println(set.isEmpty());
    }
}
