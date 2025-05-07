package chapter3;

import java.util.Scanner;

/*
    here is new task in new chapter 3
    If statement.
    All salespeople get a payment of $1000 a week.
    Salespeople who exceeded 10 sales get  an additional bonus  of 250 $
 */
public class SalaryCalculator {
   public static void main (String [] arg){
       //Initialize know values first
       int salary = 1000;
       int bonus = 250;
       int quota = 10;

       //Get values for the unknown
       System.out.println("How many sales did the employee did this week?");
       Scanner scanner = new Scanner(System.in);
       int sales = scanner.nextInt();
       scanner.close();

       //Quick detour for the bonus earners
       if (sales > quota){
           salary = salary + bonus;
       }
       //Output
       System.out.println("The employee's pay is $" + salary);


    }
}
