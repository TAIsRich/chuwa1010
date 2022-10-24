package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Amy Liu
 * @date 10/17/22
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
        Set<Integer> set= new HashSet<>();
        set.add(1);
        set.add(9);
        set.addAll(new ArrayList<>( (Arrays.asList(1,2,3))));
        System.out.println("the original set: "+ set);

        if(set.contains(1)){
            set.remove(1);//remove the number 1;
        }
        System.out.println("set after removing 1: "+ set);

        set.clear();
        System.out.println("is the set empty? "+ set.isEmpty());

    }
}
