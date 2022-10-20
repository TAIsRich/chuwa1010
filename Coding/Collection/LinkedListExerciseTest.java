package Collection;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;


/**
 * @author b1go
 * @date 6/12/22 4:45 PM
 */
public class LinkedListExerciseTest {

    LinkedList<Integer> list = new LinkedList<>();

    public <E> void print(E e){
        System.out.println(e);
    }

    public void printList(){
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print("->");
                System.out.print(integer);
            }
        });
        System.out.println();
    }

    public LinkedList setlist(){
        list.add(1);
        list.add(2);
        list.add(3);
        return list;
    }

    /**
     * e.g.
     * List<Integer> list = new LinkedList<Integer>();
     * Inserting:
     * add(E e) or addLast(E e)
     * addFirst(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addAll(int index, Collection c)
     *
     * Retrieving:
     * getFirst()
     * getLast()
     * get(int index)
     *
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        LinkedList list = setlist();
        printList();
        list.addFirst(0);
        printList();
        list.add(4,4);
        printList();
        list.addLast(5);
        printList();
        list.addAll(list);
        printList();
        list.addAll(2,list);
        printList();

        print(list.getFirst());
        print(list.getLast());
        print(list.get(3));
    }

    /**
     * removeFirst()
     * removeLast()
     * remove(int index)
     * remove(Object o)
     * removeLastOccurrence()
     *
     * sort()
     */

    @Test
    public void learn_Remove_Sort() {
        list = setlist();
        list.addAll(list);
        list.addAll(list);
        printList();
        list.removeFirst();
        list.removeLast();
        printList();
        list.remove(3);
        printList();

        print("remove object");
        //只会移除第一个 找到的数据
        list.remove(new Integer(3));
        printList();
        list .removeLastOccurrence(3);
        printList();
    }
}
