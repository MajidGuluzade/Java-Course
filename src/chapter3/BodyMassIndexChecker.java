package chapter3;

import java.util.Scanner;

public class BodyMassIndexChecker {
    public static void main (String[] arg){
        // To get body mass Index
        System.out.println("Enter your BMI:");
        Scanner scanner = new Scanner(System.in);
        double bmi = scanner.nextDouble();
        String category;
        //To evaluate category
        if(bmi < 18.5){
            category = "Underweight";
        }
        else if( 18.5 <= bmi && bmi <25){
            category = "Normal weight";
        }
        else if( 25 <= bmi && bmi <30){
            category = "Overweight";
        }
        else{
            category ="Obese";
        }
        System.out.println("Your body category is " + category);
    }
}
