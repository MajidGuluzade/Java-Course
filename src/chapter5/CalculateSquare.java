package chapter5;

import java.util.Scanner;

public class CalculateSquare {
    public static void main(String[] arg){
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
//        calcSquare(number);
        System.out.println("Square of given number: "+  calcSquare(number));

    }
    public static int calcSquare(int a ){
        int square = a*a;
        return square;

    }
}
