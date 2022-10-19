package com.chuwa.exercise.collection;

import org.junit.Test;

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
        int[] arr = {1, 2, 3, 4, 5, 6};
        List<Integer> list = new ArrayList<>();
        for(int num : arr) list.add(num);
        List<Integer> copy = new ArrayList<>();
        int size = list.size();
        for(int i=0; i<size; i++) copy.add(list.get(i));
        list.addAll(copy);
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
        String[] arr = {"ni", "hao", "niu", "bi"};
        List<String> list = new ArrayList<>();
        for(String s : arr) list.add(s);
        list.remove(3);
        list.remove("bi");
        list.removeRange(0, 2);
        List<String> rm = new ArrayList<>();
        rm.add("niu"); rm.add("bi");
        list.removeAll(rm);
        rm.clear();

        list.set(0, "wo");
        list.replaceAll(s -> s.toLowerCase()); //lambda
//        list.replaceAll(new MyOperator());
//        class MyOperator implements UnaryOperator<String>
//        {
//            @Override
//            public String apply(String t) {
//                return t.toLowerCase();
//            }
//        }

        boolean isExist = list.contains("wo");
        int firstIdx = list.indexOf("wo");
        int lastIdx = list.lastIndexOf("wo");
        

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
        String[] arr = {"ni", "hao", "niu", "bi"};
        List<String> list = new ArrayList<>();
        for(String s : arr) list.add(s);
        Iterator it = list.iterator();
        while(it.hasNext()) {
            String tmp = it.next();
            if(tmp.equals("wo")) it.remove();
            else System.out.print(tmp);
        }

        //省去while, more concise
        it.forEachRemaining((element) -> System.out.print(element));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        String[] arr = {"ni", "hao", "niu", "bi"};
        List<String> list = new ArrayList<>();
        for(String s : arr) list.add(s);
        Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
    }
}
