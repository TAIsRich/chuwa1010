package org.example;

import org.junit.Test;

import java.util.HashMap;

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
    HashMap<String,Integer> map = new HashMap<>();
    @Test
    public void learn_Inserting_And_Retrieving() {
        map.put("first",1);
        map.put("second",2);
        map.put("Third",3);
        map.put("Forth",4);
        printMap();
//* putIfAbsent(K key, V value)
        map.putIfAbsent("fifth",5);
        printMap();
//  putAll(Map<? extends K, ? extends V> m)
        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("sixth",6);
        map2.put("seventh",7);
        map.putAll(map2);
        printMap();
//     *
// get(Object key)
        print(map.get("sixth"));
        print(map.get("tenth"));
//  getOrDefault(Object key, V defaultValue)
        print(map.getOrDefault("tenth",10));
        printMap();
//                *
//   containsKey(Object key)
        print(map.containsKey("first"));
        print(map.containsKey("tenth"));
//    containsValue(Object value)
        print(map.containsValue(1));
        print(map.containsValue(10));
//                *
//   keySet()
        print(map.keySet());
//  values()
        print(map.values());
//   isEmpty()
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
        map.put("first",1);
        map.put("second",2);
        map.put("Third",3);
        map.put("Forth",4);
//        /**
//         * replace(K key, V oldValue, V newValue)
        map.replace("first",1,0);
        printMap();
//         * replace(K key, V value)
        map.replace("first",1);
        printMap();
//         * replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
        map.replaceAll((k,v)->(v+1));
        printMap();
//         *
//         * remove(Object key)
        map.remove("first");
//         * remove(Object key, Object value)
        map.remove("second",2);
        printMap();
        map.remove("second",3);
        printMap();
//         *
//         * compute(Key, BiFunction)
        map.compute("Third",(k,v)->(v-1));
//         * computeIfAbsent(Key, Function)
        map.computeIfAbsent("first",k->0);
        printMap();
//         * computeIfPresent(Key, BiFunction)
        map.computeIfPresent("first",(k,v)->(v+1));
        printMap();
//         */
    }
    public <E> void print(E e){
        System.out.println(e);
    }
    public void printMap(){
        map.forEach((key,value)->{
            System.out.print(key+":");
            System.out.print(value);
            System.out.print(",  ");
        });
        System.out.println();
    }
}
