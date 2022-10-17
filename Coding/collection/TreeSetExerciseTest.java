package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author Amy Liu
 * @date 10/17/22
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
    //A TreeSet is a set where the elements are sorted.
    // A HashSet is a set where the elements are not sorted or ordered.
    // It is faster than a TreeSet. The HashSet is an implementation of a Set.

    public void learn_Inserting_And_Retrieving_Removing() {
        TreeSet<Integer> set= new TreeSet<>();
        set.add(1);
        set.addAll(Arrays.asList(256,77,22,33,56,30));
        System.out.println("the original set: " + set);
        //the original set: [1, 22, 30, 33, 56, 77, 256]

        System.out.println("Contain 30? "+ set.contains(30));

        System.out.format("The 1st number is %d\n", set.first());
        System.out.format("The last number is %d\n", set.last());

        //Returns a view of the portion of this set whose elements range from fromElement,
        // inclusive, to toElement, exclusive. (If fromElement and toElement are equal, the
        // returned set is empty.) The returned set is backed by this set, so changes in
        // the returned set are reflected in this set, and vice-versa. The returned set
        // supports all optional set operations that this set supports.
        TreeSet<Integer> subSet= (TreeSet<Integer>) set.subSet(56, 256);// return [56,77]
        System.out.println("the subset from element 56 to 256: " + subSet);

        subSet= (TreeSet<Integer>) set.headSet(56);
        System.out.println("The subset from head to 56: " + subSet);
        subSet=(TreeSet<Integer>) set.tailSet(56);
        System.out.println("The subset from element 56 to tail: " + subSet);

        set.remove(Integer.valueOf(56));
        if(!set.isEmpty()){
            int size= set.size();
            System.out.format("Size of the set is: %d\n", size);
        }

        // %d: number placeholder %0nd means zero-padded number with a length
        // %xnd: number placeholder with x-padded in length n
        // %s: string placeholder
        System.out.format("\n%03d%s", 1, "apple");//001apple
    }
}
