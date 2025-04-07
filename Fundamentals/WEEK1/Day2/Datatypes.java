package Day2;

import java.util.Scanner;

;

public class Datatypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        double balance;
        char gender;
        boolean isRented;

        System.out.println("the results is" + (2 + 3));
        System.out.println("the results is" + (2 * 3));
        System.out.println("the results is" + (2 / 3));
        System.out.println("the results is" + (2 % 3));
        System.out.println("the results is" + (2 < 3));
        System.out.println("the results is" + (2 > 3));
        System.out.println("the results is" + (2 >= 3));
        System.out.println("the results is" + (2 <= 3));
        System.out.println("the results is" + ((2 > 3) || (2 < 3)));
        System.out.println("the results is" + ((2 > 3) && (2 < 3)));

        balance = 109.95;
        System.out.println("The balance is: " + balance);
        int intBalance = (int) balance;
        System.out.println("The balance as an integer: " + intBalance);

        final int AGE = 9;
        // try {
        //     age += 20;
        // } catch (Exception e) {
        //     System.out.println("can not reassign a constant");
        // }

        System.out.println("########## Taking inputs and Operating  ##########");
        System.out.println("Enter number 1: ");
        double number1 = scanner.nextDouble();
        System.out.println("Enter number 2: ");
        double number2 = scanner.nextDouble();
        System.out.println("Output of operator *  on the numbers: " + number1 * number2);
        System.out.println("Output of operator /  on the numbers: " + number1 / number2);
        System.out.println("Output of operator +  on the numbers: " + number1 + number2);
        System.out.println("Output of operator -  on the numbers: " + (number1 - number2));
        System.out.println("Output of operator %  on the numbers: " + number1 % number2);

        String stringNumber = "25";
        double stringAsNumber = 0;
        try {
            stringAsNumber = Double.parseDouble(stringNumber);
        } catch (Exception e) {
            System.out.println("Number conversion failed.");
        }

        System.out.println(stringAsNumber);
    }

}
