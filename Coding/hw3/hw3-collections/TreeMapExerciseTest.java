package org.example;

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
        map.put("zero", 0);
        map.putIfAbsent("one", 1);
        //last in first out
        TreeMap<String, Integer> m = new TreeMap<>();
        m.putAll(map);
        System.out.println(m);

        System.out.println(m.get("zero"));
        System.out.println(m.firstKey());
        System.out.println(m.lastKey());

        System.out.println(m.containsKey("zero"));
        System.out.println(m.containsValue(8));

        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.isEmpty());

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
        map.put("zero", 0);
        map.putIfAbsent("one", 1);

        map.replace("zero", 0,3);
        map.replace("one", 2);
        System.out.println(map);

        map.remove("zero");
        System.out.println(map);
    }
}
