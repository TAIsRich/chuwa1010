package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author Amy Liu
 * @date 10/17/22
 */
public class ArrayListExerciseTest {
    /**
     * new ArrayList()
     * add elements
     * get element
     * get Size
     * list.addAll(anotherList)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(123);
        System.out.println(integerList.get(0));
    }

    /**
     * remove(int index)
     * remove(Object o)
     * removeRange(int fromIndex, int toIndex)
     * removeAll(Collection<?> c)
     * clear()
     *
     * Update:
     * set(int index, E e)
     * replaceAll(UnaryOperator<E> operator)
     *
     * check:
     * contains(Object o)
     * indexOf(Object o)
     * lastIndexOf(Object o)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(33);
        list.add(99);
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list.get(0));
        list.set(0, 44);
        System.out.println((list));
        list.replaceAll(e -> e*2);
        System.out.println(list.contains(99));

        List<Integer> list2= new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
        }
        };
        List<Integer> list3= new ArrayList<>();
        list3.addAll(list2);

        List<Integer> list4 = new ArrayList<> (Arrays.asList(1,2,3));

    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     * forEachRemaining(Consumer<? super E> action) -- from Java8
     */

    @Test
    public void learn_Iterator() {
        List<Integer> list= new ArrayList<> (Arrays.asList(1,2,3,4,5,6,7));
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int num= iterator.next();
            System.out.print(num + " ");

            if(num==4){
                iterator.remove();
            }
        }
        System.out.println(list);// 4 is not existed in the list anymore
        list.iterator().forEachRemaining(num -> System.out.println(num));

    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        //sort
        List<Integer> list1= new ArrayList<>(Arrays.asList(34,45,2,5,6,4,46,22,6));
        System.out.println("The original order: " + list1);

        list1.sort((a,b) -> a-b);
        System.out.println("Sorting in ascending order((a-b) -> a-b: " + list1);
        list1.sort((a,b) -> b-a);
        System.out.println("Sorting in decreasing order((a-b) -> b-a: " + list1);

        //Collections.sort
        List<Integer> list2= new ArrayList<>(Arrays.asList(34,45,2,5,6,4,46,22,6));
        System.out.println("The original order: " + list2);
        Collections.sort(list2);
        System.out.println("Sorting in ascending order with Collections.sort(): "+ list2);
        Collections.sort(list2, (a,b)-> b-a);
        System.out.println("Sorting in descending order with Collections.sort(list2, (a,b)-> b-a): "+ list2);

        //Comparator.reverseOrder()
        List<Integer> list3= new ArrayList<>(Arrays.asList(34,45,2,5,6,4,46,22,6));
        System.out.println("The original order: " + list3);
        list3.sort(Comparator.reverseOrder());
        System.out.println("Sorting in descending order with Comparator.reverseOrder(): "+ list2);

        //Collections.sort(list, Comparator.reverseOrder())
        List<Integer> list4= new ArrayList<>(Arrays.asList(34,45,2,5,6,4,46,22,6));
        System.out.println("The original order: " + list4);
        Collections.sort(list4, Comparator.reverseOrder());
        System.out.println("Sorting in descending order with Collections.sort(list, Comparator.reverseOrder()): "+ list4);
    }
}