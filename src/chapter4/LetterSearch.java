package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String [] arg){
        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        boolean letterFound =false;

        //Search text for letter A
        for(int i=0; !letterFound && i < text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter =='a'){
                letterFound = true;
//                break;
            }

        }
        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        }
        else{
            System.out.println("This text doesn't contain the letter 'A'");
        }
    }

}
