package org.example.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.get(0);
        list.size();

        List<Integer> newList = new ArrayList<>();
        newList.addAll(list);
        System.out.println("=====ArrayList: Inserting And Retrieving=====");
        System.out.println(list);
        System.out.println(newList);
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
        List<String> list = new ArrayList<>();
        list.add("Aa");
        list.add("Bb");
        list.add("Cc");
        list.set(0, "Xx");
        System.out.println(list.indexOf("Xx"));
        System.out.println(list.contains("Xx"));
        System.out.println(list.contains("Aa"));

        list.replaceAll(e -> e.toLowerCase());
        list.removeAll(list);

        list.add("Dd");
        list.add("Ee");
        list.add("Ff");
        System.out.println(list.lastIndexOf("Ff"));
        list.remove(0);
        list.remove(new String("Ee"));
        // list.removeRange(0, 1);
        list.clear();
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
        List<String> list = new ArrayList<>();
        list.add("Today");
        list.add("is");
        list.add("Friday");
        list.add("Monday");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if (str.equals("Monday")) {
                iter.remove();
                continue;
            }
            System.out.print(str + " ");
        }

        iter.forEachRemaining((element) -> System.out.println(element));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<String> list = new ArrayList<>();
        list.add("Aa");
        list.add("Bb");
        list.add("Cc");

        list.sort(Comparator.naturalOrder());
        list.sort(Comparator.reverseOrder());
        Collections.sort(list);
    }
}
