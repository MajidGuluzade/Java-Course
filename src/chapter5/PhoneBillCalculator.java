package chapter5;

import java.util.Scanner;

/*
 *So, what you're going to do is allow the user to
 * input the plan fee and the number of overage minutes.
 * And then you're going to charge 25 cents for every minute that
 * they've gone over, and then a 15% tax on the subtotal.
 * I want you to create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.

Please print this as an itemized bill. I have an example of the output expected down below
 */
public class PhoneBillCalculator {
    //Initialize known values
    static Scanner scanner = new Scanner(System.in);
    static double charge = 0.25;
    static double taxPercentage = 0.15;

    public static void main(String [] arg){

        //Get the unknown values
        double cost = enterCostOfThePlan();
        double min = enterOverageMinutes();

        //Check condition
        double overage = calculateOverageFees(min);
        double tax = calculateTax(overage,cost);
        double total = calculatetotal(tax, overage, cost);
        scanner.close();

        //Show output result
        showResult(cost,overage,tax,total);


    }
    public static double enterCostOfThePlan(){

        System.out.println("Enter base cost of the plan:");
        double cost = scanner.nextDouble();
        return cost;

    }
    public static double enterOverageMinutes(){

        System.out.println("Enter overage minutes:");
        double minutes = scanner.nextDouble();
        return minutes;

    }
    public static double calculateOverageFees(double min){
        double overage = min * charge;
        return overage;

    }
    public static double calculateTax(double overage, double cost){
        double tax = (overage + cost)*taxPercentage;
        return tax;
    }
    public static double calculatetotal(double tax, double overage, double cost){
        double total = tax + overage + cost;
        return total;
    }
    public static void showResult(double cost, double overage, double tax, double total){
        System.out.println("Phone Bill Statement");
        System.out.printf("Plan: $%.2f\n", cost);
        System.out.printf("Overage: $%.2f\n", overage);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);

    }
}
