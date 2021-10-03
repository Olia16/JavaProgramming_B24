package day32_arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArrays {
    public static void main(String[] args) {
        int [] nums = {4, 1, 6, 7, -3, 10, 60};
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

     //   Arrays.sort(nums, Collections.reverseOrder()); descending order, doesn't word with primitives(int,double,etc.)

        // find the biggest and the smallest

        System.out.println("Smallest number: " + nums[0]);
        System.out.println("Biggest number: " + nums[nums.length-1]);
    }
}
