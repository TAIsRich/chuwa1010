package org.example;

import org.junit.Test;

import java.util.*;


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
        Set<Integer> set = new HashSet<>();
        set.add(1);
        List<Integer> list = new ArrayList<>(
              Arrays.asList(5,2,1,3)
        );
        set.addAll(list);
        set.contains(1);

        set.remove(2);
        set.clear();
        set.isEmpty();

    }
}
