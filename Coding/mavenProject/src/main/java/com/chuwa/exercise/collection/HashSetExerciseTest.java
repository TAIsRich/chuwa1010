package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class HashSetExerciseTest {
    /**
     * e.g.
     * Set<Integer> set= new HashSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * get()
     * contains()
     *
     * remove(Object o)
     * clear()
     *
     * isEmpty()
     *
     *
     */

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        Set<Integer> set = new HashSet<Integer>();
        set.add(5);

        ArrayList a = new ArrayList();
        a.add(5);
        a.add(8);

        //no duplicate value in hashset
        set.addAll(a);
        System.out.println(set);
        //no get method
        System.out.println(set.contains(1));
        set.remove(5);
        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());
    }
}
