import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class CopyOnWriteArrayListExerciseTest {
    List list = new CopyOnWriteArrayList();
    /**
     * e.g.
     * List list = new CopyOnWriteArrayList();
     *
     * add(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addIfAbsent(E e)
     * addAllAbsent(Collection c)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        list.add(3);
        list.add(0, 1);

    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     */

    @Test
    public void learn_Iterator() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        //Created an iterator
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ArrayList<String> aList = new ArrayList<String>();
        aList.add("Apple");
        aList.add("Mango");
        aList.add("Guava");
        aList.add("Orange");
        aList.add("Peach");
        System.out.println("The ArrayList elements are: ");
        for (String s: aList) {
            System.out.println(s);
        }
        Iterator i = aList.iterator();
        String str = "";
        while (i.hasNext()) {
            str = (String) i.next();
            if (str.equals("Orange")) {
                i.remove();
                System.out.println("\nThe element Orange is removed");
                break;
            }
        }
        System.out.println("\nThe ArrayList elements are: ");
        for (String s: aList) {
            System.out.println(s);
        }
    }
}
