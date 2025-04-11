
public class Car {

    private Engine engine;

    Car(int horsePower) {
        this.engine = new Engine(horsePower);
    }

    public void drive() {
        engine.startEngine();
        System.out.println("Car is moving with engine power of " + engine.getHorsePower() + " HP.");
    }

}
