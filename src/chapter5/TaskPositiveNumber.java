package chapter5;

import java.util.Scanner;

public class TaskPositiveNumber {
    public static void main(String [] arg){
        System.out.println("Enter a positive number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        findAllNumbers(num);

    }
    public static void findAllNumbers(int a){
       for(int i=0;i<=a;i++){
          System.out.println(i);
       }

    }
}
