package Practice;

import java.util.Arrays;

public class SortArraysWithoutMethod {

    public static void main(String[] args) {

        int[] arr = new int[] { 10, 9, 8, 7, 5, 0,1, 4 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int low = 0;
                if (arr[i] > arr[j]) {//10>9/9>8
                    low = arr[i];//low = 10/low = 9
                    arr[i] = arr[j];//arr[0]=9/arr[1]=8
                    arr[j] = low;//arr[0+1]=10//arr[2]=9
                }//{9,10,8,7}/{8,10,9,7}/{7,10,9,8}/{7, 9, 10, 8}/{7, 8, 10, 9}/{7, 8, 9, 10}
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
