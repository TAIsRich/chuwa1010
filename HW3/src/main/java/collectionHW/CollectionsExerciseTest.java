package collectionHW;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class CollectionsExerciseTest {

    /**
     * Collections.min(list))
     * min(Collection c, Comparator comp)
     * <p>
     * Collections.max(list)
     * max(Collection c, Comparator comp)
     * <p>
     * frequency(Collection c, object o)
     */

    @Test
    public void learn_common_collections_operations() {
        List<Integer> list = new LinkedList<Integer>();

        // populate the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // printing the List
        System.out.println("List: " + list);

        // getting minimum value
        // using min() method
        int min = Collections.min(list);

        // printing the min value
        System.out.println("Minimum value is: " + min);

        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, 4));


    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {



            // creating object of List<Integer>
            List<Integer> list = new ArrayList<Integer>();

            // populate the list
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);

            // printing the Collection
            System.out.println("List : " + list);

            // create a synchronized list
            List<Integer> synlist = Collections
                    .synchronizedList(list);

            // printing the Collection
            System.out.println("Synchronized list is : " + synlist);



    }

}
