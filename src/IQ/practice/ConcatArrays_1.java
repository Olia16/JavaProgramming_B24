package IQ.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcatArrays_1 {

    public static int [] concatArrays(int [] arr1, int [] arr2){

        int [] arr3 = new int[arr1.length + arr2.length];
        int index = 0;

        for(int each : arr1){
            arr3[index++] = each;
        }
        for (int each : arr2){
            arr3[index++] = each;
        }
        return arr3;
    }

    public static void main(String[] args) {
        int [] arr1 = {1, 5, 4, 7};
        int [] arr2 = {2, 4, 7, 1};
        System.out.println(Arrays.toString(concatArrays(arr1,arr2)));


        String [] str1 = {"a", "o", "l", "p"};
        String [] str2 = {"l", "a", "p", "k"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str1));
        String [] newArr = (String[]) list.toArray();

        System.out.println(list);


    }
}
