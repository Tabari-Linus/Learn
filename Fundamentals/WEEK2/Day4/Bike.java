
class Bike extends Vehicle {

    private int gearCount;

    public Bike(String name, int gearCount) {
        super(name);
        this.gearCount = gearCount;
    }

    @Override
    void move() {
        System.out.println("Bikes can move on two wheels.");
    }

}
