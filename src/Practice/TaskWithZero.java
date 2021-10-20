package Practice;

import java.util.Arrays;

public class TaskWithZero {

    //move zero to the end

    public static void main(String[] args) {


/*
        int countZero = 0; // created count to define how many zeroes in arr
        for(int each : arr){
            if(arr[each] == 0){ //4
                countZero ++;
            }
        }

        int [] newArr = new int[arr.length - countZero]; // created new arr to store nums that are more than 0; size based on length of arr minus quantity of zeroes;

        int c = 0;
        for(int b = 0; b < arr.length-1; b++){
            if(arr[b] > 0){
                newArr[c++] = arr[b];
            }
        }
        int index = arr.length - countZero;// 3 // need index position to start storing zeroes;
        for(int a = 0; a < index; a++){
            arr[a] = newArr[a];
        }

        for(int i = index; i < arr.length-1; i++){
            arr[i] = 0;
        }


        System.out.println(Arrays.toString(arr));

    }
*/
        int[] arr = {1, 0, 4, 0, 3, 4, 5};//7-4
        int[] newArr = new int[arr.length]; // created new arr to store nums that are more than 0; size based on length of arr minus quantity of zeroes;

        int c = 0;
        for (int b = 0; b < arr.length; b++) {

            if (arr[b] > 0) {
                newArr[c++] = arr[b];
            }
        }


        System.out.println(Arrays.toString(newArr));
    }
}
