package org.example;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
        HashMap<String, Integer> m = new HashMap<>();
        m.put("zero", 0);
        m.putIfAbsent("one", 1);
        HashMap<String, Integer> n = new HashMap<>();
        n.putAll(m);
        System.out.println(n);

        System.out.println(n.get("zero"));
        //If without this key, return the default value
        n.getOrDefault("three",3);
        System.out.println(n);

        System.out.println(n.containsKey("zero"));
        System.out.println(n.containsValue(3));

        System.out.println(n.keySet());
        System.out.println(n.values());
        n.clear();
        System.out.println(n.isEmpty());
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
        HashMap<String, Integer> m = new HashMap<>();
        m.put("zero", 0);
        m.putIfAbsent("one", 1);
        m.replace("zero", 100);
        m.replace("one",1,111);
        System.out.println(m);

        m.replaceAll((key,value) -> value + 2);
        System.out.println(m);

        m.compute("zero", (key,value) -> (value == 1) ? 1 : value + 2);
        System.out.println(m);
        m.computeIfAbsent("three", value -> 3000+2000);
        System.out.println(m);
        m.computeIfPresent("zero", (key,value) -> (value == 1) ? 1 : value + 2000);
        System.out.println(m);
    }
}
