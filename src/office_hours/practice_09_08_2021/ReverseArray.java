package office_hours.practice_09_08_2021;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4};
        int [] reversed = new int[4];

        int j = 0;
        for (int i = nums.length -1; i >= 0; i--){
           // System.out.println(nums[i]);
            reversed[j++] = nums[i];
            System.out.println(Arrays.toString(reversed));
        }
    }
}
