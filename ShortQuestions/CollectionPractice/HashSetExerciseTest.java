package com.chuwa.exercise.collection;

import org.junit.Test;

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
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.addAll(Arrays.asList("b", "c"));
        boolean ifExist = set.contains("a");

        boolean ifRemoved = set.remove("a");
        set.clear();

        boolean ifEmpty = set.isEmpty();
    }
}
