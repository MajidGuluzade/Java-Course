package chapter5;

import java.util.Scanner;

/*
 *Write a Java program that checks if a student is eligible
 * for a scholarship. The student must meet both of the following conditions:
 * Gpa must be 3.5 o higher
 * Number of completed community service must be 40 or more
 */

public class ScholarshipChecker {
    //Initialize known values
    static double requiredGpa = 3.5;
    static double requiredHours = 40;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){

        //Get what we don't know
        double gpa = getStudentGpa();
        double hours = getNumberOfHoursWorked();
        scanner.close();

        //Check if user is qualified or not
        boolean qualified = isQualified(hours,gpa);

        //Notify user
        notifyUser(qualified);
    }
    public static double getStudentGpa(){
        System.out.println("Enter your gpa:");
        double gpa = scanner.nextDouble();
        return gpa;

    }
    public static double getNumberOfHoursWorked(){
        System.out.println("Enter your community service hours:");
        double hours = scanner.nextDouble();
        return hours;

    }
    public static boolean isQualified( double hours, double gpa){
        if(hours>= requiredHours && gpa >= requiredGpa){
            return true;
        }else{
            return false;
        }
    }
    public static void notifyUser(boolean qualified){
        if(qualified){
            System.out.println("Congratulations! You are eligible for the scholarship!");
        }
        else{
            System.out.println("Sorry, you are not eligible for the scholarship.");
        }
    }
}
