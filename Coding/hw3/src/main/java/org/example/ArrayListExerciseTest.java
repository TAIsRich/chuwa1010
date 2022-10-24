package org.example;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
 */
public class ArrayListExerciseTest<E> {

    ArrayList<Integer> list= new ArrayList<>();;

    public <E> void print(E e){
        System.out.println(e);
    }
    public void printList(){
        for (Integer i:list){
            System.out.print(i+",");
        }
        System.out.println();
    }
    /**
     * new ArrayList()
     * add elements
     * get element
     * get Size
     * list.addAll(anotherList)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        list.add(1);
        list.add(2);
        list.add(3);
        print("get");
        print(list.get(1));
        print("size");
        print(list.size());
        print("addAll");
        list.addAll(Arrays.asList(4,5,6));
        printList();
    }


    @Test
    public void learn_Remove_Replacing_Updating() {
        list.addAll(Arrays.asList(1,2,3,4,5,6));
        print(" ");
//        /**
//         * remove(int index)
        list.remove(1);
        printList();
//         * remove(Object o)
        list.remove(new Integer(5));
        printList();
//         * removeRange(int fromIndex, int toIndex)
        list.subList(1,3).clear();
        printList();
//         * removeAll(Collection<?> c)

        print("removeAll");
        print(list.removeAll(list));
        printList();
        list.addAll(Arrays.asList(1,2,3,4,5,6));
//         * clear()
        print("clear");
        printList();
        list.clear();
        print("to");
        printList();
//         *
//         * Update:
//         * set(int index, E e)
        list.addAll(Arrays.asList(1,2,3,4,5,6));
        list.set(1,100);
        printList();
//         * replaceAll(UnaryOperator<E> operator)
        list.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer+1;
            }
        });
        printList();
        list.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer-1;
            }
        });
//         *
//         * check:
//         * contains(Object o)
        print("contain 100?");
        print(list.contains(100));
//         * indexOf(Object o)
        print("index of 100");
        print(list.indexOf(100));
//         * lastIndexOf(Object o)
        list.add(1);
        printList();
        print(list.lastIndexOf(1));
//         */
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
        list.addAll(Arrays.asList(1,2,3,4,5,6));
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            Integer i=it.next();
            if(i.equals(4))
                it.remove();
        }
        printList();
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print("use foreach,");
                print(integer);
            }
        });

    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        list.addAll(Arrays.asList(11,2,37,4,25,6));
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        printList();

        list.sort(Comparator.reverseOrder());
        printList();

        Collections.sort(list,(i,j)->{
            return i-j;
        });
        printList();
    }
}
