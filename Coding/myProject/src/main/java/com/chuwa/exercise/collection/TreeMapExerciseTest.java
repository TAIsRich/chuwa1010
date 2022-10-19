package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.TreeMap;

/**
 * @author b1go
 * @date 6/12/22 4:47 PM
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
        map.put("A", 0);
        map.putIfAbsent("B", 1);
        //last in first out
        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.putAll(map);
        System.out.println(map2);

        System.out.println(map2.get("A"));
        System.out.println(map2.firstKey());
        System.out.println(map2.lastKey());

        System.out.println(map2.containsKey("A"));
        System.out.println(map2.containsValue(4));

        System.out.println(map2.keySet());
        System.out.println(map2.values());
        System.out.println(map2.isEmpty());


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
        map.put("A", 0);
        map.putIfAbsent("B", 1);

        map.replace("A", 0,3);
        map.replace("B", 2);
        System.out.println(map);

        map.remove("A");
        System.out.println(map);

    }
}
