
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsNOperations {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("E001", "Alice", 50000),
                new Employee("E002", "Bob", 60000),
                new Employee("E003", "Charlie", 55000)
        ));

        // Sort employees by ID
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
        }

        System.out.println("===================================");

        Collections.sort(employees, new employeeSalarySortInDecending());
        for (Employee employee : employees) {
            System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
        }
        System.out.println("===================================");

        Collections.sort(employees);
        // Search for an employee by ID using a comparator
        int index = Collections.binarySearch(employees, new Employee("E002", "", 0), Comparator.comparing(Employee::getId));
        if (index >= 0) {
            Employee foundEmployee = employees.get(index);
            System.out.println("Found employee: " + foundEmployee.getId() + " " + foundEmployee.getName() + " " + foundEmployee.getSalary());
        } else {
            System.out.println("Employee not found in the list.");
        }

    }
}
