package Java8Features.StreamAPI;

import org.junit.Test;
import resources.Employee;
import resources.EmployeeData;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminateOperation {
    private static final List<Employee> EMPLOYEES = EmployeeData.getEmployees();

    @Test
    public void testMatch() {
        //allMatch(Predicate p)
        boolean allMatch = EMPLOYEES.stream().allMatch(e -> e.getName().length() > 2);
        System.out.println(allMatch);

        //anyMatch(Predicate p)
        boolean anyMatch = EMPLOYEES.stream().anyMatch(e -> e.getName().length() > 3);
        System.out.println(anyMatch);

        //noneMatch(Predicate p)
        boolean noneMatch = EMPLOYEES.stream().noneMatch(e -> e.getName().startsWith("XX"));
        System.out.println(noneMatch);
    }

    @Test
    public void testFind() {
        //findFirst
        Optional<Employee> first = EMPLOYEES.stream().findFirst();
        System.out.println(first);

        //findAny
        Optional<Employee> any = EMPLOYEES.parallelStream().findAny();
        System.out.println(any);
    }

    @Test
    public void testCountMaxMin() {
        //count
        long count = EMPLOYEES.stream().filter(e -> e.getAge() > 40).count();
        System.out.println("num of employees(age > 40): " + count);

        //max(Comparator c) - 返回流中的最大值
        Optional<Integer> max = EMPLOYEES.stream()
                .map(Employee::getAge).max(Integer::compare);
        System.out.println("max age is: " + max);

        //min(Comparator c) - 返回流中的最小值
        Optional<Employee> min = EMPLOYEES.stream()
                .min(Comparator.comparingInt(Employee::getAge));
        System.out.println("min age is : " + min);
    }

    @Test
    public void testIteration() {
        EMPLOYEES.stream().forEach(System.out::println);

        System.out.println("\n********************************\n");
        EMPLOYEES.forEach(System.out::println);
    }

    @Test
    public void testReduce() {
        //reduce(T identity, BinaryOperator)
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

        //reduce(BinaryOperator)
        Stream<Integer> stream = EMPLOYEES.stream().map(Employee::getAge);
        Optional<Integer> reduce1 = stream.reduce(Integer::sum);
        System.out.println(reduce1);

        Stream<Integer> stream2 = EMPLOYEES.stream().map(Employee::getAge);
        Optional<Integer> reduce2 = stream2.reduce((d1, d2) -> d1 + d2);
        System.out.println(reduce2.get());
    }

    @Test
    public void testCollect() {
        List<Employee> collect = EMPLOYEES
                .stream()
                .filter(e -> e.getId() > 1002)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        Set<Employee> collect2 = EMPLOYEES
                .stream()
                .filter(e -> e.getId() > 1002)
                .collect(Collectors.toSet());
        collect2.forEach(System.out::println);
    }

    @Test
    public void testChain() {
        List<Double> collect = EMPLOYEES.stream()
                .filter(e -> e.getAge() < 40)
                .map(e -> e.getSalary() * 0.8)
                .collect(Collectors.toList());


        Optional<Integer> reduce = EMPLOYEES.stream()
                .filter(e -> e.getAge() < 40)
                .map(e -> e.getSalary() * 0.8)
                .map(e -> {
                    System.out.println(e);
                    return e.intValue();
                })
                .reduce(Integer::sum);
        System.out.println(reduce.get());
    }
}
