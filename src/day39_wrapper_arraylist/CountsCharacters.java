package day39_wrapper_arraylist;

import java.util.Scanner;

public class CountsCharacters {
    public static void main(String[] args) {
        /*
        Task:
create a new class called CountCharacters

    Ask the user to enter their email

    count how many uppercase letter
    count how many lowercase letters
    count how many numbers
    count all other characters

    Challenge: instead of making 4 counting variables, use 1 array
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email address");
        String email = input.next();

        int countLower = 0;
        int countUpper = 0;
        int countNum = 0;
        int other = 0;

        for(char each : email.toCharArray()){  // email.toCharArray() - converted String email into Array
            if(Character.isLowerCase(each)){
                countLower++;
            }else if(Character.isUpperCase(each)){
                countUpper++;
            }else if(Character.isDigit(each)){
                countNum++;
            }else{
                    other++;
                }
            }
        System.out.println("Lowercase: " + countLower);
        System.out.println("Uppercase: " + countUpper);
        System.out.println("Digits: " + countNum);
        System.out.println("Others: " + other);

    }

    }

