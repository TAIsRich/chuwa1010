package Collection;
import org.junit.Test;

import java.util.*;

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
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);

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
        list.add(2);
        list.add(3);
        list.remove(1);
        list.remove(new Integer(3));
        list.add(4);
        list.add(5);
        //list.removeRange(0,2);
        //list.removeAll(list);
        list.clear();
        System.out.println(list);
        list.add(6);
        list.add(7);
        list.add(8);
        list.set(0,3);
        list.replaceAll(e -> e*2);
        System.out.println(list);
        System.out.println(list.contains(6));
        System.out.println(list.indexOf(6));
        list.add(6);
        System.out.println(list.lastIndexOf(6));

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
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        while (iter.hasNext()){
            Integer a = iter.next();
            if (a.equals(2)){
                list.remove(a);
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
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
