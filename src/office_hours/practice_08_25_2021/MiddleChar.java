package office_hours.practice_08_25_2021;

import java.util.Scanner;
public class MiddleChar {
    /*
        [Middle char]
        Given a String, write a program to display the middle character of a string
        a) If the length of the string is even there will be two middle characters. b) If the length of the string is odd there will be one middle character.
        Ex:
        Input: elephant
        Output: The middle characters: ph
 */
    public static void main(String[] args) {

                /*
            even
            012
            odd
            3/2
            01234
            5/2 = 2
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

        if (word.length() % 2 == 1) {

            char middle = word.charAt(word.length() / 2);
            System.out.println(middle);
            System.out.println(word.substring(word.length() / 2, word.length() / 2 + 1));

        } else {

            char middleOne = word.charAt(word.length() / 2 - 1);
            char middleTwo = word.charAt(word.length() / 2);

            System.out.println("" + middleOne + middleTwo);

            System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
        }

        /*
            even
            0123
            4/2 = 2
         */
    }
}