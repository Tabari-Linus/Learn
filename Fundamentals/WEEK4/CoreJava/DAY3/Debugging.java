
public class Debugging {

    public static void main(String[] args) {
        Employee employee = new Employee("E123", "John Doe", 50000, 5000, 2);
        PayrollService payrollService = new PayrollService();
        double netSalary = payrollService.calculateNetSalary(employee);
        System.out.println("Net Salary: " + netSalary);
    }
}
