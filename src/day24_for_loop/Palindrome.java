package day24_for_loop;

import java.util.Scanner;
/*
String from user
reverse the String
use loop to get indexes backwards
use reverse index with charAt
read chars backwards
concat to another String

reverse String is equal to my original String
 */

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String answer = input.nextLine();
        String reverse = "";

        for (int index = answer.length() - 1; index >= 0; index--){
            reverse += answer.charAt(index);
        }
        System.out.println(reverse);
        if(answer.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }

    }
}
