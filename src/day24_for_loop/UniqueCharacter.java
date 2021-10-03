package day24_for_loop;

import java.util.Locale;
import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        ask for a word
        ask for a letter
        scan.next().charAt(0);

        is the letter unique in the word
         */
        System.out.println("Please enter a word");
        String word = input.next().toLowerCase(Locale.ROOT);
        System.out.println("please enter a letter");
        char letter = input.next().toLowerCase(Locale.ROOT).charAt(0);

        int sum = 0;

        for(int i = 0; i < word.length();i++){
            if(word.charAt(i) == letter){
                sum++;

                }
                }
        if(sum == 1){
            System.out.println(letter + " is unique");
        }else if(sum == 0 ){
            System.out.println(letter + " was not is tne String");
            }else {
            System.out.println(letter + " is NOT unique!");
        }

        }
    }

