package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;


/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class CollectionsExerciseTest {
    ArrayList<Integer> list= new ArrayList<>();;

    public <E> void print(E e){
        System.out.println(e);
    }
    public void printList(){
        for (Integer i:list){
            System.out.print(i+",");
        }
        System.out.println();
    }
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
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        print(Collections.min(list));
        print(Collections.max(list));
        print(Collections.frequency(list,2));
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
            Collections.synchronizedList(list);
    }
}
