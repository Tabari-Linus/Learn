import java.util.ArrayList;
import java.util.List;

public class IteratorsInterface {

    public static void main(String[] args) {
        
        List<Employees> employees = new ArrayList<>();
        
        employees.add(new Employees("E001", "Jack", "Bens", 23000.0, 2022));
        
        employees.add(new Employees("E002", "Appiah", "Mensah", 23400));
        
        
        employees.add(new Employees("E003", "Kennedy", "Jard", 23000.0));
        
        employees.add(new Employees("E004", "Mole", "Brain", 23400));
   
    
    }
}
