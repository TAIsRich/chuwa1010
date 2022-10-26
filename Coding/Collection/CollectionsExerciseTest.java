package Collection;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class CollectionsExerciseTest {
    LinkedList<Integer> list = new LinkedList<>();

    public <E> void print(E e){
        System.out.println(e);
    }

    public void printList(){
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print("->");
                System.out.print(integer);
            }
        });
        System.out.println();
    }

    public LinkedList setlist(){
        list.add(1);
        list.add(2);
        list.add(3);
        return list;
    }
    /**
     * Collections.min(list))
     * min(Collection c, Comparator comp)
     *
     * Collections.max(list)
     * max(Collection c, Comparator comp)
     *
     * frequency(Collection c, object o)
     */

    @Test
    public void learn_common_collections_operations() {
        setlist();
        print(Collections.min(list));
        print(Collections.min(list, Collections.reverseOrder()));
        printList();
        print(Collections.max(list));
        print(Collections.max(list, Collections.reverseOrder()));
        list.add(3);
        printList();
        print(Collections.frequency(list,3));
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        setlist();
        List synlist = Collections.synchronizedList(list);
        print(synlist);
        print(list);
    }
}
