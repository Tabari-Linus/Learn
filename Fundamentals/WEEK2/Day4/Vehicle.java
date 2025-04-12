
abstract class Vehicle {

    String name;

    Vehicle(String name) {
        this.name = name;
    }

    abstract void move();

    void display() {
        System.out.println("Vehicle name: " + name);
    }
}
