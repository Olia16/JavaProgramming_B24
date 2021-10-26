package Practice;

import java.util.Arrays;

public class ConcatArraysQ1 {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        int arr3 [] = new int[arr1.length+arr2.length];
        int index = 0;
        for (int eachArr:arr1) {
            arr3[index++]=eachArr;

        }
        for (int eachArr:arr2) {
            arr3[index++]=eachArr;

        }

        System.out.println(Arrays.toString(arr3));
    }
}
