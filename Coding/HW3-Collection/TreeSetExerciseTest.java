package Collection;
import org.junit.Test;

import java.util.*;

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
        TreeSet<Integer> set= new TreeSet<>();
        set.add(4);
        set.add(3);
        set.add(1);
        set.add(2);
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        set.addAll(list);
        System.out.println(set);
        System.out.println(set.contains(new Integer(4)));
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.subSet(1,4));
        System.out.println(set.headSet(4));
        System.out.println(set.tailSet(4));
        set.remove(new Integer(6));
        System.out.println(set.size());
        System.out.println(set.isEmpty());

    }
}
