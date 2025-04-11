
class Car extends Vehicle {

    private String model;
    private int year;

    public Car(String name, String model, int year) {
        super(name);
        this.model = model;
        this.year = year;
    }

    @Override
    void move() {
        System.out.println(name + "Can move on wheels on four wheels.");
    }

    @Override
    public void refuel() {
        System.out.println(name + " is refueling with gasoline.");
    }

}
