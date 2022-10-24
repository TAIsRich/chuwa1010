package Coding.collection;

import org.junit.Test;
import java.util.*;

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
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.addAll(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("First element in TreeSet " + ((TreeSet<Integer>) set).first());
        System.out.println("Last element in TreeSet " + ((TreeSet<Integer>) set).last());
        System.out.println("subSet(E fromElement, E toElement): " + ((TreeSet<Integer>) set).subSet(1,3));
        System.out.println("headSet(E toElement): " + ((TreeSet<Integer>) set).headSet(1));
        System.out.println("tailSet(E fromElement): " + ((TreeSet<Integer>) set).tailSet(0));
        System.out.println("Less than 5 " + ((TreeSet<Integer>) set).headSet(40));
        System.out.println("Great than 1 " + ((TreeSet<Integer>) set).tailSet(40));
        System.out.println(set.size());
        System.out.println("isEmpty()" +set.isEmpty());

    }
}
