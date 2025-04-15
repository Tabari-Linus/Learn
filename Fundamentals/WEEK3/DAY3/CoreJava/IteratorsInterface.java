
import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class IteratorsInterface {

    static List<Employees> employeesList = new ArrayList<>();

    public static void main(String[] args) {

        try {
            employeesList.add(new Employees("E001", "Lin", "Kay", 50000.0, Year.of(2022)));
            employeesList.add(new Employees("E002", "John", "Doe", 60000.0, Year.of(2023)));
            employeesList.add(new Employees("E003", "Jane", "Smith", 70000.0, Year.of(2021)));
            employeesList.add(new Employees("E004", "Alice", "Johnson", 80000.0, Year.of(2020)));
            employeesList.add(new Employees("E005", "Bob", "Brown", 90000.0, Year.of(2023)));
            employeesList.add(new Employees("E006", "Charlie", "Davis", 100000.0, Year.of(2024)));
            employeesList.add(new Employees("E007", "David", "Wilson", 110000.0, Year.of(2023)));
            employeesList.add(new Employees("E008", "Eva", "Garcia", 120000.0, Year.of(2025)));
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
        System.out.println("--------------");
        System.out.println("Employees list employees:");
        for (Employees emp : employeesList) {
            System.out.println("ID: " + emp.getEmpID() + ", Name: " + emp.getEmpFirstName() + " " + emp.getEmpLastName()
                    + ", Salary: " + emp.getSalary() + ", Last Active: " + emp.getLastActive());
        }

        List<String> employeesAfter2023 = employeesList.stream()
                .filter(emp -> emp.getLastActive().equals(Year.of(2024)))
                .map(emp -> emp.getEmpFirstName())
                .collect(Collectors.toList());

        System.out.println("--------------");
        System.out.println("Employees after 2023: " + employeesAfter2023);
        for (String emp : employeesAfter2023) {
            System.out.println("Name: " + emp);
        }

        List<String> mostActive = employeesList.stream()
                .max(Comparator.comparing(Employees::getLastActive))
                .map(emp -> List.of(emp.getEmpFirstName()))
                .orElse(List.of());

        System.out.println("--------------");
        System.out.println("Most Active: " + mostActive);

    }
}
