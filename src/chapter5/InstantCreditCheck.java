package chapter5;

import java.util.Scanner;

/*
 *VARIABLE SCOPE
 * Write an instant credit check program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or betteR. Reject all others
 */
public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        //Check if the user is qualified
        boolean qualified = isUserQualified (creditScore, salary);

        //Notify the user
        notifyUser(qualified);


    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;

    }
    public static boolean isUserQualified( int creditScore , double salary){
        if(salary >= requiredSalary && creditScore >= requiredCreditScore  ){
            return true;
        }
        else{
            return false;
        }
    }
    public static void notifyUser ( boolean qualified){
        if(qualified){
            System.out.println(" Yes you are qualified for credit ");
        }
        else{
            System.out.println("you aren't qualified for credit ");
        }
    }
}
