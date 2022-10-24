package Coding.collection;

import org.junit.Test;
import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:47 PM
 */
public class HashMapExerciseTest {

    /**
     * e.g.
     * Map<String, Integer> map = new HashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     *
     * get(Object key)
     * getOrDefault(Object key, V defaultValue)
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
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("map is: " + map);

        map.putIfAbsent("four", 4);

        Map<String, Integer> new_map = new HashMap<>();
        new_map.put("five", 5);
        new_map.put("six", 6);
        map.putAll(new_map);
        System.out.println("map after put is: " + map);
        System.out.println("map get(three) is: " + map.get("three"));
        System.out.println("map getOrDefault is: " + map.getOrDefault("three",3));
        System.out.println("map containsKey(two) is: " + map.containsKey("two"));
        System.out.println("map containsValue(2) is: " + map.containsValue(2));
        System.out.println("map keySet() is: " + map.keySet());
        System.out.println("map values() is: " + map.values());
        System.out.println("map isEmpty() is: " + map.isEmpty());
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     * replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
     *
     * remove(Object key)
     * remove(Object key, Object value)
     *
     * compute(Key, BiFunction)
     * computeIfAbsent(Key, Function)
     * computeIfPresent(Key, BiFunction)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        System.out.println("map is: " + map);

        map.replace("two",2,20);
        map.replace("three",300);

        map.replaceAll((key, value) -> value * 2);
        map.remove("four");
        System.out.println("map is: " + map);
        map.compute("two", (key, value) -> value *2);
        map.computeIfAbsent("one", value -> 100 * 2);
        map.computeIfPresent("two", (key, value) -> value * 2);
        System.out.println("map is: " + map);

    }
}
