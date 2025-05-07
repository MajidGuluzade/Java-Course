package chapter2;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String [] arg){
        //1. ask user to input their name
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.next();
        //2. ask the user to enter scores for there subjects
        System.out.println("Enter score for Math");
        int math = scanner.nextInt();

        System.out.println("Enter score for English");
        int english = scanner.nextInt();

        System.out.println("Enther score for Science");
        int science = scanner.nextInt();
        //3. calculate total score by adding all there subject scores
        int total = math + english +science ;
        double average = total / 3.0;

        //4. calculate average score
        //5. display the user name total score and average score
        System.out.println("Student - " + studentName +"'s total score is" + total +"and average score is "+ average);

    }
}
