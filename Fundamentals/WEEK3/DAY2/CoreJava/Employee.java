
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Demonstrating the use of ArrayList to store employee names
public class Employee {

    public static void main(String[] args) {

        List<String> employeeName = new ArrayList<>();
        employeeName.add("Funguy");
        employeeName.add("Canda");
        employeeName.add("Benard");
        employeeName.add("Ladan");

        System.out.println("Employee Names: " + employeeName);

        employeeName.remove("Benard");
        System.out.println("Employee Names: -->" + employeeName);

        System.out.println("Name of Employee at index 1: " + employeeName.get(1));

        employeeName.sort(Comparator.naturalOrder());

        System.out.println("Employee Names in sorted order: " + employeeName);
    }
}
