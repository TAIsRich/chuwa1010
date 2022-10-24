package collectionHW;

import org.junit.Test;

import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
 */
public class ArrayListExerciseTest extends ArrayList<Integer>{
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
        list.add(4);
        list.add(3);
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list);
        list.addAll(list);
        System.out.println(list);

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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(11);
        list.add(7);
        list.remove(1);
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("JavaFX");
        list1.add("Java");
        list.removeAll(list);
        System.out.println(list);
        list1.clear();
        System.out.println(list1+"Clear list1");
        ArrayList<String> list2 = new ArrayList<String>();
        list1.add("JavaFX");
        list1.add("Java");
        System.out.println(list2.contains("java"));
        System.out.println(list2.indexOf(0));
        System.out.println(list2.lastIndexOf("java"));

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
        ArrayList<Integer> arr = new ArrayList<Integer>(5);

        // using add() to initialize values
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        // printing initial value
        System.out.print("The initial values in ArrayList are : ");
        for (Integer value : arr) {
            System.out.print(value);
            System.out.print(" ");
        }
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(4);
        list.add(6);
        list.add(8);
        Iterator<Integer> it= list.iterator();
        while ((it.hasNext())){
            int i = it.next();

            System.out.println(it.next());
            if(i%2!=0){
                it.remove();

            }


        }
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(3);
        list.add(10);
        list.add(6);
        list.add(5);
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

    }
}
