package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class CollectionsExerciseTest {

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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);
        System.out.println("the min number of list is: " + Collections.min(list));
        System.out.println("the min num using comparator is: " + Collections.min(list, (a, b) -> a.compareTo(b)));
        System.out.println("the max number of list is : " + Collections.max(list));
        System.out.println("the max num using comparator is: " + Collections.max(list, (a, b) -> a.compareTo(b)));

        System.out.println("frequency of the list with number 5: " + Collections.frequency(list, 5));


    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> syncList = Collections.synchronizedList(list);
        System.out.println("list: " + list);
        System.out.println("syncList: " + syncList);

        list.set(1, 7);
        System.out.println("list: " + list);
        System.out.println("syncList: " + syncList);


    }
}
