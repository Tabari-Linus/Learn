
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BestPracticeInErrorHandling {

    public static void main(String[] args) {

        final Logger logger = Logger.getLogger(BestPracticeInErrorHandling.class.getName());

        // Example usage
        EmployeeService employeeService = new EmployeeService();
        Map<String, Employee> employeeMap = new HashMap<>();

        try {
            Employee employee = new Employee("1", "John Doe", 50000);
            employeeService.addEmployee(employee, employeeMap);

            // Attempt to retrieve an employee that doesn't exist
            employeeService.getEmployeeById("2", employeeMap);
        } catch (RuntimeException e) {
            logger.log(Level.SEVERE, "Extra runtime uncheked exception: " + e.getMessage(), e);
        }
        try {
            // Attempt to update salary with a negative value
            employeeService.updateSalary("1", -1000, employeeMap);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            logger.log(Level.SEVERE, "Extra runtime uncheked exception: " + e.getMessage(), e);
        }

    }
}
