
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Employee {

    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class EmployeeService {

    private static final Logger logger = Logger.getLogger(EmployeeService.class.getName());

    public void addEmployee(Employee employee, Map<String, Employee> employeeMap) {
        employeeMap.put(employee.getId(), employee);
    }

    public Employee getEmployeeById(String id, Map<String, Employee> employeeMap) {
        try {
            if (!employeeMap.containsKey(id)) {
                throw new EmployeeNotFoundException("Employee with ID " + id + " not found in the database.");
            }
            return employeeMap.get(id);
        } catch (EmployeeNotFoundException e) {
            logger.log(Level.SEVERE, "Error retrieving employee: " + e.getMessage(), e);
            throw new RuntimeException("Failed to retrieve employee: " + e.getMessage(), e);
        }
    }

    public void updateSalary(String id, double newSalary, Map<String, Employee> employeeMap) throws IllegalArgumentException {
        Employee employee = getEmployeeById(id, employeeMap);
        if (employee != null) {
            if (newSalary < 0) {
                throw new IllegalArgumentException("Salary cannot be negative.");
            }
            employee.setSalary(newSalary);
            logger.log(Level.INFO, "Updated salary for employee ID: " + id + " to " + newSalary);
        }
    }
}
