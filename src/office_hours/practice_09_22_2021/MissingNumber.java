package office_hours.practice_09_22_2021;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] a = {4, 2, 1, 7, 5, 3, 8, 9};
        System.out.println(findMissingNum(1,4,5,6,5,8,9,2)); // you can input int array directly in print statement

    }
    /*
    take an array nums from 1 to 9
    find the missing number
     */
    public static int findMissingNum(int ... nums){ // you need to put ... three dots instead of [] brackets in order to print numbers directly in print statement
        Arrays.sort(nums);

        int checking = 1;
        for(int each: nums){
            if(checking != each){
              break;
            }
            checking++; // update checking number every iteration

        }
        return checking;
    }
}
