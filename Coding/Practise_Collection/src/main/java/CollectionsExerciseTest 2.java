import org.junit.Test;

import java.util.*;
import static java.util.Collections.synchronizedList;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class CollectionsExerciseTest {
    LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1,2,3,4,5));
    /**
     * Collections.min(list))
     * min(Collection c, Comparator comp)
     *
     * Collections.max(list)
     * max(Collection c, Comparator comp)
     *
     * frequency(Collection c, object o)
     */

    @Test
    public void learn_common_collections_operations() {
        int min = Collections.min(numbers);
        System.out.println(min);
        int max = Collections.max(numbers);
        System.out.println(max);

        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(9);
        list.add(75);

        System.out.println("Total number of times,9 is present in the List is: " + Collections.frequency(list, 9));
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> thread_safe_list = synchronizedList(numbers);
    }
}
