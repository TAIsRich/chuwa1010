public class Encapsulation {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 8, 4};
        int max = getMax(array);
        System.out.println("The maximum value is: " + max);
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
