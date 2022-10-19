package Coding.collection;

import org.junit.Test;
import java.util.*;

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

        Set<Integer> new_set= new HashSet<>();
        new_set.add(7);
        new_set.add(8);
        new_set.add(9);
        set.addAll(new_set);
        System.out.println("set after add is : " + set);

        System.out.println("set after contains(3) is : " + set.contains(3));
        set.remove(3);
        System.out.println("remove(3) is : " +set);
        set.clear();
        System.out.println("set isEmpty(): " + set.isEmpty());

    }
}
