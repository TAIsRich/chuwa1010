package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
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
        set.add(7);
        set.add(3);
        set.add(11);
        System.out.println(set);

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(1);
        set.addAll(a);
        System.out.println(set);
        System.out.println("size: " + set.size());

        System.out.println(set.contains(7));

        System.out.println(set.first());
        System.out.println(set.last());


        System.out.println(set.subSet(2,7));
        System.out.println(set.headSet(7));
        System.out.println(set.tailSet(7));

        set.remove(7);
        System.out.println("After removing: " + set);
        set.clear();
        System.out.println(set.isEmpty());


    }
}
