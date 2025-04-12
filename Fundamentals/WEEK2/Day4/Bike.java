
class Bike extends Vehicle implements FuelPowered{

    private int gearCount;

    public Bike(String name, int gearCount) {
        super(name);
        this.gearCount = gearCount;
    }

    @Override
    void move() {
        System.out.println("Bikes can move on two wheels.");
    }

    @Override
    public void refuel(){
        System.out.println( "Bike is refueling.");
    }

}
