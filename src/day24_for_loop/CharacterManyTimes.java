package day24_for_loop;

import java.util.Scanner;

public class CharacterManyTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! please enter your sentence");
        String sentence = input.nextLine();
        int sum = 0;

        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == 'b'){
                sum++;
            }
        }
        System.out.println("Characters were found in sentence " + sum + " times");
    }
}
