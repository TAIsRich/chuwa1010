package com.chuwa.exercise.collection;

import org.junit.Test;

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
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        map.put("ethan", 1);
        map.put("charles", 2);
        map.putIfAbsent("richard", 4);
        TreeMap<String, Integer> new_map = new TreeMap<String, Integer>();
        new_map.putAll(map);

        int res1 = map.get("ethan");
        String min = map.firstKey();
        String max = map.lastKey();

        boolean b1 = map.containsKey("ethan");
        boolean b2 = map.containsValue(3);

        Set<String> set1 = map.keySet();
        Set<Integer> set2 = map.values();

        boolean b3 = map.isEmpty();
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("ethan", 1);
        map.put("charles", 2);
        map.putIfAbsent("richard", 4);

        map.replace("ethan", 3);
        map.replace("ethan", 3, 5);

        Integer num = map.remove("ethan");
    }
}
