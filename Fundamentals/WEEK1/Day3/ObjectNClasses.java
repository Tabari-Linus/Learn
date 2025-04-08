package Day3;

public class ObjectNClasses {

    static class Car {

        static int totalCars = 0;

        String brand;
        String model;
        int year;
        double price;

        Car() {
            this.brand = "Tesla";
            this.model = "M9";
            this.year = 2025;
            this.price = 2_000;
            totalCars++;
        }

        Car(String brand, String model, int year, double price) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.price = price;
            totalCars++;
        }

        void displayCarInfo() {

            System.out.println("Car brand: " + this.brand + "\nCar model: " + this.model
                    + "\nCar year: " + this.year
                    + "\nCar price: " + this.price);
        }

        static int getTotalCars() {
            return totalCars;
        }
    }

    public static void main(String[] args) {

        Car telsa1 = new Car();
        Car benz = new Car("Benz", "2500c", 2024, 2300);

        // Display car info
        telsa1.displayCarInfo();
        System.out.println();
        benz.displayCarInfo();

        System.out.println("\nTotal cars created: " + Car.getTotalCars());
    }
}
