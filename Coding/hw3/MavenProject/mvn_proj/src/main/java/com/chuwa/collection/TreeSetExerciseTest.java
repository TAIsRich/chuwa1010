package com.chuwa.exercise.collection;

import org.junit.Test;
import java.util.*;

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
        set.add(2);

        List<Integer> list = new ArrayList<>(Arrays.asList(4,1,3,5));
        set.addAll(list);

        set.contains(1);
        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.subSet(2,4));
        System.out.println(set.headSet(3));
        System.out.println(set.tailSet(3));

        set.remove(2);
        System.out.println(set.size());
        System.out.println(set.isEmpty());


    }
}
