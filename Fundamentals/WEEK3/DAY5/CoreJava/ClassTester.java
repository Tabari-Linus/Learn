
import java.util.Arrays;

public class ClassTester {

    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid indices or null array");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {

        DataStore<Integer> intStore = new DataStore<>(42);
        System.out.println("Integer data: " + intStore.getData());

        DataStore<String> stringStore = new DataStore<>("Hello, World!");
        System.out.println("String data: " + stringStore.getData());

        DataStore<Double> doubleStore = new DataStore<>(3.14);
        System.out.println("Double data: " + doubleStore.getData());

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swapping (Integer array): " + Arrays.toString(intArray));
        swapElements(intArray, 1, 3);
        System.out.println("After swapping (Integer array): " + Arrays.toString(intArray));

        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("Before swapping (String array): " + Arrays.toString(strArray));
        swapElements(strArray, 0, 2);
        System.out.println("After swapping (String array): " + Arrays.toString(strArray));

    }

}
