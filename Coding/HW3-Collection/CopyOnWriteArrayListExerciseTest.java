package Collection;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

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
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3,4);
        List<Integer> list1 = new CopyOnWriteArrayList<>();
        list1.add(5);
        list1.add(6);
        list.addAll(list1);
        list.addIfAbsent(5);
        List<Integer> list2 = new CopyOnWriteArrayList<>();
        list2.add(5);
        list2.add(7);
        list.addAllAbsent(list2);
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
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }
        while (iter.hasNext()){
            String a = iter.next();
            if (a.equalsIgnoreCase("Apple")){
                list.remove(a);
            }
        }

    }
}
