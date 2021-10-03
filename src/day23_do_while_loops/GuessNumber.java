package day23_do_while_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        /*
        predefined number
        1-100
        we want the user to guess
        80
        ->50 too small
        ->90 too big
         */
        Scanner input = new Scanner(System.in);
        int secretNum = 80;
        int userGuess;
        int attempts = 0;

        do {
            System.out.println("Please enter a number");
            userGuess = input.nextInt();
            attempts++;
            if(userGuess > 0 && userGuess <= 100){
                if (userGuess == secretNum) {
                    System.out.println("Good guess! The number was " + secretNum);
                } else if (userGuess < secretNum) {
                    System.out.println(userGuess + " is too small, try again");
                }else if(userGuess > secretNum){
                    System.out.println(userGuess + " is too big, try again");
                }
            }else{
                System.out.println("Invalid number, needs to be between 1-100 ");
            }
        }while(userGuess != secretNum);

        if(attempts <= 2){
            System.out.println("Wow,really good guess!");
        }else if(attempts <= 4){
            System.out.println("still good guess");
        }else{
            System.out.println("a lot of guesses but you got it");
        }
    }
}