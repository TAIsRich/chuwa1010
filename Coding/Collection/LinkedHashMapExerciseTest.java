package Collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class LinkedHashMapExerciseTest {

    HashMap<String, Integer> map = new LinkedHashMap<>();
    public void printMap(){
        System.out.println(map);
    }

    public <E> void print(E e){
        System.out.println(e);
    }
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
        map.put("one", 1);
        map.putIfAbsent("two", 2);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("three", 3);
        map.putAll(map2);

        print(map.get("one"));
        print(map.getOrDefault("2",-1));
        print(map.containsValue(2));
        print(map.containsKey("one"));
        print(map.keySet());
        print(map.values());
        print(map.isEmpty());
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
        map.put("one", 1);
        map.putIfAbsent("two", 2);
        map.put("three", 3);

        map.replace("one", 1, 10);
        map.replace("two", 20);
        map.replaceAll((key, value) -> value-=10);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        printMap();
        map.remove("five");
        map.remove("four", 4);

        print(map.compute("one", (key, value)-> value+=10));
        printMap();
        print(map.computeIfAbsent("first", k-> 111));
        print(map.computeIfAbsent("second", k-> 222));
        printMap();
        print(map.computeIfPresent("one", (key, value)-> value-=10));
        printMap();

    }
}
