package day30_array_for_each_loop;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        /*
        declare an int array
        count even numbers
        count odd numbers
        print your counters

        -traditional for loop
        - for each loop

        -use scanner
         */
     //   int [] numbers = {4, 5, 6, 7, 5, 2, 10};

        // dynamic way via Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int  size = input.nextInt();
        int [] numbers = new int[size];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter a number " + (i + 1));
            numbers[i] = input.nextInt();
        }
 // counter variables
        int even = 0;
        int odd = 0;

        String evenNumbers = "";
        String oddNumbers = "";


        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                even++;
                evenNumbers += numbers[i] + ", ";
            }else{
                odd++;
                oddNumbers += numbers[i] + ", ";
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Even: " + even);
        System.out.println("Even numbers are: " + evenNumbers);
        System.out.println("Odd: " + odd);
        System.out.println("Odd numbers are: " + oddNumbers );


    }
}
