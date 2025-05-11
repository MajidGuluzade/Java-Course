package chapter4;

import java.util.Scanner;
import java.util.Random;

/*
 * Do while Loop:
 * Write a program that generates a random number between 1 and 10,
 * then asks the user to guess the number. The program keeps running
 * until the user guesses correctly, and asks if they want to play again.
 */
public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain;
        do {
            int secretNumber = random.nextInt(10) + 1;
            int guess;

            System.out.println("Guess a number between 1 and 10:");

            do {
                guess = scanner.nextInt();

                if (guess < secretNumber) {
                    System.out.println("Too low, try again:");
                } else if (guess > secretNumber) {
                    System.out.println("Too high, try again:");
                } else {
                    System.out.println("Correct! You guessed the number.");
                }

            } while (guess != secretNumber);

            System.out.println("Would you like to play again? Enter true or false:");
            playAgain = scanner.nextBoolean();

        } while (playAgain);

        scanner.close();
    }
}
