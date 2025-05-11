package chapter3;

import java.util.Scanner;

/*
You'll ask them how many pennies would you like?
How many nickels would you like?
How many dimes?
And then, how many quarters?

 */
public class DollarGame {
    public static void main(String [] arg){

        double valueOfPennies = 0.01;
        double valueOfNickels = 0.05;
        double valueOfDimes = 0.10;
        double valuesOfQuarter = 0.25;
        double total;
        double equator = 1.0;
        double wentOver;
        double wentUnder;
        System.out.println("how many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        double pennies = scanner.nextDouble();

        System.out.println("How many nickels would you like?");
        double nickels = scanner.nextDouble();

        System.out.println("How many dimes?");
        double dimes = scanner.nextDouble();

        System.out.println("how many quarters?");
        double quarters = scanner.nextDouble();
        scanner.close();

        total = pennies * valueOfPennies + nickels * valueOfNickels + dimes * valueOfDimes + quarters * valuesOfQuarter;

        // Make a decision
        if (total == equator){
            System.out.println("You winn the game!");
        }else if (total > equator){
            wentOver = total - equator;
            System.out.println("It's more than one dollar. You went over by $" + wentOver);
        }else{
            wentUnder = equator - total;
            System.out.println("It's less than one dollar. You went under by $" + wentUnder);
        }


    }
}
