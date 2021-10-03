package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        int [] nums = { 4, 6, 2, 10};  // hardcoded number
        double sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.println("Average number is: " + (sum/nums.length));

        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter");
        int size = input.nextInt();

        int [] numbers = new int[size];
        double summary = 0;
        for (int i = 0; i < size; i++){   //i < numbers.length
            System.out.println("Enter a number " + (i + 1));
             numbers[i] = input.nextInt();

            System.out.println(Arrays.toString(numbers));


        }
        for (int i = 0; i < numbers.length; i++){
            summary += numbers[i];
        }
        System.out.println("Average number is: " + (summary/numbers.length));

    }
}
