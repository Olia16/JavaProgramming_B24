package day25_for_loop;

import java.util.Scanner;

public class RemoveDuplicatesPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word below:");
        String word = input.nextLine();
        System.out.println("Enter a char:");
        String uniqueChars = input.nextLine();

        for(int i = 0; i < word.length(); i++){
            if(!uniqueChars.contains("" + word.charAt(i))){
                uniqueChars+=word.charAt(i);
            }
        }
        System.out.println(uniqueChars);

    }



}
