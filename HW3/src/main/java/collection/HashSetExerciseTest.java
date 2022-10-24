package collection;

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
        Set<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println("set: " + set);

        Set<Integer> set1= new HashSet<>();
        set1.add(7);
        set.addAll(set1);
        System.out.println("set after addAll: " + set);

        set.contains(1);
        System.out.println("set contains 1: " + set.contains(1));

        set.remove(1);
        System.out.println("set remove 1: " + set);

        set.clear();
        System.out.println("set after clear: " + set);

        System.out.println("set is empty? " + set.isEmpty());
    }
}
