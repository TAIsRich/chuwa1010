package com.chuwa.exercise.collection;

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
        List<Integer> array = new ArrayList<>();
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        int second = array.get(1);
        int size = array.size();

        System.out.println("array is:"+ array);
        System.out.println(" the second element is:" + second);
        System.out.println(" the size of  array is:" + size);

        List<Integer> array2 = new ArrayList<>();
        array2.addAll(array);
        System.out.println("another array is:"+ array2);
        System.out.println("--------");

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
        List<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println("the original array is "+ array);

        array.remove(2); // remove element of index 2
        array.remove(Integer.valueOf(5)); // remove Integer 5
        //array.removeRange(0,1);

        List<Integer> removeElem = new ArrayList<>(Arrays.asList(6,7,8));
        array.removeAll(removeElem);
        System.out.println("after several remove operation, the array is "+ array);

        System.out.println("--------");
        array.clear(); //remove all elems in array

        //update
        List<Integer> array2 = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println("the original array is "+ array2);
        array2.set(0,9);
        array2.replaceAll(e ->e*2); // double each number
        System.out.println("now the array is "+ array2);

        //check
        System.out.println(array2.contains(1)  );
        System.out.println(array2.indexOf(4) );
        System.out.println(array2.lastIndexOf(6));
        System.out.println("--------");
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

        List<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        Iterator<Integer> iter = array.iterator();
        System.out.println("the original array is "+ array);

        // remove specific number
        Integer elem = new Integer(0);
        int to_remove = 6;
        while (iter.hasNext()){
            elem = iter.next();

            if (elem.equals(to_remove)) {
                System.out.println("remove:" + to_remove);
                iter.remove();
                break;
            }
            System.out.println("read:"+elem);
        }

        iter.forEachRemaining((num) -> System.out.println("the remaining numbers :"+ num));
        System.out.println("--------");


    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<Integer> array = new ArrayList<>(Arrays.asList(4,5,6,2,1,3,7));
        System.out.println("the original array is "+ array);
        array.sort((a, b)->(a-b));
        System.out.println("after sorted:"+array);

        Collections.sort(array);
        System.out.println("after sorted:"+array);

        array.sort(Comparator.reverseOrder());
        System.out.println("after reversed sorted:"+array);

        System.out.println("--------");

    }
}
