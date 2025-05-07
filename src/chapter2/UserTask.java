package chapter2;

import java.util.Scanner;

public class UserTask {
    public static void main(String [] arg){
        // 1. ask user for a season of year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a season of the year :");
        String season = scanner.next();

        // 2. ask user for whole number
        System.out.println("Enter a whole number :");
        int number = scanner.nextInt();

        // 3. ask a user for adjective
        System.out.println("Enter an adjective :");
        String adjective = scanner.next();

        scanner.close();

        // 3. display given sentence

        System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " + number +
                " cups of coffee.");

    }
}
