package org.example;

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
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println(a.get(2));
        System.out.println(a.size());

        ArrayList<Integer> b = new ArrayList<>();
        b.addAll(a);
        System.out.println(b);
        System.out.println();
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
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        
        a.remove(0);
        // removeRange is a protected method
        // so we need to use it with modifying the class like: public class Main extends ArrayList<Integer>
        // a.removeRange(1,2);

        a.removeAll(a);
        System.out.println("remove all: " + a);

        a.add(1);
        a.clear();
        System.out.println("clear: " + a);


        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(4);
        a.set(0,0);
        System.out.println("update: " + a.get(0));
        a.replaceAll(e -> e * 2);
        System.out.println("replace: " + a);

        System.out.println("check contains 0: " + a.contains(0));
        System.out.println("check index of 0: " + a.indexOf(0));
        System.out.println("check last index of 8: " + a.lastIndexOf(8));
        System.out.println();

        
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
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        Iterator i = a.iterator();
        if(i.hasNext()){
            System.out.println("iterator: " + i.next());
            i.forEachRemaining(e -> System.out.println("forEachRemaining: " + e));
            i.remove();
        }

    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(2);
        a.add(8);
        a.sort(Comparator.naturalOrder());
        System.out.println("natural order: " + a);

        Collections.sort(a);
        System.out.println("collections sort: " + a);
        a.sort(Comparator.reverseOrder());
        System.out.println("reverse order: "+ a);
    }
}
