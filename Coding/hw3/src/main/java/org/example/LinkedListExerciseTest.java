package org.example;

import org.junit.Test;



import java.util.function.Consumer;
import java.util.LinkedList;
/**
 * @author b1go
 * @date 6/12/22 4:45 PM
 */
public class LinkedListExerciseTest {

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
    @Test
    public void learn_Inserting_And_Retrieving() {
//        /**
//         * Inserting:
//         * add(E e) or addLast(E e)
        list.add(1);
        list.add(2);
        printList();
//         * addFirst(E e)
        list.addFirst(0);
        printList();
//         * add(int index, E element)
        list.add(3,3);
        printList();
//         * addAll(Collection c)
        list.addAll(list);
        printList();
//         * addAll(int index, Collection c)
        list.addAll(2,list);
        printList();
//         *
//         * Retrieving:
//         * getFirst()
        print(list.getFirst());
//         * getLast()
        print(list.getLast());
//         * get(int index)
        print(list.get(1));
//         *
//         */
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
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.remove(0);
        printList();
        list.remove(list.size()-1);
        printList();
        list.remove(1);
        printList();
        list.remove(new Integer(7));
        printList();
        list.removeLastOccurrence(5);
        printList();
        list.add(10);
        list.add(1);
        list.add(7);
        printList();
        print("sorted to");
        list.sort((a,b)->(a-b));
        printList();

    }
}
