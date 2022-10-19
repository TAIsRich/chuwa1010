package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;


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
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2,2);
        System.out.println("current list is"+ list);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6));
        list.addAll(list2);
        System.out.println("current list is"+ list);

        list.addIfAbsent(99);
        List<Integer> list3 = new ArrayList<>(Arrays.asList(10,11,12));
        list.addAllAbsent(list3);
        System.out.println("current list is"+ list);

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
        while(itr.hasNext()){
            if(itr.next().equals("Banana")){
                //the Iterator of CopyOnWriteArrayList can not perform remove operation
                // otherwise we get Run-time exception saying UnsupportedOperationException
                itr.remove();
            }
        }
    }
}
