package org.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class TreeSetExerciseTest {
    /**
     * e.g.
     * Set<Integer> set= new TreeSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * contains(Object o)
     *
     * first()
     * last()
     * subSet(E fromElement, E toElement)
     * headSet(E toElement)
     * tailSet(E fromElement)
     *
     * remove(Object o)
     *
     * size()
     * isEmpty()
     *
     *
     */
    TreeSet<Integer> set = new TreeSet<>();
    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        printList();
        set.addAll(Arrays.asList(10,11));
        printList();
        print(set.contains(3));
        print(set.first());
        print(set.last());
        print(set.subSet(2,6));
        print(set.headSet(2));
        print(set.tailSet(10));
        set.remove(7);
        print(set.size());
        print(set.isEmpty());
        printList();

    }
    public <E> void print(E e){
        System.out.println(e);
    }
    public void printList(){
        set.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

                System.out.print(integer);
                System.out.print(",");
            }
        });
        System.out.println();
    }
}
