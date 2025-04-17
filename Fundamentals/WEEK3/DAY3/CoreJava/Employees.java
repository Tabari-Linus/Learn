import java.time.LocalDate;
import java.time.Year;

public class Employees {
    
    private String empID;
    private String empFirstName;
    private String empLastName;
    private Double salary;
    private Year lastActiveYear;


    Employees(String empID, String empFirstName, String empLastName, Double salary, Year lastActiveYear){
        this.empID = empID;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.salary = salary;
        this.lastActiveYear = lastActiveYear;
    }



    public Employees(String empID2, String empFirstName2, String empLastName2, int salary2) {
        //TODO Auto-generated constructor stub
    }



}
