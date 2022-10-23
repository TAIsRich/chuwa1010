package org.example;

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
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        list.add(3);
        list.add(0,2);

        CopyOnWriteArrayList listb = new CopyOnWriteArrayList();
        listb.addAll(0,list);
        listb.addIfAbsent(1);
        listb.addAllAbsent(list);

        System.out.println(listb);
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
        while (itr.hasNext()){
            String s = itr.next();
            System.out.println(s);
            if(s.equals("Orange")) {
               // not a mutable collection, UnsupportedOperationException
                // itr.remove();
            }
        }


    }
}
