package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void  main(String [] arg){
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade =  scanner.next();
        String message;
        switch (grade){
            case "A":
                message = "Excellent job";
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Good Job";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Oh no!";
                break;
            default:
                message = "Error, Invalid input ";


        }
        System.out.println(message);


    }
}


