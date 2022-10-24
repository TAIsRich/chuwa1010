package org.example;

import org.junit.Test;

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
    HashSet<Integer> set = new HashSet<>();
    public <E> void print(E e){
        System.out.println(e);
    }
    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        set.add(1);
        set.add(3);
        print(set.contains(2));
        print(set.contains(3));
        print(set.remove(3));
        print(set.contains(3));
        set.clear();
        print(set.isEmpty());

    }
}
