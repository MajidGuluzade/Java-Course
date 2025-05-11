package chapter4;

import java.util.Scanner;

public class ShoppingCartSummary {
    public static void main(String [] arg){


        System.out.println("How many products do you want to add:");
        Scanner scanner = new Scanner(System.in);
        int numOfProducts = scanner.nextInt();
        int num = numOfProducts;
        double totalCost =0;
        double highestPrice = Double.MIN_VALUE;
        double lovestPrice = Double.MAX_VALUE;

        for(int i=0;i<numOfProducts;i++){
            System.out.println("Enter product name:(you should enter "+ (num--) +" more products)");
            String name = scanner.next();
            System.out.println("Enter the price of this product:");
            double price = scanner.nextDouble();
            totalCost = totalCost + price;
            if(price > highestPrice){
                highestPrice = price;
            }
            if(price < lovestPrice){
                lovestPrice = price;
            }
            for(int j=0;j<numOfProducts;j++)
                System.out.println("Product " + name +" price is " +price);
        }
        System.out.println("Total cost of all products: $" + totalCost);
        System.out.println("Most expensive item's price is " +highestPrice);
        System.out.println("Cheapest items's price is " +lovestPrice);
    }
}
