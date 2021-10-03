package office_hours.practice_09_16_2021;

public class MergeArrays2 {
    /*

        { 1, 2, 3 }
        { 10, 20, 30}

       first case:
        output: 1, 2, 3, 10 20, 30

     */

    public static void main(String[] args) {

        int[] arrOne = {1, 2, 3, 4};
        int[] arrTwo = {10, 20, 30};

        int mergedLength = arrOne.length + arrTwo.length;
        int [] merge = new int[mergedLength];

        int j = 0;
        for(int i = 0; i < merge.length; i++){ // this loop goes thru the merge array
            merge[i++] = arrOne[j];

        }

    }
}

