package Java8.StreamAPI;
import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
public class CreateStream {
    @Test
    //create stream by .stream()
    public void create() {
        List<Integer> col = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = col.stream();

        Stream<Integer> parallelStream = col.parallelStream();
    }

    @Test
    //create stream by Arrays.stream(arr)
    public void create_arrays() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(arr);

    }

    @Test
    //create stream by Stream.of(...)
    public void create_of() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    }

    @Test
    public void testIterate() {
        /*
         * example of iterate first 10 even numbers
         * seed : 0, means initial value is 0
         * limit(10) means that it only produce 10 elements then stop.
         */
        Stream.iterate(0, i -> i + 2).limit(10).forEach(System.out::println);
    }

    @Test
    public void testGenerate() {

        Stream.generate(() -> Math.random()).limit(10).forEach(System.out::println);

        Stream<String> stream =
                Stream.generate(() -> "element").limit(10);
        stream.forEach(System.out::println);
    }

    @Test
    public void testBuilder() {
        Stream<String> stream =
                Stream.<String>builder().add("a").add("b").add("c").build();
        stream.forEach(System.out::println);
    }

    @Test
    public void testStreamOfPrimitives() {
        IntStream intStream = IntStream.range(1, 3);
        intStream.forEach(System.out::println);

        LongStream longStream = LongStream.rangeClosed(1, 3);
        longStream.forEach(System.out::println);
    }

}
