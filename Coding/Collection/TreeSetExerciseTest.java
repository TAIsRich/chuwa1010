package Collection;

import org.junit.Test;

import java.util.TreeSet;

/**
 * TreeSet is one of the most important implementations of
 * the SortedSet interface in Java that uses a Tree for storage.
 */
public class TreeSetExerciseTest {
    TreeSet<String> set = new TreeSet<>();
    public void printSet(){
        System.out.println(set);
    }

    public <E> void print(E e){
        System.out.println(e);
    }
    /**
     * e.g.
     * Set<Integer> set= new TreeSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * contains(Object o)
     *
     * first()
     * last()
     * subSet(E fromElement, E toElement)
     * headSet(E toElement)
     * tailSet(E fromElement)
     *
     * remove(Object o)
     *
     * size()
     * isEmpty()
     *
     *
     */

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        set.add("Volvo");
        set.add("BMW");
        set.add("Ford");
        set.add("BMW");
        set.add("Mazda");
        TreeSet<String> set2= new TreeSet<>();
        set2.add("Benz");
        set.addAll(set2);
        printSet();

        print(set.contains("BMW"));
        print(set.first());
        print(set.last());
        print(set.subSet("Benz","Mazda"));
        print(set.headSet("Mazda"));
        print(set.tailSet("Mazda"));

        set.remove("BMW");
        print(set.size());
        print(set.isEmpty());

    }
}
