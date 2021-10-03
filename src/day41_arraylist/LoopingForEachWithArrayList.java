package day41_arraylist;

import java.util.ArrayList;

public class LoopingForEachWithArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(21);
        nums.add(53);
        nums.add(90);

        for(Integer each : nums){ // you can use Integer or int
            if(each % 2 == 1){
                System.out.print(each + " ");
            }

            for(int i = 0; i < nums.size(); i++){
                if(nums.get(i) % 2 == 1){
                    System.out.print(nums.get(i) + " ");
                }
            }

        }

    }
}
