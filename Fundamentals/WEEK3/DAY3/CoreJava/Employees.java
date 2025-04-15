
import java.time.Year;

public class Employees {

    private String empID;
    private String empFirstName;
    private String empLastName;
    private Double salary;
    private Year lastActive;

    Employees(String empID, String empFirstName, String empLastName, Double salary, Year lastActive) {
        this.empID = empID;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.salary = salary;
        this.lastActive = lastActive;
    }

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

}
