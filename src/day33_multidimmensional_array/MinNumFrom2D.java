package day33_multidimmensional_array;

public class MinNumFrom2D {
    public static void main(String[] args) {
        int [][] nums = {
                {4, 5, 40, 1400, 1409, 12},
                {200, 3000, 3940,7, 2},
                {10, 200, 40, 2, 4, 1}
        };

        int min = nums [0][0];
        for(int [] eachArray : nums){
            for(int eachNum : eachArray){
                if(eachNum < min){
                    min = eachNum;
                }
            }
        }
        System.out.println(" Min number is: " + min);
    }
}
