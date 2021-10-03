package day30_array_for_each_loop;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};

        //traditional loop
        for(int i = 0; i < nums.length; i++){
            System.out.println("Number " + nums[i]);
        }
        System.out.println();
        // for each loop
        for(int eachNum : nums ){
            System.out.println("number " + eachNum);
        }
    }
}
