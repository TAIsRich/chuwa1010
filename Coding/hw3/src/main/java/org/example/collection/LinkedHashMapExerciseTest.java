package org.example.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

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
        map.put("map_key_1", 1);
        map.put("map_key_2", 2);
        map.put("map_key_3", 3);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("map_key_4", 4);
        map.putAll(map2);

        map.putIfAbsent("map_key_5", 5);

        System.out.println(map);
        System.out.println(map.get("map_key_5"));
        System.out.println(map.getOrDefault("map_key_5", 9));
        System.out.println(map.getOrDefault("map_key_6", 6));
        System.out.println(map.containsKey("map_key_6"));
        System.out.println(map.containsValue(6));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.isEmpty());
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
        map.put("map_key_1", 1);
        map.put("map_key_2", 2);
        map.put("map_key_3", 3);

        map.replace("map_key_3", 3, 9);
        map.replace("map_key_3", 8);
        map.replaceAll((key, value) -> value * 2);

        map.remove("map_key_3");
        map.remove("map_key_2", 2);

        map.compute("map_key_1", (key, value) -> value *2);
        map.computeIfAbsent("map_key_1", value -> 100 * 2);
        map.computeIfAbsent("map_key_2", value -> 100 * 2);
        map.computeIfPresent("map_key_1", (key, value) -> value * 2);
        map.computeIfPresent("map_key_2", (key, value) -> value * 2);
    }
}
