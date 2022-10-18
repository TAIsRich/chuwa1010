package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        int a = Collections.min(list);
        System.out.println(a);

        int b = Collections.min(list, Comparator.reverseOrder());
        System.out.println(b);

        int c = Collections.max(list);
        System.out.println(c);

        int d = Collections.max(list, Comparator.reverseOrder());
        System.out.println(d);

        int e = Collections.frequency(list,1);
        System.out.println(e);





    }


    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {

    }


}
