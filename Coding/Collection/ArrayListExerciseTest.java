package Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
 */
public class ArrayListExerciseTest {

    List list = new ArrayList<>();

    public List setList() {
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        this.list = list;
        return list;
    }

    public void printList(){
        for (Object i:list){
            System.out.print(i+",");
        }
        System.out.println();
    }


    public <E> void print(E e){
        System.out.println(e);
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

        list = setList();
        printList();
        //printList2();
        print(list.size());
        print(list.get(2));
        print(list.get(5));

        // sublist does not include the last index of ()
        list.addAll(list.subList(2,5));
        printList();
    }

    /**
     * remove(int index)
     * remove(Object o)
     * removeRange(int fromIndex, int toIndex)
     * removeAll(Collection<?> c)
     * clear()
     */
    @Test
    public void learn_Remove_Replacing_Updating() {

        list = setList();
        printList();
        print("remove index 1");
        list.remove(1);
        printList();
        print("remove element Four");
        list.remove( "Four");
        printList();
        print ("remove range 0-2");
        list.subList(0,3).clear();
        printList();

        print("list: remove all()//括号中变量可以是别的object,这样就会移除相同object");
        print(list.removeAll(list));

        printList();
        list.clear();
        print("clear");
        printList();

        /**
         *  Update:
        * set(int index, E e)
        * replaceAll(UnaryOperator<E> operator)
         **/
        list = setList();
        list.set(0,"Eleven");
        print(list);
        list.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String o) {
                return o.toLowerCase();
            }
        });
        print(list);
        /**
         *   * check:
         *      * contains(Object o)
         *      * indexOf(Object o)
         *      * lastIndexOf(Object o)
         */
        print(list.contains("two"));
        // no way
        print(list.contains("Two"));
        print(list.indexOf("four"));
        //no way
        print(list.lastIndexOf("Seven"));

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
    list = setList();
    Iterator<String> iterator = list.iterator();
    while( iterator.hasNext()){
        String s = iterator.next();
        if (s.equals("Three"))
            iterator.remove();
    }
    printList();

    //for each: the operation cannot modify the underlying source of elements so we can say that behavior of this method is unspecified
    list.forEach(new Consumer<String>() {
        @Override
        public void accept(String s) {
            s.toUpperCase();
            print(s);
        }
    });

    list.forEach((n)-> print(n));

    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {

    }
}
