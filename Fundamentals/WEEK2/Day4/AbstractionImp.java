
public class AbstractionImp {

    public static void main(String[] args) {
        Vehicle car = new Car("Bolzsab", "Toyota", 2020);
        Vehicle bike = new Bike("Bike", 21);

        car.move();
        bike.move();
    }
}
