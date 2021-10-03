package day24_for_loop;

import java.util.Locale;
import java.util.Scanner;

public class MoreForLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Please enter your sentence below: ");
        String sentence = input.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("Please enter a letter ");
        char letter = input.next().toLowerCase(Locale.ROOT).charAt(0);
        int summary = 0;

        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == letter){
                summary++;
            }
        }
        if (summary == 0){
            System.out.println(letter + " character was not found in the sentence");
        }else if(summary == 1){
            System.out.println(letter + " character is unique");
        }else{
            System.out.println(letter + " character is NOT unique!");
        }
    }
}
