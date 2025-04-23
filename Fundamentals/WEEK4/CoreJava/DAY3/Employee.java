
public class Employee {

    private String id;
    private String name;
    private double baseSalary;
    private double bonus;
    private double taxRate;

    public Employee(String id, String name, double baseSalary, double bonus, double taxRate) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.taxRate = taxRate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTaxRate() {
        return taxRate;
    }

}

class PayrollService {

    double calculateNetSalary(Employee employee) {
        double netSalary = employee.getBaseSalary() + employee.getBonus() - (employee.getBaseSalary() * employee.getTaxRate());
        return netSalary;
    }
}
