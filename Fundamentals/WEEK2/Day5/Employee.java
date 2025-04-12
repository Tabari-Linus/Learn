
public class Employee extends Person {

    private double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

}
