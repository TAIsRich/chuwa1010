package Generic.Generic_Method;

public class GenericMethod {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0 ) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {
        int max = maximum(3,4,5);
        System.out.println(max);

        double max1 = maximum(3.11,2.21,5.66);
        System.out.println(max1);

        String max2 = maximum("hello", "hi", "bye");
        System.out.println(max2);
    }

}
