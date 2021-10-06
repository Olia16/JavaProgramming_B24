package office_hours.practice_09_30_2021;

import java.util.Arrays;

public class ZombieAttack2 {
    public static void main(String[] args) {
         /*
            3 conditions/action
                if you are 0 in the beginning
                        cause the city to the right to lose half pop
                if you are 0 in the end
                        cause the city to the left to lose half pop
                if you are in the middle anywhere
                        causes the city to the left and right to both lose half pop
             when to stop?
                when all cities populations are 0
                Arrays(inhab, new int [8])
                [0, 0, 0, 0, 0, 0, 0, 0]
         */


        int[] inhabitants = { 3, 6, 0, 4, 3, 2, 7, 0 };

        int days = 0;

        System.out.println("Day " + days++ + " " + Arrays.toString(inhabitants));

//        int [] check = { 0, 0, 0, 0, 0, 0, 0, 0};
//        while (!Arrays.equals(inhabitants, check)){

        while (!Arrays.equals(inhabitants, new int[8])){

            //int [] temp = inhabitants; // this is does not copy your array, this is the same object having another reference

            int [] temp = Arrays.copyOf(inhabitants, inhabitants.length);

            for(int i = 0; i < inhabitants.length; i++){

                if(inhabitants[i] == 0){

                    if(i == 0){
                        // we found 0 at the first index, first city

                        temp[i + 1] = temp[i+1] / 2;

                    } else if( i == inhabitants.length -1 ){
                        // we found 0 at the last index, last city

                        temp[i - 1] = temp[i-1] / 2;

                    } else {
                        // we found 0 somewhere in the middle cities

                        temp[i + 1] = temp[i+1] / 2;
                        temp[i - 1] = temp[i-1] / 2;

                    }

                }

            } // for loop ends

            inhabitants = Arrays.copyOf(temp, inhabitants.length);

            System.out.println("Day " + days++ + " " + Arrays.toString(inhabitants));

        } // while loop ends

        System.out.println("---- EXTINCT ----");

    }

}

