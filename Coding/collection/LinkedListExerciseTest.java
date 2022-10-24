package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Amy Liu
 * @date 10/17/22
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
    @Test
    public void learn_Inserting_And_Retrieving() {
        LinkedList<Integer> list= new LinkedList<>();
        System.out.println("the original linked list: " + list);
        //inserting
        list.add(2);
        list.add(3);
        list.addFirst(9);
        list.addLast(100);
        list.add(1,0);
        System.out.println("Linkedlist after inserting numbers: "+ list);

        list.addAll(new LinkedList<>(Arrays.asList(11,12)));
        System.out.println("linkedlist after inserting a list: "+ list);

        list.addAll(3, new LinkedList<Integer>(Arrays.asList(13,14)));
        System.out.println("linked list after inserting a list at index 2: "+ list);

        //retrieving
        System.out.println("1st number: "+ list.getFirst());
        System.out.println("last number: "+ list.getLast());
        System.out.println("the number at index 3 which is the 4th number: "+ list.get(3));
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
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,6,7,8,9,22,9,22,44,6));
        System.out.println("the original linked list: " +list);

        list.remove(3); //index 3
        list.removeFirst();
        list.removeLast();
        System.out.println("the linked list after removing number at index 3, First, Last: "+ list);
        list.remove();//remove the first number
        System.out.println("the linked list after list.remove(): "+ list);

        //sort
        list.sort((a,b) ->a-b);//small to large
        System.out.println("list after sorting in ascending order with sort(): "+list);
        list.sort((a,b) ->b-a);//large to small
        System.out.println("list after sorting in descending order with sort(): "+list);

        Collections.sort(list);
        System.out.println("list after sorting in ascending order with Collections.sort(): "+list);
        Collections.sort(list, (a,b) -> b-a);//large to small;
        System.out.println("list after sorting in descending order with Collections.sort(): "+list);
    }
}
