package com.chuwa.collection;

import org.junit.Test;
import java.util.*;

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
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);

        System.out.println(Collections.min(list));
        System.out.println(Collections.min(list, Comparator.reverseOrder()));
        System.out.println(Collections.max(list));
        System.out.println(Collections.max(list, Comparator.reverseOrder()));

        System.out.println(Collections.frequency(list,1));

        System.out.println("--------");

    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(Collections.synchronizedList(list));

    }
}
