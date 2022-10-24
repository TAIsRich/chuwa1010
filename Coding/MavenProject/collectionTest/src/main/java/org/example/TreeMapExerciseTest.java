package org.example;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
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
        map.put("one", 1);
        map.putIfAbsent("two", 2);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("three", 3);
        map.putAll(map2);
        System.out.println(map);

        System.out.println(map.get("one"));
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println(map.containsKey("two"));
        System.out.println(map.containsValue(2));

        for(String i : map.keySet()){
            System.out.println(i);
        }
        for(int i : map.values()){
            System.out.println(i);
        }

        System.out.println(map.isEmpty());
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.replace("one", 1, 10);
        map.replace("two", 20);
        System.out.println(map);
    }
}
