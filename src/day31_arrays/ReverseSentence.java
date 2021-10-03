package day31_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {

        // ask user to enter a sentence
        // reverse your sentence

        // ex: today is Wednesday
        //     Wednesday is today

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = input.nextLine();

        String [] words = sentence.split(" ");
        String reverse = "";

        for(int i = words.length - 1; i >= 0; i--){
            reverse += words[i] + " ";

        }
        System.out.println((reverse).trim());
    }
}
