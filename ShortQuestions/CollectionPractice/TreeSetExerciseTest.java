package com.chuwa.exercise.collection;

import org.junit.Test;

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
        set.add(0);
        set.addAll(Arrays.asList(1, 2, 3));

        boolean ifExist = set.contains(1);

        int min = set.first(), max = set.last();
        TreeSet<Integer> sub_set = (TreeSet<Integer>)tree_set.subSet(0, 2);
        TreeSet<Integer> head_set = (TreeSet<Integer>)tree_set.subSet(2);
        TreeSet<Integer> tail_set = (TreeSet<Integer>)tree_set.subSet(1);

    }
}
