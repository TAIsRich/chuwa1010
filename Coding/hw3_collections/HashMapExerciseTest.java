package com.chuwa.exercise.collection;

import org.junit.Test;

/**
 * @author Wenbo Geng
 * @date 10/17/22 4:46 PM
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
        map.push("Key", 1);
        map.pushIfAbsent("Key1", 2);

        Map<String, Integer> subMap = new HashMap<>();
        subMap.pushAll(map);

        map.get("Key");
        map.getOrDefault("Kay1", 0);
        if (!map.isEmpty()) {
            if (map.containsKey("Key"))
                System.out.println(map.get("Key"));
            if (map.containsValue(0))
                System.out.println("True");

            for (String key : sites.keySet())
                System.out.println(map.get(key));

            for (int val : map.values())
                System.out.println(val);
        }
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
        map.put("Google", 1);
        map.put("Apple", 2);
        map.put("Taobao", 3);
        map.replace("Apple", 2, 5);
        map.replace("Apple", 7);
        map.replaceAll((key, val) -> val + 1);
        map.replaceAll((key, val) -> 9);
        map.remove("Google");
        map.remove("Apple", 7);
        map.compute("Google", (key, val) -> val == null? 0 : val + 1);
        map.compute("Apple", (key, val) -> val == null? 0 : val + 1);

        map.computeIfAbsent("Google", val -> Integer.valueOf(1));
        map.computeIfAbsent("Apple", val -> Integer.valueOf(1));

        map.computeIfPresent("Google", (key, val) -> val + 1);
        map.computeIfPresent("Alibaba", (key, val) -> val + 1);
    }
}
