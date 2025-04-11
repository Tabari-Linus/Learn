
public class Polymorphism {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Sum of 2 and 3: " + calculator.add(2, 3)); // Calls the first add method
        System.out.println("Sum of 2.5 and 3.5: " + calculator.add(2.5, 3.5)); // Calls the second add method
        System.out.println("Sum of 1, 2, and 3: " + calculator.add(1, 2, 3)); // Calls the third add method
    }
}
