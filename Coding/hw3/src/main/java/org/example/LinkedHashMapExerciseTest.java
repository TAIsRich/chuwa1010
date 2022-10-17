package org.example;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
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
    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
    @Test
    public void learn_Inserting_And_Retrieving() {
        map.put("first",1);
        map.put("second",2);
        map.put("Third",3);
        map.put("Forth",4);
        printMap();
        map.putIfAbsent("fifth",5);
        LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>();
        map2.put("sixth",6);
        map2.put("seventh",7);
        map.putAll(map2);
        printMap();
        print(map.get("sixth"));
        print(map.getOrDefault("tenth",10));
        print(map.containsKey("first"));
        print(map.containsValue(1));
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
        map.put("first",1);
        map.put("second",2);
        map.put("Third",3);
        map.put("Forth",4);
        map.replace("first",1,0);
        printMap();
        map.replace("first",1);
        printMap();
        map.replaceAll((k,v)->(v+1));
        printMap();
        map.remove("first");
        map.remove("second",2);
        printMap();
        map.compute("Third",(k,v)->(v-1));
        map.computeIfAbsent("first",k->0);
        printMap();
        map.computeIfPresent("first",(k,v)->(v+1));
        printMap();
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
