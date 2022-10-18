package com.chuwa.exercise.collection;

import org.junit.Test;

/**
 * @author Wenbo Geng
 * @date 10/17/22 4:46 PM
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
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.addAll(new ArrayList<Integer> (Arrays.asList(1, 2, 3)));

        if (set.contains(1)) set.remove(2);

        set.clear();
    }
}
