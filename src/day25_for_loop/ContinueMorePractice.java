package day25_for_loop;

import java.util.Scanner;

public class ContinueMorePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = input.nextInt();

        for(int i = 0; i < number; i++){

            if(i % 2 == 1){
                continue;
            }
            System.out.print(i);
        }
    }
}
