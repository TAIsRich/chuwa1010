import org.junit.Test;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.EnumMap;
import java.time.DayOfWeek;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class AdditionalMapExerciseTest {

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
        ConcurrentHashMap<String, Integer> stocks = new ConcurrentHashMap<>();

        stocks.put("Google", 123);
        stocks.put("Microsoft", 654);
        stocks.put("Apple", 345);
        stocks.put("Tesla", 999);

        System.out.println(stocks);

        // Since we are using putIfAbsent(), and Apple is already in the Map, the value will not be added.
        stocks.putIfAbsent("Apple", 1000);

        System.out.println(stocks);
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
        class Employee {
            int empId;
            String empName;

            public Employee(int empId, String empName) {
                super();
                this.empId = empId;
                this.empName = empName;
            }
        }
        Employee emp1 = new Employee(123, "Saurav");
        Employee emp2 = new Employee(123, "Saurav");

        Map<Employee, String> hashMap = new HashMap<>();
        hashMap.put(emp1, "emp1");
        hashMap.put(emp2, "emp2");


        Map<Employee, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(emp1, "emp1");
        identityHashMap.put(emp2, "emp2");

        System.out.println("The employee objects in HashMap are:");
        System.out.println(hashMap);

        System.out.println();
        System.out.println("The employee objects in IdentityHashMap are:");
        System.out.println(identityHashMap);
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

        // Putting records in EnumMap
        enumMap.put(DayOfWeek.MONDAY, 5);
        enumMap.put(DayOfWeek.WEDNESDAY, 23);

        // Fetching the value from MONDAY
        System.out.println(enumMap.get(DayOfWeek.MONDAY));

        // Removing MONDAY from the Map
        enumMap.remove(DayOfWeek.MONDAY);
    }
}
