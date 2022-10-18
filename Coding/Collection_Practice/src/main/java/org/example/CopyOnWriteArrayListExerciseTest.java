package org.example;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExerciseTest {
    /**
     * e.g.
     * List list = new CopyOnWriteArrayList();
     * <p>
     * add(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addIfAbsent(E e)
     * addAllAbsent(Collection c)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(5);
        list.add(7);
        list.add(1);
        list.add(0, 10);
        List<Integer> anotherList = new ArrayList<>(
                Arrays.asList(1, 2, 3)
        );
        list.addAll(anotherList);
        list.addIfAbsent(20);
        List<Integer> list1 = new ArrayList<>(
                Arrays.asList(5, 10, 15)
        );
        list.addAllAbsent(list1);
        System.out.println(list);

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
        }
        // ?????????? remove
        while (itr.hasNext()){
            String s = itr.next();
            if (s.equals("Apple")){
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
