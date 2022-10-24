package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Amy Liu
 * @date 10/17/22
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
        CopyOnWriteArrayList<Integer> list= new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5,7);
        System.out.println("the original list: " + list);

        List<Integer> subList= new ArrayList<Integer>() {{add(8);add(9); add(10);}};
        list.addAll(subList);
        System.out.println("new list: "+ list);

        list.addIfAbsent(15);
        list.addIfAbsent(10);
        System.out.println("new list after add 15, 10 if absent:" +list);

        list.addAllAbsent(subList);
        list.addAllAbsent(new ArrayList<Integer>() {{add(99);add(98);}});
        System.out.println("new list: "+ list);
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
        System.out.println(list);
        list.remove("Apple");
        System.out.println(list);

        //Created an iterator
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr);
//            if (itr.next().equals("Orange")) {
//
//                itr.remove();//remove() is not supported here.
//
//            }
        }

    }
}
