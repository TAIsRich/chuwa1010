package collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class LinkedHashMapExerciseTest {
    /**
     * e.g.
     * HashMap<String, Integer> map = new LinkedHashMap<>();
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
        HashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("one", 1);
        System.out.println("map" + map.toString());

        map.putIfAbsent("two", 2);
        System.out.println("map " + map.toString());

        HashMap<String, Integer> subMap = new LinkedHashMap<>();
        subMap.put("three", 3);
        map.putAll(subMap);
        System.out.println("map after putAll subMap " + map);

        System.out.println("map get one " + map.get("one"));
        System.out.println("map getOrDefault: " + map.getOrDefault("five", 5));

        System.out.println("map containsKey one: " + map.containsKey("one"));
        System.out.println("map containsKey five: " + map.containsKey("one"));
        System.out.println("map containsValue 1: " + map.containsValue(1));
        System.out.println("map containsValue 6: " + map.containsValue(6));

        for (String s : map.keySet()) {
            System.out.println(s);
        }

        for (Integer num : map.values()) {
            System.out.println(num);
        }

        System.out.println("map is empty: " + map.isEmpty());

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
        HashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("map: " + map.toString());

        map.replace("one", 2);
        System.out.println("map replace one 1 to 2 " + map.toString());

        map.replace("one", 2, 1);
        System.out.println("map replace one 2 to 1: " + map.toString());

        map.remove("one");
        System.out.println("map remove one" + map.toString());
        map.remove("two", 2);
        System.out.println("map remove two, 2" + map.toString());




    }
}
