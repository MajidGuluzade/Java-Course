package chapter5;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String [] arg){
        System.out.println("Enter you age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(voteEligibility(age));


    }
    public static String voteEligibility( int a){
        int ageLimit = 18;
        if(a >=ageLimit ){
            return "You are eligible for vote";
        }
        else {
            return "Sorry, you must be at least 18 years old to vote";
        }
    }

}
