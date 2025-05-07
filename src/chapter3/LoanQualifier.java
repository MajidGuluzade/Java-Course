package chapter3;

import java.util.Scanner;

/*
 *Nested ifs:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String[] arg) {
        // Initialize What we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get unknown values
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter number of years with your current employer:");
        double years = scanner.nextDouble();
        scanner.close();

        // Make decision
        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats You Qualify for the loan");
            }
            else {
                System.out.println("You must have worked at your current job at least " + requiredYearsEmployed + "years");
            }

        }
        else{
            System.out.println("Sorry You must earn at least $" + requiredSalary + " to qualify for the loan");
        }
    }
}