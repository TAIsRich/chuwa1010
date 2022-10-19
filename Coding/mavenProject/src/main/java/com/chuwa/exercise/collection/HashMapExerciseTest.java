package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Integer> m = new HashMap<>();
        m.put("A", 0);
        m.putIfAbsent("A", 1);
        m.putIfAbsent("B", 1);
        Map<String, Integer> n = new HashMap<>();
        n.putAll(m);
        System.out.println(n);

        System.out.println(n.get("A"));
        int a = n.getOrDefault("C",3);
        System.out.println("a: " + a);
        System.out.println("map n: " + n);

        System.out.println(n.containsKey("A"));
        System.out.println(n.containsValue(3));

        System.out.println(n.keySet());
        System.out.println(n.values());
        n.clear();
        System.out.println(n.isEmpty());
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
        map.put("A", 0);
        map.put("B", 1);
        map.put("C", 2);
        map.put("D", 3);
        map.put("F", 4);
        System.out.println("origin: " + map);

        map.replace("A", 0, 5);
        System.out.println("A value: " + map.get("A"));
        map.replace("A", 4);
        System.out.println("A value: " + map.get("A"));

        map.replaceAll((k, v) -> v * 2);
        System.out.println("double the values: " + map);

        map.remove("A");
        System.out.println("remove key A: " + map);
        map.remove("B",2);
        System.out.println("remove key B: " + map);

        //The compute(Key, BiFunction) method of HashMap class
        // allows you to update a value in HashMap.
        map.compute("C", (k, v) -> (v == 4) ? v + 1 : v + 2);
        System.out.println(map);

        // is used to compute value for a given key
        // using the given mapping function,
        // if key is not already associated with a value (or is mapped to null)
        // enter that computed value in Hashmap else null.
        map.computeIfAbsent("E", v -> 50);
        System.out.println(map);

        map.computeIfPresent("F", (k, v) -> (v > 10) ? v + 100 : v);
        System.out.println(map);
    }
}
