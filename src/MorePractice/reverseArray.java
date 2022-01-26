package MorePractice;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
      int count = 0;
      int [] reversed = new int[nums.length];

    for(int j = nums.length-1; j >= 0; j--){
              reversed[count++] = nums[j];
          }

      System.out.println(Arrays.toString(reversed));


        //challenge
        count = 0;
        int var = nums[0];
        for (int i = nums.length-1; i >= nums.length/2; i--){
            var = nums[count];
            nums[count++] = nums[i];
            nums[i] = var;

        }
        System.out.println(Arrays.toString(nums));
    }


}
