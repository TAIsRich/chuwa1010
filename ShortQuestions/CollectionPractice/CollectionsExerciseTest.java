package com.chuwa.exercise.collection;

import org.junit.Test;

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
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> list = Arrays.asList(numbers);
        int min = Collections.min(list), max = Collections.max(list);
        int min2 = Collections.min(list, Collections.reverseOrder()); // 10
        int max2 = Collections.max(list, Collections.reverseOrder()); // 1

        list.add(1);
        int freq = Collections.frequency(list, 1); //2
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> list = Arrays.asList(numbers);
//        return a synchronized (thread-safe) list backed by the specified list.
        List<Integer> synlist = Collections.synchronizedList(list);
    }
}
