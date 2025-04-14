import java.time.LocalDate;

public class Employees {
    
    private String empID;
    private String empFirstName;
    private String empLastName;
    private Double salary;
    private LocalDate lastActive;


    Employees(String empID, String empFirstName, String empLastName, Double salary, LocalDate lastActive){
        this.empID = empID;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.salary = salary;
        this.lastActive = lastActive;
    }


    Employees(String empID, String empFirstName, String empLastName, Double salary){
        this.empID = empID;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.salary = salary;
        this.lastActive = LocalDate.now();
    }
}
