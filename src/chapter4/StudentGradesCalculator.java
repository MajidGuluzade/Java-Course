package chapter4;

import java.util.Scanner;

public class StudentGradesCalculator {
    public static void main( String [] arg){

        System.out.println("Enter the number of students in a class:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numOfStudents = num;
        double averageGrade = 0;
        double higherGrade = 0;
        double loverGrade = 100;


        for(int i =0; i<numOfStudents; i++){
            System.out.println("Enter grade of each student (" + num-- +" students left)");
            double grade = scanner.nextDouble();
            while(grade < 0 || grade >100){
                System.out.println("Invalid input enter grade between 0 and 100:");
                grade = scanner.nextDouble();
            }
            if(grade > higherGrade)
                higherGrade = grade;
            if(grade <= loverGrade)
                loverGrade = grade;

            averageGrade = averageGrade + grade;


        }
        scanner.close();
        System.out.println("Total number of students is: " + numOfStudents);
        System.out.println("The average grade for the class is " + averageGrade/numOfStudents);
        System.out.println("The highest grade is "+ higherGrade);
        System.out.println("The lovest grade is " + loverGrade);
    }
}
