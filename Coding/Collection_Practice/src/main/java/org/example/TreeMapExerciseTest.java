package org.example;

import org.junit.Test;

import java.util.*;

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
        map.put("a", 1);
        map.putIfAbsent("b", 2);
        map.putIfAbsent("c", 3);

        Map<String, Integer> anotherMap = new HashMap<>();
        map.put("b", 1);
        map.put("d", 2);
        map.putAll(anotherMap);

        map.get("b");
        map.firstKey();
        map.lastKey();

        map.containsKey("a");
        map.containsValue("1");

        for (String s : map.keySet()){
            System.out.println(s);
        }
        for (Integer a : map.values()){
            System.out.println(a);
        }

        map.isEmpty();

        System.out.println(map);

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
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        map.replace("a", 1, 3);
        map.replace("b", 2);

        map.remove("c");

        System.out.println(map);

    }
}
