package chapter5;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] arg){
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
        scanner.close();
    }
    public static void greetUser(String name){
        System.out.println("Hi there, " + name);
    }
}
