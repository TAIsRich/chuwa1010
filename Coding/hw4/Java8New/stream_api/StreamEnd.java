package org.example.StreamApi;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEnd {

    private static final List<Employee> EMPLOYEES = EmployeeData.getEmployees();

    @Test
    public void testMatch(){
        //allMatch(Predicate p)
        boolean allMatch = EMPLOYEES.stream().allMatch(e -> e.getName().length() > 2);
        System.out.println(allMatch);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        //anyMatch(Predicate p)
        boolean anyMatch = EMPLOYEES.stream().anyMatch(e -> e.getName().length() > 3);
        System.out.println(anyMatch);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        //noneMatch(Predicate p)
        boolean noneMatch = EMPLOYEES.stream().noneMatch(e -> e.getName().startsWith("Joshua"));
        System.out.println(noneMatch);

    }

    @Test
    public void testFind(){
        //findFirst
        String s = EMPLOYEES.stream().findFirst().get().getName();
        System.out.println(s);

        //findAny, any element
        Optional<Employee> any = EMPLOYEES.parallelStream().findAny();
        System.out.println(any);

    }

    @Test
    public void testCountMaxMin(){
        //count
        long count = EMPLOYEES.stream().filter(e -> e.getAge() > 25).count();
        System.out.println("amount of employees whose age > 25: " + count);

        //max(Comparator c)
        Stream<Integer> stream = EMPLOYEES.stream().map(Employee::getAge);
        Optional<Integer> max = stream.max(Integer::compare);
        System.out.println("max age: " + max);

        //min(Comparator c)
        Optional<Employee> min = EMPLOYEES.stream().min(Comparator.comparing(Employee::getIndex));
        System.out.println("min age: " + min);

        EMPLOYEES.stream().filter(e -> e.getAge() > 25)
                .map(e -> e.getName() + ": old ppl")
                .forEach(System.out::println);

        List<String> collect = EMPLOYEES.stream().filter(e -> e.getAge() >25)
                .map(e -> e.getName() + ": old ppl")
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    @Test
    public void testIteration(){
        //forEach

        EMPLOYEES.stream().forEach(System.out::println);
        System.out.println("\n********************************\n");
        EMPLOYEES.forEach(System.out::println);
    }

    @Test
    public void testReduce(){
        //reduce(T identity, BinaryOperator)
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);//55

        //reduce(BinaryOperator)
        Stream<Integer> stream = EMPLOYEES.stream().map(Employee::getAge);
        Optional<Integer> reduce1 = stream.reduce(Integer::sum);
        System.out.println(reduce1);//Optional[155]

        Stream<Integer> stream2 = EMPLOYEES.stream().map(Employee::getAge);
        Optional<Integer> reduce2 = stream2.reduce((d1, d2) -> d1 + d2);
        System.out.println(reduce2.get());//155
    }


    @Test
    public void testCollect(){
        List<Employee> collect = EMPLOYEES.stream().filter(e -> e.getIndex() > 2).collect(Collectors.toList());
        collect.forEach(System.out::println);

        Set<Employee> collect2 = EMPLOYEES.stream().filter(e -> e.getIndex() > 2).collect(Collectors.toSet());
        collect2.forEach(System.out::println);
    }

    //map must have return
    @Test
    public void testChain(){
        List<Double> collect = EMPLOYEES.stream().filter(e -> e.getAge() < 25)
                .map(e -> e.getSalary() * 0.8)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        Optional<Integer> reduce = EMPLOYEES.stream().filter(e -> e.getAge() < 25)
                .map(e -> e.getSalary() * 0.8)
                .map( e ->{
                    System.out.println(e);
                    return e.intValue();
                })
                .reduce(Integer::sum);
        System.out.println(reduce.get());
    }
}
