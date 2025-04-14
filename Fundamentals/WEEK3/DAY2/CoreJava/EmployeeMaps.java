
import java.util.HashMap;
import java.util.Map;

public class EmployeeMaps {

    public static void main(String[] args) {

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "Funguy");
        employeeMap.put(102, "Canda");
        employeeMap.put(103, "Benard");
        employeeMap.put(104, "Ladan");
        employeeMap.put(105, "Fortune");

        System.out.println("Employee Map: " + employeeMap);
        System.out.println("Employee ID 102: " + employeeMap.get(102));

        employeeMap.remove(103);
        System.out.println("Employee Map :" + employeeMap);

    }
}
