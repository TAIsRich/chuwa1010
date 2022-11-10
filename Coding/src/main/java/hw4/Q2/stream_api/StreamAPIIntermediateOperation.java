package hw4.Q2.stream_api;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIIntermediateOperation {
    @Test
    public void testFilter() {
        List<Integer> col = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = col.stream();
        stream.filter(t -> t % 2 == 0).forEach(System.out::println);

        List<Employee> employees = EmployeeData.getEmployees();
        Stream<String> nameStream = employees.stream().map(Employee::getName);
        nameStream.filter(name -> name.length() > 6).forEach(System.out::println);
    }

    @Test
    public void testLimit() {
        List<Integer> col = Arrays.asList(1, 2, 3, 4, 5);
        col.stream().limit(3).forEach(System.out::println);
    }

    @Test
    public void testSkip() {
        List<Integer> col = Arrays.asList(1, 2, 3, 4, 5);
        col.stream().skip(2).forEach(System.out::println);
    }

    @Test
    public void testDistinct() {
        int[] arr = new int[]{1, 2, 3, 4, 4, 2, 5};
        IntStream st = Arrays.stream(arr);
        st.distinct().forEach(System.out::println);
    }

    @Test
    public void testMap() {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    @Test
    public void testFlatMap() {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        Stream<Stream<Character>> streamStream = list.stream().map(StreamAPIIntermediateOperation::fromStringToStream);
        streamStream.forEach(stream -> stream.forEach(System.out::println));

        Stream<Character> characterStream = list.stream().flatMap(StreamAPIIntermediateOperation::fromStringToStream);
        characterStream.forEach(System.out::println);
    }

    public static Stream<Character> fromStringToStream(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    @Test
    public void testFlatMap2() {
        List<String> list1 = Arrays.asList("1", "2", "33", "4", "5");
        List<String> list2 = Arrays.asList("6", "7", "8", "9", "10");
        List<List<String>> listOfStrings = new ArrayList<>();
        listOfStrings.add(list1);
        listOfStrings.add(list2);

        Stream<List<Integer>> listStream = listOfStrings.stream().map(nums -> nums.stream().map(Integer::parseInt).collect(Collectors.toList()));
        Stream<List<Integer>> listStream2 = listOfStrings.stream().map(nums -> nums.stream().map(Integer::parseInt).collect(Collectors.toList()));
        OptionalInt max1 = listStream2.map(list -> Collections.max(list)).mapToInt(Integer::intValue).max();
        System.out.println(max1);
        Stream<Stream<Integer>> streamStream = listOfStrings.stream().map(nums -> nums.stream().map(Integer::parseInt));
        Stream<OptionalInt> optionalIntStream = streamStream.map(stream -> stream.mapToInt(Integer::intValue).max());
        Optional<OptionalInt> max2 = optionalIntStream.max((n1, n2) -> n1.getAsInt() - n2.getAsInt());
        System.out.println(max2);

        Stream<Integer> integerStream = listOfStrings.stream().flatMap(nums -> nums.stream().map(Integer::parseInt).collect(Collectors.toList()).stream());
        System.out.println(integerStream);
        integerStream.forEach(System.out::println);
        Stream<Integer> integerStream2 = listOfStrings.stream().flatMap(nums -> nums.stream().map(Integer::parseInt).collect(Collectors.toList()).stream());
        OptionalInt max = integerStream2.mapToInt(Integer::intValue).max();
        System.out.println(max);
    }

    @Test
    public void testIntermediateOperationChain() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        list1.addAll(list2.stream().filter(e -> e % 2 == 0).map(e -> e * 10).collect(Collectors.toList()));
        long count = list2.stream().filter(e -> e % 2 == 0).count();
        System.out.println(count);
        System.out.println(list1);
    }

    @Test
    public void testSorted() {
        List<Integer> list = Arrays.asList(87, 2, 65, 34, 72, 12);
        list.stream().sorted().forEach(System.out::println);

        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);

        Stream<Employee> stream = employees.stream();
        Stream<Employee> sorted = stream.sorted(Comparator.comparingInt(Employee::getAge));
        sorted.forEach(System.out::println);
    }
}
