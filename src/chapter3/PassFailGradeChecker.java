package chapter3;

import java.util.Scanner;

/*
 *A student must score at least 50 to pass an exam.
 * Ask the user to enter their exam score.
 * If the score is 50 or above, display a message:
 *  "You passed the exam! Congratulations!"
 * Otherwise, calculate how many more points were needed and display:
 *  "You failed. You needed X more points to pass."
 */
public class PassFailGradeChecker {
    public static void main(String [] arg){
        // Initialize values
        int pass = 50;

        // Get the unknown values
        System.out.println("Enter your exam score");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        scanner.close();

        // Condition met
        if(grade>=pass){
            System.out.println("You passed the exam! Congratulations!");
        }
        else{
            int gradeShort = pass - grade;
            System.out.println("You failed. You needed " + gradeShort + " more points to pass.");
        }

        // Display output

    }
}
