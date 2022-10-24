package org.example;

import org.junit.Test;

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
        Set<String> set= new HashSet<>();
        set.add("Volvo");
        set.add("BMW");
        set.add("Ford");
        set.add("BMW");
        set.add("Mazda");
        Set<String> set2= new HashSet<>();
        set2.add("Benz");
        set.addAll(set2);

        //set.get();
        System.out.println(set.contains("Volvo"));

        System.out.println(set);

        set.remove("BMW");
        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());
    }
}
