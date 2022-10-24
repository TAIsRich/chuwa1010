package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.BiFunction;

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
        map.put("A",2);
        map.putIfAbsent("B", 2);
        HashMap<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("C",2);
        map.putAll(map1);
        System.out.println(map);
        System.out.println(map.get("C"));
        System.out.println(map.getOrDefault("V",200));
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue(200));
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
        map.put("A",2);
        map.putIfAbsent("B", 2);
        HashMap<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("C",2);
        map.replace("A",2,3);
        map.replace("B",4);
        map.remove("A");
        map.remove("B",2);
    }
}
