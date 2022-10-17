package org.example;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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
        TreeSet<String> set= new TreeSet<>();
        set.add("Volvo");
        set.add("BMW");
        set.add("Ford");
        set.add("BMW");
        set.add("Mazda");
        Set<String> set2= new HashSet<>();
        set2.add("Benz");
        set.addAll(set2);
        System.out.println(set);

        //set.get();
        System.out.println(set.contains("Volvo"));

        System.out.println(set.first());
        System.out.println(set.last());

        System.out.println(set.subSet("Ford", "Volvo"));
        System.out.println(set.headSet("Ford"));
        System.out.println(set.tailSet("Ford"));
        System.out.println(set.size());

        set.remove("BMW");
        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());
    }
}
