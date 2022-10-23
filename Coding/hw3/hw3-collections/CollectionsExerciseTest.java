package org.example;

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
        List<Integer> list = Arrays.asList(new Integer[]{1, 5, 2, 2});

        System.out.println(Collections.min(list));//1
        System.out.println(Collections.max(list, Comparator.naturalOrder()));//5
        System.out.println(Collections.frequency(list,2));
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> list = Arrays.asList(new Integer[]{1, 5, 2, 2});
        System.out.println(Collections.synchronizedList(list));
        //a thread won't be able to modify the list while another thread is currently running a method from this list.
        // The object is locked while processing method.
    }
}
