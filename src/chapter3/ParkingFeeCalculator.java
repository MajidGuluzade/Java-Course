package chapter3;

import java.util.Scanner;

/*
Base Rate: All drivers pay a base parking fee of $5.
Ask the user how many hours they parked.
If the number of hours is more than 2, they pay an extra $2 per additional hour.
Calculate the total parking fee.
Display the final amount the driver needs to pay.
 */
public class ParkingFeeCalculator {
    public static void main (String[] arg){
    int fee = 5;
    int limit = 2;
    int extra = 2;
    System.out.println("How many hours did you park? ");
    Scanner scanner = new Scanner(System.in);
    int hours = scanner.nextInt();
    scanner.close();
    if (hours > limit){

        fee = fee + (hours - limit)* extra;
    }
    System.out.println("Total parking fee is $" + fee );

    }
}
