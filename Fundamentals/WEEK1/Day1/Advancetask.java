package Day1;

import java.util.Scanner;

public class Advancetask {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Score: ");
        int score = input.nextInt();
        
        System.out.println("The square of "+score +" is "+score * score);
   
        System.out.println("Enter a message: ");
        String message = input.nextLine();
        System.out.println(message)
    }
}
