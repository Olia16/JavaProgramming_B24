package day25_for_loop;

import java.util.Scanner;

public class CountWords {
    /*
    Given a sentence determine how many words are in the String.
    Ex: Input: This has multiple words
    Output:4
     */
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Enter your sentence below:");
   String sentence = input.nextLine().trim();
   int numOfSpaces = 0;

   for(int i = 0; i < sentence.length(); i++){
       if(sentence.charAt(i) == ' '){
           numOfSpaces++;
       }

   }
        System.out.println("Given sentence has: " + (numOfSpaces + 1) + " words");
    }

}
