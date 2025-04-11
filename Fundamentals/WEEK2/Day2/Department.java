
import java.util.List;

public class Department {

    private List<Professor> professors;

    public Department(List<Professor> professors) {
        this.professors = professors;
    }

    Department() {
        this.professors = List.of();
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        if (professors == null) {
            throw new IllegalArgumentException("Professors list cannot be null.");
        }
        this.professors = professors;
    }

    public void addProfessors(List<Professor> professors, Professor professor) {
        if (professors == null) {
            throw new IllegalArgumentException("Professors list cannot be null.");
        }
        if (professor == null) {
            throw new IllegalArgumentException("Professor cannot be null.");
        }
        if (professors.contains(professor)) {
            throw new IllegalArgumentException("Professor already exists in the list.");
        }
        professors.add(professor);

    }

    public void removeProfessors(List<Professor> professors, Professor professor) {
        if (professors == null) {
            throw new IllegalArgumentException("Professors list cannot be null.");
        }
        if (professor == null) {
            throw new IllegalArgumentException("Professor cannot be null.");
        }
        if (!professors.contains(professor)) {
            throw new IllegalArgumentException("Professor does not exist in the list.");
        }
        professors.remove(professor);
    }

    public void showProfessors() {
        if (professors.isEmpty()) {
            System.out.println("No professors in this department.");
            return;
        }
        for (Professor professor : professors) {
            professor.teach();
        }
    }
}
