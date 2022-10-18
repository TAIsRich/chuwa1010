package collection;

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
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("map: " + map);

        map.putIfAbsent("four", 4);
        System.out.println("map put if absent: " + map);
        TreeMap<String, Integer> subMap = new TreeMap<>();
        subMap.put("five", 5);
        subMap.put("six", 6);
        subMap.put("seven", 6);
        map.putAll(subMap);
        System.out.println("put all subMap: " + map);

        map.get("one");
        System.out.println("map get one: " + map.get("one"));

        System.out.println("map contains key two " + map.containsKey("two"));
        System.out.println("map contains key eight " + map.containsKey("eight"));
        System.out.println("map contains value 2 " + map.containsValue(2));
        System.out.println("map contains value 10 " + map.containsValue(8));
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
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map);

        map.replace("one", 2);
        System.out.println("after change 1 to 2 on key one :" + map);

        map.replace("one", 2, 1);
        System.out.println("after change 2 to 1 on key one :" + map);

        map.remove("one");
        System.out.println("after remove one " + map);
    }
}
