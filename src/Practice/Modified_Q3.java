package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Modified_Q3 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(4)));
    }


    public static int [] sumZero(int size){  //creating  return method, that accepts int to know the size and return int [];

        ArrayList<Integer> result = new ArrayList(size);//create arraylist to easily use add method
        if(size % 2 == 0){ // to check if the length is even or odd

            for(int i = 0; i < size / 2; i++){ //if length is even, we add value of i to array list and right after add negative value of -i;
                result.add(i);
                result.add(-i);
            }
        } else { // if length/size is odd, we will add right away 0 to the first position, and then use for loop to store the rest

            result.add(0);
            for(int i = 1; i <= size / 2; i++){ // if the length is odd -> positive value of i and negative value of -i;
                result.add(i);
                result.add(-i);
            }
        }

        int [] arr = new int [result.size()];// storing to arr
        for(int i = 0; i < result.size(); i++){
            arr[i] = result.get(i);
        }
        return arr;
    }

}
