package day16_switch;

import java.util.Scanner;

public class NumberlnWords {
    /*
    add new class NumberInWords
add a main method

Write a program that will display the given number in its word form.
Create for numbers 1-10. Any other number is invalid data
    Ex:
        input: 1
        output: one

        input: 5
        output: five
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        String word = " ";

        switch (num){
            case 1: word = "one"; break;
            case 2: word = "two"; break;
            case 3: word = "three"; break;
            case 4: word = "four"; break;
            case 5: word = "five"; break;
            case 6: word = "six"; break;
            case 7: word = "seven"; break;
            case 8: word = "eight"; break;
            case 9: word = "nine"; break;
            case 10: word = "ten"; break;
            default:word = "Invalid number";

        }
        System.out.println(num);
        System.out.println(word);
    }
}
