package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

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
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list1's size: " + list1.size());
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        System.out.println("list2's size: " + list2.size());
        System.out.println("list1 index of 1: " + list1.get(1));
        System.out.println("list2 index of 1: " + list2.get(1));
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
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.remove(1);
        System.out.println("after list1 remove index 1" + list1);

        list1.removeAll(list1);
        System.out.println("After remove all list1 " + list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(14);
        list2.add(15);
        list2.contains(11);
        System.out.println("check if list2 contains 11: " + list2.contains(11));
        System.out.println("check if list2 indexOf 12: " + list2.indexOf(12));
        System.out.println("check if list2 lastIndexof 14:  " + list2.lastIndexOf(14));

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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num == 3) {
                iterator.remove();
            }
        }
        System.out.println(list);

    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.sort((a, b) -> a - b);
        System.out.println("from small to large" + list);


        list.sort((a, b) -> b - a);
        System.out.println("from large to small" + list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        list1.sort(Comparator.reverseOrder());
        System.out.println("reverse order of list1" + list1);
    }
}
