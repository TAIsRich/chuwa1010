package genericPractice;

public class GenericMethod {
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n",3,4,5, MaxGenericTest.max(3,4,5));

    }

    }
 class  MaxGenericTest{
    public static <T extends Comparable<T>> T max(T x, T y, T z){
        T max = x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }
}
