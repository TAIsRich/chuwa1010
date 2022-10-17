package org.example;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("one", 1);
        map.putIfAbsent("two", 2);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("three", 3);
        map.putAll(map2);

        System.out.println(map.get("one"));
        map.getOrDefault("four", 0);
        System.out.println(map.containsKey("two"));
        System.out.println(map.containsValue(2));

        for(String i : map.keySet()){
            System.out.println(i);
        }
        for(int i : map.values()){
            System.out.println(i);
        }

        map.isEmpty();
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
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.replace("one", 1, 10);
        map.replace("two", 20);
        map.replaceAll((key, value) -> value.compareTo(20));
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        System.out.println(map);
        map.remove("three");
        map.remove("four", 4);
        System.out.println(map);

        map.compute("five", (k, v) -> v.compareTo(5));
        System.out.println(map);
    }
}
