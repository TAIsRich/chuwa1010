package Coding.collection;

import org.junit.Test;
import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:47 PM
 */
public class TreeMapExerciseTest {

    /**
     * e.g.
     * TreeMap<String, Integer> map = new TreeMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     *
     * get(Object key)
     * firstKey()
     * lastKey()
     *
     * containsKey(Object key)
     * containsValue(Object value)
     *
     * keySet()
     * values()
     * isEmpty()
     */

    @Test
    public void learn_Inserting_And_Retrieving() {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("map is: " + map);

        map.putIfAbsent("four", 4);
        System.out.println("map putIfAbsent: " + map);
        TreeMap<String, Integer> new_map = new TreeMap<>();
        new_map.put("five", 5);
        new_map.put("six", 6);
        new_map.put("seven", 7);
        map.putAll(new_map);
        System.out.println("putAll: " + map);
        System.out.println("get(Object key): " + map.get("one"));
        System.out.println("firstKey(): " + map.firstKey());
        System.out.println("lastKey(): " + map.lastKey());
        System.out.println("containsKey(Object key): " + map.containsKey("one"));
        System.out.println("containsValue(Object value): " + map.containsValue(1));
        System.out.println("keySet(): " + map.keySet());
        System.out.println("values(): " + map.values());
        System.out.println("isEmpty(): " + map.isEmpty());

    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        System.out.println("map is: " + map);
        map.replace("two", 2, 20);
        map.replace("three", 30);
        map.remove("four");
        System.out.println("map is: " + map);


    }
}
