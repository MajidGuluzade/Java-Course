package chapter4;

import java.util.Scanner;

/*
 * Nested loops;
 * Find the average of student's test scores
 */
public class AverageTestScores {
    public static void main(String [] arg){
        //Initialize what we know
        int numOfStudents = 24;
        int numOfTests = 4;
        Scanner scanner = new Scanner(System.in);

        //Process all students
        for(int i =0; i< numOfStudents; i++){
            double total = 0;
            for(int j=0; j< numOfTests; j++){
                System.out.println("Enter the score for Test #" +(j+1));
                double score  = scanner.nextDouble();
                total = total + score;
            }
            double average = total/numOfTests;
            System.out.println(" The test average for student #" +(i+1)+" is " + average);
        }
        scanner.close();

    }
}
