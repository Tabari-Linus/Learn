<<<<<<< HEAD
import java.time.LocalDate;
=======

>>>>>>> 174ed8bf0741a9e63679246af55d461db4224e8f
import java.time.Year;

public class Employees {

    private String empID;
    private String empFirstName;
    private String empLastName;
    private Double salary;
<<<<<<< HEAD
    private Year lastActiveYear;


    Employees(String empID, String empFirstName, String empLastName, Double salary, Year lastActiveYear){
=======
    private Year lastActive;

    Employees(String empID, String empFirstName, String empLastName, Double salary, Year lastActive) {
>>>>>>> 174ed8bf0741a9e63679246af55d461db4224e8f
        this.empID = empID;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.salary = salary;
        this.lastActiveYear = lastActiveYear;
    }

<<<<<<< HEAD


    public Employees(String empID2, String empFirstName2, String empLastName2, int salary2) {
        //TODO Auto-generated constructor stub
    }


=======
    Employees(String empID, String empFirstName, String empLastName, Double salary) {
        this.empID = empID;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.salary = salary;
        this.lastActive = Year.now();
    }

    public String getEmpID() {
        return empID;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public Double getSalary() {
        return salary;
    }

    public Year getLastActive() {
        return lastActive;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setLastActive(Year lastActive) {
        this.lastActive = lastActive;
    }
>>>>>>> 174ed8bf0741a9e63679246af55d461db4224e8f

}
