package day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitPractice2 {
    public static void main(String[] args) {
        //string input 3 words
        // reverse the middle word

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence below, make sure to enter three words");
        String sentence = input.nextLine();
        input.close(); // close Scanner
        String [] sentence2 = sentence.split(" "); // splitting into separate elements
        String reverse = "";

        for(int i = sentence2[1].length() -1; i >= 0; i--){
            reverse += sentence2[1].charAt(i);
        }
        System.out.println(sentence2[0] + " " + reverse + " " + sentence2[2]);
    }
}
