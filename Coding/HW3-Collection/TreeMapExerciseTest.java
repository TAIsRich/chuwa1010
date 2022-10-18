package Collection;
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
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "First");
        map.put(2, "Second");
        map.put(4, "Fourth");
        map.putIfAbsent(2, "Second");
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(3, "Third");
        map.putAll(map1);

        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Tenth"));
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
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "First");
        map.put(2, "Second");
        map.put(4, "Fourth");
        map.putIfAbsent(3, "Third");
        map.replace(1, "First", "1ST");
        map.replace(2, "2ND");
        map.remove(4);
        System.out.println(map);

    }
}
