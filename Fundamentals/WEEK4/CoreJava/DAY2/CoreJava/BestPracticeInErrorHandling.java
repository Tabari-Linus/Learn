
import java.util.HashMap;
import java.util.Map;

public class BestPracticeInErrorHandling {

    public static void main(String[] args) {
        // Example usage
        EmployeeService employeeService = new EmployeeService();
        Map<String, Employee> employeeMap = new HashMap<>();

        try {
            Employee employee = new Employee("1", "John Doe", 50000);
            employeeService.addEmployee(employee, employeeMap);

            // Attempt to retrieve an employee that doesn't exist
            employeeService.getEmployeeById("2", employeeMap);
        } catch (EmployeeNotFoundException e) {

            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            // Attempt to update salary with a negative value
            employeeService.updateSalary("1", -1000, employeeMap);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
