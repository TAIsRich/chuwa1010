package org.example;

import org.junit.Test;

import java.util.*;


public class ArrayListExerciseTest {

    @Test
    public void learn_Inserting_And_Retrieving() {
        // new ArrayList()
        List<Integer> list = new ArrayList<>();

        // add elements
        list.add(0);
        list.add(4);
        list.add(10);

        // get elements
        list.get(1);

        // get size
        list.size();

        // list.addAll(anotherList)
        List<Integer> anotherList = new ArrayList<>();
        anotherList.addAll(list);
        System.out.println(anotherList);
    }

    @Test
    public void learn_Remove_Replacing_Updating() {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1,5,9,6,3,4,20,3)
        );
        // remove (int index)
        list.remove(2); // remove value 9

        // remove (object o)
        list.remove(Integer.valueOf(1));

        // removeRange(int fromIndex, int toIndex)
//        list.removeRange(0,1);

        // removeAll: list remove all elements that are equals to list 1
        List<Integer> list1 = new ArrayList<>(
                Arrays.asList(1,2,3,4)
        );
        list.removeAll(list1);
        System.out.println(list);

        // use clear(), if we want to remove all elements in list
        list.clear();

        //update:
        // set:
        list1.set(2, 5);

        //replaceAll:
        list1.replaceAll(e -> e*2);
        System.out.println(list1);

        // check:
        // contains
        list1.contains(2);

        // indexOf:
        list1.indexOf(2);

        // lastIndexOf:
        list1.add(2);
        list1.lastIndexOf(2);


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
        List<Integer> list = new ArrayList<>(
                Arrays.asList(3,6,7,3,8,9,10,3)
        );
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next());
        }

        while (iter.hasNext()){
            Integer a = iter.next();
            if (a.equals(3)){
                iter.remove();
            }

        }

        iter.forEachRemaining((e) -> System.out.println(e));


    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(3,6,7,3,10,9,8,1,3)
        );

        list.sort(Comparator.naturalOrder());
        list.sort(Comparator.reverseOrder());
        Collections.sort(list);

    }



}
