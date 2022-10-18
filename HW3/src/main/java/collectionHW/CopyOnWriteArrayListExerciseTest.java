package collectionHW;

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
        List<Integer> list = new CopyOnWriteArrayList();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(0,2);
        ((CopyOnWriteArrayList<Integer>) list).addIfAbsent(3);
        ((CopyOnWriteArrayList<Integer>) list).addAllAbsent(list);
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
        List<String> list = new CopyOnWriteArrayList();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        //Created an iterator
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String i =  itr.next();
            if (i.equals( "Apple") ){

                itr.remove();
            }
            System.out.println(i);
        }
    }
}
