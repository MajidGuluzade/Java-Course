package chapter3;

import java.util.Scanner;

/*
| Scholarship Type    | GPA Requirement | Income Limit (per year) |
| ------------------- | --------------- | ------------------------ |
| Full Scholarship    | ≥ 3.8           | ≤ $30,000               |
| Partial Scholarship | ≥ 3.5           | ≤ $50,000               |
| No Scholarship      | otherwise       |                          |
*/

public class ScholarshipChecker {
    public static void main(String[] args) {
        // Define thresholds
        double fullScholarshipGpa = 3.8;
        double partialScholarshipGpa = 3.5;
        double fullScholarshipIncome = 30000;
        double partialScholarshipIncome = 50000;

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your GPA:");
        double gpa = scanner.nextDouble();

        System.out.println("Enter your annual family income:");
        double income = scanner.nextDouble();
        scanner.close();

        // Decision logic
        if (gpa >= fullScholarshipGpa && income <= fullScholarshipIncome) {
            System.out.println("You qualify for a Full Scholarship!");
        } else if (gpa >= partialScholarshipGpa && income <= partialScholarshipIncome) {
            System.out.println("You qualify for a Partial Scholarship.");
        } else {
            System.out.println("You do not qualify for a scholarship.");
        }
    }
}
