
public class Engine {

    private int horsePower;

    Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void startEngine() {
        System.out.println("Engine started with " + horsePower + " Hoursepower.");
    }

}
