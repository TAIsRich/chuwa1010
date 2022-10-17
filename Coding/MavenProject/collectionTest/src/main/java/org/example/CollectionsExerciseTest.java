package org.example;

import org.junit.Test;

import java.util.ArrayList;
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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(Collections.min(list));
        System.out.println(Collections.min(list, Collections.reverseOrder()));

        System.out.println(Collections.max(list));
        System.out.println(Collections.max(list, Collections.reverseOrder()));

        list.add(1);
        System.out.println(Collections.frequency(list, 1));
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {

        //The synchronizedList() method of java.util.Collections class is used to return a
        // synchronized (thread-safe) list backed by the specified list.
        // In order to guarantee serial access, it is critical that all access to the backing list
        // is accomplished through the returned list.
        List<String> list = new ArrayList<String>();

        // populate the list
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // printing the Collection
        System.out.println("List : " + list);

        // create a synchronized list
        List<String> synlist = Collections
                .synchronizedList(list);

        // printing the Collection
        System.out.println("Synchronized list is : " + synlist);
    }
}
