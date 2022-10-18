package collection;

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
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("map" + map.toString());

        map.putIfAbsent("four", 4);
        System.out.println("map" + map.toString());

        Map<String, Integer> subMap = new HashMap<>();
        subMap.put("five", 5);
        map.putAll(subMap);
        System.out.println("After add All map: " + map);

        map.get("one");
        System.out.println("map get one " + map.get("one"));

        map.getOrDefault("four", 0);
        System.out.println("map get default " + map.getOrDefault("six", 0));

        map.containsKey("one");
        System.out.println("map containsKey one: " + map.containsKey("one"));

        map.containsValue(1);
        System.out.println("map containsValue 1: " + map.containsValue(1));

        for (String s : map.keySet()) {
            System.out.println(s);
        }

        for (Integer num : map.values()) {
            System.out.println(num);
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
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        map.replace("one", 2);
        System.out.println("map replace one 1 to 2: " + map.toString());

        map.replace("one", 2, 1 );
        System.out.println("map replace one 2 to 1: " + map.toString());

        map.remove("one");
        System.out.println("map remove one: " + map.toString());

        map.remove("two", 2);
        System.out.println("map remove two with 2: " + map.toString());



    }
}
