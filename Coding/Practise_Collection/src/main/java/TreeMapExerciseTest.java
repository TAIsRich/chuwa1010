import org.junit.Test;

import java.util.TreeMap;

/**
 * @author b1go
 * @date 6/12/22 4:47 PM
 */
public class TreeMapExerciseTest {
    TreeMap<String, Integer> map = new TreeMap<>();
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
        map.put("Harry", 15);
        map.get("Harry");
        map.put("Herminie",16);
        map.get("Herminie");
        map.put("Ron", 14);
        map.get("Ron");
        boolean containsRon = map.containsKey("Ron");
        boolean contains16 = map.containsValue("16");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        int size = map.isEmpty() ? 0 : map.size();
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {

        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.put("Oracle", 43);
        map2.put("Microsoft", 56);
        map2.put("Apple", 76);
        map2.put("Novartis", 87);

        System.out.println("Replacing the value of Oracle : " + map.replace("Oracle", 67));
        System.out.println("Latest value of Oracle : " + map.get("Oracle"));

        System.out.println("Replacing the value of Apple only if current value is 50 : " + map.replace("Apple", 50, 90));
        System.out.println("Latest value of Oracle : " + map.get("Apple"));

        System.out.println("Replacing the value of Apple only if current value is 76 : " + map.replace("Apple", 76, 90));
        System.out.println("Latest value of Oracle : " + map.get("Apple"));

    }
}
