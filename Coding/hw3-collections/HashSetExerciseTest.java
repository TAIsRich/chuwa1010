package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

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
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);

        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);

        //no duplicate value in hashset
        hs.addAll(a);
        System.out.println(hs);
        //no get method
        System.out.println(hs.contains(1));
        hs.remove(2);
        System.out.println(hs);

        hs.clear();
        System.out.println(hs.isEmpty());
    }
}
