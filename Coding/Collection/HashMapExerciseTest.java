package Collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author b1go
 * @date 6/12/22 4:47 PM
 */
public class HashMapExerciseTest {

    Map<String, Integer> map = new HashMap<>();
    public void printMap(){
        System.out.println(map);
    }

    public <E> void print(E e){
        System.out.println(e);
    }
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
        map.put("one", 1);
        map.putIfAbsent("two", 2);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("three", 3);
        map.putAll(map2);

        print(map.get("one"));
        print(map.getOrDefault("two",-1));

        print(map.containsKey("three"));
        print(map.containsValue(3));

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

        map.replace("one",1,10);
        map.replace("two", 22);
        printMap();
        map.replaceAll((key, value) -> value*value);
        printMap();

        print(map.compute("one", (key, value)-> value*10));
        printMap();
        print(map.computeIfAbsent("four", k-> 400));
        print(map.computeIfAbsent("three", k-> 400));
        printMap();
        print(map.computeIfPresent("one", (key, value)-> value-=10));
        printMap();

        // different return type
        print(map.remove("one"));
        print(map.remove("four",4));
    }
}
