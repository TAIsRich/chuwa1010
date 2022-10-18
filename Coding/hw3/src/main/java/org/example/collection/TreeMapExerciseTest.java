package org.example.collection;

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
        map.put("map_key_1", 1);
        map.put("map_key_2", 2);
        map.putIfAbsent("map_key_3", 3);

        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.put("map_key_4", 4);
        map.putAll(map2);

        System.out.println(map.get("map_key_1"));
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println(map.containsKey("map_key_2"));
        System.out.println(map.containsValue(2));

        System.out.println(map.keySet());
        System.out.println(map.values());
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
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("map_key_1", 1);
        map.put("map_key_2", 2);
        map.replace("map_key_1", 1, 9);
        map.replace("map_key_1", 8);
        map.remove("map_key_1");
    }
}
