package office_hours.practice_09_22_2021;

import java.util.Arrays;
import java.util.Locale;


public class ArraysAndCharacters {
    public static void main(String[] args) {
        String [] a = {"apple", "ape","java"};
        System.out.println("Frequency of given letter: "  + frequencyOfChar(a, 'A'));

    }

    public static int frequencyOfChar(String [] words, char letter){
        int count = 0;

        for (String eachWord : words){
            for(char eachLetter : eachWord.toCharArray()){
                if(eachLetter == letter){
                    count++;
                }
            }
        }
        return count;
    }
}
