package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
        List<Integer> list = Arrays.asList(new Integer[]{3, 8, 5, 9, 3, 10});

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list, Comparator.naturalOrder()));
        System.out.println(Collections.frequency(list,3));

    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> list = Arrays.asList(new Integer[]{3, 8, 5, 9, 3, 10});
        //thread-safe
        Collections.synchronizedList(list);

    }
}
