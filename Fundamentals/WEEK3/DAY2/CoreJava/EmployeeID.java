
import java.util.HashSet;
import java.util.Set;

public class EmployeeID {

    public static void main(String[] args) {

        Set<Integer> employeeID = new HashSet<>();
        employeeID.add(101);
        employeeID.add(102);
        employeeID.add(103);
        employeeID.add(104);

        System.out.println("Employee IDs: " + employeeID);

        System.out.println("Employee ID 102 exists: " + employeeID.contains(102));

        employeeID.remove(103);
        System.out.println("Employee IDs: " + employeeID);
    }

}
