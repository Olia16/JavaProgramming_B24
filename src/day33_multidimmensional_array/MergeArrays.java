package day33_multidimmensional_array;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int [][] nums = {
                {10,20,30}, {5,10,15}
        };

        // make single array from multidimentional 2d array

        int size = nums[0].length + nums[1].length;
        int [] merged = new int[size];

        merged[0] = nums[0][0];
        merged[1] = nums[0][1];
        merged[2] = nums[0][2];
        merged[3] = nums[1][0];
        merged[4] = nums[1][1];
        merged[5] = nums[1][2];


        System.out.println(Arrays.toString(merged));

    }
}
