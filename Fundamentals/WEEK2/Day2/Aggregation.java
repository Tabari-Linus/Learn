
import java.util.List;

public class Aggregation {

    public static void main(String[] args) {
        // Create professors
        Professor professor1 = new Professor("Alice");
        Professor professor2 = new Professor("Jane");

        // Create a department with professors
        Department department = new Department(List.of(professor1, professor2));

        // Create a department without professors
        Department department2 = new Department();

        // Show professors in the department
        System.out.println("Professors in department 1:");
        department.showProfessors();
        System.out.println("\n\nProfessors in department 2:");
        department2.showProfessors();
    }
}
