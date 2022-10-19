package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Collection;
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
        CopyOnWriteArrayList list1 = new CopyOnWriteArrayList();
        list1.add(3);
        list1.add(0, 2);
        System.out.println(list1);

        CopyOnWriteArrayList list2 = new CopyOnWriteArrayList();
        list2.add(7);
        list1.addAll(list2);
        System.out.println(list1);

        CopyOnWriteArrayList list3 = new CopyOnWriteArrayList();
        list3.add(7);
        list3.add(4);
        list1.addAllAbsent(list3);
        System.out.println(list1);

        list1.addIfAbsent(10);
        System.out.println(list1);


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
        while (itr.hasNext()) {
            String s = itr.next();
            System.out.println(s);
            //if (s.startsWith("B")) {
                //the Iterator of CopyOnWriteArrayList can not perform remove operation
                // otherwise we get Run-time UnsupportedOperationException.
                //itr.remove();
            //}
        }
        System.out.println(list);
    }
}
