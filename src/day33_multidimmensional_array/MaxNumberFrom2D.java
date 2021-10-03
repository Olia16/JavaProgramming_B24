package day33_multidimmensional_array;

public class MaxNumberFrom2D {
    public static void main(String[] args) {
        // find the biggest number from the whole 2d array

        int [][] nums = {
                {4, 5, 40, 1400, 1409, 12},
                {200, 3000, 3940},
                {10, 200, 40}
        };
        int max = nums [0][0];
        for(int [] each : nums){
            for(int eachNum:each){
               if(eachNum > max){
                   max = eachNum;
               }
            }
        }
        System.out.println("Max number is: " + max);
    }
}
