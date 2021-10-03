package day25_for_loop;

import java.util.Locale;
import java.util.Scanner;

public class CountBanana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message");
        String sentence = input.nextLine().toLowerCase(Locale.ROOT);
        int countBanana = 0;

        for(int i = 0; i < sentence.length()-5; i++){
            if(sentence.substring(i, i + 6).equals("banana")){
                countBanana++;
            }
        }
        System.out.println(countBanana + " times banana was mentioned in given sentence");

    }
}
