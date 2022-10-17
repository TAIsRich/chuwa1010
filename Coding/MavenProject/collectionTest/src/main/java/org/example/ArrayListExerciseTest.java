package org.example;

import org.junit.Test;

import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
 */
public class ArrayListExerciseTest extends ArrayList{
    /**
     * new ArrayList()
     * add elements
     * get element
     * get Size
     * list.addAll(anotherList)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        int get = al.get(0);
        int size = al.size();
        List<Integer> l = new ArrayList<>();
        l.add(11);
        l.add(22);
        al.addAll(l);

        System.out.println(get);
        System.out.println(size);
        System.out.println(al);
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
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        Integer in = new Integer(6);
        arr1.add(in);
        System.out.println(arr1);

        arr1.remove(1);
        arr1.remove(in);
        System.out.println(arr1);

        ArrayListExerciseTest arr2 = new ArrayListExerciseTest();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        arr2.removeRange(0, 3);
        System.out.println(arr2);

        arr2.removeAll(arr1);
        System.out.println(arr2);

        arr2.clear();
        System.out.println(arr2);

        arr1.set(0, 2);
        arr1.replaceAll(e -> e.compareTo(3));
        System.out.println(arr1);

        System.out.println(arr1.contains(0));
        System.out.println(arr1.indexOf(0));
        arr1.add(0);
        System.out.println(arr1.lastIndexOf(0));

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
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        Iterator<Integer> it = arr.iterator();
//        while(it.hasNext()){
//            int a = it.next();
//            if(a == 3) it.remove();
//        }

        it.forEachRemaining(re -> System.out.println(re));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random ra = new Random();
            arr.add(ra.nextInt(20));
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
