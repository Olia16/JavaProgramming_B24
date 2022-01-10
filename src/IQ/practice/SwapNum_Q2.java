package IQ.practice;

import java.util.ArrayList;
import java.util.Collections;

public class SwapNum_Q2 {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(30);
        arr1.add(90);
        System.out.println("Before swap: "+ arr1);

        Collections.swap(arr1,0,1);
        System.out.println("After swap: "+ arr1);
    }

}
