package Collection;

import org.junit.Test;

import java.util.TreeMap;

/**
 * @author b1go
 * @date 6/12/22 4:47 PM
 */
public class TreeMapExerciseTest {

    TreeMap<String, Integer> map = new TreeMap<>();
    public void printMap(){
        System.out.println(map);
    }

    public <E> void print(E e){
        System.out.println(e);
    }
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
        map.put("BMW",1);
        map.put("CORVETT",2);
        map.put("BMW",2);
        map.putIfAbsent("MERC",1);
        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.put("abc", 8);
        map.putAll(map2);
        printMap();

        print(map.get("abc"));
        print(map.firstKey());
        print(map.lastKey());
        print(map.containsKey("BMW"));
        print(map.containsValue(4));

        print(map.keySet());
        print(map.values());
        print(map.isEmpty());
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        map.put("BMW",1);
        map.put("CORVETT",2);
        map.put("BMW",2);
        map.putIfAbsent("MERC",1);
        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.put("abc", 8);
        map.putAll(map2);
        printMap();

        map.replace("BMW",2,10);
        map.replace("abc", 12);
        map.remove("MERC");
        printMap();
    }
}
