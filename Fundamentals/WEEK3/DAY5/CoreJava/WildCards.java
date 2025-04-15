
import java.util.ArrayList;
import java.util.List;

public class WildCards {

    // Method to calculate the sum of a list of numbers
    public static double sumNumbers(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // Method to add integers to a list of integers or their superclasses
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {
        // Test sumNumbers
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);
        System.out.println("Sum of doubleList: " + sumNumbers(doubleList));

        List<Integer> intList = List.of(1, 2, 3, 4);
        System.out.println("Sum of intList: " + sumNumbers(intList));

        // Test addIntegers
        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList);
        System.out.println("numberList after adding integers: " + numberList);

        List<Object> objectList = new ArrayList<>();
        addIntegers(objectList);
        System.out.println("objectList after adding integers: " + objectList);
    }
}
