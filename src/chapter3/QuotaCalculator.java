package chapter3;

import java.util.Scanner;

/*
 * If else statement
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a  congratulatory  message.
 * For those who don't , they are informed of how many sales they were short.
 *
 */
public class QuotaCalculator {
    public static void main(String [] arg){
        //Initialize values we know
        int quota = 10;

        //Get unknown values
        System.out.println("Enter the number of sales that you made this week :");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        //Make a decision ont he path to take
        if(sales >= quota)
            System.out.println("Congratulations !!! You have met your quota");
        else{
            int salesShort = quota -sales;
            System.out.println("You didn't make your quota.Your were" + salesShort + "sales short");
        }

    }
}
