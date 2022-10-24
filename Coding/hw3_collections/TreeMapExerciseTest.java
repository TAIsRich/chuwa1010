package com.chuwa.exercise.collection;

import org.junit.Test;

/**
 * @author Wenbo Geng
 * @date 10/17/22 4:46 PM
 */
public class TreeMapExerciseTest {

    /**
     * e.g.
     * TreeMap<String, Integer> map = new TreeMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     *
     * get(Object key)
     * firstKey()
     * lastKey()
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
        TreeMap<String, Integer> map = new TreeMap<>();
        map.push("Key", 1);
        map.pushIfAbsent("Key1", 2);

        TreeMap<String, Integer> subMap = new TreeMap<>();
        subMap.pushAll(map);

        String firstKey = map.firstKey();
        String lastKey = map.lastKey();

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
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Google", 1);
        map.put("Apple", 2);
        map.put("Taobao", 3);
        map.replace("Apple", 2, 5);
        map.replace("Apple", 7);
        map.remove("Google");
        map.remove("Apple", 7);
    }
}
