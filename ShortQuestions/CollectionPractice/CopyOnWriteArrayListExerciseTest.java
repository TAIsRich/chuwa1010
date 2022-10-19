package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class CopyOnWriteArrayListExerciseTest {

    /**
     * e.g.
     * List list = new CopyOnWriteArrayList();
     *
     * add(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addIfAbsent(E e)
     * addAllAbsent(Collection c)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        String[] arr = {"ni", "hao", "niu", "bi"};
        List<String> list = new CopyOnWriteArrayList<>();
        for(String s : arr) list.add(s);
        list.add(4, "a");
        List<String> copy = new CopyOnWriteArrayList<>();
        copy.add("wo");
        list.addAllIfAbsent(copy);
        list.addAll(copy);
        list.addIfAbsent("wo");
    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     */

    @Test
    public void learn_Iterator() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        //Created an iterator
        Iterator<String> itr = list.iterator();
        try {
            itr.remove();
        } catch(UnsupportedOperationException e) {
            e.printStackTrace();
        }

        while(itr.hasNext()) {
            System.out.print(itr.next());
        }
    }
}
