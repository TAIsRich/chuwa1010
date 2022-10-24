package Coding.collection;

import org.junit.Test;
import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class LinkedHashMapExerciseTest {
    /**
     * e.g.
     * HashMap<String, Integer> map = new LinkedHashMap<>();
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
        HashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        System.out.println("map" + map);
        map.putIfAbsent("five", 5);
        System.out.println("map putIfAbsent(K key, V value) is: " + map);

        LinkedHashMap<String,Integer> new_map = new LinkedHashMap<>();
        new_map.put("sixth",6);
        new_map.put("seventh",7);
        map.putAll(new_map);
        System.out.println("map putAll is: " + map);

        System.out.println("map get(Object key) is: " + map.get("four"));
        System.out.println("map getOrDefault is: " + map.getOrDefault("four", 4));
        System.out.println("map containsKey is: " + map.containsKey("two"));
        System.out.println("map containsValue is: " + map.containsValue(2));
        System.out.println("keySet() is: " + map.keySet());
        System.out.println("values() is: " + map.values());
        System.out.println("isEmpty() is: " + map.isEmpty());

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
        HashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        System.out.println("map" + map);
        map.replace("two", 2, 20);
        System.out.println("replace(K key, V oldValue, V newValue) is: " + map);
        map.replace("three", 30);
        System.out.println("replace(K key, V value) is: " + map);
        map.replaceAll((key, Integer) -> Integer * 100);
        System.out.println("map" + map);

        map.remove("four");
        map.remove("two", 2000);
        System.out.println("map remove" + map);

        map.compute("one", (key, value) -> value *2);
        map.computeIfAbsent("ten", value -> 1000 * 2);
        map.computeIfPresent("one", (key, value) -> value * 2);
        System.out.println("map" + map);


    }
}
