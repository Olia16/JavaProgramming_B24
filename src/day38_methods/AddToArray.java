package day38_methods;

import java.util.Arrays;

public class AddToArray {

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4};
        System.out.println(Arrays.toString(addElement(a,10)));
    }
    public static int [] addElement(int [] arr, int element){

        int [] newArr = new int [arr.length + 1];

        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = element;
        return newArr;
    }

}
