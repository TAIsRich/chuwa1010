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
    Set<Integer> set= new HashSet<>();

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);

        set.remove(2);
        set.remove(3);
        System.out.println(set.isEmpty());
    }
}
