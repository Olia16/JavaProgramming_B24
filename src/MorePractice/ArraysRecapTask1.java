package MorePractice;

import java.util.Arrays;

public class ArraysRecapTask1 {

    //Assign 1-100 to each index of the array.  Then use a for each loop to
    //print out all the elements of the array

    public static void main(String[] args) {
        int [] nums = new int[100];
        int count = 1;
        for(int i = 0; i < 100; i++){
            nums[i] = count++;
        }

        System.out.println(Arrays.toString(nums));

        //Write a program that can find the maximum number from any given
        //int array

        int [] numbers = {7,11,30,45,1};
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(max<numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("Max Number: " + max);

        int [] numbers2 = {4,11,30,45,1};
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(min>numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println("Min Number: " + min);
    }


}
