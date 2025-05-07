package chapter3;

import java.util.Scanner;

/*
 *To qualify for university admission:
 * A student must have a GPA of at least 3.5 (on a scale of 4.0),
 * AND must have a score of at least 1200 on the entrance exam.


 */
public class UniversityAdmissionQualifier {
    public static void main(String[] arg){
       // To initialize what we know
        double requiredGpa = 3.5;
        int requiredScore = 1200;

        // To get what we don't know
        System.out.println("Enter your GPA:");
        Scanner scanner = new Scanner(System.in);
        double gpa = scanner.nextDouble();

        System.out.println("Enter your Score: ");
        int score = scanner.nextInt();
        scanner.close();
        // To make decision

        if(gpa >= requiredGpa){
            if(score >= requiredScore){
                System.out.println("Congrats! you passed ");
            }
            else{
                System.out.println("You need to have at least " + requiredScore + "score to pass");
            }

        }
        else {
            System.out.println("You need to have at least " + requiredGpa + "GPA");
        }
    }
}
