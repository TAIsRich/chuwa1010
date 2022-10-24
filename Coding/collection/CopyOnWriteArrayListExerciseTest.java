package Coding.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;
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
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.addIfAbsent(7);
        list.add(2,100);
        System.out.println("list is : "+list);

        CopyOnWriteArrayList<Integer> new_list = new CopyOnWriteArrayList();
        new_list.add(8);
        new_list.add(9);
        new_list.add(10);
        list.addAll(new_list);
        list.addIfAbsent(7);
        System.out.println("list is : "+list);

        new_list.add(12);
        new_list.add(15);
        list.addAllAbsent(new_list);
        System.out.println("list is : "+list);
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
        list.add("one");
        list.add("two");
        list.add("three");

        //Created an iterator
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }
        while (iter.hasNext()){
            String a = iter.next();
            if (a.equalsIgnoreCase("one")){
                list.remove(a);
            }
        }

    }
}
