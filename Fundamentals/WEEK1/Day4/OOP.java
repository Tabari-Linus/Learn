
public class OOP {

    public class Person {

        private int age;
        private String name;

        Person(String name, int age) {
            this.age = age;
            this.name = name;
        }

        void setAge(int age) {
            this.age = age;
        }

        void setName(String name) {
            this.name = name;
        }

        String getName() {
            return this.name;
        }

        int getAge() {
            return this.age;
        }

    }

    abstract class Employee extends Person {

        double salary;

        public Employee(String name, int age, double salary) {
            super(name, age);
            this.salary = salary;
        }

        abstract double calculateSalary();

        public void displayInfo() {
            System.out.println("Name: " + this.getName());
            System.out.println("Age: " + this.getAge());
        }
    }

    public class FullTimeEmployee extends Employee {

        public FullTimeEmployee(String name, int age, double salary) {
            super(name, age, salary);
            //TODO Auto-generated constructor stub
        }

        @Override
        double calculateSalary() {
            this.salary = 2000;
            return this.salary;
        }

    }

    public class PartTimeEmployee extends Employee {

        double rate, hoursWorked;

        public PartTimeEmployee(String name, int age, double salary, double rate, double hoursWorked) {
            super(name, age, salary);
            //TODO Auto-generated constructor stub
            this.hoursWorked = hoursWorked;
            this.rate = rate;
        }

        double calculateSalary() {
            this.salary = this.rate * this.hoursWorked;
            return this.salary;
        }

    }

    public static void main(String[] args) {
        OOP oop = new OOP();

        FullTimeEmployee dennis = oop.new FullTimeEmployee("Dennis Owusu", 26, 3500);
        System.out.println(dennis.calculateSalary());
        dennis.displayInfo();

        PartTimeEmployee paul = oop.new PartTimeEmployee("Paul Owusu", 26, 3500, 80, 24);
        System.out.println(paul.calculateSalary());
        paul.displayInfo();
    }
}
