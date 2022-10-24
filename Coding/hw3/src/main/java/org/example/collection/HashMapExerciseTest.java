package org.example.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
        map.put("map_key_1", 1);
        map.put("map_key_2", 2);
        map.putIfAbsent("map_key_1", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(map);

        System.out.println(map);
        System.out.println(map2);
        System.out.println(map.get("map_key_1"));
        System.out.println(map.getOrDefault("map_key_2", 4));
        System.out.println(map.getOrDefault("map_key_3", 4));
        System.out.println(map.containsKey("map_key_4"));
        System.out.println(map.containsValue(5));
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
        Map<String, Integer> map = new HashMap<>();
        map.put("map_key_1", 1);
        map.put("map_key_2", 2);
        map.put("map_key_3", 3);

        map.replace("map_key_1", 1, 9);
        map.replace("map_key_1", 8);
        map.replaceAll((key, value) -> value * 2);

        map.remove("map_key_1");
        map.remove("map_key_2", 2);

        map.compute("map_key_3", (key, value) -> value *2);
        map.computeIfAbsent("map_key_1", value -> 100 * 2);
        map.computeIfAbsent("map_key_3", value -> 100 * 2);
        map.computeIfPresent("map_key_1", (key, value) -> value * 2);
        map.computeIfPresent("map_key_3", (key, value) -> value * 2);
    }
}
