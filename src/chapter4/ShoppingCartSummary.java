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
        String [] productName = new String[numOfProducts];
        double [] prices = new double[numOfProducts];
        int indexOfMostExpensive = 0;
        int indexOfLessExpensive = 0;

        for(int i=0;i<numOfProducts;i++){
            System.out.println("Enter product name:(you should enter "+ (num--) +" more products)");
            String name = scanner.next();
            productName[i] = name;
            System.out.println("Enter the price of this product:");
            double price = scanner.nextDouble();
            prices[i] =price;
            totalCost = totalCost + price;
            if(price > highestPrice){
                highestPrice = price;
                indexOfMostExpensive = i;

            }
            if(price < lovestPrice){
                lovestPrice = price;
                indexOfLessExpensive = i;
            }
        }
        System.out.println("\nProduct List:");
        for(int i =  0; i<numOfProducts; i++){
            System.out.println("- "+productName[i] + ": $" + prices[i]);
        }
        System.out.println("\nTotal cost of all products: $" + totalCost);
        System.out.println("Most expensive item: " + productName[indexOfMostExpensive] + "($" +highestPrice +")");
        System.out.println("Cheapest item: " + productName[indexOfLessExpensive] + "($" + lovestPrice +")");
    }
}
