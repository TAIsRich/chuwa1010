package org.example;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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
    CopyOnWriteArrayList list = new CopyOnWriteArrayList();
    public <E> void print(E e){
        System.out.println(e);
    }
    public void printList(){
        for (Object i:list){
            System.out.print(i+",");
        }
        System.out.println();
    }
    @Test
    public void learn_Inserting_And_Retrieving() {
        list.add("first");
        list.add(0,0);
        printList();
        list.addAll(list);
        printList();
        list.addIfAbsent("first");
        list.addIfAbsent(1);
        CopyOnWriteArrayList l1 = new CopyOnWriteArrayList();
        l1.add(3);
        l1.add(3);
        list.addAllAbsent(l1);
        printList();
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
            String s=itr.next();
            if(s.equals("Apple"))
                itr.remove();
        }
    }
}
