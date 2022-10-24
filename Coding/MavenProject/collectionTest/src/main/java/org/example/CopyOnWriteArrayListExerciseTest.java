package org.example;

import org.junit.Test;

import java.util.ArrayList;
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
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList();
        list.add(2);
        list.add(0, 1);
        List<Integer> ls = new ArrayList<>();
        ls.add(3);
        list.addAll(ls);
        list.addIfAbsent(2);
        list.addIfAbsent(4);
        List<Integer> ls1 = new ArrayList<>();
        ls1.add(5);
        list.addAllAbsent(ls1);
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
        while(itr.hasNext()){
            String a = itr.next();
            //CopyOnWriteArrayList 不支持iterator的remove
//            if(a.equals("Apple"))
//                itr.remove();

            System.out.println(a);
        }
    }
}
