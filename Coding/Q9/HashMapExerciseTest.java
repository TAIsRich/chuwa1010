package com.chuwa.exercise.collection;

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
        Map<String, Integer> studentScore = new HashMap<>();
        studentScore.put("Alice", 95);
        studentScore.putIfAbsent("Bob", 89);
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Lucy", 95);
        anotherMap.put("Blair", 77);
        studentScore.putAll(anotherMap);
        System.out.println(studentScore.get("Alice"));
        System.out.println(studentScore.getOrDefault("Tracy", 0));
        System.out.println(studentScore.containsKey("Bob"));
        System.out.println(studentScore.containsValue("88"));
        System.out.println(studentScore.keySet());
        System.out.println(studentScore.values());
        System.out.println(studentScore.isEmpty());
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
        Map<String, Integer> studentScore = new ConcurrentHashMap<>();
        studentScore.put("Alice", 95);
        studentScore.putIfAbsent("Bob", 89);
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Lucy", 95);
        anotherMap.put("Blair", 77);
        studentScore.putAll(anotherMap);
        studentScore.replace("Alice", 96);
        System.out.println(studentScore.get("Alice"));
        studentScore.replaceAll((key, value) -> (value + 1));
        System.out.println(studentScore);
        studentScore.remove("Blair");
        studentScore.remove("Lily", 93);
        System.out.println(studentScore);
        int newScore = studentScore.compute("Bob", (key, value) -> value + 2);
        System.out.println(newScore);
        int matScore = studentScore.computeIfAbsent("Mat", key -> 66);
        int lucyScore = studentScore.computeIfPresent("Lucy", (key, value) -> value - 2);
    }
}
