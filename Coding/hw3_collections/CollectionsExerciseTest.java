package com.chuwa.exercise.collection;

import org.junit.Test;

/**
 * @author Wenbo Geng
 * @date 10/17/22 4:46 PM
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
        List<Integer> list = new ArrayList<> (Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        int min1 = Collections.min(list);
        int min2 = Collections.min(list, (a, b) -> b.compareTo(a));

        int max1 = Collections.max(list);
        int max2 = Collections.max(list, (a, b) -> b.compareTo(a));

        int target = 5;
        int freq = Collections.frequency(list, target);
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> list = new ArrayList<> (Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> syncList = Collections.synchronizedList(list);
    }
}
