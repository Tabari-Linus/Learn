
import java.util.Map;

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

    public void addEmployee(Employee employee, Map<String, Employee> employeeMap) {
        employeeMap.put(employee.getId(), employee);

    }

    public Employee getEmployeeById(String id, Map<String, Employee> employeeMap) throws EmployeeNotFoundException {
        if (!employeeMap.containsKey(id)) {
            throw new EmployeeNotFoundException("Employee with ID " + id + " not found in the database.");
        }
        return employeeMap.get(id);
    }

    public void updateSalary(String id, double newSalary, Map<String, Employee> employeeMap) throws EmployeeNotFoundException {
        Employee employee = getEmployeeById(id, employeeMap);
        if (employee != null) {
            if (newSalary < 0) {
                throw new IllegalArgumentException("Salary cannot be negative.");
            }
        }
    }

}
