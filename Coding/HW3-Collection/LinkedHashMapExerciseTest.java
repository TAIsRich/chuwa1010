package Collection;
import org.junit.Test;

import java.util.*;

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
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("First", 1);
        map.put("Second", 2);
        map.put("Third", 3);
        map.putIfAbsent("Second", 2);
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Fourth", 4);
        map.putAll(map1);
        System.out.println(map);
        System.out.println(map.get("Second"));
        System.out.println(map.getOrDefault("Tenth", 10));
        System.out.println(map.containsKey("Third"));
        System.out.println(map.containsValue(7));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.isEmpty());

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
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("First", 1);
        map.put("Second", 2);
        map.put("Third", 3);
        //map.replace("First", 1, 3);
        System.out.println(map.replace("First", 1, 3));
        System.out.println(map);
        map.replace("Third", 5);
        System.out.println(map);
        map.replaceAll((key, oldvalue) -> oldvalue * 2);
        System.out.println(map);

        map.remove("First");
        System.out.println(map);
        map.remove("Third", 3);
        System.out.println(map);

        map.compute("Second", (key, value) -> value *2);
        System.out.println(map);
        map.computeIfAbsent("First", value -> 100 * 2);
        System.out.println(map);
        map.computeIfPresent("Second", (key, value) -> value * 2);
        System.out.println(map);

    }
}
