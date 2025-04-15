
import java.util.Comparator;

class employeeSalarySortInDecending implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.getSalary(), e1.getSalary()); // Sort in descending order
    }

}
