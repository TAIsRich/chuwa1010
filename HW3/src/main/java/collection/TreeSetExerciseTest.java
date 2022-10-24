package collection;

import org.junit.Test;

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
        Set<Integer> set= new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        Set<Integer> subSet= new TreeSet<>();
        subSet.add(10);
        subSet.add(20);
        set.addAll(subSet);
        System.out.println("after add subset to set: " + set);

        System.out.println("set contains 10: " + set.contains(10));
        set.remove(1);
        System.out.println("After remove 1: " + set);
        System.out.println("set size: " + set.size());
        System.out.println("set is empty? " + set.isEmpty());

    }
}
