package com.chuwa.exercise.collection;

import org.junit.Test;

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
        map.put("Barbara", 13);
        map.putIfAbsent("Michael", 22);
        Map<String, Integer> anotherMap = Map.of("Lucy", 15, "Leon", 1);
        map.putAll(anotherMap);
        System.out.println(map);
        System.out.println(map.get("Lucy"));
        System.out.println(map.getOrDefault("Eden", -1));
        System.out.println(map.containsKey("Bob"));
        System.out.println(map.containsValue(13));
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
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Barbara", 13);
        map.putIfAbsent("Michael", 22);
        Map<String, Integer> anotherMap = Map.of("Lucy", 15, "Leon", 1);
        map.putAll(anotherMap);
        map.replace("Barbara", 14);
        map.replaceAll((k, v) -> v + 1);
        map.remove("Barbara");
        map.remove("Eden", -1);
        System.out.println(map);
        map.computeIfPresent("Eden", (key, val) -> val + 1);
    }
}
