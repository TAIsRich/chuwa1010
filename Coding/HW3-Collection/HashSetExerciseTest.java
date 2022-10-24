package Collection;
import org.junit.Test;

import java.util.*;

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
        HashSet<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        set.addAll(list);
        System.out.println(set);
        System.out.println(set.contains(3));
        set.remove(new Integer(6));
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());

    }
}