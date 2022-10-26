package Collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */

//The design of the CopyOnWriteArrayList uses an interesting technique to make it thread-safe without a need for synchronization.
//When we are using any of the modify methods – such as add() or remove() – the whole content of the CopyOnWriteArrayList is copied into the new internal copy.
//Due to this simple fact, we can iterate over the list in a safe way, even when concurrent modification is happening.

/********* Thread-safe without a need for synchronization*********/
public class CopyOnWriteArrayListExerciseTest {
    CopyOnWriteArrayList list = new CopyOnWriteArrayList();
    CopyOnWriteArrayList list2 = new CopyOnWriteArrayList();
    public void printList(){
        for (Object i:list){
            System.out.print(i+",");
        }
        System.out.println();
    }


    public <E> void print(E e){
        System.out.println(e);
    }
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
        list.add(1);
        list.add(0,0);
        list.addAll(list);
        printList();

        list.addIfAbsent(0);
        printList();
        list.addIfAbsent(2);
        printList();
        list2.add(3);
        list2.add(4);
        list.addAllAbsent(list2);
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
        while(itr.hasNext()){
            print(itr.next());
            /** The CopyOnWriteArrayList was created to allow for the possibility of
             safe iterating over elements even when the underlying list gets modified.
             Because of the copying mechanism, the remove() operation on the returned Iterator is not permitted
             – resulting with UnsupportedOperationException:
        **/
        }

    }
}
