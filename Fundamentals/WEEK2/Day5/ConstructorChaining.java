
public class ConstructorChaining {

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("Person 1 Name: " + person1.getName() + ", Age: " + person1.getAge());

        Person person2 = new Person("John");
        System.out.println("Person 2 Name: " + person2.getName() + ", Age: " + person2.getAge());

        Person person3 = new Person("Owusu", 25);
        System.out.println("Person 3 Name: " + person3.getName() + ", Age: " + person3.getAge());

        Employee employee1 = new Employee("Ben", 30, 50000);
        System.out.println("Employee 1 Name: " + employee1.getName() + ", Age: " + employee1.getAge() + ", Salary: " + employee1.getSalary());

        Employee employee2 = new Employee("David", 60000);
        System.out.println("Employee 2 Name: " + employee2.getName() + ", Age: " + employee2.getAge() + ", Salary: " + employee2.getSalary());
    }

}
