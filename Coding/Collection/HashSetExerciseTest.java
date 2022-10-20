package Collection;

import org.junit.Test;

import java.util.HashSet;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
public class HashSetExerciseTest {
    /**
     * A HashSet is a collection of items where every item is unique
     * e.g.
     * Set<Integer> set= new HashSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * get()
     * contains()
     *
     * remove(Object o)
     * clear()
     *
     * isEmpty()
     *
     *
     */

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        HashSet<String> set2= new HashSet<>();
        set2.add("Benz");
        set2.add("RR");
        cars.addAll(set2);
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println(cars.contains("Benz"));

        cars.remove("RR");
        System.out.println(cars);

        cars.clear();
        System.out.println(cars.isEmpty());
    }
}
