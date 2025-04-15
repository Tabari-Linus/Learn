
import java.time.Year;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorsInterface {

    static List<Employees> employeesList = new ArrayList<>();

    public static void main(String[] args) {

        try {
            employeesList.add(new Employees("E001", "Lin", "Kay", 50000.0, Year.of(2022)));
            employeesList.add(new Employees("E002", "John", "Doe", 60000.0, Year.of(2023)));
            employeesList.add(new Employees("E003", "Jane", "Smith", 70000.0, Year.of(2021)));
            employeesList.add(new Employees("E004", "Alice", "Johnson", 80000.0, Year.of(2020)));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        employeesList.forEach(emp -> {
            System.out.println("ID: " + emp.getEmpID() + ", Name: " + emp.getEmpFirstName() + " " + emp.getEmpLastName()
                    + ", Salary: " + emp.getSalary() + ", Last Active: " + emp.getLastActive());
        });

        Iterator<Employees> iterator = employeesList.iterator();
        while (iterator.hasNext()) {
            Employees emp = iterator.next();
            if (emp.getLastActive().isBefore(Year.of(2023))) {
                iterator.remove();
            }
        }

        System.out.println("Employees list employees:");
        for (Employees emp : employeesList) {
            System.out.println("ID: " + emp.getEmpID() + ", Name: " + emp.getEmpFirstName() + " " + emp.getEmpLastName()
                    + ", Salary: " + emp.getSalary() + ", Last Active: " + emp.getLastActive());
        }

    }
}
