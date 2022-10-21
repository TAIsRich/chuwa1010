package Collection;

import org.junit.Test;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class AdditionalMapExerciseTest {

    public <E> void print(E e){
        System.out.println(e);
    }
    /**
     * e.g.
     * ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     */
    @Test
    public void learn_ConcurrentHashMap() {
        /**ConcurrentHashMap is an enhancement of HashMap as we know that while dealing with Threads in our application HashMap is not a good choice
         because performance-wise HashMap is not up to the mark.
         The underlined data structure for ConcurrentHashMap is Hashtable.
         ConcurrentHashMap class is thread-safe i.e. multiple threads can operate on a single object without any complications.**/
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Key1", 1);
        map.putIfAbsent("Key2", 2);
        map.putIfAbsent("Key2", 3);
        map.putAll(map);
        print(map);
        ConcurrentHashMap<String, Integer> map2 = new ConcurrentHashMap<>();
        map2.putAll(map);
        print(map2);
    }

    /**
     * e.g.
     * Map<DayOfWeek, Integer> map = new IdentityHashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     */

    @Test
    public void learn_IdentityHashMap() {
        // what is EQUAL (key) (地址) （map 比较的是hashcode)
        Map<DayOfWeek, Integer> map = new IdentityHashMap<>();
        map.put(DayOfWeek.MONDAY, 1);
        map.putIfAbsent( DayOfWeek.SATURDAY, 6);
        map.putIfAbsent( DayOfWeek.SATURDAY, 5);
        print(map);
    }

    /**
     * e.g.
     * EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     */
    @Test
    public void learn_EnumMap() {
        EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);
        enumMap.put(DayOfWeek.MONDAY, 1);
        enumMap.putIfAbsent(DayOfWeek.SATURDAY, 6);
        enumMap.putIfAbsent(DayOfWeek.SATURDAY, 5);
        print(enumMap);
    }
}
