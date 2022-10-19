package com.chuwa.exercise.collection;

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
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 0);
        map.putIfAbsent("B", 1);
        System.out.println(map);

        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.putAll(map);
        System.out.println(map2);

        System.out.println(map2.get("A"));
        System.out.println(map2.getOrDefault("C", 2));

        System.out.println(map2.containsKey("A"));
        System.out.println(map2.containsKey("C"));
        System.out.println(map2.containsValue(1));

        System.out.println(map2.keySet());
        System.out.println(map2.values());
        System.out.println(map2.isEmpty());

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
        LinkedHashMap<String, Integer> m = new LinkedHashMap<>();
        m.put("A", 0);
        m.putIfAbsent("B", 1);
        m.replace("B", 7);
        m.replace("A",0,99);
        System.out.println(m);

        m.replaceAll((key,value) -> value * 10);
        System.out.println(m);

        m.compute("B", (key,value) -> (value == 1) ? 1 : value * 100);
        System.out.println(m);
        m.computeIfAbsent("C", value -> 333);
        System.out.println(m);
        m.computeIfPresent("A", (key,value) -> (value == 8) ? 8 : value);
        System.out.println(m);

    }
}
