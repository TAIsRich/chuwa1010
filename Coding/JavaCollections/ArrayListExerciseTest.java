import java.io.*; 
import java.util.*; 

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
 */
public class ArrayListExerciseTest {
    /**
     * new ArrayList()
     * add elements
     * get element
     * get Size
     * list.addAll(anotherList)
     */

    public ArrayList<Integer> al = new ArrayList<Integer>();
    // create an ArrayList with size 5
    public ArrayList<Integer> alWithSize = new ArrayList<Integer>(5);

    public ArrayList addElements(ArrayList<Integer> al) {
        // add elements
        for (int i = 0; i < 5; i++) {
            al.add(i);
        }
        // al: 0, 1, 2, 3, 4
        return al;
    }

    public int getElement(ArrayList<Integer> al) {
        int res = al.get(1);
        return res;
    }

    public ArrayList addList(ArrayList<Integer> al1, ArrayList<Integer> al2) {
        al2.addAll(al1);
        return al2;
    }
    public void learn_Inserting_And_Retrieving() {

    }

    /**
     * remove(int index)
     * remove(Object o)
     * removeRange(int fromIndex, int toIndex)
     * removeAll(Collection<?> c)
     * clear()
     *
     * Update:
     * set(int index, E e)
     * replaceAll(UnaryOperator<E> operator)
     *
     * check:
     * contains(Object o)
     * indexOf(Object o)
     * lastIndexOf(Object o)
     */
    public void learn_Remove_Replacing_Updating() {

    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     * forEachRemaining(Consumer<? super E> action) -- from Java8
     */

    public void learn_Iterator() {

    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    public void learn_Sorting() {

    }

    public static void main(String args[]) {
        ArrayListExerciseTest test = new ArrayListExerciseTest();
        ArrayList<Integer> myTestList = new ArrayList<Integer>();
        test.addElements(myTestList);
        System.out.println(myTestList); // 0, 1, 2, 3, 4
        System.out.println(test.getElement(myTestList));
        System.out.println(test.addList(myTestList, myTestList));
    }
}