import java.util.ArrayList;
import java.util.List;

public class AbstractionImp {

    public static void main(String[] args) {
        
        
        Vehicle car = new Car("Bolzsab", "Toyota", 2020);
        Vehicle bike = new Bike("Bike", 21);

        Bicycle bic = new Bicycle("Crazy");

        Vehicle vehicles[] = {car, bike, bic};

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.display();
            if( vehicle instanceof FuelPowered)
            ((FuelPowered)vehicle).refuel();
        }
    }
}
